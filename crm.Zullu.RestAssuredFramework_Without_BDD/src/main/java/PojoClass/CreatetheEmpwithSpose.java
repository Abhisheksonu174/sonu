package PojoClass;

public class CreatetheEmpwithSpose {
private	String name;
private String place;
private String company;
private	String[] phone;
private Pojo_Spouse spouse;
	public CreatetheEmpwithSpose(String name,String place, String company, String[] phone, Pojo_Spouse spouse) {

		this.name = name;
		this.place = place;
		this.company = company;
		this.phone = phone;
		this.spouse = spouse;
	
	}
	public CreatetheEmpwithSpose() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	public Pojo_Spouse getSpouse() {
		return spouse;
	}
	public void setSpouse(Pojo_Spouse spouse) {
		this.spouse = spouse;
	}
	
	
	



}
