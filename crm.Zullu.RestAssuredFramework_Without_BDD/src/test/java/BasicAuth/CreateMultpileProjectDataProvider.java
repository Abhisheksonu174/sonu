package BasicAuth;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojClass;
import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;


public class CreateMultpileProjectDataProvider {
	@Test(dataProvider ="getData")
	public void createproject(String createdBy, String projectName, String status, int teamSize)
	{
		JavaLibrary jLib=new JavaLibrary();
		CreateProjectWithPojClass pli=new CreateProjectWithPojClass(createdBy, projectName+jLib.getRandomNumber(600), status, teamSize);
	baseURI="http://rmgtestingserver";
	port=8084;
	
	
	given()
	.body(pli)
	.contentType(ContentType.JSON)
	
	
	.when()
	.post("/addProject")
	
	
	.then().log().all();
	}
	
	@DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Abhishek";
		data[0][1] = "HP";
		data[0][2] = "Completed";
		data[0][3] = 17;
		
		data[1][0] = "Vijay";
		data[1][1] = "Sony";
		data[1][2] = "Created";
		data[1][3] = 19;
		
		data[2][0] = "Chinnu";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 50;
		
		
		return data;
	
	
	
	}
}


