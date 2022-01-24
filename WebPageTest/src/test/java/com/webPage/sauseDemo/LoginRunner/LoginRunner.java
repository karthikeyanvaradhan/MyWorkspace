package com.webPage.sauseDemo.LoginRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Saucedemo Test.Feature"
		,glue={"stepDefinition"},tags={"@sauce"}
		)


public class LoginRunner {

}
