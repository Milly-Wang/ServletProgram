package com.milly;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//import com.milly.Connection;
//import com.milly.Exception;
//import com.milly.PreparedStatement;
//import com.milly.PrintWriter;
//import com.milly.String;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter w=response.getWriter();
		String a=request.getParameter("uname");
		String b=request.getParameter("upass");
		String c=request.getParameter("umail");
		String d=request.getParameter("uphone");
		String e=request.getParameter("uCountry");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs1","root","YAya0408");
			PreparedStatement st=con.prepareStatement("insert into user values(?,?,?,?,?)");
			st.setString(1, a);
			st.setString(2, b);
			st.setString(3, c);
			st.setString(4, d);
			st.setString(5, e);
			int i=st.executeUpdate();
			if(i>0)
				w.print("Successfully Registered");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
