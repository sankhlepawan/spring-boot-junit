package com.example.demo.spike;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamecrestMatchersTest {

	@Test
	public void learning() {
		List<Integer> numbers = Arrays.asList(12,15,45);
		assertThat(numbers, hasSize(3));
		assertThat(numbers, hasItems(12,15));
		assertThat(numbers, everyItem(greaterThan(10)));
		assertThat(numbers, everyItem(lessThan(100)));
		
		assertThat("", isEmptyString());
		assertThat("abcd", containsString("abcd"));
	}

}
