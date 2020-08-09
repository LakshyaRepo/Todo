package com.l;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.Todo;

public class MyListener implements ServletContextListener
{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		List<Todo> list=new ArrayList<Todo>();
		ServletContext context=sce.getServletContext();
	    context.setAttribute("list", list);
	}
	

}
