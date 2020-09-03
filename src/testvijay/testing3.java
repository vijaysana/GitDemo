package testvijay;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing3 {
	
	@AfterSuite
	
	public void aftersuite()
	
	{
		System.out.println("after suite execution");
	}
	
	@AfterTest
	
	public void firstexecution()
	{
		//webinars
		System.out.println("Execute first");
	}
	@Test(groups= {"Smoke"})
	
	public void upcomingwebinars()
	{
		//webinars
		System.out.println("Live");
	}
	
	@Test
	
	public void recordedwebinars()
	{
		System.out.println("Recorded");
	}
	
	@Test
	
	public void cd()
	{
	
	System.out.println("CD");
	
	}

}
