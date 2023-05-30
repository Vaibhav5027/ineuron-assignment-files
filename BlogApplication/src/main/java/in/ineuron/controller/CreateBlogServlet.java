package in.ineuron.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.bo.BlogBO;
import in.ineuron.dao.BlogDAO;
import in.ineuron.dao.BlogDaoImpl;
import in.ineuron.vo.BlogVO;

@WebServlet("/createpost")
public class CreateBlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BlogDAO dao = new BlogDaoImpl();

		BlogVO vo = new BlogVO();
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		vo.setDiscription(request.getParameter("discription"));
		BlogBO bo = new BlogBO();
		bo.setTitle(vo.getTitle());
		bo.setDiscription(vo.getDiscription());
		bo.setContent(vo.getContent());
		dao.insert(bo,response);
	}

}
