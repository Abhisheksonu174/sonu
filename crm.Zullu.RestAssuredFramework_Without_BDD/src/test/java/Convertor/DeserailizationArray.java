package Convertor;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.CreateProjectWithPojEmpArray;

public class DeserailizationArray {
	@Test
	public void main() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		
		CreateProjectWithPojEmpArray emp=obj.readValue(new File("./SerailizationArray.json"), CreateProjectWithPojEmpArray.class);
		
		System.out.println(emp.geteName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPlace());
		System.out.println(emp.getPhone()[0]);
		System.out.println(Arrays.toString(emp.getPhone()));
	}	
}



