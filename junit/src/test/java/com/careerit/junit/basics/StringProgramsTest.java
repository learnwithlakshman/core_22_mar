package com.careerit.junit.basics;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringProgramsTest {

	@Test
	void isPalindromeWithPalindromeStr() {
			StringPrograms obj =new StringPrograms();
			String str = "mom";
			boolean expected = true;
			boolean actual = obj.isPalindrome(str);
			assertEquals(expected, actual);
			
	}
	
	@Test
	void isPalindromeForNonPalindromeStr() {
		StringPrograms obj =new StringPrograms();
		String str = "dummy";
		boolean expected = false;
		boolean actual = obj.isPalindrome(str);
		assertEquals(expected, actual);
	}
	@Test
	void isPalindromeWithNumbers() {
		StringPrograms obj =new StringPrograms();
		String str = "12321";
		boolean expected = true;
		boolean actual = obj.isPalindrome(str);
		assertEquals(expected, actual);
	}
	@Test
    void isPalindromeWithSpaceInit() {
		StringPrograms obj =new StringPrograms();
		String str = "mom mom";
		boolean expected = true;
		boolean actual = obj.isPalindrome(str);
		assertEquals(expected, actual);
	}
}
