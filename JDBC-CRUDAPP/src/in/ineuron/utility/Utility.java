package in.ineuron.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	static Connection conn=null;
	static String url="jdbc:mysql:///inuron";
	static String user="root";
	static String password="root";
   public static Connection getConnection() {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   conn = DriverManager.getConnection(url, user, password);
		   
	   }catch(Exception e) {
		   System.out.println();
		   System.out.println("error while making connection");
	   }
	  return conn; 
   }
 
   
}
