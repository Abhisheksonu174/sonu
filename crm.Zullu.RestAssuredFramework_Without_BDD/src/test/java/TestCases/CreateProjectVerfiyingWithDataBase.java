package TestCases;

import PojoClass.CreateProjectWithPojClass;
import genericUtility.BaseClass;
import genericUtility.EndPointsLibrary;
import genericUtility.JavaLibrary;
import genericUtility.RestAssuredLibrary;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;

import java.sql.SQLException;

public class CreateProjectVerfiyingWithDataBase extends BaseClass{



	public void createProjects1() throws SQLException 
	{
		CreateProjectWithPojClass cp = new CreateProjectWithPojClass("abhishek","Tyss"+jLib.getRandomNumber(500), "Created", 17);

		Response res=given()
				.body(cp)
				.contentType(ContentType.JSON)
				.when().post(EndPointsLibrary.createProject);


		String expdata=rLib.getJsonDat(res,"projectID");
		System.out.println(expdata);
	


	String query = "select* from projects;";
	String actual = dlib.readDataFromValidate(query, 1, expdata);

}
}
