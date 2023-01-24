package com.xworkz.panda.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/yake")
public class FastServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Running doget method");
	}
	
	public FastServlet() {
		// TODO Auto-generated constructor stub
		
		System.out.println("FastServlet constructor");
	}

}
