/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerB_2101092076;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public class HutangController {
    private FormHutang formHutang;
    private Hutang hutang;
    private HutangDao hutangDao;
    
    public HutangController(FormHutang formHutang)
    {
        this.formHutang = formHutang;
        hutangDao = (HutangDao) new HutangDaoImpl();
    }
    
    public void bersihForm()
    {
        formHutang.getTxtKodeTransaksi().setText("");
        formHutang.getTxtTanggalTransaksi().setText("");
        formHutang.getTxtPembeli().setText("");
        formHutang.getTxtTotalBeli().setText("");
    }
    
    public void saveHutang()
    {
        hutang = new Hutang();
        hutang.setKodeTransaksi(formHutang.getTxtKodeTransaksi().getText());
        hutang.setTanggalTransaksi(formHutang.getTxtTanggalTransaksi().getText());
        hutang.setPembeli(formHutang.getTxtPembeli().getText());
        hutang.setTotalBeli(Integer.parseInt(formHutang.getTxtTotalBeli().getText()));
        hutangDao.save(hutang);
        JOptionPane.showMessageDialog(formHutang, "Insert OK");
    }
    
    public void updateHutang()
    {
        int index = formHutang.getTblHutang().getSelectedRow();
        hutang = hutangDao.getHutang(index);
        hutang.setKodeTransaksi(formHutang.getTxtKodeTransaksi().getText());
        hutang.setTanggalTransaksi(formHutang.getTxtTanggalTransaksi().getText());
        hutang.setPembeli(formHutang.getTxtPembeli().getText());
        hutang.setTotalBeli(Integer.parseInt(formHutang.getTxtTotalBeli().getText()));
        hutangDao.update(index, hutang);
        JOptionPane.showMessageDialog(formHutang, "Update OK");
    }
    
    public void deleteHutang()
    {
        int index = formHutang.getTblHutang().getSelectedRow();
        hutangDao.delete(index);
        JOptionPane.showMessageDialog(formHutang, "Delete OK");
    }
    
    public void tampil()
    {
        DefaultTableModel tabelModel = (DefaultTableModel) formHutang.getTblHutang().getModel();
        tabelModel.setRowCount(0);
        List<Hutang> list = hutangDao.getAllHutang();
        for (Hutang hutang : list){
            Object[] row = {
                hutang.getKodeTransaksi(),
                hutang.getTanggalTransaksi(),
                hutang.getPembeli(),
                hutang.getTotalBeli(),
            };
            tabelModel.addRow(row);
        }
    }
    
    public void getHutang()
    {
        int index = formHutang.getTblHutang().getSelectedRow();
        hutang = hutangDao.getHutang(index);
        if (hutang!=null){
            formHutang.getTxtKodeTransaksi().setText(hutang.getKodeTransaksi());
            formHutang.getTxtTanggalTransaksi().setText(hutang.getTanggalTransaksi());
            formHutang.getTxtPembeli().setText(hutang.getPembeli());
            formHutang.getTxtTotalBeli().setText(String.valueOf(hutang.getTotalBeli()));
        }
    }
    
   
}
