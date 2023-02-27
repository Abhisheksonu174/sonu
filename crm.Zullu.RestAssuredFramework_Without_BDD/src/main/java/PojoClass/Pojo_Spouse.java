package PojoClass;

public class Pojo_Spouse {
	
	private String Name;
	private int[] phone;
	
	public Pojo_Spouse(String name, int[] phone) {
		super();
		Name = name;
		this.phone = phone;
	}
	
	
	public Pojo_Spouse() {
	
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int[] getPhone() {
		return phone;
	}


	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	

	
}
