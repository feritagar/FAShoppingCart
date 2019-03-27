<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.feritagar.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: Ferit
  Date: 3/12/2019
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FA Store Products</title>
    <link rel="stylesheet" href="./CSS/Site.css">
</head>
<body>
<div class="container">
    <div class="navigation-bar">
        <ul>
            <li><a class="active" href="index.jsp">Home</a></li>
            <li><a href="cat.go">Products</a></li>
            <li><a href="cart.go">Shopping Cart</a></li>
        </ul>
    </div>

    <!--product search box-->
    <h1>Product Search</h1>
    <form method="post" action="cat.go">
        <input type="text" name="search"/>
        <input type="submit" value="Search"/>
    </form>
     <form action="cartplace.go">
            <table style="padding-top: 25px; background-color: white; border-color: black; text-align: center;">
                <tr><th>Product Name</th> <th>Price</th>  <th>Product Detail</th> <th>Size</th></tr>
                <%
                    List recs = (List) request.getAttribute("catalog");
                    Iterator it = recs.iterator();
                    while (it.hasNext()) {

                        Product item = (Product) it.next();
                        out.print("<tr><td style='color:White;background:blue'>"
                                + item.getProductName() +
                                "</td><td style='color: White; background-color: gray;'>"
                                + String.format("$%3.2f",item.getProductPrice()) +
                                "<td style='color: White; background-color: darkgreen;'>"
                                + item.getProductDetail() +
                                "</td><td style='color: White; background-color: blue;'>"+ item.getSize() +
                                "</td><td>Add to Cart<input type='checkbox' name='cartItem' value="
                                + item.getProductNumer()+
                                "></td></tr>");
                    }
                %>

            </table>
            <input type="submit" value="Purchase">
        </form>

    </div>
</div>
<div class="footer">
    &copy; Copyright 2019 FA Online Store
</div>
</body>
</html>

