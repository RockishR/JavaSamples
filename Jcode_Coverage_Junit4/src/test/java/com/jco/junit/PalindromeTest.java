package com.jco.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jco.Palindrome;

public class PalindromeTest {

/*	@Test
	public void testIsPalindrome() {
		
		Palindrome palindromeTester = new Palindrome();

		assertTrue(palindromeTester.isPalindrome("MADDAM"));
		assertTrue(palindromeTester.isPalindrome("MADAM"));
		assertTrue(palindromeTester.isPalindrome("MMMMMMMMMMMMMMMMMM"));
		
	}*/
	
	@Test
	public void whenEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	
}
