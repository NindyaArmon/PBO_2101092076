/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori_151222;

/**
 *
 * @author hp
 */

public class Abstract {
    abstract class Shape {
        private String nm;
        Shape(String nama) {
        nm = nama; }

        public String getName() {
            return nm;
        }
        abstract float getArea();

    }

    class Circle extends Shape {
        int r;
        Circle(String nama) {
            super(nama);
            r= 3;
        }
        float getArea() {
            float luas;
            luas = (float)(3.14 * r * r);
            return luas;
        }
    }
    
    class Square extends Shape {
        private int sisi;
        Square(String nama) {
            super(nama);
            sisi = 3;
        }

        float getArea() {
            float luas;
            luas = sisi * sisi;
            return luas;
        }
    }

}

