<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
    <head>
       
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script language="JavaScript">
<!--
function calculateBmi() {
var weight = document.bmiForm.weight.value;
var height = document.bmiForm.height.value;
if(weight > 0 && height > 0){	
var finalBmi = weight/(height/100*height/100);
document.bmiForm.bmi.value = finalBmi;
if(finalBmi < 18.5){
document.bmiForm.meaning.value = "That you are too thin.";
}
if(finalBmi > 18.5 && finalBmi < 25){
document.bmiForm.meaning.value = "That you are healthy.";
}
if(finalBmi > 25){
document.bmiForm.meaning.value = "That you have overweight.";
}
}
else{
alert("Please Fill in everything correctly");
}
}
//-->
</script>
    </head>
    <body>
        <h1 style="color:blueviolet">BMI</h1>
        <form name="bmiForm">
Your Weight(kg): <input type="text" name="weight" size="10"><br />
Your Height(cm): <input type="text" name="height" size="10"><br />
<input type="button" value="Calculate BMI" onClick="calculateBmi()"><br />
Your BMI: <input type="text" name="bmi" size="10"><br />
This Means: <input type="text" name="meaning" size="25"><br />
<input type="reset" value="Reset" />
</form>
    </body>
</html>
