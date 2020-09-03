package testvijay;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testing5 {
	@Test
	
	public void standards()
	{
		//standards
		System.out.println("standards");
	}
	
   @Test
	
	public void standards1()
	{
		//standards
		System.out.println("standards1");
	}
   
   @BeforeMethod
   
   public void beformethod()
   {
	   System.out.println("before method execution");
   }
   
 
   @Test
	
	public void standards2()
	{
		//standards
		System.out.println("standards2");
	}
   
   @Test
	
	public void standards3()
	{
		//standards
		System.out.println("standards3");
	}
   
   @Test
	
	public void standards4()
	{
		//standards
		System.out.println("standards4");
	}
	
	@Test(groups= {"Smoke"})
	
	public void checklists()
	{
		System.out.println("checklists");
	}
	
	@Test
	
	public void templates()
	{
	
	System.out.println("templates");
	
	}
	
	@BeforeSuite
	
	public void beforesuite()
	{
	
	System.out.println("before suite execution");
	}
	
	
	
	
	

}
