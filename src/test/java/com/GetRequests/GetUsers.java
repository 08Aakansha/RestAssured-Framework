package com.GetRequests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsers {
	
	static ExtentReports extent;
	@BeforeTest
	public void initializeReport() {
		String path =System.getProperty("user.dir")+"\\reports\\Get_Request_Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("API Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("SDET", "Aakansha Singh");
	}

	
	@Test(description="Verify Total in response Json", priority=0)
	 public static void verifyTotalResponse() 
	{
		ExtentTest test= extent.createTest("Verify Total in response Json");
		RestAssured.baseURI="https://reqres.in";
		 Response resp=RestAssured.given().when().get("/api/users?page=2");
		 System.out.println(resp.path("total").toString());
		 assertEquals(resp.path("total").toString(),"12");
		 
		 
	}
	
	@Test(description="Method to extract data from JSON and store in List",priority=1)
	 public static void storeDataInList() 
	{
		ExtentTest test= extent.createTest("Method to extract data from JSON and store in List");
		RestAssured.baseURI="https://reqres.in";
		 Response resp=RestAssured.given().when().get("/api/users?page=2");
		 List<Object> jsonResponse = resp.jsonPath().getList("data");
		 System.out.println(jsonResponse);
		   System.out.println("The number of data in the list is : " + jsonResponse.size());
		  for(int i=0; i<jsonResponse.size();i++)
		  {
			 System.out.println(jsonResponse.get(i));
		  }
	}
		
	@Test(description="Method to extract data from JSON and store in Map",priority=2)
	 public static void storeDataInMap() 
	{
		ExtentTest test= extent.createTest("Method to extract data from JSON and store in Map");
		RestAssured.baseURI="https://reqres.in";
		 Response resp=RestAssured.given().when().get("/api/users?page=2");
		 List<Object> jsonResponse = resp.jsonPath().getList("data");
		 for(int i=0; i<jsonResponse.size();i++) {
		 Map<Object, Object> company = resp.jsonPath().getMap("data["+i+"]");
	     System.out.println(company);
	      company.entrySet().forEach(entry-> {
	    	  System.out.println(entry.getKey() + " " + entry.getValue());
	    	  System.out.println("Next Entry");
	    	  System.out.println("----------------------");
	      });
		 }
		 
	}
	
	
	@AfterTest
	public void closeReport() {
		extent.flush();
	}
	
	
		
		
		
		
		
		
	}


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 