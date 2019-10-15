package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.IItemRepository;
import com.example.demo.model.Item;

@Service
public class ItemSBusinesservice {

	@Autowired
	private IItemRepository repo;
	
	
	public Item retreiweHardcodedItem() {
		return new Item("soap",1,500, 5);
	}
	
	public List<Item> retriveAllItems() {
		List<Item> items =  repo.findAll();
		
		for(Item item: items) {
			 item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}
}
