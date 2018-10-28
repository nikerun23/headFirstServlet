package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.example.model.BeerExpert;

public class WebApp extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    PrintWriter out = response.getWriter();
    out.println("PrintWriter !!");
    out.println("admin Email : " + getServletConfig().getInitParameter("adminEmail"));
  }

}
