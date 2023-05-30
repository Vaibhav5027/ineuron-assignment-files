package in.ineuron;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.utility.Utility;

@WebServlet("/displayList")
public class DisplyPlayerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = Utility.getConnection();
	Statement createStatement = null;
	PreparedStatement prepareStatement = null;
	ResultSet resultSet = null;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		String select_query = "select sname,sage ,saddress from student";
		try {
			createStatement = connection.createStatement();
			resultSet = createStatement.executeQuery(select_query);
			writer.println("<center>");
			writer.println("<h1 style='color:blue;'>List Of Players</h1><table border='1'>");
			writer.print("<tr><th>Name</th><th>Age </th><th>Address </th>");
			while (resultSet.next()) {
				String sname = resultSet.getString(1);
				String sage = resultSet.getString(2);
				String saddress = resultSet.getString(3);
				writer.print("<tr><td>"+sname+" </td><td>"+sage+" </td><td>"+saddress+"</td>");
			}
			writer.println("</table>");
			writer.println("</center>");

		} catch (Exception e) {
			System.out.println("Something wrong !!");
		}

	}

}
