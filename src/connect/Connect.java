package connect;
import java.sql.*;
import java.sql.DriverManager;


public class Connect {
    static Connection connection() {
         try{
     java.sql.Connection conn = DriverManager.getConnection("jdbc:odbc:dsn2", "", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
   }
    
}
