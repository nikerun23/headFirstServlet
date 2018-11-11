package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionCounter implements HttpSessionListener {

  static private int activeSessions;

  public static int getActiveSession() {
    return activeSessions;
  }

  public void sessionCreated(HttpSessionEvent event) {
    activeSessions++;
  }

  public void sessionDestroyed(HttpSessionEvent event) {
    activeSessions--;
  }
}
