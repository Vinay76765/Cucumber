package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before
	public void Setup()
	{
		System.out.println("Launching browser");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Quit Browser");
	}
	
	@BeforeAll
	public static void beforeall()
	{
		System.out.println("I will execute before start of all test");
	}
	
	@AfterAll
	public static void Afterall()
	{
		System.out.println("I will execute after end of all test");
	}
	
	@BeforeStep
	public static void BeforeStep()
	{
		System.out.println("I will execute before every step");
	}
	
	@AfterStep
	public static void AfterStep()
	{
		System.out.println("I will execute after every step");
	}

}
