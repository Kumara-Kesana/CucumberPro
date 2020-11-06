package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	public static void click(final WebDriver driver, By Locator)
	{
		driver.findElement(Locator).click();
	}
	
	public static void text(final WebDriver driver, By Locator, String text)
	{
		driver.findElement(Locator).sendKeys(text);
	}
	
	public static void ExplicitText(final WebDriver driver, By Locator)
	{
		WebDriverWait click = new WebDriverWait(driver, 20);
		click.until(ExpectedConditions.visibilityOfElementLocated(Locator)).click();
	}
	
	}
