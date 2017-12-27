package by.htp.formtest.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends AbstractPage {

	@FindBy(css = "#frm > div:nth-child(10) > div > div.sb-dates__grid.u-clearfix > div.sb-dates__col.--checkout-field > div > div > div.sb-date-field.b-datepicker > div > div.sb-date-field__display")
	private WebElement checkOutDate;
	@FindBy(css = "li.user_center_option:nth-child(1)")
	private WebElement currencyChoise;
	@FindBy(className = "currency_USD selected_currency")
	private WebElement usd;
	@FindBy(css = "#filter_price > div:nth-child(2) > a:nth-child(1)")
	private WebElement priceRange;
	
	
	public ResultPage(WebDriver driver) {
		super(driver);	
		PageFactory.initElements(this.driver, this);
	}

	public void CompareDates() {
		String visibleCheckOutDate = checkOutDate.getAttribute("понедельник, 1 января 2018");
		assertTrue(visibleCheckOutDate.contains("1 января 2018"));
	}
	
	public void ChangeCarrency() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currencyChoise.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		usd.click();
	}
	
	public void ChoosePriceRange() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		priceRange.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void CompareResultPrice() {
		
	}
	
	@Override
	public void openPage() {
		
	}

}
