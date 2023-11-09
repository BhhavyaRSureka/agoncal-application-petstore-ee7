// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Address_hashCode_5a2657087a_Test {

    private Address address;

    @BeforeEach
    public void setup() {
        address = new Address();
    }

    @Test
    public void testHashCode_EmptyAddress() {
        int expected = 0;
        int actual = address.hashCode();

        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_AddressWithStreet1AndCityAndZipcode() {
        address.setStreet1("123 Main St");
        address.setCity("Springfield");
        address.setZipcode("12345");

        int expected = Objects.hash("123 Main St", "Springfield", "12345");
        int actual = address.hashCode();

        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode_AddressWithStreet1AndCityAndZipcodeAndCountry() {
        address.setStreet1("123 Main St");
        address.setCity("Springfield");
        address.setZipcode("12345");

        Country country = new Country();
        country.setName("USA");
        address.setCountry(country);

        int expected = Objects.hash("123 Main St", "Springfield", "12345");
        int actual = address.hashCode();

        assertEquals(expected, actual);
    }
}
