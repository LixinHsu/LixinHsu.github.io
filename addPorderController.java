package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;
import Model.porder;

@WebServlet("/addPorderController")
public class addPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer.parseInt(request.getParameter("memberId"));
		Integer.parseInt(request.getParameter("rstrId"));
		Integer.parseInt(request.getParameter("foodId"));
		
		porder p = new porder(1,1,1);
		
		new porderDao().add(p);
		
		response.sendRedirect("porder/finish.jsp");
	}

}
