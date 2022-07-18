package SampleTest;

import org.testng.annotations.Test;

public class Organization {
	
	@Test(groups = "smoke")
	public void createOrganizationTest() {
		System.out.println("Oranization created");
		
	}
	
	@Test(groups = "regression")
	public void deleteOrganization() {
		System.out.println("Organization deleted");
	}

}
