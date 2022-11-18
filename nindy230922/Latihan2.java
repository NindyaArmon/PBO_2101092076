/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nindy230922;

import java.text.DecimalFormat;

/**
 *
 * @author hp
 */
public class Latihan2
{
    public static void main(String[] args) 
    {
        DecimalFormat Formatdata = new DecimalFormat ("#.##");
        //sedikit angka
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variabel values...");
        System.out.println("   i = " + i);
        System.out.println("   j = " + j);
        System.out.println("   x = " + x);
        System.out.println("   y = " + y); 

        //penjumlahan nagka
        System.out.println("Adding... ");
        System.out.println("   i + j = " + (i + j));
        System.out.println("   x + y = " + (x + y));
        
        //pengurangan angka
        System.out.println("Subtracing...");
        System.out.println("   i - j = " + (i - j));
        System.out.println("   x - y = " + Formatdata.format (x - y));
        
        //perkalian angka
        System.out.println("Multiplaying...");
        System.out.println("   i * j = " + (i * j));
        System.out.println("   x * y = " + Formatdata.format (x * y));
        
        //pembagian angka
        System.out.println("Dividing...");
        System.out.println("   i / j = " + (i / j));
        System.out.println("   x / y = " + Formatdata.format  (x / y));
        
        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the remainder...");
        System.out.println("   i % j = " + (i % j));
        System.out.println("   x % y = " + Formatdata.format (x % y));
        
        //tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println("   j + y = " + (j + y));
        System.out.println("   i * x = " + (i * x));
        
    }
    
}
