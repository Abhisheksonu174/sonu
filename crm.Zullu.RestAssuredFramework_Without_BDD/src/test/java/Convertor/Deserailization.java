package Convertor;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojEmpArray;

public class Deserailization {
	@Test
	public void main() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		
		CreateProjectWithPojEmpArray emp=obj.readValue(new File("./Serailization.json"), CreateProjectWithPojEmpArray.class);
		
		System.out.println(emp.geteName());
	}

}
