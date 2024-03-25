package com.naukari;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	
	@Test
	public void uploadFile() throws InterruptedException, IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		

		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("hthitame@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Extreme$00");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='nI-gNb-bar2']")).click();
		driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Update']")).click();
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
		
		Runtime.getRuntime().exec("C:\\Users\\hthit\\eclipse-workspace\\selenium\\Nauari\\AutoItFileUpload\\UploadFile.exe");
		
		Thread.sleep(6000);
		driver.quit();
		
	}
}
