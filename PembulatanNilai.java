
import static java.lang.Math.round;
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
public class PembulatanNilai {    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double hai = masuk.nextDouble();
        double bulat =  round(hai);
        System.out.println(hai);
        System.out.println(bulat);
    }
}
