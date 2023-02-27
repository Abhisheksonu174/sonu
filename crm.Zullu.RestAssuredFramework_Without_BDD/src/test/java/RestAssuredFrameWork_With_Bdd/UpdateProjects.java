package RestAssuredFrameWork_With_Bdd;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class UpdateProjects {
	@Test
	public void updateProjects() {
JavaLibrary jLib=new JavaLibrary();
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Siri17");
		jObj.put("projectName","phendula"+jLib.getRandomNumber(600));
		jObj.put("status","modified");
		jObj.put("teamsize", 27);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(jObj).contentType(ContentType.JSON).when().put("/projects/TY_PROJ_16443")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
