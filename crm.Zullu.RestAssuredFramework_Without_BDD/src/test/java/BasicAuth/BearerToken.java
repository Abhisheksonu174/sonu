package BasicAuth;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	@Test
	public void bearertoken() 
		{
			
		
			baseURI ="https://api.github.com";
			JSONObject jObj = new JSONObject();
			jObj.put("name", "sdet31restAssured");
			
			given()
			 .auth()
			 .oauth2("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")
			 .body(jObj)
			 .contentType(ContentType.JSON)
			 
		    .when()
		     .post("/user/repos")
		     
		    .then().log().all();
		
	}

}
