/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class MyConnexion {
    
    
    private String url="jdbc:mysql://localhost:3306/gl4_tp_db";
    private String login="root";
    private String pwd="";
    
    private static Connection connection;
    
    private static MyConnexion instance;

    
      private MyConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,pwd);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            System.exit(0);
        }

    }
    
    
     
    public static MyConnexion getInstance(){
        if(instance == null){
            instance = new MyConnexion();
        }
        return instance;
    }

    /**
     * @return the connection
     */
    public static Connection getConnection() {
        return connection;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
}
