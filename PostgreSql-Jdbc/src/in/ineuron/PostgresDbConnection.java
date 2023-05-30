package in.ineuron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class PostgresDbConnection {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/ineuron";
		String user = "root";
		String password = "postgres";
		Connection connection = null;
		PreparedStatement prepareStatement=null;

		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection(url, user, password);
		
			String insertQuery = "insert into student(sid,sname,sage,address) values(?,?,?,?)";
			 prepareStatement = connection.prepareStatement(insertQuery);
			
			BufferedReader reader= new BufferedReader(new FileReader("PostgresData.txt"));
			System.out.println(reader);
			String line = reader.readLine();
			while(line!=null) {
				String[] data = line.split(",");
				prepareStatement.setInt(1, Integer.parseInt(data[0]));
				prepareStatement.setString(2, data[1]);
				prepareStatement.setString(3, data[2]);
				prepareStatement.setString(4, data[3]);
				prepareStatement.addBatch();
//				System.out.println(data[0]);
				line=reader.readLine();
				
			}
		int[] executeBatch = prepareStatement.executeBatch();
	   System.out.println(Arrays.toString(executeBatch));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(prepareStatement!=null)
				try {
					prepareStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
}
