package PojoClass;

import org.testng.annotations.Test;

import genericUtility.JavaLibrary;

public class CreateProjectWithPojClass {
	String createBy;
	String projectName;
	String status;
	int teamsize;

	public CreateProjectWithPojClass(String createBy, String projectName, String status, int teamsize) {
		
		this.createBy = createBy;
		this.projectName = projectName;
		this.status = status;
		this.teamsize = teamsize;}

	public String getCreateBy() {
		return createBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getStatus() {
		return status;
	}

	public int getTeamsize() {
		return teamsize;
	}
	
	
}
