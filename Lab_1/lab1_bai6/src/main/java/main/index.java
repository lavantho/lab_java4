package main;

import java.io.IOException;
import java.text.DecimalFormat;

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
	DecimalFormat fm=new DecimalFormat("####");
       
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
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	double chieudai=Double.parseDouble(request.getParameter("chieudai"));
	double chieurong=Double.parseDouble(request.getParameter("chieurong"));
	request.setAttribute("chuvi", fm.format((chieudai+chieurong)*2));
	request.setAttribute("dientich", fm.format(chieudai*chieurong));
	request.getRequestDispatcher("/view/result.jsp").forward(request, response);
	
	
	}

}
