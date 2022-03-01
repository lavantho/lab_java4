package lab1_bai2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeServelet/index")
public class HomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Integer>list= new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServelet() {
        super();
        
    }
 private void add() {
	 for(int i=0;i<10;i++) {
		 list.add(i);
	 }
 }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		add();
		request.setAttribute("message", list);
		request.setAttribute("hello","Hello serverlet");
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
