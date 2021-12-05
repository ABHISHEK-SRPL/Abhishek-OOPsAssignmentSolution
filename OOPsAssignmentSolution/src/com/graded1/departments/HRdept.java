package com.graded1.departments;

public class HRdept extends Superdept {
	
	String doActivity = "team Lunch";

	public String getDoActivity() {
		return doActivity;
	}

	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}
	
	public String  display(String departmentName, String doActivity,  String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		return "Welcome to " + departmentName +  "\n" + doActivity + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n"  + isTodayAHoliday + "\n";
	}
}