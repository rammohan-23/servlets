package com.rammohan.servlets.cubeOfSum.httpSession;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CubeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		int k = (int) session.getAttribute("k");

		response.getWriter().println("Result is " + k * k * k);

	}
}
