package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.foodDao;
import Model.food;

@WebServlet("/addFoodController")
public class addFoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addFoodController() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer.parseInt(request.getParameter("rstrId"));
		String FoodName = request.getParameter("foodName");
		
		food f = new food(1,FoodName);
		
		new foodDao().add(f);
		
		response.sendRedirect("food/finish.jsp");
	}

}
