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
public class latihan2a {
    public static void main(String[] args ){
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka : ");
        int n = Integer.valueOf(angka).intValue();
        
        String hasil = "";
            if(n==1){
               hasil+= "satu"; 
            }else if(n==2){
                hasil += "dua";
            }else if(n==3){
                hasil += "tiga";
            }else if(n==4){
                hasil += "empat";
            }else if(n==5){
                hasil += "lima";
            }else if(n==6){
                hasil += "enam";
            }else if(n==7){
                hasil += "tujuh";
            }else if(n==8){
                hasil += "delapan";
            }else if(n==9){
                hasil += "sembilan";
            }else if(n==10){
                hasil += "sepuluh";
            }else{
            hasil += "Invalid Number";
            }
        JOptionPane.showMessageDialog(null, hasil); 
    }
}
