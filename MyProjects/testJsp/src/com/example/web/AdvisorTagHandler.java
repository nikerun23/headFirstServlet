package com.example.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class AdvisorTagHandler extends SimpleTagSupport {

  private String user;

  public void doGet() throws JspException, IOException{
    getJspContext().getOut().write("Hello " + user + "</br>");
    //getJspContext().getOut().write("Your Advice is : " + getAdvice());
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getAdvice() {
    String[] adviceString = {"Random 0","Random 1","Random 2","Random 3"};
    int random = (int) (Math.random() * adviceString.length);
    return adviceString[random];
  }

}
