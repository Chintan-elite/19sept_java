package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw  =resp.getWriter();
		pw.write("<h1>Servlet : 2</h1>");
		
		ServletContext cx = req.getServletContext();
		String driver =  cx.getInitParameter("driver");
		pw.write("<h2>"+driver+"</h2>");
		
		ServletConfig ch = getServletConfig();
		String path =ch.getInitParameter("path");
		pw.write("<h2>"+path+"</h2>");
		
	}
	
	
}
