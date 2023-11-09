// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import nl.jqno.equalsverifier.EqualsVerifier;

public class Product_hashCode_5a2657087a_Test {

    private Product product1, product2;

    @Before
    public void setUp() {
        product1 = new Product("Product1", "Description1", new Category("Category1", "CategoryDescription1"));
        product2 = new Product("Product2", "Description2", new Category("Category2", "CategoryDescription2"));
    }

    @Test
    public void testHashCode() {
        assertNotNull(product1.hashCode());
    }

    @Test
    public void testHashCodeForDifferentObjects() {
        assertNotEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    public void testHashCodeForSameObjects() {
        Product product3 = product1;
        assertEquals(product1.hashCode(), product3.hashCode());
    }

    @Test
    public void testHashCodeForEqualObjects() {
        Product product4 = new Product("Product1", "Description1", new Category("Category1", "CategoryDescription1"));
        assertEquals(product1.hashCode(), product4.hashCode());
    }

    @Test
    public void testHashCodeWithEqualsVerifier() {
        EqualsVerifier.forClass(Product.class).verify();
    }
}
