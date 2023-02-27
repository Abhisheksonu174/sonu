package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FromParameter {
	@Test
	public void form()
	{
		given()
		.formParam("createdBy", "abhishek")
		.formParam("projectName","TYSS")
		.formParam("status","created")
		.formParam("teamSize", 12)
		
		.when()
		.post("http://rmgtestingserver")
		 .then().log().all();
		
	}

}
