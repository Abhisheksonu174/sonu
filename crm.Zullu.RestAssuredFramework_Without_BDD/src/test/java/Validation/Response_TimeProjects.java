package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class Response_TimeProjects {
	public void response_timePrjocets() {
		JavaLibrary jLib=new JavaLibrary();
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Siri");
		jObj.put("projectName","phendula"+jLib.getRandomNumber(600));
		jObj.put("status","created");
		jObj.put("teamsize", 21);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(jObj).contentType(ContentType.JSON).when().post("/addProject")
		
		
		
		.then().assertThat().time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS)
		.statusCode(201).contentType(ContentType.JSON).log().all();
		

}
}
