//��������Ҫ�İ�
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	//��дdoGet����
	public static String username;
	public static String password;
	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
     throws ServletException,
            IOException {
	    username = request.getParameter("username");   
	    password = request.getParameter("password");      
		
		//�������˴�ӡ��Ϣ
		System.out.println("username=" + username);
		System.out.println("password=" + password);
	/*	Service.insert(username, password);*/
		 String sql ="insert into test.user (username,password) values ('"+username+"','"+password+"')"; 
		 Jdbc.update(sql);
		//���ñ����ʽ
		response.setContentType("text/html;charset=GB18030");
		
		//����htmlҳ��
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");	
		response.getWriter().println("<title>注册页面</title>");	
		response.getWriter().println("</head>");	
		response.getWriter().println("<body>");	
		response.getWriter().println("用户名" + username + "注册成功");	
		response.getWriter().println("</body>");	
		response.getWriter().println("</html>");
		}    

	
	//��дdoPost����
	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
    throws ServletException,
            IOException {
		doGet(request, response);               	
	}     
}
