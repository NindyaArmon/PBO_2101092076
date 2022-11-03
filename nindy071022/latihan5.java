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
import javax.swing.JOptionPane;

public class latihan5 {
     public static void main (String[] args){
        //JOptionPane
        
        int nilai1=0;
        int nilai2=0;
        int nilai3=0;
        float rata=0;
        String status = "";
        
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 1 : "));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 2 : "));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 3 : "));
        
        
        
        rata=(nilai1+nilai2+nilai3)/3;
        if(rata>=60){
               status = ":-)";
           }else{
               status = ":-(";
           }
        
        JOptionPane.showMessageDialog(null, "Rata-rata : "+rata+" "+ status); 
    }
}
