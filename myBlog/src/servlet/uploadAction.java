package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.alibaba.fastjson.JSONObject;


/**
 * Servlet implementation class uploadAction
 */
@WebServlet("/uploadAction")
@MultipartConfig
public class uploadAction extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	


	  
	        request.setCharacterEncoding("utf-8");

	        //��ȡ�ļ���part
	        Part part = request.getPart("upload");

	        //��ȡ�������Ϣ
	        String requestinfo = part.getHeader("content-disposition");
	        System.out.println(requestinfo);

	        //��ȡ�ļ��ĺ�׺��
	        String str = requestinfo.substring(requestinfo.lastIndexOf("."),requestinfo.length()-1);
	        System.out.println("��׺��:"+str);

	        //��ȡ�ϴ��ļ���Ŀ¼
	        String root = request.getServletContext().getRealPath("//upload");
	        System.out.println(root);

	        //���´����ļ���
	        String filename = UUID.randomUUID().toString()+str;
	        String url = root+"/"+filename;
	        System.out.println(url);
	        part.write(url);


	        //��Ӧ
	        PrintWriter out = response.getWriter();
	        //��ȡ·��
	        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
	        
	        JSONObject result = new JSONObject();
	      

	        String url1 = basePath+request.getContextPath()+"/upload/"+filename;
	 
	        result.put("uploaded",1);
	        result.put("fileName", filename);
	       
	        result.put("url", url1);
	        System.out.println(result);
	        out.write(result.toJSONString());
	        out.flush();
	        out.close();
	 
	}

}
