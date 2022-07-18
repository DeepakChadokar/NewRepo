package SampleTest;

import org.testng.annotations.Test;


public class RunSampleMaven {
	
	@Test(groups = "smoke")
	public void helloNikhil() {
		System.out.println("caphige hogona");
	}
	
	@Test(groups = "regression")
	public void testTest() {
		System.out.println("test executing");
	}
	
	@Test
	public void hh() {
		System.out.println("hi im cristan");
	}
	
}
