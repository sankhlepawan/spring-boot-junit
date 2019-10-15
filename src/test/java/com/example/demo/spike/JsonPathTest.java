package com.example.demo.spike;





import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {

	@Test
	public void test() {
		String responseFromService =  "[" + 
				"{\"id\":100, \"name\":\"pencil\",\"quantity\":5}," + 
				"{\"id\":101, \"name\":\"pen\",\"quantity\":15}" + 
				"{\"id\":102, \"name\":\"eraser\",\"quantity\":10}" 
				+ "]";
		
		DocumentContext parse = JsonPath.parse(responseFromService);
		int length = parse.read("$.length()");
		assertThat(length).isEqualTo(3);
		
		List<Integer> ids = parse.read("$..id");
		assertThat(ids).containsExactly(100,101,102);
		
		System.out.println(parse.read("$.[1]").toString());
		System.out.println(parse.read("$.[0:1]").toString()); // get two elements exclusive 1
		System.out.println(parse.read("$.[?(@.name=='pen')]").toString()); // get element by condition
		System.out.println(parse.read("$.[?(@.quantity==5)]").toString()); // get element by condition
	}

}
