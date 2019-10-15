//package com.example.demo.controller;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.example.demo.controllers.ItemController;
//
//@RunWith(SpringRunner.class)
//// @WebMvcTest(ItemController.class)
//public class DummyItemControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void dummyItem_basic() throws Exception{
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/dummy-item")  // url to be check
//				.accept(MediaType.APPLICATION_JSON);  // building the request
//		
//		MvcResult result= mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().json("{\n" + 
//						"  \"name\": \"soap\",\n" + 
//						"  \"id\": 1,\n" + 
//						"  \"price\": 500,\n" + 
//						"  \"quantity\": 5\n" + 
//						"}"))
//				.andReturn();
//		
//	}
//
//}
