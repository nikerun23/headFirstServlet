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

    HttpSession session = request.getSession(false); // request.getSession(false); Session을 생성하지 않고 Get만한다.

    if (session == null) {
      out.println("</br>Session is Null !!");
      out.println("</br>Create Session ~");
      session = request.getSession();
    }

    if (session.isNew()) {
      out.println("</br>This a New Session !!");
      out.println("</br><a href=\""+request.getContextPath()+response.encodeURL("/SessionTest.do")+"\">Session URL Link</a>");
    } else {
      out.println("</br>WelCome Back !!");
    }

  }

}
