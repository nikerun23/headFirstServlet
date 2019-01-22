package com.example.web;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class SimpleTagTest extends SimpleTagSupport {

  public void doTag() throws JspException, IOException {

    getJspContext().getOut().print("This is the lamest use of a custom tag.");

  }
}
