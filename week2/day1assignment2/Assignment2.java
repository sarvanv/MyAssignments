package week2.day1assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads=driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLeads=driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();
		WebElement elementCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("MSYS");
		WebElement elementFirstName=driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Saravana2");
		WebElement elementLastName=driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("kumar V");
		WebElement elementFirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("sarvan");
		WebElement elementDepartment=driver.findElement(By.name("departmentName"));
		elementDepartment.sendKeys("Computer");
		WebElement elementDescription=driver.findElement(By.name("description"));
		elementDescription.sendKeys("Leads for Saravana");
		WebElement elementEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("sarvan0889@gmail.com");
		WebElement elementCreateLead1=driver.findElement(By.className("smallSubmit"));
		elementCreateLead1.click();
		WebElement elementEdit=driver.findElement(By.linkText("Edit"));
		elementEdit.click();
		driver.findElement(By.name("description")).clear();
		WebElement elementImportantNote=driver.findElement(By.id("updateLeadForm_importantNote"));
		elementImportantNote.sendKeys("Important note for Saravana");
		WebElement elementUpdateLead=driver.findElement(By.className("smallSubmit"));
		elementUpdateLead.click();
		
		System.out.println("Title of the page is:"+ driver.getTitle());

	}

}
