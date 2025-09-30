/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanetti.simple.supermarket.poo;

/**
 *
 * @author fatec-dsm2
 */
public class Product {

    String name;
    double price;
    int stock;
    String code;

    public Product(String name, double price, int stock, String code) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCod() {
        return code;
    }
    
    public void details() {
        System.out.println("Nome: " + name + "\n" 
                + "Preco: R$" + price + "\n" 
                + "Quantidade em estoque: " + stock + "\n" 
                + "Codigo: " + code + "\n" 
                + "---------------------------------");
    }


}
