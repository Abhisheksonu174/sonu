package RequestChaining;

import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojClass;
import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateReaquestChaining {
	@Test
	public void craeteRequestChaing() {
		JavaLibrary jLib=new JavaLibrary();
		CreateProjectWithPojClass pLib=new CreateProjectWithPojClass("abhishek","Phendula"+jLib.getRandomNumber(600),"created", 15);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
		Response res=given().body(pLib).contentType(ContentType.JSON)
				.when().post("/addProject");
		
		//Capture the project id
		String proID = res.jsonPath().get("projectId");
		System.out.println(proID);
		res.then().log().all();
		
		
		//Create a get request and pass proID as path parameter
		given()
		.pathParam("pid", proID)
		.when()
		.get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();
		
		
		
		
	}

}
