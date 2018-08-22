package com.iunigo.apitest.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;


public class Dbconnection {
	@Test
    public static void connect(){

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String user = "root";
        String password = "pass";
        
        String query = "SELECT VERSION()";

        try (Connection con = (Connection) DriverManager.getConnection(url, user, password);
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query)) {

            if (rs.next()) {
                
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            
            Logger lgr = Logger.getLogger(query);
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } 
    }
}
