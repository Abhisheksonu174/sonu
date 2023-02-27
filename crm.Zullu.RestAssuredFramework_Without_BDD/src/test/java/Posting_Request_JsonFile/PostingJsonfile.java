package Posting_Request_JsonFile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostingJsonfile {
	@Test
	public void creatingProject() {
		File jsonfile=new File("./src/test/resources/JSON_FileCreated.json");
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(jsonfile).contentType(ContentType.JSON).when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}
}
