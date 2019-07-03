package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setIntHeader("HelloServlet", 5);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>第一个Servlet程序</title></head>");
			out.println("<body>");
			out.println("<h3 style=\"color:#0000ff\">Hello,World!</h3>");
			out.println("今天的日期是："+LocalDate.now()+"<br>");
			out.println("现在的时间是："+LocalTime.now()+"<br>");
			out.println("第一个Servlet程序");
			out.println("</body>");
			out.println("</html");			
		
	}

}
