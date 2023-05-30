package in.ineuron;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeMsgGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  String name=request.getParameter("username");
	  out.println("<center>");
	  out.println("<h1 style='color:red;'> Hi "+name+" welcome to our site" );
	  out.println("<h1>"+"</h1>");
	  out.println("</center>");
	}

}
