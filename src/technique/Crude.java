/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technique;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Crude {
        MyConnexion mc = MyConnexion.getInstance();
        
        
        public boolean exeInsert(String sql){
            try {
                Statement statement = mc.getConnection().createStatement();
                statement.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                return false;
            }
        
        }
        
        
        public boolean exeUpdate(String sql){
            try {
                Statement statement = mc.getConnection().createStatement();
                statement.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
        
         
        public boolean exeDelete(String sql){
            try {
                Statement statement = mc.getConnection().createStatement();
                statement.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
        
        public ResultSet exeSelect(String sql){
            try {
                Statement statement = mc.getConnection().createStatement();
                ResultSet rs;
                rs = statement.executeQuery(sql);
                return rs;
            } catch (SQLException ex) {
                 return null;
            }

        }
        
}
