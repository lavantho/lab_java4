package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounterServelet
 */
@WebServlet("/HitCounterServelet.php")
public class HitCounterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      int count;
      Path path=Paths.get("/home/kali/Desktop/Learn_Java/Java4/Java4/Lab/Lab_2/demo.txt");
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
Files.write("/home/kali/Desktop/Learn_Java/Java4/Java4/Lab/Lab_2/text.txt",String.valueOf(count).getBytes(),null);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
    	count++;
    	req.setAttribute("count", count);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		init();
		service(request, response);
		destroy();
	
	}

}
