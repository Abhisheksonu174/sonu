package Convertor;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
//import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojEmpArray;


public class SerializationArray {

	public  static void main(String[]args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		
		Long[] phone= {7625027040l,9481246640l};
		CreateProjectWithPojEmpArray emp=new CreateProjectWithPojEmpArray("abhi", "Hassan", "abhishek@gmail.com", phone);
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File("./SerailizationArray.json"), emp);
	
	
	
	}
}
