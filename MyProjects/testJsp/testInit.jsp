<%@ page import="com.example.web.*" %>

<html>
  <body>
    <%!
    public void jspInit() {
      ServletConfig sConfig = getServletConfig();
      String username = sConfig.getInitParameter("username");
      ServletContext sContext = getServletContext();
      sContext.setAttribute("username",username);
    }
    %>
    <%= application.getAttribute("username") %>
  </body>
</html>
