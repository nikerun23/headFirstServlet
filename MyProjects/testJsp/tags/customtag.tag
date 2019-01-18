<%@ attribute name="subTitle" required="true" rtexprvalue="true" %>
<%@ tag body-content="tagdependent" %>

<h2>This Custom Tag File.</h2>
<p>${subTitle}</p>
<p><font color="${fontColor}"><jsp:doBody/></font></p>
