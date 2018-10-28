package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.BeerExpert;

public class WebApp extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Test Init Parameter");

    Enumeration e = getServletConfig().getInitParameterNames();
    while (e.hasMoreElements()) {
      out.println("</br> param name = " + e.nextElement());
    }
    out.println("</br>admin Email : " + getServletConfig().getInitParameter("adminEmail"));
    out.println("</br>main Email : " + getServletConfig().getInitParameter("mainEmail"));
  }

}
