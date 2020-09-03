package testvijay;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {
	
	@BeforeTest
	public void lastexecute()
	{
		System.out.println("Exexute last");
	}
	
	@Test(groups= {"Smoke"})
	public void demo1()
	{
		System.out.println("sana");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Vijaya");
	}
	
	

}
