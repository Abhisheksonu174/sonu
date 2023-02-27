package Convertor;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoClass.CreatetheEmpwithSpose;
import PojoClass.Pojo_Spouse;

public class DeserializationSpouse {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		CreatetheEmpwithSpose semp=obj.readValue(new File("./Complex.json"), CreatetheEmpwithSpose.class);
		System.out.println(semp.getSpouse().getName());
		System.out.println(semp.getSpouse().getPhone()[1]);
		
		
	}

}
