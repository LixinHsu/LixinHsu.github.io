package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;
import Model.porder;

@WebServlet("/updatePorderController")
public class updatePorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updatePorderController() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int porderId = Integer.parseInt(request.getParameter("porderId"));
		int memberId = Integer.parseInt(request.getParameter("memberId"));
		int rstrId = Integer.parseInt(request.getParameter("rstrId"));
		int foodId = Integer.parseInt(request.getParameter("foodId"));
		
		porder p = new porder(memberId, rstrId, foodId);
		
		p.setMemberId(memberId);
		p.setRstrId(rstrId);
		p.setFoodId(foodId);
		
		new porderDao().update(p);
		
		response.sendRedirect("porder/updatePorder.jsp");
	}

}