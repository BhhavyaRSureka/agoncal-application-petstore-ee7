// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Product_equals_f2d574000d_Test {

    private Product product1;
    private Product product2;
    private Category category;

    @BeforeEach
    public void setUp() {
        category = new Category("Category1", "Description1");
        product1 = new Product("Product1", "Description1", category);
        product2 = new Product("Product2", "Description2", category);
    }

    @Test
    public void testEqualsMethodWithSameObject() {
        assertTrue(product1.equals(product1));
    }

    @Test
    public void testEqualsMethodWithNullObject() {
        assertFalse(product1.equals(null));
    }

    @Test
    public void testEqualsMethodWithDifferentClassObject() {
        assertFalse(product1.equals(new String("Test")));
    }

    @Test
    public void testEqualsMethodWithDifferentObject() {
        assertFalse(product1.equals(product2));
    }

    @Test
    public void testEqualsMethodWithSameValues() {
        Product product3 = new Product("Product1", "Description1", category);
        assertTrue(product1.equals(product3));
    }
}
