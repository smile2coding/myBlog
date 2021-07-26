package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.jdbcUtil;
import Vo.article;
public class articleDao {
	public articleDao() {
		
	}
public List<article> findBlogByType(String type) {
		
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		List<article> userList=new ArrayList<article>();
		try{
			conn=jdbcUtil.getconn();
			String sql="select * from article where type=?";
			st=conn.prepareStatement(sql);
			st.setString(1, type);
			rs=st.executeQuery();
			System.out.println("hello");
			while(rs.next()) {
				article art=new article();
				art.title=rs.getString("title");
				art.description=rs.getString("description");
				art.context=rs.getString("context");
				art.textId=rs.getInt("textId");
				art.time=rs.getString("time");
				art.type=rs.getString("type");
				userList.add(art);
				System.out.println("hello");
				System.out.println(art.title);
			}
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
		
		return userList;
	}
	public void updateBlogById(int textId,article art) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		
		
		try{
			conn=jdbcUtil.getconn();
			String sql="update article set title=?,description=?,context=?,time=?,type=? where textId=?";
			st=conn.prepareStatement(sql);
			st.setInt(6, art.getTextId());
			st.setString(1, art.getTitle());
			st.setString(2, art.getDescription());
			st.setString(3, art.getContext());
			st.setString(4, art.getTime());
			st.setString(5, art.getType());
			
		    
					
		    int n=st.executeUpdate();
			
			
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
		
	}
	public void deleteById(int textId) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		
		
		try{
			conn=jdbcUtil.getconn();
			String sql="delete from article where textId=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, textId);
					
		    int n=st.executeUpdate();
			
			
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
	}
	public article findBlogById(int textId) {
		
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		article art=new article();
		try{
			conn=jdbcUtil.getconn();
			String sql="select * from article where textId=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, textId);
			rs=st.executeQuery();
			while(rs.next()) {
			
				art.context=rs.getString("context");
				art.description=rs.getString("description");
				art.textId=rs.getInt("textId");
				art.title=rs.getString("title");
				art.time=rs.getString("time");
				art.type=rs.getString("type");
				
			}
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
		
		return art;
	}
	public void addBlog(int textId,String title,String description,String context,String time,String type) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;

		try{
			conn=jdbcUtil.getconn();
			String sql="insert into article(textId, title, description, context, time, type) values(?,?,?,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setInt(1, textId);
			st.setString(2, title);
			st.setString(3, description);
			st.setString(4, context);
			st.setString(5, time);
			st.setString(6, type);

			st.executeUpdate();
					
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
	}
	public int getCount() {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		int row=0;
		try{
			conn=jdbcUtil.getconn();
			String sql ="SELECT COUNT(*) FROM article";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			rs.next();
			row = rs.getInt(1);
			
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		return row;
	}
	
	public List<article> queryAll(){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		List<article> userList=new ArrayList<article>();
		
		try{
			conn=jdbcUtil.getconn();
			String sql="select * from article";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()){
				article art=new article();
				art.title=rs.getString("title");
				art.description=rs.getString("description");
				art.context=rs.getString("context");
				art.textId=rs.getInt("textId");
				art.time=rs.getString("time");
				art.type=rs.getString("type");
				userList.add(art);
			}
			
			
		}catch(Exception e){e.printStackTrace();
		
		}finally{
		
		  jdbcUtil.free(rs, st, conn);
		}
		
		return userList;
			
	}
}
