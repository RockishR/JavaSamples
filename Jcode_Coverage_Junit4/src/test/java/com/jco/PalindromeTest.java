package com.jco;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jco.Palindrome;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		
		Palindrome palindromeTester = new Palindrome();

		assertTrue(palindromeTester.isPalindrome("MADDAM"));
		assertTrue(palindromeTester.isPalindrome("A"));
		assertTrue(palindromeTester.isPalindrome("WOW"));
		assertTrue(palindromeTester.isPalindrome("12344321"));
		assertFalse(palindromeTester.isPalindrome("XYZ"));
		assertFalse(palindromeTester.isPalindrome("123"));
	
	}
	
	@Test
	public void whenEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	
}
