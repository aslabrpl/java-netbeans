
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Koneksi {
    Connection con;
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/belajar_crud_ci","root","");
            JOptionPane.showMessageDialog(null, "Berhasil konek mblo");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal konek nub");
        }
        return con;
    }
}
