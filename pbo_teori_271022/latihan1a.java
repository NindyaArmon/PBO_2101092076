/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori_271022;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1a {
    public static void main(String[] args){ 
 
        BufferedReader dataIn = new BufferedReader( 
        new InputStreamReader( System.in) ); 
            
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        int rata = 0;

        try{
            System.out.print("Masukkan nilai ujian yanga ke-1 : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yanga ke-2 : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ujian yanga ke-3 : ");
            nilai3 = Integer.parseInt(dataIn.readLine());
            
            rata = (nilai1 + nilai2 + nilai3) / 3 ;
             
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        
        System.out.println("Rata - rata nilai ujian = " + rata); 
            
        if( rata >= 60 ){ 
            System.out.println( ":-)" ); 
        } 
        else{
            System.out.println(":-(" ); 
        } 
                        
    }

}