package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	@Test
	public void testMethod() {
		String expectedTitle = "PEC";
		String actualTitle = "PECC";

		// Soft Assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);
		sa.assertAll();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Status: Pass");
		}
		else {
			System.out.println("Status: Failed");
		}
		
		sa.assertAll();
	}
}
