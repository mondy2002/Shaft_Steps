package GUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class Home {

	
		// variables 
		org.openqa.selenium.WebDriver driver;
        final  String  url ="https://www.google.com/";
		
        
        
        
        // locators 
        public static By google_logo_image ()
        {
        	return  By.xpath("//img [@alt='Google']");
        }
        public static By search ()
        {
        	return By.name("q");
        }
        
        // constructor 
        public Home (org.openqa.selenium.WebDriver driver)
        {
        	this .driver = driver ; 
        }
        // Keywords 
        public Home navigate ()
        {
    		BrowserActions.navigateToURL(driver, url);
    		return this;

        }
        public Results searchforquery (String query )
        {
    		(new ElementActions(driver)).type(Home.search(), query )
    		.keyPress(search(), Keys.ENTER);
return new Results(driver);
        }
	}


