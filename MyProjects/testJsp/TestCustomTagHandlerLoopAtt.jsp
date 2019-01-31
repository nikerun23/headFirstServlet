<%@ taglib prefix="mytag" uri="simpleTags"%>

<%
 List movieList = {"Movie1","Movie2","Movie3","Movie4","Movie5"};
 request.setAttribute("movieList",movieList);
%>

<html>
  <body>

    <table>
      <mytag:loopTagTestAtt movieList="${movieList}">
      <tr>
        <td>${movie}</td>
      </tr>
    </mytag:loopTagTestAtt>
    </table>

  </body>
</html>
