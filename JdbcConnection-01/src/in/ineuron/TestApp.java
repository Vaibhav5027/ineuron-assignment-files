//11. Write a Java program that connects to a MySQL database using JDBC. The program
//should read data from a table and display the results in the console.

package in.ineuron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * To make connection with database we need to follow below steps 1.load the
 * driver for particular database 2.get the connection object 3. create the
 * statement 4.excecute the query 5.process the resultset close the connection
 * 
 */
public class TestApp {

	public static void main(String[] args) {

		Connection connection = null;
		ResultSet resultSet = null;
		Statement createStatement = null;
		// step 1 loading the driver class

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		Step 2 getting connection object from DriverManager
//		Connection is the interface 
		String url = "jdbc:mysql:///inuron";
		String user = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		step 3 preparing staement object;
		String select_query = "select sname,sage ,saddress from student";
		try {
			createStatement = connection.createStatement();
			resultSet = createStatement.executeQuery(select_query);

			while (resultSet.next()) {
				String sage = resultSet.getString(1);
				String saddress = resultSet.getString(2);
				String sname = resultSet.getString(3);
				System.out.println(sname + "\t" + sage + "\t" + saddress);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				createStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
