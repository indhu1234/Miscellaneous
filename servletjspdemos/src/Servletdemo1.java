

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletdemo1
 */
@WebServlet("/Servletdemo1")
public class Servletdemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletdemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String user=request.getParameter("t1");
		String pass=request.getParameter("p1");
		out.println("User Name : "+user);
		out.println("Password : "+pass);
		
		if(user.equals("Niit") && pass.equals("niit"))
		{
			RequestDispatcher dispatch=getServletContext().getRequestDispatcher("/welcome.jsp");
			dispatch.forward(request, response);
		}
		else
		{
			//RequestDispatcher dispatch=getServletContext().getRequestDispatcher("/jspdemo1.jsp");
			//out.println("Invalid Login");
			//dispatch.include(request, response);
			RequestDispatcher dispatch2=getServletContext().getRequestDispatcher("/error.jsp");
			dispatch2.include(request, response);
			//dispatch2.forward(request, response);
			//RequestDispatcher dispatch3=getServletContext().getRequestDispatcher("/servletdemo2");
			//RequestDispatcher dispatch4=getServletContext().getRequestDispatcher("/error.jsp");
			//dispatch3.forward(request, response);
			//dispatch4.include(request, response);
			//dispatch1.include(request, response);
		}
		
	}

}
