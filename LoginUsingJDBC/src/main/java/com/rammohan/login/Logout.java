package com.rammohan.login;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("username");
		httpSession.invalidate();
		
		response.sendRedirect("login.jsp");
	}
}
