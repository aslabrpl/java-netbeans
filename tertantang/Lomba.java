/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tertantang;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lomba {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        if (a<b) {
            System.out.println("error");
        }else if(a>b){
            if (a > b) {
                a = a+a;
            }else{
                b = b+b;
            }
        }
    }
}
