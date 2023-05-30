package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.ineuron.bo.BlogBO;
import in.ineuron.utility.Utility;
import in.ineuron.vo.BlogVO;

public class BlogDaoImpl implements BlogDAO {
	Connection connection = Utility.getConnection();

	@Override
	public void insert(BlogBO bo,HttpServletResponse res) {
		
		String InsertQuery="Insert into blog(`title`,`description`,`content`)values(?,?,?);";
		
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(InsertQuery);
			prepareStatement.setString(1,bo.getTitle());
			prepareStatement.setString(2, bo.getDiscription());
			prepareStatement.setString(3, bo.getContent());
			
			 int rowAffected = prepareStatement.executeUpdate();
			 if(rowAffected==1) {
				try {
					res.setContentType("text/html");
					res.getWriter().println("<h1>record inserted succesfully</h1>");
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<BlogVO> retriveAll() {
		String selectQuery="select id,title,description,content from blog";
		List<BlogBO> listBo=new ArrayList<BlogBO>();
		List<BlogVO> listVo=new ArrayList<BlogVO>();
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
			ResultSet rs = prepareStatement.executeQuery();
			
			while(rs.next()) {
				BlogBO bo=new BlogBO();
				bo.setId(rs.getInt(1));
				bo.setTitle(rs.getString(2));
				bo.setDiscription(rs.getString(3));
				bo.setContent(rs.getString(4));
				listBo.add(bo);
			}
			BlogVO blogVo;
			for (BlogBO blogBO : listBo) {
				 blogVo = new BlogVO();
				 blogVo.setId(blogBO.getId().toString());
				 blogVo.setTitle(blogBO.getTitle().toUpperCase());
				 blogVo.setDiscription(blogBO.getDiscription());
				 blogVo.setContent(blogBO.getContent());
				 listVo.add(blogVo);
			}
			System.out.println(listVo);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listVo;
	}

}
