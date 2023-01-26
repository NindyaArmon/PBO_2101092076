/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_2101092076.controller;

import buku_2101092076.model.BukuDao;
import buku_2101092076.model.Buku;
import buku_2101092076.model.BukuDaoImpl;
import buku_2101092076.view.FormBuku;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku)
    {
        this.formBuku = formBuku;
        bukuDao = (BukuDao) new BukuDaoImpl();
    }
    
    public void bersihForm()
    {
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    public void saveBuku()
    {
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void updateBuku()
    {
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudulBuku(formBuku.getTxtJudulBuku().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update OK");
    }
    
    public void deleteBuku()
    {
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete OK");
    }
    
    public void tampil()
    {
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            Object[] row = {
                buku.getKodeBuku(),
                buku.getJudulBuku(),
                buku.getPengarang(),
                buku.getPenerbit()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void getBuku()
    {
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if (buku!=null){
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudulBuku().setText(buku.getJudulBuku());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
        }
    }
}
