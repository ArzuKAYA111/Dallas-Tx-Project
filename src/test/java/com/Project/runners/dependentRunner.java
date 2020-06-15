package com.Project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/resources/features/",
		glue="com/Project/steps",
		dryRun=true,
		monochrome=true,
		strict=true,
		tags ="@progress",
		plugin= {
			"pretty",
			"html:target/cucumber-default-report",
			  "json:target/cucumber.json",	
			  "rerun:target/failed.txt" 
			  
		}

	)

public class dependentRunner {

	

	
	
}
