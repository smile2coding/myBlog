package DAO;



import Util.jdbcUtil;
import Vo.User;

import java.sql.*;
public class userDao {
	
	public userDao(){}
	
	
	//����idֵ��ѯ���ݿ��е�ѧ����Ϣ
	

	public User userCheak(String username){
		User user=new User();
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		
		
		try{
			conn=jdbcUtil.getconn();
			String sql="select * from user where username=username";//+username+"'";
			st=conn.prepareStatement(sql);
			
			rs=st.executeQuery();
			while(rs.next()){
				

				user.username=rs.getString("username");
				user.password=rs.getString("password");
				
			
			}
			
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
		
		return user;
	}
	
	
	
	

}
