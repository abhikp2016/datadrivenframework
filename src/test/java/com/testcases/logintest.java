package com.testcases;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.testbase;

public class logintest extends testbase{
	
	@Test
	public void login() throws InterruptedException
	{
	driver.findElement(By.xpath(OR.getProperty("bankmanagerlogin"))).click();
		Thread.sleep(4000);
		system.out.println("my system method");
		system.out.println("my second system method");

		Assert.assertTrue(Iselementpresent(By.xpath(OR.getProperty("addcustomer"))), "customer  button not found");
	}

}
