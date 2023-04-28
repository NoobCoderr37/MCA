
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class classInfoServlet
 */
@WebServlet("/classInfoServlet")
public class classInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public classInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	      throws ServletException, IOException {
    	    response.setContentType("text/html");
    	    PrintWriter out = response.getWriter();

    	    // Get client information
    	    String ipAddress = request.getRemoteAddr();
    	    String browserType = request.getHeader("User-Agent");

    	    // Get server information
    	    String osName = System.getProperty("os.name");
    	    ServletContext context = getServletContext();
    	    String[] servletNames = context.getServletRegistrations().keySet().toArray(new String[0]);

    	    // Output the information
    	    out.println("<html><head><title>Request Information</title></head><body>");
    	    out.println("<h1>Client Information:</h1>");
    	    out.println("<p>IP Address: " + ipAddress + "</p>");
    	    out.println("<p>Browser Type: " + browserType + "</p>");
    	    out.println("<h1>Server Information:</h1>");
    	    out.println("<p>Operating System: " + osName + "</p>");
    	    out.println("<p>Loaded Servlets:</p>");
    	    out.println("<ul>");
    	    for (String servletName : servletNames) {
    	      out.println("<li>" + servletName + "</li>");
    	    }
    	    out.println("</ul>");
    	    out.println("</body></html>");
    	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
