package Convertor;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoClass.CreateProjectWithPojoEmp;

public class Serailization {
	public  static void main(String[]args) throws JsonGenerationException, JsonMappingException, IOException 
	{


		CreateProjectWithPojoEmp emp=new CreateProjectWithPojoEmp("abhishek","Hassan", "abhishek@gmail.com");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./Serailization.json"), emp);

	}

}
