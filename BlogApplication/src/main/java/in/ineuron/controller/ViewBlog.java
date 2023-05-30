package in.ineuron.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.BlogDAO;
import in.ineuron.dao.BlogDaoImpl;
import in.ineuron.vo.BlogVO;

@WebServlet("/view")
public class ViewBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BlogDAO dao = new BlogDaoImpl();
		List<BlogVO> blogList = dao.retriveAll();
		request.setAttribute("bloglist", blogList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./view.jsp");
		requestDispatcher.forward(request, response);
	}

}
