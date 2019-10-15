package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.data.IItemRepository;
import com.example.demo.model.Item;
import com.example.demo.service.ItemSBusinesservice;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

	@Mock
	private IItemRepository repo;
	
	
	@InjectMocks
	ItemSBusinesservice business;
	
	
	
	@Test
	public void calculateSumUsingDataService_basic() {
		when(repo.findAll()).thenReturn(Arrays.asList(new Item("item1",1000, 1000, 500),new Item("item2",1001, 1000, 50)));
		
		List<Item> items = business.retriveAllItems();
		
		assertEquals(500000, items.get(0).getValue());
		assertEquals(50000, items.get(1).getValue());
	}
	
}
