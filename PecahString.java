
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PecahString {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
//        String hai = "234|mas  irfan|jauh|124";
        String kamu = masuk.nextLine();
        System.out.println(kamu);
        String pecah[] = kamu.split(Pattern.quote("|"));
        System.out.println(pecah[1]);
    }
}
