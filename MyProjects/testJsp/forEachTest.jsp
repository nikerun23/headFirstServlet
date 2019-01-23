<%@ page import="com.example.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
 String[] movieList = {"Movie1","Movie2","Movie3","Movie4","Movie5"};
 request.setAttribute("movieList",movieList);
%>

<html>
  <body>
    Servlet c:forEach </br>
    <c:set var="test" value="TEST"/>
    <table>
    <c:forEach var="result" items="${movieList}">
      <tr><td>${result}</td></tr>
    </c:forEach>
    </br>
    ${movieList}
  </table>

  </body>
</html>
