package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("kingName");
		 String region = req.getParameter("region");
		 String noOfQueens = req.getParameter("noOfQueens");
		 String dob= req.getParameter("DOB");
		 String dod =req.getParameter("DOD");
		 
		 System.out.println(name);
		 System.out.println(region);
		 System.out.println(noOfQueens);
		 System.out.println(dob);
		 System.out.println(dod);
		 
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
        writer.print("<h1>");
        writer.print("<span style='color:red'>");
		writer.print("king Name is " + name);
		writer.print("<br>");
		writer.print("<span style='color:green'>");
		writer.print("king region is " + region);
		writer.print("<br>");
		writer.print("<span style='color:pink'>");
		writer.print("kings queens are " + noOfQueens);
		writer.print("<br>");
		writer.print("<span style='color:yellow'>");
		writer.print("king birthDate in " + dob);
		writer.print("<br>");
		writer.print("<span style='color:white'>");
		writer.print("king deathDate is in Rs " + dod);
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

		
		
	}
	

}
