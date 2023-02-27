package Convertor;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoClass.CreatetheEmpwithSpose;
import PojoClass.Pojo_Spouse;

public class SerailizationSpouse {
 public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
 
 {
	 int[] phone= {1234,5489};
	 Pojo_Spouse spo=new Pojo_Spouse("sach", phone);
	 
	String []ext= {"Adgy","asdt"};
	 
	 CreatetheEmpwithSpose semp=new CreatetheEmpwithSpose("Abhishek","Hassan","Tyss", ext, spo);
	 
	 ObjectMapper amp=new ObjectMapper();
	 amp.writeValue(new File("./Complex.json"), semp);
	
}

}
