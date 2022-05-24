package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Amuthan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Chinnu");
		driver.findElement(By.name("departmentName")).sendKeys("NB");
		driver.findElement(By.name("description")).sendKeys("First Cry");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("KA@test.com");
		Select option= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		option.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("New Born");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		

	}

}
