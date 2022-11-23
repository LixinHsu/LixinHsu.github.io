package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;

@WebServlet("/deletePorderController")
public class deletePorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public deletePorderController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		new porderDao().delete(id);
		
		response.sendRedirect("porder/deleteOrder.jsp");
	}

}
