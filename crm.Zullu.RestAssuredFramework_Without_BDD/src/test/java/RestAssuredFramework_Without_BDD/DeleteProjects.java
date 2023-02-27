package RestAssuredFramework_Without_BDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjects {
	@Test
	public void deleteProjects() {
		Response res=RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_16191");
		res.then().log().all();
		System.out.println(res.statusCode());
	}

}
