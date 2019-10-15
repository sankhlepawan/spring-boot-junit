package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations= {"classpath:application-test.properties"}) // test related properties
public class UdamyUnitTestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
