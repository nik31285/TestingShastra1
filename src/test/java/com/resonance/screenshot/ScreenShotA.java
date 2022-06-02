package com.resonance.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotA {
	@Test
	public void takeScreenShot() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	System.setProperty("webdriver.chrome.driver", "D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		driver.get("https://www.iitb.ac.in/");
		Thread.sleep(10000);
		File input=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File outFile=new File("ScreenShot.jpeg");
		Files.copy(input, outFile);
	}
}
