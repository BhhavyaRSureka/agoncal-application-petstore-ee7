// Test generated by RoostGPT for test roost-test using AI Type Open AI and AI Model gpt-4


// Test generated for /categories_get for http method type GET in rest-assured framework


// RoostTestHash=8b82be555a


package org.agoncal.application.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class categoriesGetTest {
  
    @Test  
    public void categories_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src\test\java\org\agoncal\application\RoostTest\categoriesGetTest.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.pathParam("start", map.get("start") != null ? map.get("start") : "")
				.pathParam("max", map.get("max") != null ? map.get("max") : "")
                .when()
                .get("/categories")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
    
              if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("version") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("version"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("name") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("name").length(), lessThanOrEqualTo(30));
  
                MatcherAssert.assertThat(response.jsonPath().getString("name").length(), greaterThanOrEqualTo(1));
  
          }
    
              if (response.jsonPath().get("description") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("description").length(), lessThanOrEqualTo(3000));
  
                MatcherAssert.assertThat(response.jsonPath().getString("description").length(), greaterThanOrEqualTo(0));
  
          }
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
