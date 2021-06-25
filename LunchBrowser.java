package com.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class LunchBrowser  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\College\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("https://www.lambdatest.com/");
		//driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    //driver.findElement(By.id("useremail")).sendKeys("samruddhishukla05@gmail.com");
	     driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	     driver.findElement(By.id("btnLogin")).click();
	     //driver.findElement(By.partialLinkText("Welcome")).click();
	     //driver.findElement(By.linkText("Logout")).click();
		//driver.get("https://www.lambdatest.com/");
		
		
		driver.manage().window().maximize();
		 
	    Thread.sleep(3000);
	    WebElement element = driver.findElement(By.linkText("Admin"));
	    
		
        Actions act = new Actions(driver);
       //mouse hover the Resources element
	   act.moveToElement(element).build().perform();
	   WebElement element1 = driver.findElement(By.linkText("User Management"));
	   Actions act1 = new Actions(driver);
	   act1.moveToElement(element1).build().perform();
	
        //specify the locator for the element Blog and click
	    driver.findElement(By.linkText("Users")).click();


		
		
		
		//WebElement drag = driver.findElement(By.id("draggable"));
	//	WebElement drop = driver.findElement(By.id("droppable"));
		
		//a.dragAndDrop(drag, drop).perform();
		
		
		
		//WebElement we = driver.findElement(By.linkText("Sortable"));
		//a.contextClick(we).perform();
		driver.close();

	
	     System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
	}
}

		
	

	


