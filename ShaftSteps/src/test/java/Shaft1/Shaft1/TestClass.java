package Shaft1.Shaft1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ibm.icu.util.BytesTrie.Result;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;

import GUI.pages.Home;
import GUI.pages.Results;

public class TestClass {
	private JSONFileManager testdata = new JSONFileManager("C:\\Users\\Mass\\eclipse-workspace\\Shaft1\\target\\resources\\testdatafiles\\GoogleZSearch.json");

	
	
	
	@Test

	public void test() {

		org.openqa.selenium.WebDriver driver;
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "https://www.google.com/");
		Validations.assertThat().element(driver, Home.google_logo_image())

				.matchesReferenceImage().withCustomReportMessage("Check that result stats is not empty").perform();

	}

	@Test(description = "this is the search test case in google")

	public void test2() {

		org.openqa.selenium.WebDriver driver;
		driver = DriverFactory.getDriver();

		new Home(driver).navigate().searchforquery(testdata.getTestData("searchQuery"));

		Validations.assertThat().element(driver, Results.result_stats()).text().doesNotEqual("")
				.withCustomReportMessage("this is assertion of search case ").perform();
		BrowserActions.closeCurrentWindow(driver);

	}

}
