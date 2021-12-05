package com.graded1.main;

import com.graded1.departments.*;

public class Driver{

	public static void main (String args[]) {
					
		Admindept admin = new Admindept();
		HRdept hr = new HRdept();
		Techdept tech = new Techdept();
		
		String showadmin, showhr, showtech;
		
		showadmin = admin.display("Admin Department","Complete your documents submission","Complete by EOD","Today is not a holiday");
			System.out.println(showadmin);

		showhr = hr.display("HR Department",hr.getDoActivity(),"Fill today's timesheet and mark your attendance","Complete by EOD","Today is not a Holiday");
			System.out.println(showhr);
			
		showtech = tech.display("Tech Department","Complete coding of Module 1","Complete by EOD", tech.getGetTechStackInformation() ,"Today is not a Holiday");
			System.out.println(showtech);
		}		
}