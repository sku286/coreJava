package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.util.logging.Logger;
/**
 * Servlet Filter implementation class LoggingFilter
 */
public class LoggingFilter implements Filter {

	Logger log = Logger.getLogger("LOg message");
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		//System.out.println("Pre-Process by Logging Filter");
        HttpServletRequest req= (HttpServletRequest)request;
		String reqhost=req.getRemoteHost() ;
		StringBuffer redUrl=req.getRequestURL();
		StringBuffer buffer = new StringBuffer("one request");
		buffer.append(" from");
		buffer.append(reqhost);
		buffer.append(" for");
		buffer.append(redUrl);
		buffer.append(" At");
		log.info(buffer.toString());
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		//System.out.println("Post-Process by Logging Filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
