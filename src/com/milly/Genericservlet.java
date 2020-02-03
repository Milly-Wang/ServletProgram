package com.milly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Genericservlet
 */
@WebServlet("/Genericservlet")
public class Genericservlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text.html");
		PrintWriter w = res.getWriter();
		w.print("<Html><body>");
		w.print("<h1>Welcome to Generic Servlet</h1>");
		w.print("</body></html>");
	}

}
