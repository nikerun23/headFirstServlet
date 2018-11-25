<%@ page import="com.example.model.*" %>

<html>
  <body>
    Person is : <%= request.getAttribute("Person") %> </br>
    Person is : <%= ((Person) request.getAttribute("Person")).getName() %> </br>

    <jsp:useBean id="Person" class="com.example.model.Person" scope="request" />
    Person is : <jsp:getProperty name="Person" property="name" />
  </body>
</html>
