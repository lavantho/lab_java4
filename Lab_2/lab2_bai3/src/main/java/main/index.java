package main;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index.php")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

private String getQuoctich(String quoctich) {
	if(quoctich.equals("vn")) {
		return "Việt Nam";
	}
	if(quoctich.equals("vn")) {
		return "Việt Nam";
	}
	if(quoctich.equals("us")) {
		return "Mỹ";
	}
	if(quoctich.equals("nga")) {
		return "Nga";
	}
	return "Ukraina";
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("user");
	String passwd=request.getParameter("passwd");
	String gioitinh=request.getParameter("gt")=="nam"?"Nam":"Nữ";
	String giadinh=request.getParameter("gd")=="gd"?"Đã có gia đình":"chưa có gia đình";
	String[]sothich=request.getParameterValues("sothich");
	String quoctich=getQuoctich(request.getParameter("quoctich"));
	String ghichu=request.getParameter("ghichu");
  
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("username", "Username "+username);
	request.setAttribute("passwd", "password"+passwd);
	request.setAttribute("male", "Giới tính"+gioitinh);
	request.setAttribute("sothich","Sở thích"+ Arrays.toString(sothich));
	request.setAttribute("giadinh","Gia đình : "+giadinh);
	request.setAttribute("quoctich", quoctich);
	request.setAttribute("ghichu","ghi chú :"+ghichu);
	request.getRequestDispatcher("/view/result/result.jsp").forward(request, response);

	}

}
