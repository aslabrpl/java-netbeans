/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StringToInteger {
    public static void main(String[] args) {
        
        String huruf = "1234";
        int angka = Integer.parseInt(huruf);
        String hurufKedua = String.valueOf(angka);
        System.out.println("angka dalam bentuk string :");
        System.out.println(huruf);
        System.out.println("angka dalam bentuk integer yang dirubah dari string :");
        System.out.println(angka);
        System.out.println("angka dalam bentuk string yang dirubah dari integer :");
        System.out.println(hurufKedua);
    }
}
