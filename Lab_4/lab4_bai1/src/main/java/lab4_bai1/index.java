package lab4_bai1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

private void getItem( HttpServletRequest request,HttpServletResponse repost) {
	Item item=new Item();
	item.setHinhAnh("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.notebookcheck.net%2FiPhone-14-Pro-Apple-finalises-design-without-under-display-Touch-ID-as-trial-production-begins.602199.0.html&psig=AOvVaw027vBsEDu4BzbdbJboKsq6&ust=1646404711732000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNCW2tOVqvYCFQAAAAAdAAAAABAD");
	item.setMota("Hinh anh");
	request.setAttribute("item", item);
	
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 getItem(request, response);
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
