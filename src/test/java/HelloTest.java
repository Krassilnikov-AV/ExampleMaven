/*
 * Copyright (c) 2020 Tander, All Rights Reserved.
 */

import org.junit.*;

import java.util.Arrays;

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

	public static void test1() {
		Arrays.stream(new int[]{1, 2, 3}).forEach(System.out.println);
	}
	public static void main(String[] args) {
		test1();
		test1();
	}
}