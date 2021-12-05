package com.graded1.departments;

public class Admindept extends Superdept{
	
	public String  display(String departmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		return "Welcome to " + departmentName + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n" + isTodayAHoliday + "\n";
	}
}