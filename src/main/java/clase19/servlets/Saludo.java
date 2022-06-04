package clase19.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Saludo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Saludo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("El nombre es " + request.getParameter("nombre"));
		out.println("</br>");
		out.println("El apellido es " + request.getParameter("apellido"));
		out.println("</body>");
		out.println("</html>");		
		out.close();
		
		/*
		response.getWriter().append(
				"Nombre: " + request.getParameter("nombre") + 
				", Apellido: " + request.getParameter("apellido"));
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
