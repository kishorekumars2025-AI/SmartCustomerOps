/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
import java.util.*;
public class Customer {
    String name;
    String address;
    List<Order> orders = new ArrayList<>();

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void addOrder(Order order) {
        orders.add(order);
    }    
}
