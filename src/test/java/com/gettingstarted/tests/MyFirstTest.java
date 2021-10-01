package com.gettingstarted.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class MyFirstTest {
	
	@Managed
	WebDriver driver;
	
	@Title("Mobile Searching")
	@Test
	public void navigateToGooglePage() throws InterruptedException {
		//1. Opening Amazon.in
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		//2. Searching Mobile
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String matchWord="\"Mobile\"";
		String returnResult= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(matchWord, returnResult);
		
		
		
		//3. Filter by company
		driver.findElement(By.cssSelector("#p_89\\/OnePlus > span > a > span")).click();
		Thread.sleep(3000);
		
		//4. Filter by price
		driver.findElement(By.cssSelector("#p_36\\/1318506031 > span > a > span")).click();
		Thread.sleep(3000);
		
		//5. Filter by price
		driver.findElement(By.cssSelector("#p_n_operating_system_browse-bin\\/1485077031 > span > a > span")).click();
		Thread.sleep(3000);
		//boolean tr=driver.findElement(By.id("productTitle")).isDisplayed();
		//System.out.println(tr);
		
		//6. selecting mobile
		driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20 > div > div > div:nth-child(1) > h2 > a > span\r\n")).click();
		Thread.sleep(3000);
		
		//7. Add to cart
//		driver.navigate().to("https://www.amazon.in/Test-Exclusive_2020_1173-Multi-3GB-Storage/dp/B089MSGHJQ/ref=sr_1_1_sspa?dchild=1&keywords=Mobile&qid=1633097557&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzNTJTMVJYRkU3QzcyJmVuY3J5cHRlZElkPUEwMzgxNDUzMzZXRFZBSzhIWDNMVyZlbmNyeXB0ZWRBZElkPUExMDI0NzAyMklGRE44RkxUV04wRCZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
//		Thread.sleep(10000);
//		driver.findElement(By.id("add-to-cart-button")).click();
//		Thread.sleep(10000);
//		

	}
}
