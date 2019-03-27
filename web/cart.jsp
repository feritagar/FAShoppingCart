<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.feritagar.model.Product" %>
<%@ page import="com.feritagar.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: Ferit
  Date: 3/12/2019
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FA Store Shopping Cart</title>
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

        <h3 align="center">Shopping Cart</h3>
        <form action="bill.go">
            <table style="padding-top: 25px; background-color: white; border-color: black; text-align: center;" align="center">
                <tr><th>Product Name</th> <th>Price</th></tr>
                <%
                    List recs = (List) request.getAttribute("catalog");
                    Iterator it = recs.iterator();
                    double total = 0;
                    while (it.hasNext()) {
                        Product item = (Product) it.next();
                        out.print("<tr><td style='color:White;background:blue'>"
                                + item.getProductName() +
                                "</td><td style='color: White; background-color: gray;'>"
                                + String.format("$%3.2f",item.getProductPrice()));
                        total+=item.getProductPrice();
                    }
                    out.print("<tr class='total' ><td>Total:</td><td>" +
                            String.format("$%3.2f",total) + "</td></tr>");
                %>
            </table>
            <div align="center" style="margin-top: 15px;"><input type="submit" value="Complete Order"></div>

        </form>
    <!--Remove from cart-->
    <form action="cart.go" method="post">
        <div align="center" style="margin-top: 15px;"><input type="submit" name="selectedCartItem" value="Remove Product(s)"></div>

    </form>


</div>
<div class="footer">
    &copy; Copyright 2019 FA Online Store
</div>
</body>
</html>
