/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zanetti.simple.supermarket.poo;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class SimpleSupermarketPoo {
    
    public static void main(String[] args) {
        CreateProduct creator = new CreateProduct();
        
        Product[] products = new Product[3];
        
        for (int i=0; i < 3; i ++) {
            System.out.println("\n Cadastro do produto " + (i+1));
            products[i] = creator.create();
        }
        
        for (int i = 0; i < 3; i ++) {
            products[i].details();
        }
    }
}   
