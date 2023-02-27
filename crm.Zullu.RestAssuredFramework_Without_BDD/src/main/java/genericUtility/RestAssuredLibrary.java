package genericUtility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	/*
	 * This method will return json data from the corresponding response body.
	 * @response
	 * @path
	 */
	
	public String getJsonDat(Response response,String path)
	{
		String jsonData=response.jsonPath().get(path);
		return jsonData;
	}

}
