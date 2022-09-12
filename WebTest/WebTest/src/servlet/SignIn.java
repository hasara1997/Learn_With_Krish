package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DB;
import model.User;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ServletContext sc = request.getServletContext();
		
		if(sc.getAttribute("db")!= null) {
			DB db = (DB) sc.getAttribute("db");
			boolean already = db.already(email);
			
			if(already == true) {
				User user = db.getUser(email);
				
				if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
					request.setAttribute("username",user.getName());
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
			}else {
				response.sendRedirect("index.jsp");
			}
		}
	
	}

}
