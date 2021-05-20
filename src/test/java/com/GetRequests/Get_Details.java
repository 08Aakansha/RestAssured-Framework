package com.GetRequests;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojo.DeserializeJSON;

public class Get_Details {

	
	@Test()
	public static void getEmployeeDetail(){
		RestAssured.baseURI= "http://dummy.restapiexample.com/api/v1/employees";
		//setting request specification class
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get();
		System.out.println(response.asString());
		ResponseBody body = response.getBody();
		DeserializeJSON responseBody = body.as(DeserializeJSON.class);
		
		System.out.println(responseBody);
		
	}
}
