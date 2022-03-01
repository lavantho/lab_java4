package main;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form.php")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String>error=new ArrayList<>();
       DecimalFormat fm=new DecimalFormat("###.###");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void Error(HttpServletRequest request,HttpServletResponse response,String a,String b,String c) {
		
		if(a.isBlank()) {
			error.add("a is not emty");
			
		}
		if(b.isBlank()) {
			error.add("b is not emty");
			
		}
		if(c.isBlank()) {
			error.add("c is not emty");
			
		}
		if(a.matches("^[0-9]+$")==false) {
			error.add("a is not a number");
		}
		if(b.matches("^[0-9]+$")==false) {
			error.add("b is not a number");
		}
		if(c.matches("^[0-9]+$")==false) {
			error.add("c is not a number");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String dientich=request.getParameter("dientich");
if(dientich==null) {
	String a=request.getParameter("a");
	String b=request.getParameter("b");
	String c=request.getParameter("c");
Error(request, response,a,b,c);
 if(error.isEmpty()) {
	 request.setAttribute("data", "chu vi :"+(Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)));
 }else {
	 request.setAttribute("error", error);
	 return;
 }

request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}else {
		 double a=Double.parseDouble(request.getParameter("a"));
		 double b=Double.parseDouble(request.getParameter("b"));
		 double c=Double.parseDouble(request.getParameter("c"));
	  
	    double p=(a+b+c)/2;
	    double dt=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	    if(error.isEmpty()) {
	    	request.setAttribute("data", "Dien tich"+fm.format(dt));
	    	request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	    }else {
	    	request.setAttribute("error", error);
	    	request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	    }
		
	}
	}
}
