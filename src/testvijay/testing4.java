package testvijay;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testing4 {
	
	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("after method execution");
	}
	@Test(groups= {"Smoke"})
	
	public void upcomingseminars()
	{
		//seminars
		System.out.println("upcoming");
	}
	
	@Test
	
	public void virtualseminars()
	{
		System.out.println("virtual");
	}
	
	@Test
	
	public void onsiteseminars()
	{
	
	System.out.println("onsite");
	
	}

}
