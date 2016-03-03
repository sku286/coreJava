package com.training.tags;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ForEach extends TagSupport {
	
	/**
	 * 
	 */
	
	private String items;
	
	public ForEach() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public void setItems(String items) {
		this.items = items;
	}


	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		
	ArrayList<String> list = new ArrayList<>();
	HttpServletRequest resp = (HttpServletRequest) pageContext.getRequest();
	list = (ArrayList<String>) resp.getAttribute("names");
	int i=1;
	// TODO Auto-generated method stub
	try{
		JspWriter out = pageContext.getOut();
		for(String name:list){
			out.println(i + " " + name);
			i++;
		}
		}
		
	 catch(Exception e){
		e.printStackTrace();
	}
	
	return Tag.SKIP_BODY;
	}

}
