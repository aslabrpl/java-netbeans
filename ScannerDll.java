
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ScannerDll {
    public static void main(String[] args) throws IOException{
        String nama;
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.out.print("input namamu : ");
        nama = BR.readLine();
        System.out.println(nama);
    }
}
