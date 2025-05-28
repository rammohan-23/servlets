package com.rammohan.login;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		LoginDao loginDao = new LoginDao();
		if (loginDao.check(username, password)) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", username);

			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
