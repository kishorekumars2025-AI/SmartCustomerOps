/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
class OrderDetail {
    int quantity;
    Item item;

    OrderDetail(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    double calcSubTotal() {
        return quantity * item.getPrice();
    }
}
