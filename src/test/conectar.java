package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class conectar {
    public static Connection connect(){
String url = "jdbc:mysql://localhost:3306/primaria";
String user = "root";
String pass = "";
Connection connection=null;
try
{
    connection = DriverManager.getConnection(url, user,pass);
    
}catch(SQLException e){
System.out.println(e.getMessage());
}
return connection;
}
    
    public static void query(String sql){
        try{
    Statement s = connect().createStatement();
    s.executeUpdate(sql);
        }catch(SQLException e){
System.out.println(e.getMessage());
}
    }
       public static ResultSet result(String sql){
           ResultSet r=null;
        try{
    Statement s = connect().createStatement();
    r=s.executeQuery(sql);
        }catch(SQLException e){
System.out.println(e.getMessage());
}
        return r;
    } 
}
