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
public class latihan4 {
    public static void main(String[] args ){
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka : ");
        int n = Integer.valueOf(angka).intValue();
        
        String hasil = "";
        switch(n){
            case 1 :{
                hasil += "satu";
            } break;
            
            case 2 :{
                hasil += "dua";
            } break;
            
            case 3 :{
                hasil += "tiga";
            } break;
            
            case 4 :{
                hasil += "empat";
            } break;
            
            case 5 :{
                hasil += "lima";
            } break;
            
            case 6 :{
                hasil += "enam";
            } break;
            
            case 7 :{
                hasil += "tujuh";
            } break;
            
            case 8 :{
                hasil += "delapan";
            } break;
            
            case 9 :{
                hasil += "sembilan";
            } break;
            
            case 10 :{
                hasil += "sepuluh";
            } break;
            
            default : {
                hasil += "Invalid Number";
            }break;
                
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
