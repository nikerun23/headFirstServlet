import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Ch1Servlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    PrintWriter out = response.getWriter();
    java.util.Date today = new java.util.Date();
    out.println("<html><head><title>Servlet TEST</title></head><body><h1>Ch1Servlet2</h1>"+today+"</body></html>");
  }
}
