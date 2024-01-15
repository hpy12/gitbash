package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationPage {
	public static WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/signup/");
	    
	}

	@When("user enter valide\"<Fname>\",{string},{string},{string}")
	public void user_enter_valide_fname(String fname, String lname, String mno) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(mno);
	    
	}

	@When("user enter valide\"<Day>\",{string},{string} and {string}")
	public void user_enter_valide_day_and(String day, String month, String year) {
		driver.findElement(By.name("birthday_day")).sendKeys(day);
		driver.findElement(By.name("birthday_month")).sendKeys(month);
		driver.findElement(By.name("birthday_year")).sendKeys(year);
		
	    
	}


	






}
