package com.feritagar.model;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> productList = new ArrayList<>();
    private int nextProductNumber;

    public ProductCatalog(){
        nextProductNumber = 1;
        productList.add( new Product
                (nextProductNumber++,"Hazal Dress",
                        "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                        "S/M/L/XL",35.00));
        productList.add(new Product(nextProductNumber++,"Beste Dress",
                "They are manufactured from %100 cotton.They do not contain carcinogen substance.",
                "S/M/L/XL",25.00));
        productList.add(new Product(nextProductNumber++,"Kanavice Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Pecvork Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Manyana Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",20.00));
        productList.add(new Product(nextProductNumber++,"Polen Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",50.00));
        productList.add(new Product(nextProductNumber++,"Monalisa Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Frilly Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Yalena Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",45.00));
        productList.add(new Product(nextProductNumber++,"Mimoza Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",15.00));
        productList.add( new Product(nextProductNumber++,"Ebru Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Positano Dress",
                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Selin Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Meric Dress",
                                "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",20.00));
        productList.add(new Product(nextProductNumber++,"Sedef Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",45.00));
        productList.add(new Product(nextProductNumber++,"Safir Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Kumsal Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",55.00));
        productList.add(new Product(nextProductNumber++,"Hera Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Alya Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Zenna Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Helin Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Azra Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Lilyum Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Filiz Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",20.00));
        productList.add(new Product(nextProductNumber++,"Ece Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Gokce Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Leyla Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",45.00));
        productList.add(new Product(nextProductNumber++,"Dila Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Gonca Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Mine Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",20.00));
        productList.add(new Product(nextProductNumber++,"Lina Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",15.00));
        productList.add(new Product(nextProductNumber++,"Yesim Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",15.00));
        productList.add(new Product(nextProductNumber++,"Ladin Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Shirt Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Pareo",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Zumrut Tunic",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Embroidered Pants",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",45.00));
        productList.add(new Product(nextProductNumber++,"Beyza Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Ezgi Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Mikanos Dress",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",45.00));
        productList.add(new Product(nextProductNumber++,"Miray Blouse",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",30.00));
        productList.add(new Product(nextProductNumber++,"Pitircik Blouse",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",35.00));
        productList.add(new Product(nextProductNumber++,"Yakamoz Pareo",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Bahar Tunic",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Gupur Skirt",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",55.00));
        productList.add(new Product(nextProductNumber++,"Pants",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));
        productList.add(new Product(nextProductNumber++,"Cigdem Tunic",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",40.00));
        productList.add(new Product(nextProductNumber++,"Salkim Skirt",
                    "They are manufactured  from %100 cotton, scrim, special, local fabric.They are dyed by antique dyeing method. They do not contain carcinogen substance.",
                    "S/M/L",25.00));

    }

    public List<Product> getItemCatalog() {
        return productList;
    }


    public Product getProduct(int id){
        Product theProduct = null;

        for(Product product : productList){
            if(product.getProductNumer() == id){
                theProduct = product;
            }
        }
        return theProduct;
    }

    public List<Product> getAllProducts(){
        return productList;
    }

    public List<Product> findProducts(String search){
        search = search.toLowerCase();
        List<Product> theList = new ArrayList<>();
        for (Product product : productList){
            if (product.getProductName().toLowerCase().startsWith(search)){
                theList.add(product);
            }
        }
        return theList;
    }

    public Product getSingleItem(int productID) {
        Product product=null;

        for(Product i: productList) {
            if (i.getProductNumer() == productID) {
                return i;
            }
        }
        return product;
    }
}
