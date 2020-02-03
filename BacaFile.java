
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class BacaFile {
    public static void main(String[] args) {
        try {
            File filenya = new File("D://data.txt");
            
            Scanner tulis = new Scanner(filenya);
            
            while (tulis.hasNext()) {
                String pecahData[] = tulis.next().split(Pattern.quote("|"));
                
                System.out.println(pecahData[1]);
            }
            
            tulis.close();
        } catch (FileNotFoundException ex) {
        }
    }
}
