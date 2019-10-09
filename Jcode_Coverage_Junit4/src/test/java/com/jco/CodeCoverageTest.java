package com.jco;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CodeCoverageTest {
	CodeCoverage codeCoverage = null;
			
	@Before
	public void setup() {
		System.out.println("Setup method call.");
		this.codeCoverage = new CodeCoverage();
	}

	@Test
	public void testSimpleMethod() {
		assertTrue(codeCoverage.simpleMethod());
	}

	@Test
	public void testMultipleBranchMethod() {
		assertTrue(NUMTYPE.EVEN == codeCoverage.multipleBranchMethod(222));
		assertTrue(NUMTYPE.EVEN == codeCoverage.multipleBranchMethod(0));
		assertTrue(NUMTYPE.ODD  == codeCoverage.multipleBranchMethod(111));
		assertTrue(NUMTYPE.ODD  == codeCoverage.multipleBranchMethod(1));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void negativeNumberTestCase() {
	    codeCoverage.multipleBranchMethod(-111);
	}
	
	@After
	public void tearDown() {
	System.out.println("Tear Down Method call.");
	}
}
