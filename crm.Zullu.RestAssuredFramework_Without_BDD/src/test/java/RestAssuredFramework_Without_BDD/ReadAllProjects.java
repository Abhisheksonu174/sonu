package RestAssuredFramework_Without_BDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadAllProjects {
	@Test
	public void readalltheProjects() {
		Response res=RestAssured.get("http://rmgtestingserver:8084/projects");
		res.then().log().all();
	}

}
