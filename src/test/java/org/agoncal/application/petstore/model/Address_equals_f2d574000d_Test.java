// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Address_equals_f2d574000d_Test {

    private Address address1;
    private Address address2;
    private Address address3;
    private Country country;

    @Before
    public void setUp() {
        country = new Country("US", "United States", "United States of America", "USA", "840");
        address1 = new Address("123 Main St", "New York", "10001", country);
        address2 = new Address("123 Main St", "New York", "10001", country);
        address3 = new Address("456 Elm St", "Los Angeles", "90001", country);
    }

    @Test
    public void testEquals_SameAddress() {
        assertTrue(address1.equals(address1));
    }

    @Test
    public void testEquals_DifferentAddress() {
        assertFalse(address1.equals(address3));
    }

    @Test
    public void testEquals_NullAddress() {
        assertFalse(address1.equals(null));
    }

    @Test
    public void testEquals_SameValues() {
        assertTrue(address1.equals(address2));
    }

    @Test
    public void testEquals_DifferentClass() {
        assertFalse(address1.equals(country));
    }
}
