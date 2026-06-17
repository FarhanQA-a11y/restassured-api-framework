package tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserApiTest {

	@Test
    public void getUsersTest() {

        int statusCode =
                given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users")
                .getStatusCode();

        System.out.println("Status Code : " + statusCode);

        Assert.assertEquals(statusCode, 200);
    }
}