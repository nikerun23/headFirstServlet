<%@ page import="com.example.model.*" %>

<html>
  <body>
    Person is : <%= request.getAttribute("Person") %> </br>
    Person is : <%= ((Person) request.getAttribute("Person")).getName() %> </br>

    <jsp:useBean id="person" class="com.example.model.Person" scope="request">
      <jsp:setProperty name="person" property="name" value="newLee" />
    </jsp:useBean>
    Person is : <jsp:getProperty name="person" property="name" /> </br>
  </body>
</html>
