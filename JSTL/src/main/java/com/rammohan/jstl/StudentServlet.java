package com.rammohan.jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> students = Arrays.asList(new Student(1, "Ram"), new Student(2, "Raju"));
		
		request.setAttribute("studs", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("student.jsp");
		dispatcher.forward(request, response);
	}
}
