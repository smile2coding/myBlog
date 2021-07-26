package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.articleDao;

/**
 * Servlet implementation class addBlog
 */
@WebServlet("/addBlog")
public class addBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
	    articleDao art=new articleDao();
	    String id =null;
		UUID uuid = UUID.randomUUID();
		id = uuid.toString();
		
		//去掉随机ID的短横线
		id = id.replace("-", "");
		
		//将随机ID换成数字
		int textId = id.hashCode();
		//去绝对值
		textId = textId < 0 ? -textId : textId;
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		   //响应
        PrintWriter out = response.getWriter();
		Date date = new Date(System.currentTimeMillis());
		String time =formatter.format(date);
		String title=request.getParameter("title");
		String context=request.getParameter("context");
		String type =request.getParameter("type");
		String description =request.getParameter("description");
		art.addBlog(textId, title, description, context, time, type);
		out.println("添加成功！");

 ;
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
