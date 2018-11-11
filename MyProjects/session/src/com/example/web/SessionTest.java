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
      out.println("</br><a href=\""+request.getContextPath()+response.encodeRedirectURL("/RedirectTest.do")+"\">Redirect Session URL Link</a>");
      Cookie cookie = new Cookie("username","lee");
      cookie.setMaxAge(-1);
      response.addCookie(cookie);
    } else {
      out.println("</br>WelCome Back !!");
      Cookie[] cookies = request.getCookies();
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username")) {
          String username = cookie.getValue();
          out.println("</br>You`r Cookie username : " + username);
        }
      }

    }

  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Session Add Cookie !!");

    String name = request.getParameter("username");

    Cookie cookie = new Cookie("username", name);
    response.addCookie(cookie);

  }

}
