package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.userDao;
import Vo.User;

/**
 * Servlet implementation class loginCheak
 */
@WebServlet("/loginCheak")
public class loginCheak extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCheak() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.setCharacterEncoding("UTF-8");
		//request.getRequestDispatcher("login.jsp").forward(request, response);
		//response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("zhelifdjkf");

		request.setCharacterEncoding("UTF-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username);
        userDao user=new userDao();
        User res = new User();
                res = user.userCheak(username);
        if(res.password.equals(password)) {
        	request.getRequestDispatcher("manage.jsp").forward(request, response);
        }else {
        	
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
	}

}
