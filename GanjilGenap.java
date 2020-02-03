/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class GanjilGenap {
    public static void main(String[]args){
        int[] angka = {1,2,3,4,5,6};
        int hasilBagi = angka.length % 2;
        if (hasilBagi == 0) {
            int i = 1;
            System.out.println("GENAP");
            while (i<angka.length) {                
                System.out.print(angka[i]+",");
                i=i+2;
            }
        }else{
            int i = 0;
            System.out.println("GANJIL");
            while (i<angka.length) {                
                System.out.print(angka[i]+",");
                i=i+2;
            }
        }
    }

}