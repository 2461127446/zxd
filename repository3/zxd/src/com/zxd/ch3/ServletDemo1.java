package com.zxd.ch3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//通过HttpServletResponse对象设置页面响应编码格式
		response.setContentType("text/html;charset=UTF-8");
				// 得到输出流PrinterWriter对象,Servlet使用输出流来产生响应
				PrintWriter printWriter = response.getWriter();
				//通过PrintWriter对象向页面打印信息
				printWriter.write("实现第一个servlet程序");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
