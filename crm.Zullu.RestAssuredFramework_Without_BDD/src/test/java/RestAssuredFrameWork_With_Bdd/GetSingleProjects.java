package RestAssuredFrameWork_With_Bdd;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleProjects {
@Test
public void getsingleProjects() {
	baseURI="http://rmgtestingserver";
	port=8084;
	
	when().get("/projects/TY_PROJ_16443")
	.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
}
	
	
	
}

