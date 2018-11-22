<%@ page import="com.example.web.*" %>

<html>
  <body>
    The Page Count is now : <%= Counter.getCount() %>
    </br>
    <%! int count = 0; %>
    The Page Count is now : <%= ++count %>
  </body>
</html>
