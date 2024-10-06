package org.jvm;

import java.io.File;

import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
	
	public static void jvmReporting(String jsonreport) {



File f=new File("C:\\Users\\durairaj\\eclipse-workspace\\CucumberProject\\Screenshot");

Configuration c=new Configuration(f, "facebook");
c.addClassifications("platform name", "window");
c.addClassifications("platform version", "window 11");
c.addClassifications("browser name", "chrome");
c.addClassifications("browser version", "128");

List<String> li=new LinkedList<String>();
li.add(jsonreport);

ReportBuilder r=new ReportBuilder(li, c);

r.generateReports();











	}

}
