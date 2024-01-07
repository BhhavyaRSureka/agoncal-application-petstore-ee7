/*
Test generated by RoostGPT for test JavaTesting using AI Type Open AI and AI Model gpt-4

1. Scenario: Test when the compared object is the same as the original object
   - Given the same instance of the object is passed for comparison
   - The equals method should return true

2. Scenario: Test when the compared object is null
   - Given null is passed as the object for comparison
   - The equals method should return false

3. Scenario: Test when the compared object is of a different class
   - Given an object of a different class is passed for comparison
   - The equals method should return false

4. Scenario: Test when the compared object is of the same class but with a different name
   - Given an object of the same class but with a different name is passed for comparison
   - The equals method should return false

5. Scenario: Test when the compared object is of the same class and the same name
   - Given an object of the same class and the same name is passed for comparison
   - The equals method should return true

6. Scenario: Test when the name of the category object is null
   - Given an object of the same class with a null name is passed for comparison
   - The equals method should return false if the name of the original object is not null

7. Scenario: Test when the name of the original object is null
   - Given the name of the original object is null and an object with a non-null name is passed for comparison
   - The equals method should return false

8. Scenario: Test when both the original and compared object names are null
   - Given both the original and the compared object names are null
   - The equals method should return true

These scenarios cover most of the possible edge cases and help ensure that the equals method is functioning as intended.
*/
package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Category_equals_f2d574000d_Test {

    @Test
    public void testEqualsSameObject() {
        Category category1 = new Category("Test1", "Description1");
        assertTrue(category1.equals(category1));
    }

    @Test
    public void testEqualsNull() {
        Category category1 = new Category("Test1", "Description1");
        assertFalse(category1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Category category1 = new Category("Test1", "Description1");
        String str = "Test";
        assertFalse(category1.equals(str));
    }

    @Test
    public void testEqualsDifferentName() {
        Category category1 = new Category("Test1", "Description1");
        Category category2 = new Category("Test2", "Description2");
        assertFalse(category1.equals(category2));
    }

    @Test
    public void testEqualsSameName() {
        Category category1 = new Category("Test1", "Description1");
        Category category2 = new Category("Test1", "Description2");
        assertTrue(category1.equals(category2));
    }

    @Test
    public void testEqualsNullName() {
        Category category1 = new Category("Test1", "Description1");
        Category category2 = new Category(null, "Description2");
        assertFalse(category1.equals(category2));
    }

    @Test
    public void testEqualsOriginalObjectNullName() {
        Category category1 = new Category(null, "Description1");
        Category category2 = new Category("Test2", "Description2");
        assertFalse(category1.equals(category2));
    }

    @Test
    public void testEqualsBothNamesNull() {
        Category category1 = new Category(null, "Description1");
        Category category2 = new Category(null, "Description2");
        assertTrue(category1.equals(category2));
    }
}
