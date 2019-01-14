<%@ taglib prefix="dice" uri="DiceFunctions"%>

<html>
  <body>
    <jsp:useBean id="person" class="com.example.model.Person" scope="request">
      <jsp:setProperty name="person" property="name" />
    </jsp:useBean>
    Person is : <jsp:getProperty name="person" property="name"/> </br>

    Dice Roll : ${dice:rollIt()}
  </body>
</html>
