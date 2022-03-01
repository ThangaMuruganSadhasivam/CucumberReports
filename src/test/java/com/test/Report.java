package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	public static void jvmReport(String jsonFile)
	{
		File f = new File("C:\\Users\\Thanga\\eclipse-workspace\\GoAmazon\\src\\test\\resources\\cucumber-report");
		Configuration config = new Configuration(f,"amazon mobile Booking");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("version", "93");
		
		List<String> json = new ArrayList<String>();
		json.add(jsonFile);
		ReportBuilder report = new ReportBuilder(json,config);
		report.generateReports();
	}

}
