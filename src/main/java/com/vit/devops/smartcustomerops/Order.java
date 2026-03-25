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
class Order {
    Date date;
    String status;
    List<OrderDetail> items = new ArrayList<>();
    Payment payment;

    Order(String status) {
        this.date = new Date();
        this.status = status;
    }

    void addItem(OrderDetail detail) {
        items.add(detail);
    }

    void setPayment(Payment payment) {
        this.payment = payment;
    }

    double calcTotal() {
        double total = 0;
        for (OrderDetail d : items) {
            total += d.calcSubTotal();
        }
        return total;
    }
}
