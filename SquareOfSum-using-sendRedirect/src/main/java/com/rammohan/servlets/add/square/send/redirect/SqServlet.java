package com.rammohan.servlets.add.square.send.redirect;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int k = Integer.parseInt(request.getParameter("k"));

		response.getWriter().println("Result is " + k * k);

	}
}
