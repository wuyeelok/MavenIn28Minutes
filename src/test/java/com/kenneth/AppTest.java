package com.kenneth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void test1() {
		App app = new App();

		int actualResult = app.parseToInt("00000011", 0);
		int expectedResult = 11;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test2() {
		App app = new App();

		int actualResult = app.parseToInt("00000199", 0);
		int expectedResult = 199;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test3() {
		App app = new App();

		int actualResult = app.parseToInt("00000000", 0);
		int expectedResult = 0;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test4() {
		App app = new App();

		int actualResult = app.parseToInt("abc", 0);
		int expectedResult = 0;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test5() {
		App app = new App();

		int actualResult = app.parseToInt(null, 0);
		int expectedResult = 0;

		assertEquals(expectedResult, actualResult);
	}
}
