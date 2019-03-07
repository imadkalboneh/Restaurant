package handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;

import objects.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		int month = Integer.parseInt(request.getParameter("month"));
		int day = Integer.parseInt(request.getParameter("day"));
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		
		String prompt = "<font size='2' color='red'>";
		String path = "";
		
		DataAccess da = (DataAccess) session.getAttribute("da");
		
		if(da == null) {
			da = new DataAccess();
		}

		if(pass1.equals(pass2)) 
		{
			if(da.memberExists(email)) 
			{
				path += "register.jsp";
				prompt += "An account with this email has already been made! </font>"
						+ "<br>"
						+ "<font size='2'><a href='forgot.jsp'>Forgot your password?</a></font><br><br>";
				session.setAttribute("prompt", prompt);
			} 
			
			else 
			{
				Member m = new Member(fname, lname, month, day, phone, email, pass2, null);
				da.addMember(m);
				record(fname, phone);
				path += "home.jsp";
				
				m = da.getMember(email);
				session.setAttribute("da", da);
				session.setAttribute("m", m);
			}
		}
		
		else 
		{
			prompt += "Please make sure the passwords match</font>";
			path += "register.jsp";
		}
		
		response.sendRedirect(path);
	}
	
	public void record(String name, String number)
	{
		try
		{
			FileWriter file = new FileWriter("temp.txt");
			file.write(name + "\n" + number);
			file.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
