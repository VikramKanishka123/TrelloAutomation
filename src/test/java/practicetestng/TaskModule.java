package practicetestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public static void createTask() 
	{
		Reporter.log("createTask", true);
	}
	@Test
	public static void modifyTask() 
	{
		Reporter.log("modifyTask", true);
	}
	@Test
	public static void deleteTask() 
	{
		Reporter.log("deleteTask", true);
	}
}
