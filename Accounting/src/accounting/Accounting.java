/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounting;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author klemu
 */
public class Accounting {
    Connection con = null;
    
    public static Connection connectDB(){    
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:akunting.sqlite");
            System.out.println("Connection Success!!");
            
            return con;
        }catch(Exception e){
            System.out.println("Connection Failed"+e);
            return null;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connectDB();
    }
    
}
