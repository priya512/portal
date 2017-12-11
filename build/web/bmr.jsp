<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
    <head>
        <script>
            function calculatebmr()
            {
               var a= document.bmr.age.value;
               var g=document.bmr.gender.value;
               var h=document.bmr.ht.value;
               var w=document.bmr.wt.value;
               if(g=="female")
               {
                   var c=655 + 9.6 * w + 1.8 * h - 4.7 * a;
                   document.write(c+"calories/day");
               }
               else
               {
                   var c=66 + 13.7 * w +5 * h -6.8 *a;
                   document.write(Number(c)+"calories/day");
               }
            }
</script>        
    </head>
    <body>
          <h1 style="color:blueviolet">BMR</h1>
        <form name="bmr">
            AGE:<input type="number" name="age"/><br>
            GENDER:   <input type="radio" name="gender" value="male"/>male
            <input type="radio" name="gender" value="female"/>female<br>
         
            HEIGHT:<input type="number" name="ht"/>Centimeters<br>
            WEIGHT:<input type="number" name="wt"/>Kilograms<br>
            <input type="button" value="CLICK" onclick="calculatebmr()"/>
            
        </form>
    </body>
</html>