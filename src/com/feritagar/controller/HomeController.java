package com.feritagar.controller;

import com.feritagar.model.Product;
import com.feritagar.model.Product;
import com.feritagar.model.ProductCatalog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class HomeController extends HttpServlet {
    private String RESULT_PAGE = "home.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Create a new instance of a model object
        // For some applications, we would not want to create a new one each time.
        ProductCatalog shop = new ProductCatalog();

        // Always a good idea to trim and/or validate input data
        List<Product> result = shop.getItemCatalog();

        // Parameters are read only Request object properties, but attributes
        // are read/write. We can use attributes to store data for use on
        // another page.
        request.setAttribute("catalog", result);

        // This object lets you forward both the request and response
        // objects to a destination page
        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Main Controller";
    }
}
