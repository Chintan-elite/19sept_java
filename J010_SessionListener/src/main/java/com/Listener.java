package com;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class Listener implements HttpSessionListener
{

	int user = 0;
	int tUser = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		user++;
		tUser++;
		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("user", user+"");
		cx.setAttribute("tUser", tUser+"");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		user--;
		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("user", user+"");
	}

}
