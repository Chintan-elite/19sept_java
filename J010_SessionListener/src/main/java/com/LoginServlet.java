package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		if (uname.equals("admin") && pass.equals("pass")) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
		}

		PrintWriter pw = response.getWriter();

		ServletContext cx = request.getServletContext();
		String currentuser = (String) cx.getAttribute("user");
		String totaluser = (String) cx.getAttribute("tUser");
		pw.write("<h1>current user : " + currentuser + "</h1>");
		pw.write("<h1>Total user : " + totaluser + "</h1>");

		pw.write("<a href='logout'>logout</a>");

	}

}
