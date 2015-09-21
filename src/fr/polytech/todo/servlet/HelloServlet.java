package fr.polytech.todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
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
	
		/*
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello "+name+" !</h1>");
		out.println("</body>");
		out.println("</html>");
		*/
		
		request.getRequestDispatcher("form.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Hello.jsp").forward(request,response);
	

	}

}
