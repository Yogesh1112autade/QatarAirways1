package TestCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.collect.Iterators;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class TC_001_SignUp extends Utility{
	@Test
	public void launch() throws InterruptedException, IOException {
		Launch();
		HomePage h=new HomePage();
		Thread.sleep(3000);
		driver.findElement(h.acceptbtn).click();
		driver.findElement(h.sigup).click();
		
		LoginPage l=new LoginPage(driver);
		l.joinNow.click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String PWin=it.next();
		String Cwin=it.next();
       driver.switchTo().window(Cwin);
       
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		ArrayList<String> username=dataread("M:\\Selenium\\Setup\\textExcel\\QatarAirways.xlsx","SignUp",0);
		System.out.println(username.size());
		for(int i=0;i<username.size();i++) {
	        System.out.println(username.get(i));
		}
		
		

	}

}
