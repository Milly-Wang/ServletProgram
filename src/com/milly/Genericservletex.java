package com.milly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Genericservletex
 */
@WebServlet("/Genericservletex")
public abstract class Genericservletex extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text.html");
		PrintWriter w = res.getWriter();
		w.print("<Html><body>");
		w.print("<h1>Welcome to Generic Servlet</h1>");
		w.print("</body></html>");
	}

}
