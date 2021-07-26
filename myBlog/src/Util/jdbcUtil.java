package Util;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public final class jdbcUtil {
	private static String driver=null;
	private static String url=null;
	private static String user=null;
	private static String password=null;
	private static Properties pr=new Properties();
	
	private jdbcUtil(){}
	
	static{
		try{
			pr.load(jdbcUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			driver=pr.getProperty("driver");
			url=pr.getProperty("url");
			user=pr.getProperty("user");
			password=pr.getProperty("password");
			Class.forName(driver);
			
		}catch(Exception e){e.printStackTrace();}
		
	}
	
	public static Connection getconn() throws SQLException{
		return DriverManager.getConnection(url,user,password);
		
	}
	
	public static void free(ResultSet rs, Statement st, Connection conn){
		if(rs!=null){
			try{
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		if(st!=null){
			try{
				st.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
