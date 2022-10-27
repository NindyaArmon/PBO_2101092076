/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori_131022;

/**
 *
 * @author hp
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class latihan1 {
    public static void main( String[] args ){ 
    
        BufferedReader dataIn = new BufferedReader( 
            new InputStreamReader( System.in) ); 
            
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        int nilai=0;
        
        try{
            System.out.print("Masukkan nilai ujian yanga ke-1 :");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yanga ke-2 :");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yanga ke-3 :");
            nilai3 = Integer.parseInt(dataIn.readLine());
                
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
 
        nilai = (nilai1 >= nilai2)?nilai1:nilai2;
        nilai = (nilai3 >= nilai)?nilai3:nilai;
        
        System.out.println("Number 1 = " +nilai1 );
        System.out.println("Number 2 = " +nilai2 );
        System.out.println("Number 3 = " +nilai3 );
        System.out.println("Nilai Terbesar = " +nilai );
                 
    }
}
