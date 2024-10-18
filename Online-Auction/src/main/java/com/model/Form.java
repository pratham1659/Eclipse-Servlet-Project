package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		//Set Response Type
		response.setContentType("text/html");
		
		//read the form Data
		String id = request.getParameter("itemid");
		String itemname = request.getParameter("itemname");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String amount = request.getParameter("bid");
		String inc = request.getParameter("true");
		

		//Adding Bootstrap in Servlet
				pw.print(" <!-- Latest compiled and minified CSS -->\n"
						+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n"
						+ "\n"
						+ "<!-- jQuery library -->\n"
						+ "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\n"
						+ "\n"
						+ "<!-- Popper JS -->\n"
						+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n"
						+ "\n"
						+ "<!-- Latest compiled JavaScript -->\n"
						+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n"
						+ "");
				
				pw.print("<div class='container' style='width: 700px; margin: auto; margin-top: 70px; background-color: yellow; text-align: center;'>");
				pw.println("<h1><b>Bid Submitted</b></h1>");
				pw.println("<p>Your bid is submitted. If your bid is sucessful you will be notified within 24 hours of close of bidding.</p>");
				pw.println("<table border='1' style='text-align: center; margin-left: auto; margin-right: auto; background-color: yellow;'>");
				pw.println("<tr>");
				pw.println("<td style='color:white;background-color: black'>" + itemname + "</td>");
				pw.println("</tr>");
				
				
				
				pw.println("<tr>");
				pw.println("<td>Item Id: " + id + "</td>");
				pw.println("</tr>");
				
				pw.println("<tr>");
				pw.println("<td>Name: " + name + "</td>");
				pw.println("</tr>");
				
				pw.println("<tr>");
				pw.println("<td>Email Address: " + email + "</td>");
				pw.println("</tr>");
				
				pw.println("<tr>");
				pw.println("<td>Bidding Price: " + amount + "</td>");
				pw.println("</tr>");
				
				pw.println("<tr>");
				pw.println("<td>Auto Incriment:" + inc + " </td>");
				pw.println("</tr>");
				
				pw.print("</table>");
				pw.print("</div>");
				
				
				//close the stream
				pw.close();
							
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}