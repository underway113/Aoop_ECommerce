/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoop_ecommerce1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * Jeremy Adam
 * Joshua Renael
 * Kelvin Novaro
 */
public class AOOP_ECommerce1 {

    public static void main(String[] args) {
        Connection con = null;
        String query = "DELETE FROM CART";
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TokipedDB");
            PreparedStatement deleteInit = con.prepareStatement(query);
            deleteInit.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       new LoginFrame().setVisible(true);
    }
    
}
