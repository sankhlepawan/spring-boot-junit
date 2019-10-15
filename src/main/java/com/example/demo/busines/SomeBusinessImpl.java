package com.example.demo.busines;

import com.example.demo.data.SomeDataService;

public class SomeBusinessImpl {

	SomeDataService someDataService;
	
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int caluculateSum(int[] data) {
		int sum=0;
		for(int value : data) {
			sum += value;
		}
		return sum;
	}
	
	public int caluculateSumwithDataServie() {
		int sum=0;
		int[] data = someDataService.getallData();
		for(int value : data) {
			sum += value;
		}
		return sum;
	}
}
