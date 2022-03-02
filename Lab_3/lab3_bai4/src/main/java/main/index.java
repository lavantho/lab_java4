package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=CookieWeb.getCookie("username", request);
	String password=CookieWeb.getCookie("password", request);
	request.setAttribute("username", username);
	request.setAttribute("password", password);
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}
	//
	//
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("taikhoan");
		String passwd=request.getParameter("matkhau");
		String remember=request.getParameter("remember");
		if(username.equals("admin")==false) {
			request.setAttribute("message", "thông tin tài khoản hoặc mật khẩu không chính xác");
		}else if(passwd.length()<6) {
			request.setAttribute("message", "thông tin tài khoản hoặc mật khẩu không chính xác");
		}else {
			request.setAttribute("message", "Đăng nhập thành công");
			int time=remember==null?0:100*24;
			CookieWeb.add("username", username, time, response);
			CookieWeb.add("password", passwd, time, response);
		}
		doGet(request, response);
	}

}
