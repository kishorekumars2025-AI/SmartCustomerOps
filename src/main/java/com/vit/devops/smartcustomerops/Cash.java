/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
class Cash extends Payment {
    Cash(double amount) {
        super(amount);
    }

    void pay() {
        System.out.println("Paid using Cash: " + amount);
    }
}