package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeanTest extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    Person p = new Person();
    p.setName("Lee");
    request.setAttribute("Person",p);

    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);

  }

}
