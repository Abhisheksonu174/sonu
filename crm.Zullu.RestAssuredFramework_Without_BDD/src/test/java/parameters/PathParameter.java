package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameter {
	@Test
	public void pathparameter() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.pathParam("pid", "TY_PROJ_16942")
		.when()
		.get("/projects/{pid}")
		.then()
		.log().all();
		
		
		
	}

}
