package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionTest extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("Session Test !!");

    HttpSession session = request.getSession();

    if (session.isNew()) {
      out.println("</br>This a New Session !!");
    } else {
      out.println("</br>WelCome Back !!");
    }

  }

}
