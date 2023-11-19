/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.ArrayList;
import javaappgl4bestpractices.User;
import technique.Crude;
import java.sql.ResultSet;


/**
 *
 * @author root
 */
public class UserControler {
    private Crude crude = new Crude();
       
    public boolean insert(User e) {
        String sql =  "INSERT INTO user(login, password) VALUES ('"
                + e.getLogin()+ "','" +e.getPwd()+ "')";
        System.out.println(sql);
        return crude.exeInsert(sql);    
    }
    
    public boolean update(int id, User e) {
        String sql = "UPDATE user SET login = '"+ e.getLogin()+ "',"
                + " password = '"+ e.getLogin()+ "' WHERE id= "+ id;
        System.out.println(sql);
        return crude.exeUpdate(sql);    
    }
    
    public boolean delete(User e) {
        String sql = "DELETE FROM user WHERE id= "+ e.getId();
        System.out.println(sql);
        return crude.exeDelete(sql);    
    }
       
    public ArrayList<User> getall() {
        try{
        String sql = "SELECT *  FROM user ";
        System.out.println(sql);
        ResultSet rs = crude.exeSelect(sql);  
        ArrayList<User> maliste =  new ArrayList<User>();
        while(rs.next()){
            User user = new User( rs.getInt(1), rs.getString(2), rs.getString(3)  ) ;
            maliste.add(user);  
        }
        return maliste;
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            return null;            
            }
        }

  
}
