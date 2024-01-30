package com.tabledata.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/selenium%20software/Offline%20Website/index.html");
		
driver.manage().window().maximize();
		
	WebElement email_Element=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 email_Element.sendKeys("kiran@gmail.com");
	 
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	 
	  
	  WebElement signin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	  signin_element.click();
		
	  driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
	  
	  
	  List<WebElement> row_list = driver.findElements(By.tagName("tr"));
	 	System.out.println("Row size "+row_list.size());

	 	for(int i=1;i<row_list.size();i++) {
	 		
	 		List<WebElement> col_list= row_list.get(i).findElements(By.tagName("td"));
	 		 System.out.println(col_list.size());
	        
	 		 for(int j=1;j<8;j++){
	 			 System.out.print(col_list.get(j).getText()+"\t");
	 		 }
	 		
	 		 
		// System.out.println("============");
		  
	  }
	  
		
		
		
		
		
		
		
		
	}



}
