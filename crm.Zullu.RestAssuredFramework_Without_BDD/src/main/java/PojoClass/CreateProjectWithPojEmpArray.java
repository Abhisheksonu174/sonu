package PojoClass;

public class CreateProjectWithPojEmpArray {
	String eName;
	String place;
	String email;
	Long[] phone;



	public CreateProjectWithPojEmpArray(String eName, String place, String email, Long[] phone) {
		super();
		this.eName = eName;
		this.place = place;
		this.email = email;
		this.phone = phone;
	}


	public String geteName() {
		return eName;
	}
	public String getPlace() {
		return place;
	}
	public String getEmail() {
		return email;
	}
	public Long[] getPhone() {
		return phone;
	}





}
