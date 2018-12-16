<%@ page import="com.example.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <body>
    Person is : <%= request.getAttribute("Person") %> </br>
    Person is : <%= ((Person) request.getAttribute("Person")).getName() %> </br>

    <jsp:useBean id="person" class="com.example.model.Person" scope="request">
      <jsp:setProperty name="person" property="name" value="newLee" />
    </jsp:useBean>
    Person is : <jsp:getProperty name="person" property="name" /> </br>
    EL Person is : ${Person.name} </br>
    EL Person is : ${Person["name"]} </br>
    EL Person is : ${requestScope.Person.name} </br>
    EL Cookie is : ${cookie.username.value} </br>
    EL Context Param is : ${initParam.Email} </br>
    JSTL Person is : <c:out value="${Person.name}"/> </br>

    JSTL Xml True : <c:out value="<b>B bold Tag</b>" escapeXml="true" /> </br>
    JSTL Xml False : <c:out value="<b>B bold Tag</b>" escapeXml="false" /> </br>

    Jstl Null : Hello <c:out value="${name}" default="Guest" />.
  </body>
</html>
