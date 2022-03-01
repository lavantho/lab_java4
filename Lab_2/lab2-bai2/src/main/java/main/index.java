package main;

import java.io.IOException;
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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

	private String getQuoctich(String quoctich) {
		if(quoctich.equals("vn")) {
			return "Việt Nam";
		}
		if(quoctich.equals("us")) {
			return "US";
		}
		if(quoctich.equals("UK")) {
			return "UK";
		}
		return "Korean";
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 request.setCharacterEncoding("UTF-8");
		String tendangnhap=request.getParameter("user");
	  String passwd=request.getParameter("passwd");
	  String gioitinh=request.getParameter("1")=="nam"?"Nam":"Nữ";
	  String giadinh=request.getParameter("giadinh")=="true"?"đã có gia đình":"Độc thân";
	  String quoctich=getQuoctich(request.getParameter("quoctich"));
	  String ghichu=request.getParameter("ghichu");
	  request.setAttribute("tendangnhap","Tên đăng nhập"+tendangnhap);
	  request.setAttribute("passwd","Mật khẩu"+ passwd);
	  request.setAttribute("gioitinh", "Giới tính :"+gioitinh);
	  request.setAttribute("giadinh", "Gia đình"+giadinh);
	  request.setAttribute("quoctich", "Quốc tịch"+quoctich);
	  request.setAttribute("ghichu","ghi chú"+ghichu);
	  request.getRequestDispatcher("/view/result.jsp").forward(request, response);
	}

}
