package in.ineuron.dao;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.ineuron.bo.BlogBO;
import in.ineuron.vo.BlogVO;


public interface BlogDAO {
	public void insert(BlogBO bo, HttpServletResponse response);

	public List<BlogVO> retriveAll();
}
