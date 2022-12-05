package like_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Like_button_definition {
	
	WebDriver driver;
	
	@Given("I should be inside profile")
	public void i_should_be_inside_profile() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.kooapp.com/feed");
		driver.manage().window().maximize();
	   
	}
	@When("Scroll down to post")
	public void scroll_down_to_post() throws InterruptedException {
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//*[@class='_5ZKJ8']"))).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='aZv6-']/div[3]")).click();
		
		Thread.sleep(3000);
		Actions a2=new Actions(driver);
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
		a2.sendKeys(Keys.ARROW_DOWN).build().perform();
	   
	}
	@When("Move mouse pointer on like button")
	public void move_mouse_pointer_on_like_button() throws InterruptedException {
		Thread.sleep(2000);
		Actions a3=new Actions(driver);
		a3.moveToElement(driver.findElement(By.xpath("//*[@class='_1NUm-']/div/div"))).build().perform();
	}
	@When("Click on Like button")
	public void click_on_like_button() {
		driver.findElement(By.xpath("//*[@class='_1NUm-']/div/div")).click();
	   
	}
	@Then("I should be navigated to a page to login")
	public void i_should_be_navigated_to_a_page_to_login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='_2dufT']")).sendKeys("8867775368");
		Thread.sleep(20000);
	}

	}
