/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappgl4bestpractices;

import controler.UserControler;
import technique.Crude;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class JavaAppGL4BestPractices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user= new User(1,"GL4","GL4@21023");
        UserControler uc = new UserControler();
        uc.insert(user);
        
        ArrayList<User> liste = uc.getall();
        for(User u : liste){
            System.out.println(u);
        }
        
        
                    
    }
    
}
