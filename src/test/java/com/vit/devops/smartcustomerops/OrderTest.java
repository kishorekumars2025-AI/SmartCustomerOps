/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vit.devops.smartcustomerops;

/**
 *
 * @author karth
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class OrderTest {
    @Test
    public void testTotalCalculation() {
        Item item = new Item("Phone", 10000);
        Order o = new Order("NEW");
        o.addItem(new OrderDetail(item, 2));
        assertEquals(20000, o.calcTotal(), 0);
    }
    @Test
    public void testEmptyOrder() {
        Order o = new Order("NEW");
        assertEquals(0, o.calcTotal(), 0);
    }
    @Test
    public void testSingleItem() {
        Item item = new Item("Book", 500);
        Order o = new Order("NEW");
        o.addItem(new OrderDetail(item, 1));
        assertEquals(500, o.calcTotal(), 0);
    }
    @Test
    public void testMultipleItems() {
        Order o = new Order("NEW");
        o.addItem(new OrderDetail(new Item("Pen", 10), 10));
        o.addItem(new OrderDetail(new Item("Bag", 1000), 1));
        assertEquals(1100, o.calcTotal(), 0);
    }
    @Test
    public void testPaymentAssignment() {
        Order o = new Order("NEW");
        Payment p = new Cash(100);
        o.setPayment(p);
        assertNotNull(o.payment);
    }
}