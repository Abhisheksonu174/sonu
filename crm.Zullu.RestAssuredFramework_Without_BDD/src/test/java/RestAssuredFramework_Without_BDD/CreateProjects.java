package RestAssuredFramework_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjects {
	@Test
	public void createProjects()
	{
		JavaLibrary jLib =new JavaLibrary();
		// Step:1  Create the pre requisites -request Body
		JSONObject jObj= new JSONObject();
		jObj.put("creaedBy", "abhishek");
		jObj.put("projectName", "Phendula"+jLib.getRandomNumber(500));
		jObj.put("status","Completed");
		jObj.put("teamSize",12);
		//create the pre requistes -request Body
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObj);


		// Step:2 Perfrom  the Action
		Response response=req.post("http://rmgtestingserver:8084/addProject");

		//Step:3 validate the response
		System.out.println("log");
		response.then().log().all();
		
		
		System.out.println("get Content Type"); //this method is used to print which contain type body is belongs to. 
		System.out.println(response.getContentType());
		
		System.out.println("asString");  // this method is used to print all the response (actual data) in the single line.
		System.out.println(response.asString());
		
		System.out.println("prettyPrint");//this method is used to print all the response (actual data) in the console window.
		System.out.println(response.prettyPrint());
		
		System.out.println("prettyPeek");  //this method is used to print header along with body (actual data) in the console window.
		System.out.println(response.prettyPeek());




	}


}
