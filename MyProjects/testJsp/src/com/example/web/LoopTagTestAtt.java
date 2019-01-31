package com.example.web;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import java.util.*;

public class LoopTagTestAtt extends SimpleTagSupport {

  private List movieList;

  public void doTag() throws JspException, IOException {

    for (int i=0, len=movieList.size(); i<len; i++) {
      getJspContext().setAttribute("movie", movieList.get(i));
      getJspBody().invoke(null);
    }

  }

  public void setMovieList(List movieList) {
    this.movieList = movieList;
  }
}
