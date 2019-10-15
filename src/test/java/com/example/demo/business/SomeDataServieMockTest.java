package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.busines.SomeBusinessImpl;
import com.example.demo.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class SomeDataServieMockTest {

	@Mock
	SomeDataService dataService;  // mock this because this is using inside impl
	
	@InjectMocks
	SomeBusinessImpl business;
	
	
	
	@Before
	public void before() 
	{
		business.setSomeDataService(dataService);
	}
	
	@Test
	public void calculateSumUsingDataService_basic() {
		when(dataService.getallData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.caluculateSumwithDataServie());
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		when(dataService.getallData()).thenReturn(new int[] {});
		assertEquals(0, business.caluculateSumwithDataServie());
	}
	
	@Test
	public void calculateSumUsingDataService_one() {
		
		when(dataService.getallData()).thenReturn(new int[] {1});
		assertEquals(1, business.caluculateSumwithDataServie());
	}
}
