package in.ineuron;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**here we mainetain the user name in second servlet By ussing Session object
 * 1) so in firsr servlet we add session object 
 * 2) in second servlet we get name which are added in first servlet for that we provide one link
 */

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username=request.getParameter("username");
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		//	we give link here to go to second servlet
		writer.println("<center>");
		writer.println("<h1><a href='./second' style='color:green;'>Go to second servlet</a></h1>");
		writer.println("</center>");
	}

}
