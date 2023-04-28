import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String time = sdf.format(now);

        String message = "";
        if (time.compareTo("06:00:00") >= 0 && time.compareTo("12:00:00") < 0) {
            message = "Good morning!";
        } else if (time.compareTo("12:00:00") >= 0 && time.compareTo("18:00:00") < 0) {
            message = "Good afternoon!";
        } else {
            message = "Good evening!";
        }

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Greeting Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>The current time is " + time + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}