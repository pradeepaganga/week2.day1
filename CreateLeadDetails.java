package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("week2new");
		String text2 = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(text2);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("day1new");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("first");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("last");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/8/91");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MS");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("USD - American Dollar");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Automobile");
		driver.findElement(By.name("sicCode")).sendKeys("Automobile");
		driver.findElement(By.name("tickerSymbol")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9566052015");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("pradee");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("pradee");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("URL");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("pr");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 10 ppg street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("rajalikpakam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alaska");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620014");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("United States");
			driver.findElement(By.className("smallSubmit")).click();
			
			WebElement dispFirstName = driver.findElement(By.id("viewLead_firstName_sp"));
			System.out.println("After Create Lead submitted, The entered First Name is :" + dispFirstName.getText());
			
			
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if (text.equals("View Lead"))
		{
			System.out.println("Lead is Present");
		}
		else
			System.out.println("Lead is not present");
	
		

				
	}

}
