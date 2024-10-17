package mvc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	PrintWriter pw = res.getWriter();
	
	//Set Response Type
	res.setContentType("text/html");
	
	//read the form Data
	
	String name = req.getParameter("name");
	String age = req.getParameter("age");
	

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
	
	pw.print("<div class='container' style='width: 600px; margin: auto; margin-top: 70px'>");
	pw.println("<table class='table table-hover table-striped'>");
	pw.println("<tr>");
	pw.println("<td>Name :</td>");
	pw.print("<td>"+name+"</td>");
	pw.println("</tr>");
	
	pw.println("<tr>");
	pw.println("<td>DOB :</td>");
	pw.print("<td>"+age+"</td>");
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
