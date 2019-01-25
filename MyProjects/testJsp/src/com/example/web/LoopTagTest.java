package com.example.web;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class LoopTagTest extends SimpleTagSupport {

  private String[] movieList = {"Movie1","Movie2","Movie3","Movie4","Movie5"};
  public void doTag() throws JspException, IOException {

    for (int i=0, len=movieList.length; i<len; i++) {
      getJspContext().setAttribute("movie", movieList[i]);
      getJspBody().invoke(null);
    }

  }
}
