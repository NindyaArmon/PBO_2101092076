/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nindy071022;

/**
 *
 * @author hp
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class latihan4 {
    public static void main (String[] args){
        
        //BufferedReader
        System.out.println("=== Program Nilai Ujian ===");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        int nilai1 =0;
        int nilai2 =0;
        int nilai3 =0;
        float rata =0;
        String status = "";
        
        try{
            System.out.print("Masukkan Nilai 1 : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai 2 : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Nilai 3 : ");
            nilai3 = Integer.parseInt(dataIn.readLine());

            rata=(nilai1+nilai2+nilai3)/3;

            if(rata>=60){
                status = ":-)";
            }else{
                status = ":-(";
            }

            }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println("Rata-rata : "+rata+" "+ status);
        
    }
}

