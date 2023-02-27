package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DynmicValidation {
	@Test
	public void dynamicvalidation() {
		String expdata = "TY_PROJ_11111";
		
		

		baseURI="http://rmgtestingserver";
		port=8084;
		
		//action
		Response res=when().get("/projects");
		
		//validation
		boolean flag = false;
		List <String>pIDs=res.jsonPath().get("projectId");
		for (String pid : pIDs) {
			if(pid.equalsIgnoreCase(expdata)) {
				System.out.println("Actual pid------> +pid");
				flag=true;
				break;
			}
			
		}
		Assert.assertTrue(flag);
		res.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS);
		
	}

}
