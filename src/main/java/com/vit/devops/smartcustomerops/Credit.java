/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
class Credit extends Payment {
    String cardType;

    Credit(double amount, String cardType) {
        super(amount);
        this.cardType = cardType;
    }

    void pay() {
        System.out.println("Paid using Credit Card: " + cardType);
    }
}
