/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_b.controller;

/**
 *
 * @author hp
 */
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uas_b.view.*;
import uas_b.model.*;

public class WarnetController {
    
    private FormWarnet formWarnet;
    private Warnet warnet;
    private WarnetDao warnetDao;
    
    public WarnetController(FormWarnet formWarnet)
    {
        this.formWarnet = formWarnet;
        warnetDao = new WarnetDaoImpl();
    }
    
    public void bersihForm()
    {
        formWarnet.getTxtKodeTrans().setText("");
        formWarnet.getTxtTglTrans().setText("");
        formWarnet.getTxtPelanggan().setText("");
        formWarnet.getTxtJamMasuk().setText("");
        formWarnet.getTxtJamKeluar().setText("");
        formWarnet.getTxtLama().setText("");
        formWarnet.getTxtTarif().setText("");
        formWarnet.getTxtDiskon().setText("");
        formWarnet.getTxtTotal().setText("");
    }
    
    public void saveWarnet()
    {
        warnet = new Warnet();
        warnet.setKodeTrans(formWarnet.getTxtKodeTrans().getText());
        warnet.setTglTrans(formWarnet.getTxtTglTrans().getText());
        warnet.setPelanggan(formWarnet.getTxtPelanggan().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText());
        warnet.setLama(formWarnet.getTxtLama().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnet.setDiskon(formWarnet.getTxtDiskon().getText());
        warnet.setTotal(formWarnet.getTxtTotal().getText());
        warnetDao.save(warnet);
        JOptionPane.showMessageDialog(formWarnet, "Insert OK");
    }
    
    public void updateWarnet()
    {
        int index = formWarnet(.getTblWarnet(().getSelectedRow();
        warnet( = WarnetDao.getWarnet(index);
        warnet.setKodeTrans(formWarnet.getTxtKodeTrans().getText());
        warnet.setTglTrans(formWarnet.getTxtTglTrans().getText());
        warnet.setPelanggan(formWarnet.getTxtPelanggan().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText());
        warnet.setLama(formWarnet.getTxtLama().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnet.setDiskon(formWarnet.getTxtDiskon().getText());
        warnet.setTotal(formWarnet.getTxtTotal().getText());
        warnetDao.update(index, warnet);
        JOptionPane.showMessageDialog(formAnggota, "Update OK");
    }
    
    public void deleteAnggota()
    {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);
        JOptionPane.showMessageDialog(formWarnet, "Delete OK");
    }
    
    public void tampil()
    {
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet> list = WarnetDao.getAllWarnet();
        for (Warnet warnet : list){
            Object[] row = {
                warnet.getKodeTrans(),
                warnet.getTglTrans(),
                warnet.getPelanggan(),
                warnet.getJamMasuk(),
                warnet.getJamKeluar(),
                warnet.getLama(),
                warnet.getTarif(),
                warnet.getDiskon(),
                warnet.getTotal(),
            };
            tabelModel.addRow(row);
        }
    }
    
    public void getWarnet()
    {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        Warnet = WarnetDao.getWarnet(index);
        if (Warnet!=null){
            formWarnet.getTxtKodeTrans().setText(warnet.getNobp());
            formWarnet.getTxtTglTrans().setText(warnet.getNama());
            formWarnet.getTxtPelanggan().setText(warnet.getAlamat());
            formWarnet.getTxtJamMasuk().setText(warnet.getNobp());
            formWarnet.getTxtJamKeluar().setText(warnet.getNama());
            formWarnet.getTxtLama().setText(warnet.getAlamat());
            formWarnet.getTxtTarif().setText(warnet.getNobp());
            formWarnet.getTxtDiskon().setText(warnet.getNama());
            formWarnet.getTxtTotal().setText(warnet.getAlamat());
        }
    }
}
