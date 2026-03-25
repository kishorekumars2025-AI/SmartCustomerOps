/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
class Item {
    String description;
    double price;

    Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}
