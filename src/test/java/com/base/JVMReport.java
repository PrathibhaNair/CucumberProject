package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile) {
		
		File loc = new File("C:\\Users\\Prathibha\\eclipse-workspace\\CucumberPjt4\\src\\test\\resources\\Reporting");
		
		Configuration configuration = new Configuration(loc, "Adactin Hotel Automation");
		
		configuration.addClassifications("Sprint", "10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Environment", "UAT");
		configuration.addClassifications("OS", "Win-10");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}
}
