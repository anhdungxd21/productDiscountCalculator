<%--
  Created by IntelliJ IDEA.
  User: Faceless
  Date: 12/25/2020
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Calculator</title>
  </head>
  <body>
  <form action="/discount" method="get">
    <label>Product Description</label><br>
    <input type="text" name="product" size="40" placeholder="description"><br>
    <label>List Price</label><br>
    <input type="text" name="price" size="40" placeholder="0"><br>
    <label>Discount Percent</label><br>
    <input type="text" name="discount" size="40" placeholder="10"><br>
    <input type="submit" value="Submit!">
  </form>
  </body>
</html>
