<%@ page import="java.util.*" %>
<html>
  <head>
    <title>Head First Servlet</title>
  </head>
  <body>
     <h1 style="text-align:center;">Beer Recommendations JSP</h1>
      <p>
        <%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while(it.hasNext()) {
          out.print("</br>try : " + it.next());
        }
        out.print("</br>content-Length : " + request.getAttribute("contentLength"));
        %>
  </body>
</html>
