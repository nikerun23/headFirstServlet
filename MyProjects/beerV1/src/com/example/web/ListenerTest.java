package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.Dog;

public class ListenerTest extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Test context attribute set Listener<br>");
    Dog dog = (Dog) getServletContext().getInitParameter("dog");
    out.println("Dog Breed : " + dog.getBreed(););

  }

}
