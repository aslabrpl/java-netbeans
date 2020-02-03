/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tertantang;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Modular {
    public static void main(String[] args) {
        System.out.println("PENCARI FACTORIAL");
        Scanner masuk = new Scanner(System.in);
        int banyak = masuk.nextInt();
        int pembagi = masuk.nextInt();
        int hai = 40;
        for (int i = 1; i < banyak; i++) {
            hai = (hai*i) % pembagi;
            System.out.println(hai);
        }
        
    }
}
