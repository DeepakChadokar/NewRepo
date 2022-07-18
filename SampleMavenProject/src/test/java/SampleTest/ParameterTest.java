package SampleTest;

import org.testng.annotations.Test;

public class ParameterTest {
	@Test(groups = "smoke")
	public void tryParameter() {
		String value = System.getProperty("browser");
		System.out.println(value);
	}
}
