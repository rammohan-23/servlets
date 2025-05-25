package com.rammohan.servlets.add.square;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		req.setAttribute("k", i+j);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, response);
		
	}
}
