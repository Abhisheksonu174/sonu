package genericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class BaseClass {
	protected DatabaseLibrary dlib=new DatabaseLibrary();
	protected JavaLibrary jLib=new JavaLibrary();
	protected RestAssuredLibrary rLib=new RestAssuredLibrary();



	@BeforeSuite 
	public void saeconfig() throws SQLException {
		dlib.connectTODB();

		baseURI = "http://rmgtestingserver";
		port=8084;

	}

	@AfterSuite
	public void asConfig() throws SQLException {
		dlib.closeDB();
	}
}
