package RestAssuredFramework_Without_BDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import genericUtility.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ModifiedProjects {
	@Test
	public void putMP() {
		
		
			JavaLibrary jLib =new JavaLibrary();
			// Step:1  Create the pre requisites -request Body
			JSONObject jObj= new JSONObject();
			jObj.put("creaedBy", "abhisheksonu");
			jObj.put("projectName", "Phendula"+jLib.getRandomNumber(500));
			jObj.put("status","Created");
			jObj.put("teamSize",17);
			//create the pre requistes -request Body
			RequestSpecification req=RestAssured.given();
			req.contentType(ContentType.JSON);
			req.body(jObj);
		

			// Step:2 Perfrom  the Action
			Response response=req.put("http://rmgtestingserver:8084/projects/TY_PROJ_16191");
			
			System.out.println(response.prettyPrint());
			
			
			

	}

}
