package practicetestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgExceptionExample {
	@Test(priority=1,invocationCount = 3)
	public static void createCustomer() 
	{
		Reporter.log("createCustomer", true);
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public static void modifyCustomer() 
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority=3,dependsOnMethods = {"createCustomer","modifyCustomer"})
	public static void deleteCustomer() 
	{
		Reporter.log("deleteCustomer",true);
	}
}
