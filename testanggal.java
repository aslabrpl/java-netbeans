

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class testanggal {
    public static void main(String args[]) {
       //  object tanggal
       Date date = new Date();
        
       // menampilkan waktu dan tanggal menggunakan toString()
        System.out.println("Sekarang tanggal berapa ya ?");
        System.out.println(date.toString());
        System.out.println("TANGGAL : "+date.getDate());
   }
}
