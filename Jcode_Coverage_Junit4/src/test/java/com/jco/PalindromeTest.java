package com.jco;

import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

//import org.junit.Test;

/*import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
*/

public class PalindromeTest {

/*	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
*/
	//@Test
/*	public void testIsPalindrome() {
		
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
