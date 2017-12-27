package by.htp.formtest.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import by.htp.formtest.driver.DriverSingleton;
import by.htp.formtest.pages.MainPage;
import by.htp.formtest.pages.ResultPage;


public class Steps
{
	private WebDriver driver;	

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}
	public void closeDriver()
	{
		DriverSingleton.closeDriver();
	}

	public void openMainPage()
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
	}
	
	public void insertSearchSrtring(String searchString){
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.clickOnPoleCityAndInsert(searchString);
		mainPage.compareResult();
	}

	
	public void CompareCheckOutDate() {
		ResultPage resultPage = new ResultPage(driver);
//		resultPage.CompareDates();
	}
	
	public void ComparePrice() {
		ResultPage resultPage = new ResultPage(driver);
		resultPage.ChangeCarrency();
		resultPage.ChoosePriceRange();
		
	}
}