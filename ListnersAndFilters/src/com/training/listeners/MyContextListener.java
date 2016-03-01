package com.training.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener,ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
    	Connection con = null;
       System.out.println("Context-Initialized======");
       
       String url=event.getServletContext().getInitParameter("url");
       String className=event.getServletContext().getInitParameter("className");
       String userName=event.getServletContext().getInitParameter("username");
       String passWord=event.getServletContext().getInitParameter("password");
       
       System.out.println("URL:"+url+"\n"+"class:"+className+"\n"+"username:"+userName+"\n"+"password:"+passWord);
       
       try {
		Class.forName(className);
		 con = DriverManager.getConnection(url, userName, passWord);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	event.getServletContext().setAttribute("dbconn", con);	
   }
    
    
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
        
    	System.out.println("Context-Destroyed********");
    }

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		
		System.out.println("Attribute Added"+event.getServletContext().getAttributeNames());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute REmoved"+event.getServletContext().getAttributeNames());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		
	}

	
   
	
}
