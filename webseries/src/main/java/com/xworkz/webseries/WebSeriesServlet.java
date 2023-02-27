package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webseries")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("webSeriesName");
		String language = req.getParameter("language");
		String ott = req.getParameter("ottPlatform");
		String episode = req.getParameter("NoOfEpisode");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(language);
		System.out.println(ott);
		System.out.println(episode);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style ='colour:red'>");
		
		writer.print(" Name of the WenSeries is " + name);
		writer.print("<span style ='colour:red'>");
		writer.print("Language of the series " + language);
		writer.print("<span style ='colour:red'>");
		writer.print("Ott platform of series " + ott);
		writer.print("<span style ='colour:red'>");
		writer.print("No of epispdes " + episode);
		writer.print("<span style ='colour:red'>");
		writer.print("Budget for series " + budget);
		
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

		

	}

}
