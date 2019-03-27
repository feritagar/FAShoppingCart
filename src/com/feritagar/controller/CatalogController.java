package com.feritagar.controller;

import com.feritagar.model.Product;
import com.feritagar.model.ProductCatalog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class CatalogController extends HttpServlet {
    private String RESULT_PAGE = "catalog.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductCatalog shop = new ProductCatalog();

        //search

        String search = request.getParameter("search");

        if (search != null) {
            List<Product> productList = shop.findProducts(search);
            request.setAttribute("catalog", productList);
            RequestDispatcher view =
                    request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        } else {
            List<Product> productList = shop.getItemCatalog();
            request.setAttribute("catalog", productList);
            RequestDispatcher view =
                    request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductCatalog shop = new ProductCatalog();

        List<Product> result = shop.getItemCatalog();

        request.setAttribute("catalog", result);
        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }
//
//    @Override
//    public String getServletInfo() {
//        return "Main Controller";
//    }
}
