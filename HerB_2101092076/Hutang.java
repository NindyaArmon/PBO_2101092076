/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerB_2101092076;

/**
 *
 * @author hp
 */
public class Hutang {
    private String kodeTransaksi;
    private String tanggalTransaksi;
    private String pembeli;
    private int totalBeli;
    private Double diskon;
    private int totalHutang;
    
    public Hutang(){
    }

    public Hutang(String kodeTransaksi, String tanggalTransaksi, String pembeli, int totalBeli) {
        this.kodeTransaksi = kodeTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.pembeli = pembeli;
        this.totalBeli = totalBeli;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public int getTotalBeli() {
        return totalBeli;
    }

    public void setTotalBeli(int totalBeli) {
        this.totalBeli = totalBeli;
    }

    public Double getDiskon() {
        double diskon =  0.02;
        return diskon;
    }


    public int getTotalHutang() {
        if(totalBeli > 100000){
            double Diskon =  0.02;
            totalHutang = (int) (totalBeli - Diskon);
        } else {
            System.out.println("Tidak dapat diskon");
        }
        return totalHutang;  
    }

    public void setTotalHutang(int totalHutang) {
        this.totalHutang = totalHutang;
    }
    
}
