package com.example;

import javax.servlet.*;
import com.example.Dog;

public class MyServletContextListener implements ServletContextListener {

  public void contextInitialized(ServletContextEvent event) {

    ServletContext sc = event.getServletContext();
    String dogBreed = sc.getInitParameter("breed");
    Dog dog = new Dog(dogBreed);
    sc.setAttribute("dog", dog);

  }

  public void contextDestroyed(ServletContextEvent event) {

  }

}
