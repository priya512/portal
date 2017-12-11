<%
    if(request.getParameter("sign")==null)
    {
        response.sendRedirect("index.html");
    }
    %>
<%@page import="database.Dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .alert {
    padding: 20px;
    background-color: #f44336; /* Red */
    color: white;
    margin-bottom: 15px;
}

/* The close button */
.closebtn {
    margin-left: 15px;
    color: white;
    font-weight: bold;
    float: right;
    font-size: 22px;
    line-height: 20px;
    cursor: pointer;
    transition: 0.3s;
}

/* When moving the mouse over the close button */
.closebtn:hover {
    color: black;
}


        </style>
    </head>
 
    <body>
        <h1>SIGN UP:</h1>
          <table>
            <form action="signup.jsp" method="">
            <tr> 
                <td>NAME:</td>
                <td><input type="text" name="name" required/></td>
            </tr>
        <tr>
            <td> EMAIL-ID:</td>
            <td> <input type="email" name="email" required/></td>
        </tr>
        <tr>
            <td>PASSWORD:</td>
            <td><input type="password" name="password" required/></td>
        </tr>
<tr>
    <td><INPUT TYPE="submit" value="SUBMIT" name="ok"/></td>
</tr>
         </form></table>
                   

        <strong>OR</strong><br>
        <form action="login.jsp?log=1"> <input type="submit" value="LOGIN" name="log"/></form>
    </body>
    <%
       if(request.getParameter("ok")==null ||request.getParameter("log")==null)
       {
           
       }
       else if(request.getParameter("ok")!=null)
       {
        String n=request.getParameter("name");
        String e=request.getParameter("email");
        String p=request.getParameter("password");
        Dbconnect d=new Dbconnect();
        int chk=d.set(n,e,p);
        if(chk==1)
        {
            %>
                    <div class="alert">
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
  Welcome<%=n%>;
</div>
            <%
        }
        else
{
        %>
        
                         <div class="alert">
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
  Sorry User Exist <%=n%>;
</div> 
<%
    }

       }

        %>
</html>
