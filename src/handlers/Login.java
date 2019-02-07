package handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import objects.DataAccess;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();		
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		DataAccess da = (DataAccess) session.getAttribute("da");
		
		if(da == null) 
		{
			da = new DataAccess();
			session.setAttribute("da", da);
		}
		
		if(!da.memberExists(email) || da.confirmPass(email, pass)) {
			session.setAttribute("m", da.getMember(email));
			response.sendRedirect("home.jsp");
		}
	}

}
