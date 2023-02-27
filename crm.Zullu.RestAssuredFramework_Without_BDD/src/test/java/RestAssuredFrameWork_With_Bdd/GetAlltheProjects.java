package RestAssuredFrameWork_With_Bdd;


import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAlltheProjects {
	@Test
	public void getalltheProjects() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when().get("/projects")
		.then().assertThat().time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS)
		.statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
