<%-- <%@ page errorPage="errorPage.jsp" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <body>

    <c:catch var="myException">
      <%
      int i = 10 / 0;
      %>
    </c:catch>

    <h3>Exception Catch !!</h3>

    <c:if test="${myException != null}">
    This is Exception : ${myException}
    </c:if>

  </body>
</html>
