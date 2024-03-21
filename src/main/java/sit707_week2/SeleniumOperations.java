package sit707_week2;

import java.io.IOException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void saveScreenshot(WebDriver driver) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		// this will use to save images by including year month and day along with hour min and second so that differnet images have different same 
	
		String screenshotname = "screenshot_" + timeStamp + ".png";
        //  screenshot filename
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D:/Deakin/2024T1/SIT707SoftwareQualityAndTesting/2.1P/" + screenshotname));
			} catch (IOException e) {
				System.out.println("Failed to save screenshot");
				e.printStackTrace();
			}
	}
		
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "D:/Deakin/2024T1/SIT707SoftwareQualityAndTesting/driver/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser for first website.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		
		driver.get(url);
		driver.manage().window().maximize();
		// maximise the window size
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		;
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Simranjit");
		
		WebElement element1 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element1);
		// Send last name
		element1.sendKeys("Singh");
		
		WebElement element2 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element2);
		// Send phone number
		element2.sendKeys("0499123456");
		WebElement element3 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element3);
		// Send  email
		element3.sendKeys("singhgeelong@gmail.com");
		WebElement element4 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element4);
		// Send password
		element4.sendKeys("Singhs@99");
		WebElement element5 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element5);
		// Send confirmpassword
		element5.sendKeys("Singhs@99");
				
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
	
        WebElement submitButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));

        // Click on the submit button
        submitButton.click();
        sleep(10);
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        
        saveScreenshot(driver);
        
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	public static void target_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "D:/Deakin/2024T1/SIT707SoftwareQualityAndTesting/driver/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser for second website.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		
		driver.get(url);
		driver.manage().window().maximize();
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		sleep(2);
		WebElement button1 = driver.findElement(By.cssSelector("button.btn.btn-join-today.mt-2"));

        // Click the button
        button1.click();
        sleep(2);

		WebElement element3 = driver.findElement(By.id("signup-email"));
		System.out.println("Found element: " + element3);
		// Send  email
		element3.sendKeys("singhgeelong@gmail.com");
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("first-name"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Simranjit");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement element1 = driver.findElement(By.id("last-name"));
		System.out.println("Found element: " + element1);
		// Send last name
		element1.sendKeys("Singh");
		
		WebElement element2 = driver.findElement(By.id("mobile-number"));
		System.out.println("Found element: " + element2);
		// Send phone number
		element2.sendKeys("0499123456");
		
		WebElement element4 = driver.findElement(By.id("signup-password"));
		System.out.println("Found element: " + element4);
		// Send password
		element4.sendKeys("Singhs@99");
		
		WebElement checkbox = driver.findElement(By.id("marketing-emails"));

        // Check the checkbox if it's not already checked
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        
        WebElement button = driver.findElement(By.id("btn-signup"));

        // Click the button
        button.click();
		
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
	
        sleep(10);
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        
        saveScreenshot(driver);
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
	
}
