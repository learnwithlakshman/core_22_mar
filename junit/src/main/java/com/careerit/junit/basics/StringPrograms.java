package com.careerit.junit.basics;

public class StringPrograms {

	public boolean isPalindrome(String str) {
		if (str != null) {
			return new StringBuffer(str).reverse().toString().equalsIgnoreCase(str);
		}
		return false;
	}

	// ABCD => n = 3 => ["ABC", "BCD"]
	public int[] subStringWithSizeN(String str, int n) {
		return null;
	}

	// ["Rajesh","Manoj","Suresh"] => delimeter = "-" => Rajesh-Manoj-Suresh
	public String joinStrings(String[] str, String delimeter) {
		return null;
	}

	// Occurance of given key in the given array
	public int occurance(String[] str, String key) {

		return 0;
	}

	// Sort the given colors in asc/desc
	public String[] sort(String[] colors) {

		return null;
	}

	public int countOfVowels(String str) {

		return 0;
	}

	public int getWordCount(String str) {

		return 0;
	}

	// Covert integer arr values to binary string array
	public String[] covertToBinaryString(int[] arr) {

		return null;
	}

	// Encode string vowels with 1 and consonants with 0 then return
	public String encode(String str) {
		return null;
	}

}