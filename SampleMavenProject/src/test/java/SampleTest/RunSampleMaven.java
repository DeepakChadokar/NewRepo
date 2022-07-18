package SampleTest;

import org.testng.annotations.Test;


public class RunSampleMaven {
	
	@Test(groups = "smoke")
	public void helloNikhil() {
		System.out.println("caphige hogona");
		System.out.println("changes done nikhil");
	}
	
	@Test(groups = "regression")
	public void testTest() {
		System.out.println("test executing");
	}
	@Test
	public void hiii()
	{
		System.out.println("how are you");
	}
	@Test
	public void hh()
	{
		System.out.println("hh");
	}
	
	
	
	@Test
	public void hh() {
		System.out.println("hi im cristan");
	}
	
}
