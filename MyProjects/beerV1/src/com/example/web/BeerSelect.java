package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    PrintWriter out = response.getWriter();
    out.println("Beer Selection Advice");
    String c = request.getParameter("color");
    int contentLength = request.getIntHeader("Content-Length");
    out.println("Got beer color : " + c);

    BeerExpert beerExpert = new BeerExpert();
    List resultList = beerExpert.getBrands(c);

    // html Write
    // Iterator it = resultList.iterator();
    // while (it.hasNext()) {
    //   out.println("Got beer model : " + it.next());
    // }

    request.setAttribute("styles", resultList);
    request.setAttribute("contentLength", contentLength);

    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("application/txt");

    ServletContext ctx = getServletContext();
    InputStream is = ctx.getResourceAsStream("/test.txt");

    int read = 0;
    byte[] bytes = new byte[1024];

    OutputStream os = response.getOutputStream();
    while((read = is.read(bytes)) != -1) {
      os.write(bytes, 0, read);
    }
    os.flush();
    os.close();
  }

}
