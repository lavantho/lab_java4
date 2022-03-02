package main;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig()
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File dir = new File(request.getServletContext().getRealPath("/files"));
		System.out.print(dir);
		if(!dir.exists()) { // tạo nếu chưa tồn tại
		dir.mkdirs();
		}
		Part photo=request.getPart("photo_file");
      File photoFile=new File(dir,photo.getSubmittedFileName());
      photo.write(photoFile.getAbsolutePath());
      Part doc = request.getPart("doc_file"); 
      File docFile = new File(dir, doc.getSubmittedFileName());
      doc.write(docFile.getAbsolutePath());
      request.setAttribute("img", photoFile);
      request.setAttribute("doc", docFile);
      request.getRequestDispatcher("/view/result.jsp").forward(request, response);
	}

}
