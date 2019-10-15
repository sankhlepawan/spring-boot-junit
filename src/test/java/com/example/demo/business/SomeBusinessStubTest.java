package com.example.demo.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.busines.SomeBusinessImpl;
import com.example.demo.data.SomeDataService;

class SomeDataServieStub implements SomeDataService{

	@Override
	public int[] getallData() {
		return new int[] {1,2,3};
	}

	
}
public class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServieStub());
		int result = business.caluculateSumwithDataServie();
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void emptyTest() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServieStub());
		int result = business.caluculateSumwithDataServie();
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}

}
