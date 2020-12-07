/*
 * Copyright (c) 2020 Tander, All Rights Reserved.
 */

import org.junit.*;

/**
 * Класс HelloTest
 */
public class HelloTest {
	@Test
	public void testHello(){
		Assert.assertEquals("Hello!", Hello.hello());
	}
	@Test
	public void testHelloAge(){
		Assert.assertEquals("Hello, 6!", Hello.helloAge(6));
		Assert.assertEquals("Hello, 20!", Hello.helloAge(20));
		Assert.assertEquals("Hello, 12!", Hello.helloAge(12));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHelloAgeZero(){
	Hello.helloAge(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHelloAgeNegative(){
		Hello.helloAge(-10);
	}


}