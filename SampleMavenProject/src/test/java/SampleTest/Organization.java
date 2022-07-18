package SampleTest;

import org.testng.annotations.Test;

public class Organization {
	
	@Test(groups = "smoke")
	public void createOrganizationTest() {
		System.out.println("Oranization created");
		System.out.println("changes done by nikhil");
		
	}
	
	@Test(groups = "regression")
	public void deleteOrganization() {
		System.out.println("Organization deleted");
		System.out.println("done by nokhil");
	}

}
