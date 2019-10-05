package com.zxd.ch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReqServlet1")
public class ReqServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReqServlet1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		// 模拟用户注册成功
		response.getWriter().write("用户注册成功，2秒后跳转到首页");
		// 2秒后刷新并跳转到传智播客官网首页
		response.setHeader("Refresh", "2;URL=http://www.itcast.cn");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
