/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class BelajarArray {
    public static void main(String[] args){
//  PENDEKLARASIAN ARRAY
    String[] hai;
    
//  PEMPERIAN NILAI PADA ARRAY
    String[] manusia = {"laba-laba", "Man", "D BARBAR"};
    
//  PEMANGGILAN NILAI YANG ADA PADA ARRAY
    System.out.println("data 1 : "+manusia[0]);
    System.out.println("data 2 : "+manusia[1]);
    System.out.println("data 3 : "+manusia[2]);
    
//  MERUBAH NILAI YANG ADA PADA ARRAY
    manusia[0] = "Spider-man";
    manusia[1] = "Super-man";
    manusia[2] = "Barbar-man";
//  MENGHITUNG NILAI YANG ADA PADA ARRAY
    System.out.println("Menhitung data pada array : "+manusia.length);
//  LOOPING
        for (int i = 0; i < manusia.length; i++){
            System.out.println(manusia[i]);
        }
        for (String dudu : manusia) {
            System.out.println(dudu);
        }
//  MULTYDIMENSION ARRAY
    int[][] banyakAngka = {{1,2,3,4},{5,6,7}};
    int keluarkan = banyakAngka[1][2];
    System.out.println("ini multy : "+keluarkan);
    
//  LOOPING INSIDE LOOPING
    int[][] angka = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int i = 0; i < angka.length; ++i) {
            for (int j = 0; j < angka[i].length; ++j) {
                System.out.print(angka[i][j]);
            }
        }
    }
}