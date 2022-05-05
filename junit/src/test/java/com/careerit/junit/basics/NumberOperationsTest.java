package com.careerit.junit.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NumberOperationsTest {

	NumberOperations obj;
	
	@BeforeEach
	void init() {
		System.out.println("init");
		obj = new NumberOperations();
	}
	
	@AfterEach
	void destory() {
		System.out.println("destory");
	}
	
	@BeforeAll
	static void initData() {
		System.out.println("Before init test cases");
	}
	
	@AfterAll
	static void destoryData() {
		System.out.println("After all test cases");
	}
	
	@Nested
	class MathDivisionTest {
		@Test
		void divisionOfTwoNumbers() {
			int expected = 6;
			int actual = obj.div(20, 3);
			System.out.println("Result :"+actual);
			assertEquals(expected, actual);
		}

		@Test
		void divisionWithZero() {
			assertThrows(ArithmeticException.class, () -> obj.div(10, 0));
		}
	}
	
	@Nested
	@DisplayName("Biggest of three numbers")
	class MathBiggestTest {
		@Test
		void biggestAsA() {
			int expected = 10;
			int actual = obj.biggest(10, 3, 4);
			assertEquals(expected, actual, "It should return biggest");
		}

		@Test
		void biggestAsB() {
			int expected = 10;
			int actual = obj.biggest(3, 10, 4);
			assertEquals(expected, actual, "It should return biggest");
		}

		@Test
		void biggestAsC() {
			int expected = 10;
			int actual = obj.biggest(4, 3, 10);
			assertEquals(expected, actual, "It should return biggest");
		}

		@Test
		void biggestAsSameValues() {
			int expected = 10;
			int actual = obj.biggest(10, 10, 10);
			assertEquals(expected, actual, "It should return biggest");
		}
	}
}
