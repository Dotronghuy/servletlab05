	import java.io.IOException;
	import javax.servlet.*;
	import javax.servlet.http.*;
	
	public class HelloServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Xin chào, đây là Servlet đầu tiên của bạn!</h1>");
	    }
}