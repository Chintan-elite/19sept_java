package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Registrationfilter
 */
@WebFilter("/reg")
public class Registrationfilter implements Filter {

  
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phno = req.getParameter("phno");
		String cpass = req.getParameter("cpass");
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		if(fname==null || fname=="")
		{
			req.setAttribute("fnameE", "firstname should not be blank");
			rd.forward(req, resp);
		}
		
		if(lname==null||lname=="")
		{
			req.setAttribute("lnameE", "lastname should not be blank");
			rd.forward(req, resp);
		}
		
		
		if(email==null||email=="")
		{
			req.setAttribute("emailE", "Email should not be blank");
			rd.forward(req, resp);
		}
		else if(!EmailValidation.emailCheck(email))
		{
			req.setAttribute("emailE", "invalid formate");
			rd.forward(req, resp);
		}
		
		
		
		if(pass==null||pass=="")
		{
			req.setAttribute("passE", "password should not be blank");
			rd.forward(req, resp);
		}
		
		if(!pass.equals(cpass))
		{
			req.setAttribute("cpassE", "Cpass should be same as password");
			rd.forward(req, resp);
		}
		
		if(phno==null||phno=="")
		{
			req.setAttribute("phnoE", "Phno should not be blank");
			rd.forward(req, resp);
		}
		else if(phno.length()>10)
		{
			req.setAttribute("phnoE", "phno shold be <= 10");
			rd.forward(req, resp);
		}
		chain.doFilter(req, resp);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
