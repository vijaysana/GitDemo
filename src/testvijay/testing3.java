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
		System.out.println("after suite execution1");
		System.out.println("after suite execution2");
		System.out.println("after suite execution3");
		System.out.println("after suite execution4");
		System.out.println("after suite execution5");
		System.out.println("after suite execution6");
		System.out.println("after suite execution7");
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
