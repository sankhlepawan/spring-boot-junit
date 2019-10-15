package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void contextLoads() throws Exception{
		String response = restTemplate.getForObject("/all-item-from-database", String.class);
		System.out.println(response);
		JSONAssert.assertEquals("[{id:1000},{id:1001},{id:1004},{id:1002},{id:1003}]", response, false);
	}

}
