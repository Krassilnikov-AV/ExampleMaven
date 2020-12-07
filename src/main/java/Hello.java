/*
 * Copyright (c) 2020 Tander, All Rights Reserved.
 */

import java.util.Arrays;

/**
 * Класс Hello
 */
public class Hello {

	public static String hello() {
		return "Hello!";
	}

	public static String helloAge(int age) {

		if(age <=0) {
			throw new IllegalArgumentException();
		}
		return String.format("Hello, %d!", age);
	}
	public static void test1() {
		Arrays.stream(new int[]{1, 2, 3}).forEach(i -> System.out.println(i));
	}
	public static void main(String[] args) {
		test1();
		test1();
	}
}