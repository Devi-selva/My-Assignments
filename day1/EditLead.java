package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch Chrome Driver
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				//Launch URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Login Screen
				WebElement username= driver.findElement(By.id("username"));
				WebElement Password=driver.findElement(By.id("password"));
				WebElement Login= driver.findElement(By.className("decorativeSubmit"));
				
				//Pass the attribute values for Login screen
				username.sendKeys("demoSalesManager");
				Password.sendKeys("crmsfa");
				Login.click();
				//Click CRM/SFA link
				
				WebElement CRM= driver.findElement(By.linkText("CRM/SFA"));
				CRM.click();
				WebElement Leads = driver.findElement(By.linkText("Leads"));
				Leads.click();
				WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
				CreateLead.click();
				
				//Create Lead by entering the values
				
				WebElement Companyname =driver.findElement(By.id("createLeadForm_companyName"));
				Companyname.sendKeys("TestLeaf");
				WebElement FirstName =driver.findElement(By.id("createLeadForm_firstName"));
				FirstName.sendKeys("Test");
				WebElement LastName =driver.findElement(By.id("createLeadForm_lastName"));
				LastName.sendKeys("One");
				WebElement FirstNameLocal =driver.findElement(By.id("createLeadForm_firstNameLocal"));
				FirstNameLocal.sendKeys("LTest");
				WebElement LastNameLocal =driver.findElement(By.id("createLeadForm_lastNameLocal"));
				LastNameLocal.sendKeys("LOne");
				WebElement Department =driver.findElement(By.id("createLeadForm_departmentName"));
				Department.sendKeys("Dept1");
				WebElement Description =driver.findElement(By.id("createLeadForm_description"));
				Description.sendKeys("Create a new Lead");
				WebElement Email =driver.findElement(By.id("createLeadForm_primaryEmail"));
				Email.sendKeys("TestLeaf@gmail.com");
				WebElement province=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select State= new Select(province);
				State.selectByVisibleText("New York");
				
				WebElement Submit= driver.findElement(By.className("smallSubmit"));
				Submit.click();
				
				System.out.println(driver.getTitle());
				
				//Click Duplicate Lead
				Thread.sleep(3000);
				WebElement Edit=driver.findElement(By.linkText("Edit"));
				Edit.click();
				WebElement Description1 =driver.findElement(By.id("updateLeadForm_description"));
				Description1.sendKeys("Update-Edit Lead");
				WebElement ImpNote =driver.findElement(By.id("updateLeadForm_importantNote"));
				ImpNote.sendKeys("NotesfromTestLeaf");
				WebElement Submit1= driver.findElement(By.className("smallSubmit"));
				Submit1.click();				
				System.out.println(driver.getTitle());
			
			}

		}
