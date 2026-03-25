/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
public class Main {
    public static void main(String[] args) {

        Customer c = new Customer("Krish", "Vellore");

        Item i1 = new Item("Laptop", 50000);
        Item i2 = new Item("Mouse", 500);

        Order o = new Order("NEW");

        o.addItem(new OrderDetail(i1, 1));
        o.addItem(new OrderDetail(i2, 2));

        Payment p = new Cash(o.calcTotal());
        o.setPayment(p);

        c.addOrder(o);

        System.out.println("Total Order Value: " + o.calcTotal());
        p.pay();
    }
}
