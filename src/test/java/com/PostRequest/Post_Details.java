package com.PostRequest;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testData.Payload;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Details {
	
	static Payload payload=new Payload();
	@Test()
	public static void getBooks(){
		RestAssured.baseURI= "http://dummy.restapiexample.com";
		//setting request specification class
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.body(payload.employeeDetailsPayload()).post("/api/v1/create");
		System.out.println(response.asString());

	}	
}
