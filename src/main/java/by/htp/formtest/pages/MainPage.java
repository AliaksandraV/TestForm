package by.htp.formtest.pages;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage
{
	private final String BASE_URL = "https://www.booking.com";
	
	
	@FindBy(id = "ss")
	private WebElement poleCity;
	
	@FindBy(xpath = "//td[@data-id=\"1514678400000\"]")
	private WebElement date31December2017;
	
	@FindBy(className = "sb-searchbox__button")
	private WebElement searchButton;

	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickOnPoleCityAndInsert(String searchingString)
	{
		poleCity.click();	
		poleCity.sendKeys(searchingString);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		poleCity.sendKeys(Keys.ARROW_DOWN);
		poleCity.sendKeys(Keys.ENTER);
		date31December2017.click();
		searchButton.click();			
	}
	
	public void compareResult()
	{
		String title = driver.getTitle();
		assertTrue(title.contains("Минск"));		
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}
}
