package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Thanga\\eclipse-workspace\\GoAmazon\\src\\test\\resources\\Amazon.feature",
glue="com.step",
plugin= {"pretty","json:src\\test\\resources\\cucumber-report\\output.json",
		"html:src\\test\\resources\\report\\output.html",
		"junit:src\\test\\resources\\report\\output.xml"})
public class Test
{
@AfterClass
public static void afterclass()
{
	Report.jvmReport("C:\\Users\\Thanga\\eclipse-workspace\\GoAmazon\\src\\test\\resources\\cucumber-report\\output.json");
}
}
