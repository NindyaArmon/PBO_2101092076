/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_b.model;

/**
 *
 * @author hp
 */
public class Warnet {
    private String kodeTrans;
    private String tglTrans;
    private String pelanggan;
    private String jamMasuk;
    private String jamKeluar;
    private int lama;
    private int tarif;
    private int diskon;
    private int total;
    
    public Warnet(){
    
    }
    
    public Warnet(String kodeTrans, String tglTrans, String pelanggan, String jamMasuk, String jamKeluar, int lama, int tarif, int diskon, int total) {
        this.kodeTrans = kodeTrans;
        this.tglTrans = tglTrans;
        this.pelanggan = pelanggan;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.lama = lama;
        this.tarif = tarif;
        this.diskon = diskon;
        this.total = total;
        
    }
    
    public String getKodetrans() {
        return kodeTrans;
    }

    public void setKodeTrans(String kodeTrans) {
        this.kodeTrans = kodeTrans;
    }

    public String getTglTrans() {
        return tglTrans;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setJamMasuk(String jamMasukt) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
       
}
