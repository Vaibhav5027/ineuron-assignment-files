package in.ineuron.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.utility.Utility;

public class UserServiceImpl implements UserServices {
	Connection connection = Utility.getConnection();
	Statement createStatement = null;
	PreparedStatement prepareStatement=null;
	ResultSet resultSet=null;

	@Override
	public void select() {
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

		} catch (Exception e) {
         System.out.println("Something wrong !!");
		}
	}

	@Override
	public void insert() {
       try {
    	String insertQuery="insert into student(sname,sage,saddress) values(?,?,?)";
		prepareStatement = connection.prepareStatement(insertQuery);
		prepareStatement.setString(1, "Qinton d-cock");
		prepareStatement.setInt(2, 32);
		prepareStatement.setString(3,"LSG" );
		
		int rowAffected = prepareStatement.executeUpdate();
		if(rowAffected==1) {
			System.out.println("Data Inserted Succesfully");
		}
		else {
			System.out.println("error while inserting data");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void update(Integer sid) {
		try {
	    	String updateQuery="update student set sname='quinton' where sid=?";
			prepareStatement = connection.prepareStatement(updateQuery);
			prepareStatement.setInt(1, sid);
			
			
			int rowAffected = prepareStatement.executeUpdate();
			connection.commit();
			if(rowAffected==1) {
				System.out.println("Data updated Succesfully");
			}
			else {
				System.out.println("error while updating data");
			}
		} catch (SQLException e) {
		
			try {
				connection.rollback();
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
		}  
	}

	@Override
	public void delete(Integer sid) {
		try {
		String deleteQuery="delete from student where sid=?";
		
			prepareStatement = connection.prepareStatement(deleteQuery);
			prepareStatement.setInt(1, sid);
			
			int rowAffected = prepareStatement.executeUpdate();
			if(rowAffected==1) {
				System.out.println("data deleted Succesfully");
			}
			else {
				System.out.println("error while deleting data");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
