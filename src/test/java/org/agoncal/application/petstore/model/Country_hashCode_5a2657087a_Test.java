/*
Test generated by RoostGPT for test GeminiTest using AI Type Vertex AI and AI Model gemini-pro

 You are required to write test scenarios to validate business logic of the function `hashCode()`

**Test Scenario 1:**
**Test Objective:** Verify that the hash code is generated correctly for a non-null and non-empty ISO code.

**Test Data:**
 - ISO Code: "US"

**Expected Result:**
 - The hash code should be a non-zero integer.

**Test Steps:**
1. Create an instance of the class with a non-null and non-empty ISO code.
2. Call the `hashCode()` method on the instance.
3. Verify that the returned hash code is a non-zero integer.

**Test Scenario 2:**
**Test Objective:** Verify that the hash code is generated correctly for a null ISO code.

**Test Data:**
 - ISO Code: null

**Expected Result:**
 - The hash code should be zero.

**Test Steps:**
1. Create an instance of the class with a null ISO code.
2. Call the `hashCode()` method on the instance.
3. Verify that the returned hash code is zero.

**Test Scenario 3:**
**Test Objective:** Verify that the hash code is generated correctly for an empty ISO code.

**Test Data:**
 - ISO Code: ""

**Expected Result:**
 - The hash code should be zero.

**Test Steps:**
1. Create an instance of the class with an empty ISO code.
2. Call the `hashCode()` method on the instance.
3. Verify that the returned hash code is zero.

**Test Scenario 4:**
**Test Objective:** Verify that the hash code is generated correctly for two objects with the same ISO code.

**Test Data:**
 - ISO Code: "US"

**Expected Result:**
 - Both objects should have the same hash code.

**Test Steps:**
1. Create two instances of the class with the same ISO code.
2. Call the `hashCode()` method on both instances.
3. Verify that both instances have the same hash code.

**Test Scenario 5:**
**Test Objective:** Verify that the hash code is generated correctly for two objects with different ISO codes.

**Test Data:**
 - ISO Code 1: "US"
 - ISO Code 2: "CA"

**Expected Result:**
 - Both objects should have different hash codes.

**Test Steps:**
1. Create two instances of the class with different ISO codes.
2. Call the `hashCode()` method on both instances.
3. Verify that both instances have different hash codes.
*/
import org.junit.Test;
import static org.junit.Assert.*;
import org.agoncal.application.petstore.model.Country;

public class Country_hashCode_5a2657087a_Test {

    @Test
    public void testHashCode_WithNonNullAndNonEmptyIsoCode() {
        Country country = new Country("US");

        int hashCode = country.hashCode();

        assertTrue(hashCode != 0);
    }

    @Test
    public void testHashCode_WithNullIsoCode() {
        Country country = new Country();

        int hashCode = country.hashCode();

        assertEquals(0, hashCode);
    }

    @Test
    public void testHashCode_WithEmptyIsoCode() {
        Country country = new Country("");

        int hashCode = country.hashCode();

        assertEquals(0, hashCode);
    }

    @Test
    public void testHashCode_WithSameIsoCode() {
        Country country1 = new Country("US");
        Country country2 = new Country("US");

        int hashCode1 = country1.hashCode();
        int hashCode2 = country2.hashCode();

        assertEquals(hashCode1, hashCode2);
    }

    @Test
    public void testHashCode_WithDifferentIsoCode() {
        Country country1 = new Country("US");
        Country country2 = new Country("CA");

        int hashCode1 = country1.hashCode();
        int hashCode2 = country2.hashCode();

        assertNotEquals(hashCode1, hashCode2);
    }
}
