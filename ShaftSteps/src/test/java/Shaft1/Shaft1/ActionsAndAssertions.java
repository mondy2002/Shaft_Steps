package Shaft1.Shaft1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;

public class ActionsAndAssertions {

	public ActionsAndAssertions() {
		// TODO Auto-generated constructor stub
	}
	
	
	@ Test 
	public void getText()
	{
		
        SHAFT.GUI.WebDriver driver =  new SHAFT.GUI.WebDriver(); 
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/");
        String url = driver.browser().getCurrentURL();
        By seleniumButton = By.id("selenium");
        String button = driver.element().getText(seleniumButton);
        
	}
	
	
	@ Test 
	public void typedata()
	{
		
        SHAFT.GUI.WebDriver driver =  new SHAFT.GUI.WebDriver(); 
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/actions.html");
        By fn = By.name("firstName");
        By ln = By.name("lastName");
        By ldropdown = By.name("level");

        By Webradio = By.id("web");
        By click = By.id("actions-button");

        driver.element().type(fn, "mohamad");
        driver.element().type(ln, "mondy");

        driver.element().select(ldropdown, "Junior");

        driver.element().click(Webradio);
        driver.element().click(click);

        
	}
	
	
	@ Test 
	public void testWaits()
	{
		
        SHAFT.GUI.WebDriver driver =  new SHAFT.GUI.WebDriver(); 
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        By primary = By.className("primary");
        By secondary = By.className("secondary");

 
        driver.element().click(primary);
        driver.element().click(secondary);


        
	}

}
