package com.web_mini_proj.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_mini_proj.model.DAOService;
import com.web_mini_proj.model.DAOServiceImpl;
@WebServlet("/update")
public class UpdateRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateRegistration() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("emailId");
		String mobile = request.getParameter("mobile");
		
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/update.jsp");
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		
        DAOService service =new DAOServiceImpl();
		
		service.connectDB();
		
		service.updateRegistration(email,mobile);
		
          ResultSet registrations=service.ListAll(); 
		
		request.setAttribute("registrations", registrations);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_reg.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}
