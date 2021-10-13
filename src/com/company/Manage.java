package com.company;

import java.util.Scanner;

public class Manage {
    public Product[] listProduct;

    public void inputProduct(Product[] listProduct) {
        this.listProduct = listProduct;
        for (int i = 0; i < listProduct.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập vào tên sản phẩm:");
            String name = sc.nextLine();
            System.out.println("nhập vào mã sản phẩm:");
            double code = sc.nextDouble();
            System.out.println("nhập vào loại:");
            sc.nextLine();
            String type = sc.nextLine();
            System.out.println("nhập vào đơn vị tiền:");
            String currency = sc.nextLine();
            System.out.println("nhập vào giá:");
            double price = sc.nextDouble();
            Product product = new Product(name, code, type, currency, price);
            listProduct[i] = product;
        }
    }

    public void output(Product[] listProduct) {
        this.listProduct = listProduct;
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public int sumPrice(Product[] listProduct) {
        this.listProduct = listProduct;
        int sum = 0;
        for (Product product : listProduct) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void searchBook(Product[] listProduct) {
        this.listProduct = listProduct;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sách cần tìm ");
        String nameb = sc.nextLine();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getName().equals(nameb)) {
                check = true;
                index = i;
            }
        }
        if (check) {
            System.out.println(listProduct[index]);
            System.out.println(index);
        } else {
            System.out.println("not in the list");
        }
    }

    public void editProduct( Product[] listProduct) {
        this.listProduct = listProduct;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vị trí muốn sửa");
        int index = sc.nextInt();
        for (int i = 0; i < listProduct.length; i++) {
            if (index == i) {
                System.out.println("nhập vào tên sản phẩm:");
                String name = sc.nextLine();
                System.out.println("nhập vào mã sản phẩm:");
                double code = sc.nextDouble();
                System.out.println("nhập vào loại:");
                String type = sc.nextLine();
                System.out.println("nhập vào đơn vị tiền:");
                String currency = sc.nextLine();
                System.out.println("nhập vào giá:");
                double price = sc.nextDouble();
                Product product = new Product(name, code, type, currency, price);
                listProduct[i] = product;
            }
        }
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public void deleteProduct( Product[] listProduct) {
        this.listProduct = listProduct;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vị trí muốn sửa");
        int index = sc.nextInt();
        for (int i = 0; i < listProduct.length; i++) {
            if (index == i) {
                listProduct[i - 1] = listProduct[i];
            }
        }
        for (int i = 0; i < listProduct.length - 1; i++) {
            System.out.println(listProduct[i]);
        }
    }
}
