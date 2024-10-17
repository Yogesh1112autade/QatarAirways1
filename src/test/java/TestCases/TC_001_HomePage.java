package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;

public class TC_001_HomePage extends Utility{
	
	HomePage h=new HomePage();
	@Test
	public void verify_HomePage() throws IOException {
		Launch();
		String SignUpname=driver.findElement(h.sigup).getText();
		Assert.assertEquals(SignUpname,"Sign up","Correct");
	}

}
