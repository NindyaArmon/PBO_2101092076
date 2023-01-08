/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pustaka.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pustaka.model.mahasiswa;
import pustaka.model.mahasiswaDao;
import pustaka.view.formMahasiswa;

/**
 *
 * @author hp
 */
public class mahasiswaController {
    formMahasiswa view;
    mahasiswa model;
    mahasiswaDao dao;
    int index;
    
    public mahasiswaController(formMahasiswa view){
        this.view = view;
        dao = new mahasiswaDao();
    }

    public mahasiswaController() {
        
    }
    
    public void clearView(){
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
    }
    
    public void insert(){
        model = new mahasiswa();
        model.setNobp(view.getTxtNobp().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJekel(view.getCbJekel().getSelectedItem().toString());
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Entri Data OK ");
    }
    
    public void viewData(){
        DefaultTableModel model = (DefaultTableModel) view.getTblMahasiswa().getModel();
        model.setNumRows(0);
        List<mahasiswa> list = null;
        for (mahasiswa mahasiswa : list){
            Object[] data = {
                mahasiswa.getNobp(),
                mahasiswa.getNama(),
                mahasiswa.getAlamat(),
                mahasiswa.getjekel()};
            model.addRow(data);
        }
    }
    
    public void actionClickTable(){
        index = view.getTblMahasiswa().getSelectedRow();
        model = dao.getMahasiswa(index);
        view.getTxtNobp().setText(model.getNobp());
        view.getTxtNama().setText(model.getNama());
        view.getTxtAlamat().setText((String) model.getAlamat());
        view.getCbJekel().setSelectedItem(model.getJekel());
    }
    
    public void update(){
        model.setNobp(view.getTxtNobp().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJekel(view.getCbJekel().getSelectedItem().toString());
        dao.update(index, model);
        JOptionPane.showMessageDialog(view, "Update Data OK");
    }
    
    public void delete(){
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete Data OK");
    }

    
}
