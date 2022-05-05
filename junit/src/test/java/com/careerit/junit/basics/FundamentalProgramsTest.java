package com.careerit.junit.basics;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FundamentalProgramsTest {

	@Test
	void isPrimeWithPrime() {
		FundamentalPrograms obj = new FundamentalPrograms();
		boolean expected = true;
		int num = 17;
		boolean actual = obj.isPrime(num);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Prime nubmer with -ve numbers")
	void isPrimeWithNNumber() {
		FundamentalPrograms obj = new FundamentalPrograms();
		boolean expected = false;
		int num = -17;
		boolean actual = obj.isPrime(num);
		assertEquals(expected, actual);
	}

	/*
	 * @Test void reverseOfNumber() { FundamentalPrograms obj = new
	 * FundamentalPrograms();
	 * 
	 * assertAll( () -> assertEquals(321, obj.reverseOfNumber(123)), () ->
	 * assertEquals(301, obj.reverseOfNumber(103))); }
	 */
}
