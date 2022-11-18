/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_181122_a;

/**
 *
 * @author hp
 */

import java.util.Scanner;
public class PeminjamanNindya 
{
    private String KodePeminjaman; 
    private String Tanggal; 
    private String KodeNasabah; 
    private String NamaNasabah; 
    private int JumlahPinjaman; 
    private int LamaPinjaman; 
    private double Bunga; 
    private int AngsuranPokok; 
    private int AngsuranPerbulan; 
    private int TotalHutang; 
    
    private static String studentCount;
    
    //KodePeminjam
    public String getKodePeminjaman(){ 
        return KodePeminjaman; 
    }
    
    public void setKodePeminjaman( String KodePeminjaman ){ 
        this.KodePeminjaman = KodePeminjaman; 
    }  
    
    //Tanggal
    public String getTanggal(){ 
        return Tanggal; 
    }
    
    public void setTanggal( String Tanggal ){ 
        this.Tanggal = Tanggal; 
    } 
    
    //KodeNasabah
    public String getKodeNasabah() {
        return KodeNasabah;
    }
    
    public void setKodeNasabah(String KodeNasabah){
        this.KodeNasabah = KodeNasabah;
    }
    
    //NamaNasabah
    public String getNamaNasabah(){ 
        return NamaNasabah; 
    }
    
    public void setNamaNasabah( String NamaNasabah ){ 
        this.NamaNasabah = NamaNasabah; 
    }
    
    //JumlahPinjamn
    public int getJumlahPinjaman() {
        return JumlahPinjaman;
    }
    
    public void setJumlahPinjaman(int JumlahPinjaman){
        this.JumlahPinjaman = JumlahPinjaman;
    }
    
    //LamaPinjaman
    public int getLamaPinjaman() {
        return LamaPinjaman;
    }
    
    public void setLamaPinjaman(int LamaPinjaman){
        this.LamaPinjaman = LamaPinjaman;
    }
    
    //Bunga
    public double getBunga() {
        Bunga = 0.12 * JumlahPinjaman;
        return Bunga;
    }
    
    public void setBunga(Double Bunga){
        this.Bunga = Bunga;
    }
    
    //AngsuranPokok
    public int getAngsuranPokok(){
        AngsuranPokok = JumlahPinjaman / LamaPinjaman;
        return AngsuranPokok;
    }
    
    public void setAngsuranPokok(int AngsuranPokok){
        this.AngsuranPokok = AngsuranPokok;
    }
    
    //AngsuranPerbulan
    public int getAngsuranPerbulan(){
        AngsuranPerbulan = (int) (Bunga / AngsuranPokok);
        return AngsuranPerbulan;
    }
    
    public void setAngsuranPerbulan(int AngsuranPerbulan){
        this.AngsuranPerbulan = AngsuranPerbulan;
    }
    
    //TotalHutang
    public int getTotalHutang() {
        TotalHutang = (int) (JumlahPinjaman * Bunga);    
        return TotalHutang;
    }
    
    public void setTotalHutang(int TotalHutang){
        this.TotalHutang = TotalHutang;
    }

}
