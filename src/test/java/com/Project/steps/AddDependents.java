package com.Project.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import com.Project.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class AddDependents extends CommonMethods {

	@Given("user logged in with valid admin username {string} and password {string}")
	public void user_logged_in_with_valid_admin_username_and_password(String string, String string2) {

		login.login(string, string2);
		wait(2);
	}
	@Then("user navigated to employee list page")
	public void user_navigated_to_employee_list_page() {
		dashboard.navigateToEmployeeList();
		wait(10);
	}
	@Then("user searched employee by employee ID {string}")
	public void user_searched_employee_by_employee_ID(String ID) {

		empinfo.EmpID.sendKeys(ID, Keys.ENTER);
		wait(2);
		jsClick(empinfo.serchBtn);
		wait(2);
	}
	@Then("user seleceted to employee and navigated to personal details page")
	public void user_seleceted_to_employee_and_navigated_to_personal_details_page() {
		jsClick(empinfo.userid);
		wait(2);
	}
	@Then("user clicked on dependents link and navigate to Assigned Dependents page")
	public void user_clicked_on_dependents_link_and_navigate_to_Assigned_Dependents_page() {
		pdetails.searchDependents(pdetails.dependent,"Dependents");
	}
	@Then("user added multiple dependents name {string}")
	public void user_added_multiple_dependents_name(String string) {
		wait(3);
		jsClick(depdents.btnAddDependant);
		sendText(depdents.depdntName , string);
		wait(2);
	
	}
	@Then("user selected dependents relationship {string} and specify relationship {string}")
	public void user_selected_dependents_relationship_and_specify_relationship(String string1 ,String string2) {
		selectDdValue(depdents.Relationship,string1);
		wait(2);
		sendText(depdents.SpecifyRelationship , string2);
	}
	@Then("user selected dependents birthdates {string},{string},{string} and click save")
	public void user_selected_dependents_birthdates_and_click_save(String month, String day, String year) {
	
		depdents.DependentBirthDate(month,day,year);
		
		jsClick(depdents.btnSave);
	}
	
	@Then("user added multiple dependents information")
	public void user_added_multiple_dependents_information(DataTable str) {
		List<Map<String, String>> depinfo=str.asMaps();
		
		for(Map<String ,String > addinfo:depinfo) {
			
			String depName=addinfo.get("DependentName");
			String relationship=addinfo.get("RelationShip");
			String rel=addinfo.get("relations");
			String birtday=addinfo.get("birthDate");
			
			sendText(depdents.depdntName, depName);
			sendText(depdents.Relationship, relationship);
			sendText(depdents.SpecifyRelationship, rel);
			sendText(depdents.DateOfBirth, birtday);

			}
	}
}
