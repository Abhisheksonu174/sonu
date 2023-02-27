package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticValidation {
	@Test
	public void staticvalidation() {
		String expData = "TY_PROJ_11111";
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//action
		Response res=when().get("/projects");
		
		//validation
		res.then().log().all();
		String actData = res.jsonPath().get("[0].projectId");
		System.out.println(actData);
		Assert.assertEquals(actData,expData);
		System.out.println("Data verfied");
	}

}
