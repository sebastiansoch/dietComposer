<%-- 
    Document   : caloriesPerMeal
    Created on : 2018-05-16, 16:07:05
    Author     : Seba
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="_menu.jsp"></jsp:include>
        <h1>Calories Per Meal</h1>
        
        <h3>Przydziel ilość kalorii do posiłku</h3>
        <form action="caloriesPerMeal">
            Wybierz ilość posiłki w ciągu dnia:<br />
            <ul style="list-style-type: none">
                <li><input type="checkbox" name="breakfast" checked="checked" />Śniadanie</li>
                <li><input type="checkbox" name="second_breakfast" />Drugie śniadanie</li>
                <li><input type="checkbox" name="soup" />Zupa</li>
                <li><input type="checkbox" name="main_course" checked="checked" />Danie główne</li>
                <li><input type="checkbox" name="tea" />Podwieczorek / Przekąska</li>
                <li><input type="checkbox" name="supper" checked="checked" />Kolacja</li>
            </ul>
            Ilość kalorii na dzień:
            <input type="number" name="calories" /><br />
            <input type="submit" value="Generuj" />
        </form>
    </body>
</html>
