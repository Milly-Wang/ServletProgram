package com.milly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Srv2
 */
//@WebServlet("/Srv2")
public class Srv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		w.println("<html><head><title>Servlet2</title></head>");
		w.println("<body><p>Username is :" + name + "<p>Password is: " + password + "</body></html>");
		
	}

}
