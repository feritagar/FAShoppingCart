package com.feritagar.model;

public class Product {
//    private String productID;
    private int productNumer;
    private String productName;
    private String productDetail;
    private String size;
    private double productPrice;

    public Product(int productNumer, String productName, String productDetail, String size, double productPrice) {
//        this.productID = productID;
        this.productNumer = productNumer;
        this.productName = productName;
        this.productDetail = productDetail;
        this.size = size;
        this.productPrice = productPrice;
    }

//    public String getProductID() {
//        return productID;
    //    }

//    public void setProductID(String productID) {
//        this.productID = productID;
//    }

    public int getProductNumer() {
        return productNumer;
    }

    public void setProductNumer(int productNumer) {
        this.productNumer = productNumer;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
