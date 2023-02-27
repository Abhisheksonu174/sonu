package RestAssuredFrameWork_With_Bdd;


import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProjects {
	@Test
public void deleteProjects() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when().delete("/projects/TY_PROJ_9979")
		.then().assertThat().time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS).statusCode(204);
	}
	}

