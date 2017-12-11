<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<%
    if(request.getParameter("log")==null)
    {
       
        response.sendRedirect("signup.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <h1><u>LOGIN</u></h1>
        <form>
            EMAIL-ID:
            <input type="email" name="email" required/></td>
        <br>
            PASSWORD:
            <input type="password" name="password" required/><br>
            <INPUT TYPE="submit" value="SUBMIT" name="ok"/>
    </form>   
    </body>
</html>
