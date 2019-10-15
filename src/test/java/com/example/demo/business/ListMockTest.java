package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListMockTest {

	@Mock
	List<String> mock;
	
	@Test
	public void test() {
		
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5,mock.size());
		assertEquals(10,mock.size());
	}
	
	@Test
	public void returnWithParameter() {
		when(mock.get(0)).thenReturn("unitTest");
		assertEquals("unitTest",mock.get(0));
		assertEquals(null,mock.get(1));
	}
	
	@Test
	public void returnWithAnyParameters() {
		when(mock.get(anyInt())).thenReturn("unitTest");
		assertEquals("unitTest",mock.get(0));
	}
	
	@Test
	public void verificatonBasics() {
		
		String value = mock.get(0);
		String value1 = mock.get(1);
		
		verify(mock).get(0);
		verify(mock, atLeast(1)).get(anyInt());
		verify(mock, times(2)).get(anyInt());
		verify(mock, never()).get(2);
	}
	
	@Test
	public void argumentCapturing() {
		
		//SUt
		mock.add("SomeString"); // adding some value
	    
		//verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("SomeString", captor.getValue());
	}
	
	@Test
	public void MultipleargumentCapturing() {
		
		//SUt
		mock.add("SomeString"); // adding some value
		mock.add("SomeString1");
	    
		//verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		
		List<String> allValues = captor.getAllValues();
		
		assertEquals("SomeString", allValues.get(0));
		assertEquals("SomeString1", allValues.get(1));
	}
	
	@Test
	public void spying() {
		ArrayList arrayListSpy = spy(ArrayList.class); // spy on mock object for original behaviour
		
		arrayListSpy.add("Test");
		// arrayListSpy.get(1); // test faild here because we have not added at 1 index any thing in list and we are spying 
		arrayListSpy.get(0);
		arrayListSpy.size();
		
		arrayListSpy.add("Test2");
		arrayListSpy.size();
		
		when(arrayListSpy.get(0)).thenReturn(5);
		arrayListSpy.get(0);
	}
}
