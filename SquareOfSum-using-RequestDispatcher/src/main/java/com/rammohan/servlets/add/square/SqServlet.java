package com.rammohan.servlets.add.square;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse response) throws IOException {
		int k = (int) req.getAttribute("k");

		response.getWriter().println("Result is " + k * k);

	}
}
