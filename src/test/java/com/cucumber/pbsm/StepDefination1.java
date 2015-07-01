package com.cucumber.pbsm;


import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {

	static	WebDriver driver;
	
	@Given("^I am on Product builder log-in screen$")
	public void loginscreen() throws Throwable {
	//System.setProperty("webdriver.chrome.driver", "/Users/ikumar/chromedriver");
		//driver = new ChromeDriver();
		// Thread.sleep(5000);
	    driver = new FirefoxDriver();
		driver.navigate().to("http://toolbox.qa.cengage.info/index.html");
		//  String pburl1 = System.getProperty("pburl");
		//  System.out.println("*****Value of PB url: " + pburl1);
		 // driver.get(pburl1);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   
	}

	@When("Enter valid credential$")
	public void Enter(DataTable table) throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw();
		//System.out.println(data.get(1).get(1));
		driver.findElement(By.name(data.get(1).get(0))).sendKeys(data.get(1).get(1));
		
		// driver.findElement(By.name(data.get(2).get(0))).sendKeys(data.get(2).get(1));
		// Decryption of string
	    String encryptedPassword = data.get(2).get(1);
	 	byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
		String decryptedPassword = new String(decryptedPasswordBytes);
        System.out.print(decryptedPassword);
		driver.findElement(By.name(data.get(2).get(0))).sendKeys(decryptedPassword);
		
		
		
		Thread.sleep(1000);
		
	    // Express the Regexp above with the code you wish you had
	  
	}

	@And("^Click on login button$")
	public void loginbutton() throws Throwable {
		//driver.findElement(By.className("btn btn-primary login")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    // Express the Regexp above with the code you wish you had
		Thread.sleep(1000);
	}

	@Then("^User is logged in successfully \"([^\"]*)\"$")
	public void loggedin(String tbtitle) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(tbtitle));
		driver.manage().window().maximize();
		Thread.sleep(1000); 
	 
	}

/*	@Given("^User is logged in successfully1$")
	public void loggedin1() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		String pbstext = driver.findElement(By.xpath("//*[@id='cengage-portal']/div/div/div/div/div[1]/div/div[1]")).getText();	  
	System.out.print(pbstext);
	}
*/
	@When("^Click on Product Builder link$")
	public void Pblink() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Thread.sleep(1000);
		String pbstext = driver.findElement(By.xpath("//*[@id='cengage-portal']/div/div/div/div/div[1]/div/div[1]")).getText();	  
		System.out.println("Screen after loging - " +pbstext);
		
		driver.findElement(By.xpath("//*[@id='cengage-portal']/div/div/div/div/div[1]/div/div[1]")).click();
		Thread.sleep(1000);
	}

	@Then("^User should be navigated to \"([^\"]*)\" page$")
		public void Welpbs(String pbstitle) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		String pbswelcome = driver.findElement(By.xpath("//*[@id='cengage-builder-product']/div/div/header/div/h1")).getText();
		System.out.println("Welcome Screen " +pbswelcome);
		Assert.assertTrue(pbswelcome.contains(pbstitle));
	}
	
}
