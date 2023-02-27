package RestAssuredFramework_Without_BDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadSingleProjects {
	@Test
	public void getsP() {
		Response res=RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_16191");
		res.then().log().all();
	}

}
