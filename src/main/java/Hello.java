/*
 * Copyright (c) 2020 Tander, All Rights Reserved.
 */

/**
 * Класс Hello
 */
public class Hello {

	public static String hello() {
		return "Hello";
	}

	public static String helloAge(int age) {

		if(age <=0) {
			throw new IllegalArgumentException();
		}
		return String.format("Hello%d!", age);
	}
}