package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.articleDao;
import Vo.article;

/**
 * Servlet implementation class saveBlog
 */
@WebServlet("/saveBlog")
public class saveBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveBlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		articleDao exe =new articleDao();
		article art=new article();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
	   // articleDao art=new articleDao();
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		   //响应
        PrintWriter out = response.getWriter();
		Date date = new Date(System.currentTimeMillis());
		art.textId =Integer.parseInt(request.getParameter("textId"));
		art.time =formatter.format(date);
		art.title=request.getParameter("title");
		art.context=request.getParameter("context");
		art.type =request.getParameter("type");
		art.description =request.getParameter("description");
		exe.updateBlogById(art.textId, art);
		request.getRequestDispatcher("info.jsp").forward(request, response);
		out.println("更新成功");
	}

}
