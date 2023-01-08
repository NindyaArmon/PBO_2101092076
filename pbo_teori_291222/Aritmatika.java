/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori_291222;

/**
 *
 * @author hp
 */
public class Aritmatika
{
    public void prima(int n)
    {
        int[] hasil = new int[n];
        int counter = 0;
        int count = 0;
        while(true){
            if (IsPrima(counter)){
                hasil[count] = counter;
                count++;
            }
            if (count==n){
                break;
            }
            counter++;    
        }
        return hasil;
    }

    public boolean IsPrima(int n)
    {
        boolean prima = true;
        if (n == 0 || n == 1){
            prima = false;
        } else{
            for (int i = 2; i <= n/2; i++){
                if (n % i == 0) {
                    prima = false;
                    break;
                }
            }
        }
        return prima;
    }
    
    public static void main(String[] args) 
    {
        Aritmatika a = new Aritmatika();
        System.out.println(a.IsPrima(3));
        int hasil[] = a.prima(5);
        for (int i = 0; i < hasil.length; i++){
            System.out.println(" "+hasil[i]);
        }
    }
}