/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tertantang;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LampuMati {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int nilai = masuk.nextInt();
        int hasil = (int) round(Math.sqrt(nilai));
        System.out.println(hasil);
        if (hasil * hasil != nilai) {
            System.out.println((hasil*hasil));
            System.out.println("LAMPU MATI");
        }else{
            System.out.println((hasil*hasil));
            System.out.println("LAMPU HIDUP");
        }
    }
}
