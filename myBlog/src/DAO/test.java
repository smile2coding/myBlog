package DAO;
import Vo.article;
import java.util.List;
public class test {

	public static void main(String[] args) {
		 
	        List<article> list=null;
	        articleDao art=new articleDao();
	        list=art.queryAll();
	        if(list!=null){
	        	for(int i=0;i<list.size();i++){
	        		String title =list.get(i).getTitle();
	        		System.out.println(title);
	        	}
	        	
	        }

	}

	
}
