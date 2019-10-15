package com.example.demo.spike;

import static org.junit.Assert.*;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	String actualResponse = "{\n" + "  \"name\": \"soap\",\n" + "  \"id\": 1,\n" + "  \"price\": 500,\n" + "  \"quantity\": 5\n" + "}";
	
	@Test
	public void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws Exception{
		String expectedResponse = "{\n" + "  \"name\": \"soap\",\n" + "  \"id\": 1,\n" + "  \"price\": 500,\n" + "  \"quantity\": 5\n" + "}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);
	}
	
	@Test
	public void jsonAssert_StrictFalse() throws Exception{
		String expectedResponse = "{\n" + "  \"name\": \"soap\",\n" + "  \"price\": 500,\n" + "  \"quantity\": 5\n" + "}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}
	
	@Test
	public void jsonAssert_WithoutEscapeChar() throws Exception{
		String expectedResponse = "{name: soap,price: 500,quantity:5}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}

}
