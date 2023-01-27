package com.xworkz.mobiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mobile")
public class MobileServlet extends HttpServlet {
	
	public MobileServlet() {
		System.out.println("Running MobileServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("name");
		req.getParameter("modle");
		req.getParameter("series");
		req.getParameter("company");
		req.getParameter("webstie");
		req.getParameter("owner");
		req.getParameter("owneradd");
		req.getParameter("cost");
		req.getParameter("ram");
		req.getParameter("rom");
		req.getParameter("processor");
		req.getParameter("size");
		req.getParameter("weight");
		req.getParameter("ownerName");
		req.getParameter("language");
		req.getParameter("Showroom");
		req.getParameter("showroomAddress");
		req.getParameter("Showroom Owner");
		req.getParameter("Billdate");
		req.getParameter("billTime");

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
        writer.print("<h1>");
        writer.print("<span style='color:red'>");
		writer.print("mobile Name is " + req.getParameter("name"));
		writer.print("<br>");
		writer.print("<span style='color:green'>");
		writer.print("mobile modle is " + req.getParameter("modle"));
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
