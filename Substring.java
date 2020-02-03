/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Substring {    
    public static void main(String[] args) {
        String hai = "kamu itu sangat cantik sekali";
        System.out.println(hai.startsWith("kamu"));
        System.out.println(hai.endsWith("sekali"));
        System.out.println(hai.substring(9));
        System.out.println(hai.indexOf("sangat"));
        System.out.println(hai.toUpperCase());
        System.out.println(hai.length());
//        System.out.println();
    }
}
