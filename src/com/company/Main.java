package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số lượng sản phẩm");
        int size = sc.nextInt();
        Product[] listProduct = new Product[size];
        Manage manage = new Manage();
        manage.inputProduct(listProduct);
        manage.output(listProduct);
        manage.searchBook(listProduct);
        manage.editProduct( listProduct);
        manage.deleteProduct( listProduct);
    }
}

