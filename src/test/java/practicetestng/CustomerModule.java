package practicetestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=1)
	public static void createCustomer() 
	{
		Reporter.log("createCustomer", true);
		Assert.fail();
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public static void modifyCustomer() 
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority=3,dependsOnMethods = "modifyCustomer")
	public static void deleteCustomer() 
	{
		Reporter.log("deleteCustomer",true);
	}
}
