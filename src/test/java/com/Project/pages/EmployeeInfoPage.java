package com.Project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class EmployeeInfoPage  extends CommonMethods{
	@FindBy (id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy (id="empsearch_id")
	public WebElement EmpID;
	
@FindBy(xpath="//select[@id='empsearch_employee_status']")
public List<WebElement> EplymntStatus;

@FindBy(xpath="//select[@id='empsearch_termination']")
public List<WebElement > include;

	@FindBy (id="searchBtn")
	public WebElement serchBtn;
	
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr")
	public List<WebElement> emplListRows;
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr/td")
	public List<WebElement> emplListcolums;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement userid;
	
	@FindBy(xpath="//table[@id='resultTable']//td[3]/a")
	public WebElement userName;

	
public	EmployeeInfoPage(){
		
	PageFactory.initElements(BaseClass.driver, this);
	
	}
	
public void employeeIdIsDisplayed() {
	System.out.println("The user ID is : "+ userid.isDisplayed());
}

public  void employeeNameusernameDisplayed() {
	System.out.println("The user NAME is : "+ userName.isDisplayed());
	
	
	
	
	
	
}

}
