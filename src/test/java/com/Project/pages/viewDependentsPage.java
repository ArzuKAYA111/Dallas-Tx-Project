package com.Project.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Project.utils.CommonMethods;
public class viewDependentsPage extends CommonMethods{
@FindBy(xpath="//input[@id='btnAddDependent']")
public WebElement btnAddDependant;
@FindBy(id="dependent_name")
public WebElement depdntName;
@FindBy(xpath="//select[@id='dependent_relationshipType']")
public WebElement Relationship;
@FindBy(xpath="//input[@id='dependent_relationship']")
public WebElement SpecifyRelationship;
@FindBy(id="dependent_dateOfBirth")
public WebElement DateOfBirth;   //send text line
@FindBy(xpath="//input[@id='dependent_dateOfBirth']/following-sibling::img")
public WebElement calendarimage; 
@FindBy(xpath="//select[@class='ui-datepicker-month']")
public WebElement selectMonth; 
@FindBy(xpath="//select[@class='ui-datepicker-year']")
public WebElement selectYear; 
@FindBy(xpath="//a[@title='Next']")
public WebElement NextBtn; 
@FindBy(xpath="//a[@title='Prev']")
public WebElement PreviousBtn; 
@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr")
public List<WebElement > calenadrRows; 
@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr//td")
public List<WebElement> datenumbers; // calenadr Columns
@FindBy(id="btnSaveDependent")
public WebElement btnSave; 
public viewDependentsPage(){
	PageFactory.initElements(driver, this);
}
public void DependentBirthDate(String month, String birtDay,String year) {
	calendarimage.click();
	selectDdValue(selectMonth,month);
	wait(2);
	selectDdValue(selectYear,year);
//List<WebElement>  datenumbers=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));// calendar
	for(WebElement date: datenumbers) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		if(date.getText().equals(birtDay)) {
			date.click();
			break;
		}}	}

}
	

