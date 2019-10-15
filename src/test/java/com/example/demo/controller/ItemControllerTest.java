package com.example.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controllers.ItemController;
import com.example.demo.model.Item;
import com.example.demo.service.ItemSBusinesservice;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemSBusinesservice itemService;
	
	
	@Test
	public void retreiwAllItems_basic() throws Exception{
		
		when(itemService.retriveAllItems())
		.thenReturn(Arrays.asList(new Item("item1",1000, 1000, 500),new Item("item2",1001, 1000, 500)));
		
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/all-item-from-database")  // url to be check
				.accept(MediaType.APPLICATION_JSON);  // building the request
		
		MvcResult result= mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id:1000,name:item1,price:1000},{id:1001,name:item2,price:1000}]"))
				.andReturn();
	}

}
