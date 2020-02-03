
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Percabangan {
    public static void main(String[] args) {
//        Scanner masuk = new Scanner(System.in);
//        String kamu = masuk.next();
////        String isi = kamu;
////        System.out.println(isi);
//        if ("ya".equals(kamu)) {
//            System.out.println("berhasil");
//        }else if("hai".equals(kamu)){
//            System.out.println("noob");
//        }else if("tetew".equals(kamu)){
//            System.out.println("tikentod");
//        }else{
//            System.out.println("babi");
//        }
        Scanner masuk = new Scanner(System.in);
        int awal = masuk.nextInt();
        int akhir = masuk.nextInt();
        if (awal < akhir) {
            System.out.println("hai");
        } else {
            System.out.println("y");
        }
    }
}
