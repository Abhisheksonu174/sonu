package Posting_Request_JsonFile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class HashMapProjects {
@Test
public void updateProjects() {
	JavaLibrary jLib=new JavaLibrary();
	
	HashMap<String,Object> jsonData=new HashMap();
	jsonData.put("createdBy","Siri");
	jsonData.put("projectName","phendula"+jLib.getRandomNumber(600));
	jsonData.put("status","created");
	jsonData.put("teamsize", 5);
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().body(jsonData).contentType(ContentType.JSON).when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
}
}
