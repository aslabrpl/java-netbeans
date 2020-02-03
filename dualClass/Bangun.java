/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualClass;

/**
 *
 * @author ASUS
 */
public class Bangun extends Bangunan {
    public void hitungLuas(int panjang, int lebar){
        int luas = panjang*lebar;
        System.out.println("luas = "+luas);
    }
    public void hitungLuas(int lebar){
        int luas = lebar*lebar;
        System.out.println("luas = "+luas);
    }
}
