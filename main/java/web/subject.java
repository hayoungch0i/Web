package web;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class subject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String check=request.getParameter("ck");
		String data=request.getParameter("dataname").intern();
		
		if(check.equals("1")) { //과목 체크박스
			String list[]=data.intern().split("\\?");
			System.out.println(Arrays.toString(list));
		}
		else if(check.equals("2")) { //기타 선택
			System.out.println("기타: "+data);
			System.out.println("22222");
		}
	}

}
