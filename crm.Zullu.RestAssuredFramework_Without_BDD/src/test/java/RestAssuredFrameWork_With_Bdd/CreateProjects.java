package RestAssuredFrameWork_With_Bdd;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class CreateProjects {
	@Test
	public void createPrjocets() {
		JavaLibrary jLib=new JavaLibrary();
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Siri");
		jObj.put("projectName","phendula"+jLib.getRandomNumber(600));
		jObj.put("status","created");
		jObj.put("teamsize", 21);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(jObj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()
		.assertThat().time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS)
		.statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
