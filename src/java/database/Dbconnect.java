package database;
import java.sql.*;
public class Dbconnect
{
   public int set(String n,String e,String p) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/project","root","1234");
       PreparedStatement ps=con.prepareStatement("select email from signup where email='"+e+"';");
      ResultSet ob= ps.executeQuery();
       if(ob.next()!=true)
       {
       PreparedStatement pst=con.prepareStatement("insert into signup(name,email,password) values('"+n+"','"+e+"','"+p+"');");
       int i= pst.executeUpdate();
       
        if(i==1)
            return 1;
        else 
            return 0;
       }
       else 
           return 0;
        
    }
    
}