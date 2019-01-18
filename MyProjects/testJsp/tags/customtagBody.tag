<%@ attribute name="fontColor" required="true" %>
<%@ tag body-content="tagdependent" %>

<h2>This Custom Tag Body File.</h2>
<p><font color="${fontColor}"><jsp:doBody/></font></p>
