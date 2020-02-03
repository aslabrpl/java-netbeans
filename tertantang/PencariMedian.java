/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tertantang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * * @author ASUS
 */
public class PencariMedian {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int[] data;
        int tengah;
        int jData;
        
        System.out.print("MASUKKAN JUMLAH DATA : ");
        jData = masuk.nextInt();
        data = new int[jData];
        for (int i = 0; i < jData; i++) {
            System.out.print("ANGKA KE-"+(i+1)+" : ");
            data[i] = masuk.nextInt();
        }
        
        int jika = jData % 2;
//        MENGURUTKAN NILAI PADA ARRAY
        Arrays.sort(data);
        System.out.println("DATA DIURUT DARI YANG TERKECIL : ");
        for (int i = 0; i < jData; i++) {
            System.out.println(data[i]);
        }
        
        System.out.println("MEANNYA ADALAH : ");
        for (int i = 0; i < jData; i++) {
//            int hasil =  (data[i]/data.length;
        }
        
        if (jika == 0) {
            System.out.println("DATA GENAP");
            int tengah1 = ((jData/2)-1);
            int tengah2 = ((jData/2));
            System.out.println("MEDIANNYA ADALAH : "+data[tengah1]+" DAN "
                                                    +data[tengah2]);
        }else{
            System.out.println("DATA GANJIL");
            tengah = (((jData+1)/2)-1);
            System.out.println("MEDIANNYA ADALAH : "+data[tengah]);
        }
    }
}
