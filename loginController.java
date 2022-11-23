package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginController() {
        super();
        }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");

		/*List<member> l = new memberDao().queryMember(Username, Password);

		if(l.size()!=0)
		{
			member[] m=l.toArray(new member[l.size()]);
			request.getSession().setAttribute("M", m[0]);
			
			response.sendRedirect("member/loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("member/loginError.jsp");
		}*/
		response.sendRedirect("member/loginSuccess.jsp");
		//response.sendRedirect("member/loginError.jsp");

	}

}