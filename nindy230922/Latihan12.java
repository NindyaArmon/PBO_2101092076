/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nindy230922;

/**
 *
 * @author hp
 */
public class Latihan12 
{
    public static void main(String[] args) {
        int num1 = 10 ;
        int num2 = 23 ;
        int num3 = 5;
        int hasil = 80;
        
        hasil = (num1>num2)?num1:(num2<num3)?num2:(num3>num1)?num3:num2;
        
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        System.out.println("number 3 = " + num3);
        
        System.out.println("Nilai Tertingginya adalah " + hasil);
    }
    
}
