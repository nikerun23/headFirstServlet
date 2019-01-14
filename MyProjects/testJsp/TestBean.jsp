<%@ taglib prefix="dice" uri="DiceFunctions"%>
<%@ taglib prefix="mytag" tagdir="/WEB-INF/tags"%>

<html>
  <body>
    <jsp:useBean id="person" class="com.example.model.Person" scope="request">
      <jsp:setProperty name="person" property="name" />
    </jsp:useBean>
    Person is : <jsp:getProperty name="person" property="name"/> </br>

    Customtag : <mytag:customtag />

  </body>
</html>
