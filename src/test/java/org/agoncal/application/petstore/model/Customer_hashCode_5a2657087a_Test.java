/*
Test generated by RoostGPT for test GeminiTest using AI Type Vertex AI and AI Model gemini-pro


Here are some test scenarios for the given code snippet:

**Scenario 1: HashCode for a Null Login**
- Test Objective: To verify that the hashCode method returns a consistent hash code for an object with a null login.

- Test Steps:
  1. Create a Customer object with a null login.
  2. Call the hashCode() method on the Customer object.
  3. Assert that the returned hash code is a consistent value.

**Scenario 2: HashCode for a Unique Login**
- Test Objective: To verify that the hashCode method returns a unique hash code for each Customer object with a unique login.

- Test Steps:
  1. Create multiple Customer objects with unique logins.
  2. Call the hashCode() method on each Customer object.
  3. Assert that the returned hash codes are unique for each Customer object.

**Scenario 3: HashCode for a Duplicate Login**
- Test Objective: To verify that the hashCode method returns the same hash code for Customer objects with duplicate logins.

- Test Steps:
  1. Create multiple Customer objects with duplicate logins.
  2. Call the hashCode() method on each Customer object.
  3. Assert that the returned hash codes are the same for all Customer objects with duplicate logins.

**Scenario 4: HashCode for a Changed Login**
- Test Objective: To verify that the hashCode method returns a different hash code for a Customer object whose login has been changed.

- Test Steps:
  1. Create a Customer object with a login.
  2. Call the hashCode() method on the Customer object.
  3. Change the login of the Customer object.
  4. Call the hashCode() method on the Customer object again.
  5. Assert that the returned hash codes are different.

**Scenario 5: HashCode for a Null Customer Object**
- Test Objective: To verify that the hashCode method throws a NullPointerException when called on a null Customer object.

- Test Steps:
  1. Attempt to call the hashCode() method on a null Customer object.
  2. Assert that a NullPointerException is thrown.

These test scenarios cover various cases to validate the functionality of the hashCode method in the provided code snippet. By executing these tests, you can ensure that the hashCode method behaves as expected and adheres to the business logic requirements.
*/
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Customer_hashCode_5a2657087a_Test {

    @Test
    @DisplayName("Should return consistent hash code for a null login")
    void testHashCodeForNullLogin() {
        Customer customer = new Customer();
        int hashCode = customer.hashCode();
        assertEquals(0, hashCode);
    }

    @Test
    @DisplayName("Should return unique hash code for each Customer object with a unique login")
    void testHashCodeForUniqueLogin() {
        Customer customer1 = new Customer();
        customer1.setLogin("customer1");
        int hashCode1 = customer1.hashCode();

        Customer customer2 = new Customer();
        customer2.setLogin("customer2");
        int hashCode2 = customer2.hashCode();

        assertEquals(hashCode1, hashCode2);
    }

    @Test
    @DisplayName("Should return the same hash code for Customer objects with duplicate logins")
    void testHashCodeForDuplicateLogin() {
        Customer customer1 = new Customer();
        customer1.setLogin("customer1");
        int hashCode1 = customer1.hashCode();

        Customer customer2 = new Customer();
        customer2.setLogin("customer1");
        int hashCode2 = customer2.hashCode();

        assertEquals(hashCode1, hashCode2);
    }

    @Test
    @DisplayName("Should return a different hash code for a Customer object whose login has been changed")
    void testHashCodeForChangedLogin() {
        Customer customer = new Customer();
        customer.setLogin("customer1");
        int hashCode1 = customer.hashCode();

        customer.setLogin("customer2");
        int hashCode2 = customer.hashCode();

        assertNotEquals(hashCode1, hashCode2);
    }

    @Test
    @DisplayName("Should throw a NullPointerException when called on a null Customer object")
    void testHashCodeForNullCustomerObject() {
        assertThrows(NullPointerException.class, () -> {
            Customer customer = null;
            customer.hashCode();
        });
    }
}
