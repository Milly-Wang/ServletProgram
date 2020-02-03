package com.milly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletForScope
 */
@WebServlet(urlPatterns= {"/ServletForScope"},
initParams={@WebInitParam(name="defaultUser", value="milly")})
public class ServletForScope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null) {
			session.setAttribute("saveduserName", userName);
			context.setAttribute("saveduserName", userName);
		}
		w.println("session Parameter Username as:    " + (String)session.getAttribute("saveduserName") + "  ");
		w.println("context Parameter Username as:    " + (String)context.getAttribute("saveduserName") + "  ");
		w.println("initial Parameter Username as:    " + getServletConfig().getInitParameter("defaultUser"));   
		
	}

}
