<%@ page import="java.io.PrintWriter" %>
<html>
<body>
Welcome to jsp page!...

<%
    PrintWriter pw=response.getWriter();
    String name=request.getAttribute("name").toString();
    pw.print(name);
%>
</body>
</html>