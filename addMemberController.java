package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;


@WebServlet("/addMemberController")
public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		String Name = request.getParameter("name");
		String Address = request.getParameter("address");
		String Phone = request.getParameter("phone");
		String Mobile = request.getParameter("mobile");
		
		member m = new member(Username,Password,Name,Address,Phone,Mobile);
		
		new memberDao().add(m);
		
		response.sendRedirect("member/addMemberSuccess.jsp");
	}

}
