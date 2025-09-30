/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanetti.simple.supermarket.poo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */

public class CreateProduct {
    String name, code;
    double price;
    int stock;
    Scanner read = new Scanner(System.in);
    
    public Product create() {
        System.out.print("Digite o nome do produto: ");
        name = read.nextLine();
        System.out.print("Digite o preço do produto: ");
        price = read.nextDouble();
        System.out.print("Digite o eetoque do produto: ");
        stock = read.nextInt();
        read.nextLine();
        System.out.print("Digite o código do produto: ");
        code = read.nextLine();
        
        return new Product(name, price, stock, code);
    }
}