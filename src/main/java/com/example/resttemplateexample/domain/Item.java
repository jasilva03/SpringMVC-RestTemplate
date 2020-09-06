package com.example.resttemplateexample.domain;

public class Item {

    private int quantity;
    private double price;
    private String item_url;
    private String order_url;
    private String product_url;

    public Item() {
    }

    public Item(int quantity, double price, String item_url, String order_url, String product_url) {
        this.quantity = quantity;
        this.price = price;
        this.item_url = item_url;
        this.order_url = order_url;
        this.product_url = product_url;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem_url() {
        return item_url;
    }

    public void setItem_url(String item_url) {
        this.item_url = item_url;
    }

    public String getOrder_url() {
        return order_url;
    }

    public void setOrder_url(String order_url) {
        this.order_url = order_url;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }

}
