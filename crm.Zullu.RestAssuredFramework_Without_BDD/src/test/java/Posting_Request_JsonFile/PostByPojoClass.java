package Posting_Request_JsonFile;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojClass;
import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class PostByPojoClass {
	@Test
	public void postbyPojoClass() {
	JavaLibrary jb=new JavaLibrary();
	CreateProjectWithPojClass data=new CreateProjectWithPojClass("Abhi", "abhishek"+jb.getRandomNumber(500), "processing", 15);

	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().body(data).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
}
}

