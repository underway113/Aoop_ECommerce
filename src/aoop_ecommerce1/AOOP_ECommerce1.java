/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoop_ecommerce1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * Jeremy Adam
 * Joshua Renael
 * Kelvin Novaro
 */
public class AOOP_ECommerce1 {

    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        ResultSet res = null;
        String query = "SELECT * FROM Cart";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            state = con.createStatement();
            res = state.executeQuery(query);
            while(res.next()){
                int id = res.getInt("CartID");
                String namaBarang = res.getString("NamaBarang");
                int jumlah = res.getInt("Jumlah");
                int harga = res.getInt("Harga");
                System.out.println(id + namaBarang + jumlah + harga);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       new LoginFrame().setVisible(true);
    }
    
}
