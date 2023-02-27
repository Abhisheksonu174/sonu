package BasicAuth;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Oauth_2_0 {
	@Test
	public void authauntication() {
		Response resp= given()
				.formParam("client_id","sdet_47")
				.formParam("client_secret","5d8302c931aea827163a08a7518ba534")
				.formParam("grant_type","client_credentials")
				.formParam("redirect_uri","http://hassan.com")
				 .formParam("code","authorization code")
				 
				 .when()
				 .post("http://coop.apps.symfonycasts.com/token");
		
		
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID",4252)
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		  
		.then()
		 .log().all();
		
		
	}

}
