package com.zxd.ch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReqServlet2")
public class ReqServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReqServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = (String) request.getAttribute("username");
		System.out.println(username);
		request.setAttribute("username", "ÕÅÈý");
		username = (String) request.getAttribute("username");
		System.out.println(username);
		request.removeAttribute("username");
		username = (String) request.getAttribute("username");
		System.out.println(username);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
