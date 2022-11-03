/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori_271022;

/**
 *
 * @author hp
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class latihan3 {
    public static void main(String[] args){
        
        //BufferedReader
        System.out.println("--------->Program Gaji Karyawan<---------");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatdata = new DecimalFormat("#.##");
        String gol = "";
        int jkerja = 0;
        int janak = 0;
        int lkerja = 0;
        long gpokok = 0, gjam = 0, glembur = 0, tunjang_anak = 0, tunjangan = 0, tgaji = 0;
        double pajak = 0, gbersih = 0;
        
        try{
            System.out.print("Masukkan golongan\t\t : ");
            gol = dataIn.readLine();
            System.out.print("Masukkan jumlah jam kerja(/bulan): ");
            jkerja = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan jumlah anak\t\t : ");
            janak = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan lama kerja (tahun)\t : ");
            lkerja = Integer.parseInt(dataIn.readLine());
            System.out.println("-----------------------------------------");
            
            gpokok=0;
            gjam=0;
            glembur=0;
            tunjang_anak=0;
            tunjangan=0;
            pajak=0;
            
            switch(gol){ 
            case "1A": 
                    gpokok = 500000;
                    gjam = jkerja*2000;
                    tunjangan = 0;
                    System.out.println("Gaji pokok\t: "+gpokok);
                    System.out.println("Gaji perjam\t: "+gjam);
                    System.out.println("Tunjangan\t: "+tunjangan);
                    break; 
            case "2A": 
                    gpokok = 600000;
                    gjam = jkerja*3000;
                    if(lkerja>5){
                        tunjangan = 100000;
                    }else{
                        tunjangan = 0;
                    }
                    System.out.println("Gaji pokok\t: "+gpokok);
                    System.out.println("Gaji perjam\t: "+gjam);
                    System.out.println("Tunjangan\t: "+tunjangan);
                    break; 
            case "1B": 
                    gpokok = 700000;
                    gjam = jkerja*4000;
                    tunjangan = 0;
                    System.out.println("Gaji pokok\t: "+gpokok);
                    System.out.println("Gaji perjam\t: "+gjam);
                    System.out.println("Tunjangan\t: "+tunjangan);
                    break;
            case "2B": 
                    gpokok = 800000;
                    gjam = jkerja*5000;
                    if(lkerja>5){
                        tunjangan = 100000;
                    }else{
                        tunjangan = 0;
                    }
                    System.out.println("Gaji pokok\t: "+gpokok);
                    System.out.println("Gaji perjam\t: "+gjam);
                    System.out.println("Tunjangan\t: "+tunjangan);
                    break;
            case "3B": 
                    gpokok = 900000;
                    gjam = jkerja*6000;
                    tunjangan = 0;
                    System.out.println("Gaji pokok\t: "+gpokok);
                    System.out.println("Gaji perjam\t: "+gjam);
                    System.out.println("Tunjangan\t: "+tunjangan);
                    break;
            default: 
                
            }
            
             if(jkerja>160){
                glembur = (jkerja-160)*3500;
                 System.out.println("Gaji lembur\t: "+glembur);
            }else{
               glembur=0;
                System.out.println("Gaji lembur\t: "+glembur);
            }
            
            if(janak<=2){
                tunjang_anak = janak*25000;
                System.out.println("Tunjangan anak\t: "+tunjang_anak);
            }else{
                tunjang_anak =  2*25000;
                System.out.println("Tunjangan anak\t: "+tunjang_anak);
            }
            
            tgaji = 0;
            tgaji = gpokok+gjam+glembur+tunjang_anak+tunjangan;
            pajak = tgaji*0.1;
            gbersih = tgaji-pajak;
            
        }catch(IOException e){
            System.out.println("Error!");
        } 
        
        System.out.println("Total gaji\t: "+tgaji);
        System.out.println("Pajak\t\t: "+ formatdata.format(pajak));
        System.out.println("Gaji bersih\t: "+ formatdata.format(gbersih));
        
    }
}