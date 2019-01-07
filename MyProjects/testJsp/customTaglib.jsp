<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mine" uri="randomThings" %>

<html>
  <body>

  <c:set var="userName" value="Leehyunkeun" />

  <h1>Advisor Page !!</h1>
  ${userName}
  <p>
    <mine:advice user="${userName}" />
  </p>

  </body>
</html>
