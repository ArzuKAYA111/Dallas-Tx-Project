package com.Project.testbase;


import com.Project.pages.ContactDetailsPage;
import com.Project.pages.DashboardPage;
import com.Project.pages.EmployeeInfoPage;
import com.Project.pages.LoginPage;
import com.Project.pages.PersonalDetailsPage;
import com.Project.pages.viewDependentsPage;

public class PageInitializer extends BaseClass {

	public static LoginPage login;
	public static DashboardPage dashboard;
	public static PersonalDetailsPage pdetails;
    public static ContactDetailsPage contDetail;
public static viewDependentsPage depdents;
public static EmployeeInfoPage empinfo;



public static void initialize() {
	 login=new LoginPage();
	 dashboard=new DashboardPage();     //we are calling the constructor of page calsses
	 pdetails= new PersonalDetailsPage();
	 contDetail= new ContactDetailsPage();
	 depdents=new viewDependentsPage();
	 empinfo =new EmployeeInfoPage();
	 
}
	
	
	
	
	
	
	
	
}
