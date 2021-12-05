package com.graded1.departments;

public class Techdept extends Superdept{
	String getTechStackInformation = "core Java";

	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}

	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
	}
	public String  display(String departmentName, String getTodaysWork, String getWorkDeadline,String getTechStackInformation, String isTodayAHoliday) {
		return "Welcome to " + departmentName + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n" + getTechStackInformation + "\n" + isTodayAHoliday + "\n";
	}
}