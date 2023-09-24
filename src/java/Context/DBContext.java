/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DBContext {
    public Connection KetNoiCSDl()
    {
        Connection conn = null;
        String url="jdbc:mysql://localhost:3306/qlnt";
        String username="root";
        String password="";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url, username, password);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return conn;
    }      
   
           
}
