package testautomation;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APITestAutomation {

	
		 @BeforeTest
		    public static void setup() {
		        RestAssured.baseURI = "https://reqres.in/api/";
		    }

		    @Test
		    public void getRequest() {
		        Response response = RestAssured.given()
		                .contentType(ContentType.JSON)
		                .when()
		                .get("users/2")
		                .then()
		                .extract().response();

		        Assert.assertEquals(200, response.statusCode());
		       String name = "aaa";
		      
		       System.out.print(response.getHeader("Content-Type"));
		       
		      // System.out.println(response.getHeaders());
		       System.out.println(response.getHeaders().asList());
		    }
		

	}


