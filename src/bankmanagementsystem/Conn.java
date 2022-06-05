package bankmanagementsystem;

import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
   
    Conn(){
        
        try{
         //DRIVER NAME 
          c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root" ,"chirag@123");//CREATE connection
          s=c.createStatement();//with the help of Satement you can execute qurey
        }
        catch(Exception e)
        { 
            System.out.print(e);
        }
    }
}