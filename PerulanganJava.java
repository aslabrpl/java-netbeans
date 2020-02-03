/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PerulanganJava {
    public static void main(String[] args) {
        System.out.println("MENGGUNAKAN WHILE");
        int i = 0;
        while (i<=10) {            
            System.out.println("Data no = "+i);
            i++;
        }
        
        System.out.println("----------------------------------------------");
        System.out.println();
        
        System.out.println("MENGGUNAKAN FOR");
        for (int j = 0; j < 10; j++) {
            System.out.println("Perulangan ke = "+j);
        }
        
        System.out.println("----------------------------------------------");
        System.out.println();
        
        System.out.println("MENGGUNAKAN DO WHLIE");
        int h = 10;
        do{                
            System.out.println("KE BERAPA YA = "+h);
            h++;
        }while(h<10);
    }
}
