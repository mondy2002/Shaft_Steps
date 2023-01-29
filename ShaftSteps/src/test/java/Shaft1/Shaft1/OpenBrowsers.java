package Shaft1.Shaft1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.Validations;
import com.shaft.gui.element.ElementActions;

public class OpenBrowsers {

	public OpenBrowsers() {
		// TODO Auto-generated constructor stub
	}
	
	
	@ Test 
	public void OpenChrome()
	{
		
        SHAFT.GUI.WebDriver driver =  new SHAFT.GUI.WebDriver(); 
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/");
        String url = driver.browser().getCurrentURL();
        Assert.assertEquals(url,"https://hatem-hatamleh.github.io/Selenium-html/" );

	}
	@ Test 
	public void OpenFtireFox ()
	{
		// there are 2 options
		//1- go to the shaft engine config and modify the ecxecution to be on the firefox 
		//2- go to source then properties then webcapabilities.properties and modify the targetBrowserNmae to be 
		// MozillaFirefox
        SHAFT.GUI.WebDriver driver =  new SHAFT.GUI.WebDriver(); 

	}


}
