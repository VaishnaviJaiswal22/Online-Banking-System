package utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DatabaseConnection {
		
	
	   public static  Connection getConnection() throws SQLException {
		   
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCproject", "root", "Vaishu@2208") ;
		   
		    return conn  ;
		    
	   }
	  
	  
	  
	 
}
