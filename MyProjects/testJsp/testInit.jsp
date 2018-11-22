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
    application : <%= application.getAttribute("username") %>
    </br>
    pageContext : <%= pageContext.getAttribute("username", PageContext.APPLICATION_SCOPE) %>
    </br>
    findAttribute : <%= pageContext.findAttribute("username") %>
  </body>
</html>
