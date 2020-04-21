package com.sapient.week1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		CheckEven tester = new CheckEven();
		assertEquals( true, tester.check(8));
		assertEquals( true, tester.check(12));
		assertEquals( false, tester.check(5));
		assertEquals( false, tester.check(3));
	}

}
