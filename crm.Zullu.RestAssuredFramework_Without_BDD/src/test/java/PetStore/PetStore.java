package PetStore;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PetStore {
	@Test
	
public  void petstore() {
	baseURI = "https://petstore.swagger.io/v2";
	File files = new File("./src/test/resources/puppy-gab589aa12_1920.jpg");
	given()
	.pathParams("petId",10)
	.contentType(ContentType.MULTIPART)
	.multiPart("file",files)
	
	.when().post("/pet/{petId}/uploadImage")
	.then().log().all();
}
	
	}


