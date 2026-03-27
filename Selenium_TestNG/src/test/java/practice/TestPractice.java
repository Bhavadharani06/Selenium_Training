package practice;

import org.testng.annotations.Test;

public class TestPractice {
	
//	@Test
//	public void TestMethod1() {
//		System.out.println("---Executing testMethod2---");
//	}
//	
//	@Test
//	public void TestMethod2() {
//		System.out.println("---Executing testMethod2---");
//	}
	
	@Test
	public void loginTest() {
		System.out.println("---Executing Login Method---");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest() {
		System.out.println("---Executing  Logout Method---");
	}
}
