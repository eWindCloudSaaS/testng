package com.ewindcloud.testng;

import org.testng.annotations.Test;

public class TestCase02 {

	@Test
	public void TestNgLearn() {
		System.out.println("TestNG Case 02 Start...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TestNG Case 02 Finish...");
	}

}