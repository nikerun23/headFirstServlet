package com.example.web;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class SimpleTagTest1 extends SimpleTagSupport {

  public void doGet() throws JspException, IOException {
    getJspContext().getOut().print("This is the lamest use of a custom tag.");
    getJspContext().getOut().write("This is the lamest use of a custom tag.");
  }
}
