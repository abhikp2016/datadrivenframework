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
		Assert.assertTrue(Iselementpresent(By.xpath(OR.getProperty("addcustomer"))), "customer  button not found");
	}

}
