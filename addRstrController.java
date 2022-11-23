package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.rstrDao;
import Model.rstr;

@WebServlet("/addRstrController")
public class addRstrController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addRstrController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rstrName = request.getParameter("rstrName");
		
		rstr r = new rstr(rstrName);
		
		new rstrDao().add(r);
		
		response.sendRedirect("rstr/finish.jsp");
	}

}
