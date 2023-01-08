/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pustaka.model;

/**
 *
 * @author hp
 */
public class mahasiswa {
    private String nobp;
    private String nama;
    private String alamat;
    private String jekel;
    public String getNama;
    
    public mahasiswa(){
    
    }
    
    public mahasiswa (String nobp, String nama, String alamat, String jekel){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        this.jekel = jekel;    
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat= alamat;
    }
    
    public void setJekel(String jekel){
        this.jekel = jekel;
    }
    
    public String getNobp(){
        return nobp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String geAlamat(){
        return alamat;
    }
    
    public String getjekel(){
        return jekel;
    }

    public Object getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getJekel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
