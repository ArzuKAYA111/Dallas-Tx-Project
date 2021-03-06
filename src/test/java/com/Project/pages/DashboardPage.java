package com.Project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class DashboardPage extends CommonMethods {
	 @FindBy(id="welcome")
	    public WebElement welcome;
	    
		@FindBy(xpath="//a[contains(text(),'Welcome')]")
		public WebElement welcomeuser;

		@FindBy(xpath = "//div[@id='branding']/a[1]/img")
		public WebElement logo; // logo in Dashboard at the left top

		@FindBy(id = "menu_pim_viewPimModule")
		public WebElement PIM;
		
		@FindBy(id="menu_pim_viewEmployeeList")
		public WebElement empListPage;
		
		@FindBy(id = "menu_pim_addEmployee")
		public WebElement addemp;

		@FindBy(id = "firstName")
		public WebElement empfirstnme;

		@FindBy(id = "lastName")
		public WebElement lastnme;

		@FindBy(id = "employeeId")
		public WebElement empid;

		@FindBy(id = "//input[@id='personal_txtEmployeeId']")
		public WebElement lablempid;

		@FindBy(id = "photofile")
		public WebElement empPrfl;

		@FindBy(id = "btnSave")
		public WebElement BtnSave;
		
		@FindBy(xpath = "//div[@class='menu']/ul/li")
		public List< WebElement > dashMenu;
		

		public DashboardPage() {
			PageFactory.initElements(BaseClass.driver, this);
		}

		public void navigateToAddEmployee() {
			jsClick(PIM);
			jsClick(addemp); //  We created method to click elements what defind in that class so we willl calll taha method in Test
		
		}
		
		public void navigateToEmployeeList() {
			jsClick(PIM);
			jsClick(empListPage); //  We created method to click elements what defind in that class so we willl calll taha method in Test
		
		}
		
}
