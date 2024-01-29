/*
Test generated by RoostGPT for test GeminiTest using AI Type Vertex AI and AI Model gemini-pro

 You are tasked to write test scenarios to validate the business logic of the given code snippet.

**Test Scenario 1:**

**Objective:** To verify that the `hashCode()` method returns a unique hash code for different login values.

**Test Steps:**

1. Create two `Customer` objects with different login values.
2. Call the `hashCode()` method on both objects and store the returned hash codes in separate variables.
3. Assert that the two hash codes are not equal.

**Expected Outcome:**

The test should pass, as the `hashCode()` method is expected to return a unique hash code for different login values.

**Test Scenario 2:**

**Objective:** To verify that the `hashCode()` method returns the same hash code for the same login value, even if the object is modified in other ways.

**Test Steps:**

1. Create a `Customer` object with a specific login value.
2. Call the `hashCode()` method on the object and store the returned hash code in a variable.
3. Modify the object by changing its name, email, or other non-login related fields.
4. Call the `hashCode()` method again on the modified object and store the returned hash code in a separate variable.
5. Assert that the two hash codes are equal.

**Expected Outcome:**

The test should pass, as the `hashCode()` method is expected to return the same hash code for the same login value, regardless of other changes to the object.

**Test Scenario 3:**

**Objective:** To verify that the `hashCode()` method returns a consistent hash code for the same login value, even if the object is serialized and deserialized.

**Test Steps:**

1. Create a `Customer` object with a specific login value.
2. Serialize the object to a byte array using an object serialization library.
3. Deserialize the object from the byte array back into a new `Customer` object.
4. Call the `hashCode()` method on both the original and deserialized objects and store the returned hash codes in separate variables.
5. Assert that the two hash codes are equal.

**Expected Outcome:**

The test should pass, as the `hashCode()` method is expected to return a consistent hash code for the same login value, even if the object is serialized and deserialized.

**Test Scenario 4:**

**Objective:** To verify that the `hashCode()` method returns a unique hash code for different login values, even if the login values are similar.

**Test Steps:**

1. Create two `Customer` objects with login values that are similar but not identical (e.g., "johndoe" and "johndoh").
2. Call the `hashCode()` method on both objects and store the returned hash codes in separate variables.
3. Assert that the two hash codes are not equal.

**Expected Outcome:**

The test should pass, as the `hashCode()` method is expected to return a unique hash code for different login values, even if the login values are similar.
*/
package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CustomerHashCodeTest {

    @Test
    @DisplayName("Should return same hash code for same login")
    void shouldReturnSameHashCodeForSameLogin() {
        Customer customer1 = new Customer();
        customer1.setLogin("johndoe");

        Customer customer2 = new Customer();
        customer2.setLogin("johndoe");

        assertEquals(customer1.hashCode(), customer2.hashCode());
    }

    @Test
    @DisplayName("Should return different hash code for different login")
    void shouldReturnDifferentHashCodeForDifferentLogin() {
        Customer customer1 = new Customer();
        customer1.setLogin("johndoe");

        Customer customer2 = new Customer();
        customer2.setLogin("janedoe");

        assertNotEquals(customer1.hashCode(), customer2.hashCode());
    }

    @Test
    @DisplayName("Should return different hash code for similar login")
    void shouldReturnDifferentHashCodeForSimilarLogin() {
        Customer customer1 = new Customer();
        customer1.setLogin("johndoe");

        Customer customer2 = new Customer();
        customer2.setLogin("johndoh");

        assertNotEquals(customer1.hashCode(), customer2.hashCode());
    }

    @Test
    @DisplayName("Should return same hash code after serialization and deserialization")
    void shouldReturnSameHashCodeAfterSerializationAndDeserialization() throws IOException, ClassNotFoundException {
        Customer customer1 = new Customer();
        customer1.setLogin("johndoe");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(customer1);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Customer customer2 = (Customer) ois.readObject();
        ois.close();

        assertEquals(customer1.hashCode(), customer2.hashCode());
    }
}
