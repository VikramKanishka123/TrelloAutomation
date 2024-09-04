package practicetestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public static void createProject() 
	{
		Reporter.log("createProject", true);
	}
	@Test
	public static void modifyProject() 
	{
		Reporter.log("modifyProject", true);
	}
	@Test
	public static void deleteProject() 
	{
		Reporter.log("deleteProject", true);
	}
}
