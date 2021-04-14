package com.perfsfm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	@Test
	public void Add(){
		int a=10;
		int b=10;
		Assert.assertEquals(20,a+b);
	}
	@Test
	public void AddTest(){
		int a=20;
		int b=10;
		Assert.assertEquals(30,a+b);
	}

}
