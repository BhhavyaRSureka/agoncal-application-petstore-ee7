// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class PurchaseOrder_equals_f2d574000d_Test {

    private PurchaseOrder purchaseOrder1;
    private PurchaseOrder purchaseOrder2;
    private Customer customer;
    private CreditCard creditCard;
    private Address deliveryAddress;

    @BeforeEach
    public void setUp() {
        customer = new Customer();
        creditCard = new CreditCard();
        deliveryAddress = new Address();
        purchaseOrder1 = new PurchaseOrder(customer, creditCard, deliveryAddress);
        purchaseOrder2 = new PurchaseOrder(customer, creditCard, deliveryAddress);
    }

    @Test
    public void testEquals_sameObject() {
        assertTrue(purchaseOrder1.equals(purchaseOrder1));
    }

    @Test
    public void testEquals_differentObject_sameValues() {
        assertTrue(purchaseOrder1.equals(purchaseOrder2));
    }

    @Test
    public void testEquals_differentObject_differentValues() {
        purchaseOrder2.setOrderDate(new Date());
        assertFalse(purchaseOrder1.equals(purchaseOrder2));
    }

    @Test
    public void testEquals_null() {
        assertFalse(purchaseOrder1.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        assertFalse(purchaseOrder1.equals(new Object()));
    }
}
