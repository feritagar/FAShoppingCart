package com.feritagar.controller;

import com.feritagar.model.Product;
import com.feritagar.model.ProductCatalog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "CartServlet")
public class CartController extends HttpServlet {
    private String RESULT_PAGE = "cart.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        List<Product> items = new ArrayList();
        items.add(new Product(0," ","","",0.0));
        if( cookies != null ) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.print(cookie.getValue());
            }
        }

        request.setAttribute("catalog", items);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = null;
        Cookie[] cookies = null;
        // Get an array of Cookies associated with the this domain
        cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        List<Product> items = new ArrayList();
        items.add(new Product(0," ","","",0.0));
        if( cookies != null ) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.print(cookie.getValue());
                if (cookie.getName().equals("cartItem")) {
                    items = orderedItems( cookie.getValue( ));
                }
            }
        }
        request.setAttribute("catalog", items);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    protected List<Product> orderedItems(String itemsNumbers) {
        List<Product> items = new ArrayList<>();
        ProductCatalog cat = new ProductCatalog();
        String[] nums = itemsNumbers.split(",");
        for (int i=0;i<nums.length;i++) {
            items.add(cat.getSingleItem(Integer.parseInt(nums[i])));
        }
        return items;
    }

}
