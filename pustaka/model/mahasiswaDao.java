/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pustaka.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class mahasiswaDao {
    private List<mahasiswa> data = new ArrayList<mahasiswa>();
    
    public mahasiswaDao(){
        data.add(new mahasiswa("098763", "Ali", "Padang", "1"));
    }
    
    public void insert(mahasiswa m){
        data.add(m);
    }
    
    public void update(int index, mahasiswa m){
        data.set(index, m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public mahasiswa getMahasiswa(int index){
        return data.get(index);
    }
    
    public List<mahasiswa> getAllMahasiswa(){
        return data;
    }
}
