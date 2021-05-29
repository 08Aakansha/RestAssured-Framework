package com.PostRequest;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testData.Payload;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojo.DeserializeJSON;

public class Post_Details {
	
	static Payload payload=new Payload();
	@Test()
	public static void getBooks(){
		RestAssured.baseURI= "http://dummy.restapiexample.com";
		//setting request specification class
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest. contentType(ContentType.JSON).body(payload.employeeDetailsPayload()).post("/api/v1/create");
		 ResponseBody body = response.getBody();
		 DeserializeJSON responseBody = body.as(DeserializeJSON.class);
		 System.out.println(responseBody.getMessage());
		 
		//fdfdfdfdfdf

	}	
}
