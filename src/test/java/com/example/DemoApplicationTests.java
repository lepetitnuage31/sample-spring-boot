package com.example;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals(true, false);
	}
	
	@Ignore
	@Test
	public void test2() {
		assertEquals(true, false);
	}

}
