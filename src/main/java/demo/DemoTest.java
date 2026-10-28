package demo;

import org.testng.annotations.Test;
//Create Maven project.
//In the pom.xml, add the selenium, &  dependencies from the pom.xml in AdvSelA27
//Save it.Update it.
//Create package & create class "Test" at the end of the class 
//keep "Test" at the end of the class & the method

public class DemoTest {

	@Test(groups = "smoke")
	public void addTest()
	{
		System.out.println("add");
	    System.out.println("sub");
	}
}
