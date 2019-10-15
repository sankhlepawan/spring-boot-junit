package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemSBusinesservice;

@RestController
public class ItemController {

	@Autowired
	private ItemSBusinesservice itemService;
	
	@GetMapping("/dummy-item")
	public Item helloWorld() {
		return new Item("soap",1,500, 5);
	}
	
	@GetMapping("/item-from-servie")
	public Item itemFromervice() {
		return itemService.retreiweHardcodedItem();
	}
	
	@GetMapping("/all-item-from-database")
	public List<Item> retriwvAllItems() {
		return itemService.retriveAllItems();
	}
	
	
}
