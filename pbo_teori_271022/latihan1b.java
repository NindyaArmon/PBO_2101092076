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

public class latihan1b {
    public static void main(String[] args) {
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        int rata = 0;
        
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian yang ke 1")); 
        
        nilai2 =  Integer.parseInt (JOptionPane.showInputDialog("Masukkan nilai ujian yang ke 2")); 
        
        nilai3 =  Integer.parseInt (JOptionPane.showInputDialog("Masukkan nilai ujian yang ke 3")); 
        
        rata = (nilai1 + nilai2 + nilai3)/3;

        JOptionPane.showMessageDialog(null, rata); 
        if(rata>=60){ 
            System.out.println( ":-)" ); 
            JOptionPane.showMessageDialog(null, ":-)"); 
        } 
        else{
            System.out.println(":-(" ); 
            JOptionPane.showMessageDialog(null, ":-("); 
        } 
     }
}
