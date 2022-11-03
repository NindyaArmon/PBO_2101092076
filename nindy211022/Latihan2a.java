/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nindy211022;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Latihan2a {
    public static void main(String[] args) {
    Scanner b = new Scanner(System.in);
    System.out.println("masukkan angka : ");
    int input = b.nextInt();

    System.out.println("masukkan pangkat : ");
    int pangkat = b.nextInt();

    int i = 1;
    int h = 1;

    while (i<pangkat){
        h = h*input;
        i++;
    }
    
    System.out.println(input + " ^ " +pangkat +" = " +h);
    }
}
