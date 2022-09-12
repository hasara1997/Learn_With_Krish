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
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		//System.out.println("email: "+email+", "+"password: "+password);
		
		ServletContext sc = request.getServletContext();
		if(sc.getAttribute("db") != null) {
			DB db = (DB) sc.getAttribute("db");
			
			if(db.already(email) == false) {
				
				User user = new User(email,name,password);
				System.out.println(db.add(user));
				
				response.sendRedirect("Login.jsp");
			}else {
				System.out.println("Already Registered!");
				response.sendRedirect("Login.jsp");
			}
		}
	}

}
