package webApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		
		//		System.out.println(k); 
		
		
//		url rewriting
//		res.sendRedirect("sq?k="+k);
		
		
		
		
//		req.setAttribute("k", k);
//		//request dispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		if(i >0 && j > 0 && i < 100 && j < 100)
		{
			PrintWriter out = res.getWriter();
			out.println("the sum of the numbers = "+k);
		}
		else if(i <=0 || j <= 0)
		{
			PrintWriter out = res.getWriter();
			out.println("values are very small");
		}
		else if(i >= 100 || j >= 100)
		{
			PrintWriter out = res.getWriter();
			out.println("values are very large");
		}
		
	}
}
