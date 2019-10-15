//package com.example.demo.controller;
//
//import static org.junit.Assert.assertEquals;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
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
//import com.example.demo.controllers.HelloWorlController;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(HelloWorlController.class)
//public class HellowWorldControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void helloWorld_basic() throws Exception{
//	    // call hello-world
//		// verify Hello world
//		
//		RequestBuilder request = MockMvcRequestBuilders
//				.get("/hello-world")  // url to be check
//				.accept(MediaType.APPLICATION_JSON);  // building the request
//		
//		MvcResult result= mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().string("Hello World"))
//				.andReturn();
//		
//		// assertEquals("Hello World", result.getResponse().getContentAsString()); // expecting Hello World in request result
//	}
//	
//
//}
