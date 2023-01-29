package GUI.pages;

import org.openqa.selenium.By;

public class Results {
	org.openqa.selenium.WebDriver driver;
	
	public Results(org.openqa.selenium.WebDriver driver)
    {
    	this .driver = driver ; 
    }
	
	public static By result_stats ()
    {
    	return  By.id("result-stats");
    }
}
