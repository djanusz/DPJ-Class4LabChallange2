<%-- 
    Document   : calculator2
    Created on : Feb 3, 2013, 2:35:42 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script type="text/javascript">
            function validateRectangle()
            {
                var length=document.forms["rectangle"]["length"].value;
                var width=document.forms["rectangle"]["width"].value;
                var isValid=false;
                if (isNaN(length)&& parseFloat(length)<0 && isNaN(width)&& parseFloat(width)<0)
                {
                    alert("Please enter a positive number");
                } 
                else {
                    isValid = true;
                }
                return isValid;
            }
            
            function validateCircle()
            {
                var radius=document.forms["circle"]["radius"].value;
                var isValid=false;
                if (isNaN(radius)&& parseFloat(radius)<0)
                {
                    alert("Please enter a positive number");
                    
                } else {
                    isValid = true;
                }
                return isValid;
            }
            
            function validateTriangle()
            {
                var legA=document.forms["pythagorean"]["legA"].value;
                var legB=document.forms["pythagorean"]["legB"].value;
                var isValid=false;
                if (isNaN(legA)&& parseFloat(legA)<0 && isNaN(legB)&& parseFloat(legB)<0)
                {
                    alert("Please enter a positive number");
                    
                } else {
                    isValid = true;
                }
                return isValid;
            }
            
        </script>
    </head>
    <body>
        <h1>Area Calculator!</h1>
        <form id="rectangle" name="rectangle" method="POST" action="RectangleCalculatorController" onsubmit="return validateRectangle">
            <div>
                <h3>Rectangle</h3>
                Length: <input type="text" name="length"><br>
                Width: <input type="text" name="width"><br><br>
                <input id="rectangleSubmit" name="rectangleSubmit" type="submit" value="Submit">
                <br><br>
            </div>
        </form>
        <hr>
        <form id="circle" name="circle" method="POST" action="CircleCalculatorController" onsubmit="return validateCirlce">
            <div>
                <h3>Circle</h3>
                Radius: <input type="text" name="radius"><br>
                <br>
                <input id="circleSubmit" name="circleSubmit" type="submit" value="Submit">
                <br><br>
            </div>
        </form>
        <hr>
        <h1>Pythagorean Theorem</h1>
        <form id="pythagorean" name="pythagorean" method="POST" action="PythagoreanTheoremCalculatorController" onsubmit="return validateTriangle">
            <div>
                <h3>Right Triangle</h3>
                Leg "a": <input type="text" name="legA"><br>
                Leg "b": <input type="text" name="legB"><br><br>
                <input id="pythagoreanSubmit" name="pythagoreanSubmit" type="submit" value="Submit">
            </div>
        </form>
    </body>
</html>
