package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenericDemoServlet
 */
@WebServlet("/generic-servlet")
public class GenericDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private transient ServletConfig servletConfig;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenericDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		servletConfig = getServletConfig();
		String servletName = servletConfig.getServletName();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<! DOCTYPE html>"+"<html>"
		+"<body>Hello from "+ servletName + "<br>"
		+"世界那么大，我想去看看"
		+"</body></html>");
	}

}
