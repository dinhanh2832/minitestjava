package com.company;

public class Product {
    private double code;
    private String name;
    private String type;
    private String currency;
    private double price;

    public Product() {
    }

    public Product(String name, double code, String type, String currency, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.currency = currency;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString() {
        return "tên: " + getName() + " mã: " + getCode() + " loại: " + getType() + " Đơn vị tiền: " + getCurrency() + " giá: " + getPrice();
    }
}
