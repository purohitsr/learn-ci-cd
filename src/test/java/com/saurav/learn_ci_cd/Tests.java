package com.saurav.learn_ci_cd;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Tests {
	
	@Test
	public void test1() {
		Assert.assertTrue("PlayWrite".equalsIgnoreCase("PlayWrite"));
	}
	
	@Test
	public void test2() {
		Assert.assertTrue("Selenium".equalsIgnoreCase("Selenium"));
	}
	
	@Test
	public void test3() {
		Assert.assertTrue("Cypress".equalsIgnoreCase("Cypress"));
	}
	
	
	
	
	
}
