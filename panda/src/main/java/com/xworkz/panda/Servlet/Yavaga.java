package com.xworkz.panda.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6 , urlPatterns = "/Yavaga")
public class Yavaga extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in " + getClass().getSimpleName());
	}
	
	public Yavaga() {
		System.out.println("Running constructur in " + getClass().getSimpleName());
	}
}
