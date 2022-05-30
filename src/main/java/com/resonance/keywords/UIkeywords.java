package com.resonance.keywords;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.resonance.util.PropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIkeywords {
	public static WebDriver driver = null;
	static PropertyFile pfile=new PropertyFile();
	static String basePath="/src/main/resources/Envoirnment.properties";

	/**
	 * This method is used to open Browser
	 * 
	 * @param browserName in which you want to enter Browse name eg.
	 *                    "chrome","firefox"
	 */
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else
			System.out.println("Invalid Browser Name: " + browserName);
	}

	/**
	 * This method is used to open given url
	 * 
	 * @param URL in which enter URL
	 * @throws IOException 
	 */
	public static void launchURL(String URL) throws IOException {
		driver.get(URL);
		String title=UIkeywords.getTitle();
		System.out.println(title);
		if(title.contains("Privacy error")) {
			UIkeywords.click(pfile.getValue(basePath, "Advance_button"));
			UIkeywords.click(pfile.getValue(basePath, "Proceed_Link"));
		}
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void click(String locator) {
		String locatorType=locator.split("##")[0];
		System.out.println(locatorType);
		String locatorValue=locator.split("##")[1];
		System.out.println(locatorValue);
		switch (locatorType) {
			case "CSS":
				driver.findElement(By.cssSelector(locatorValue)).click();
				break;
			case "XPATH":
				driver.findElement(By.xpath(locatorValue)).click();
				break;
			case "ID":
				driver.findElement(By.id(locatorValue)).click();
				break;
			case "CLASSNAME":
				driver.findElement(By.className(locatorValue)).click();
				break;
		default:
				System.out.println("Invalid locator");
		}
		
	}

	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * 
	 * @param String css require to pass
	 * @return It return text of the WebElement
	 */
	public static String getText(String css) {
		return (driver.findElement(By.cssSelector(css))).getText();
	}

}
