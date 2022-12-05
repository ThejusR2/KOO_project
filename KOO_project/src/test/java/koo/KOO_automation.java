package koo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KOO_automation {
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;
	
	@BeforeTest
	public void BT() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.kooapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		test = extent.createTest("navigating to the koo Feed Home Page");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_1a5x-']/a")).click();
		test.pass("user is able to open the home page");
		
	}
	
	@Test
	public void tc2() throws InterruptedException {
		test = extent.createTest("Logging into koo");
		driver.findElement(By.xpath("//*[@class='_2UoZW']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_2dufT']")).sendKeys("8867775368");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='_2-ryR']")).click();
		Thread.sleep(30000);
		test.pass("user is able to login");
	}
	@Test
	public void tc3() throws InterruptedException {
		test = extent.createTest("Mouseovering, clicking on people and clicking on a profile");
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//*[@class='_5ZKJ8']"))).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='aZv6-']/div[3]")).click();
		test.pass("user is able to mouseover, click on people and click on a profile");
	}

	@Test
	public void tc4() throws InterruptedException {
		test = extent.createTest("Moving to a post by keyboard actions");
		Thread.sleep(3000);
		Actions a2=new Actions(driver);
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
		test.pass("user is able to move to a post using keyboard actions");
	}
	@Test
	public void tc5() throws InterruptedException {
		test = extent.createTest("Mouseovering on like button and clicking on it");
		Thread.sleep(2000);
		Actions a3=new Actions(driver);
		a3.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div/div"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter Name']")).sendKeys("Thejus");
		Thread.sleep(7000);
		test.pass("user is able to mouseover on like button and click on it");
	}
	
	@Test
	public void tc6() throws InterruptedException {
		test = extent.createTest("Navigating back and scrolling down to same post");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_3eE46']/span")).click();
		Thread.sleep(2000);
		Actions a4=new Actions(driver);
		a4.sendKeys(Keys.ARROW_DOWN).build().perform();
		a4.sendKeys(Keys.ARROW_DOWN).build().perform();
		a4.sendKeys(Keys.ARROW_DOWN).build().perform();
		test.pass("user is able to navigate back and scroll down to same post");
			
	}
	
	@Test
	public void tc7() throws InterruptedException {
		test = extent.createTest("Mouseovering on comment button and clicking on it");
		Thread.sleep(3000);
		Actions a5=new Actions(driver);
		a5.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div[2]/div"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div[2]/div")).click();
		Thread.sleep(6000);
		test.pass("user is able to mouseover on comment button and click on it");
	}
	
	@Test
	public void tc8() throws InterruptedException {
		test = extent.createTest("Navigating back and scrolling down to same post");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='_3eE46']/span")).click();
		Thread.sleep(2000);
		Actions a6=new Actions(driver);
		a6.sendKeys(Keys.ARROW_DOWN).build().perform();
		a6.sendKeys(Keys.ARROW_DOWN).build().perform();
		a6.sendKeys(Keys.ARROW_DOWN).build().perform();
		test.pass("user is able to navigate back and scroll down to same post");
	}
	
	@Test
	public void tc9() throws InterruptedException {
		test = extent.createTest("Mouseovering on re-koo button and clicking on it");
		Thread.sleep(3000);
		Actions a7=new Actions(driver);
		a7.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div[3]/div"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div[3]/div")).click();
		Thread.sleep(6000);
		test.pass("user is able to mouseover on re-koo button and click on it");
		
	}
	
	@Test
	public void tc10() throws InterruptedException {
		test = extent.createTest("Navigating back and scrolling down to same post");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@class='_3eE46']/span")).click();
		Thread.sleep(2000);
		Actions a8=new Actions(driver);
		a8.sendKeys(Keys.ARROW_DOWN).build().perform();
		a8.sendKeys(Keys.ARROW_DOWN).build().perform();
		a8.sendKeys(Keys.ARROW_DOWN).build().perform();
		test.pass("user is able to navigate back and scroll down to same post");
	}
	
	@Test
	public void tc11() throws InterruptedException {
		test = extent.createTest("Mouseovering on Whatsapp button and clicking on it");
		Thread.sleep(3000);
		Actions a9=new Actions(driver);
		a9.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div[4]/div/div"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div[4]/div")).click();
		test.pass("user is able to mouseover on Whatsapp button and click on it");
	}
	
	@Test
	public void tc12() throws InterruptedException {
		test = extent.createTest("Mouseovering on share button and clicking on it");
		Thread.sleep(3000);
		Actions a11=new Actions(driver);
		a11.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div[5]/div/div"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div[5]/div")).click();
		test.pass("user is able to mouseover on share button and click on it");
	}
	
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		extent.flush();
	}
	
}


	


