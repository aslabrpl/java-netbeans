/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class phytagoras {
    int panjang;
    int lebar;
    double barbar;
    
    public void segitiga(){
        this.panjang = 3;
        this.lebar = 4;
        double phy = Math.pow(panjang,2)+Math.pow(lebar,2);
        //Math.pow digunakan untuk pengkuadratan
        //Math.sqrt digunakan untuk pengakaran
        this.barbar = Math.sqrt(phy);
        System.out.println(barbar);
    }
    
    public static void main (String[]args){
        phytagoras segiempat = new phytagoras();
        
        segiempat.segitiga();
    }
}
