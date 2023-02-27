package Posting_Request_JsonFile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class PostByJsonObject {
	
	@Test
	public void jsonObjet() {
	JavaLibrary jLib=new JavaLibrary();
	
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy","Siri");
	jObj.put("projectName","phendula"+jLib.getRandomNumber(600));
	jObj.put("status","created");
	jObj.put("teamsize", 21);
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().body(jObj).contentType(ContentType.JSON).when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
}
}
