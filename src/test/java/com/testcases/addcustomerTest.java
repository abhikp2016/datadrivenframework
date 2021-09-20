package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.testbase;
import com.utilities.ExcelReader;

public class addcustomerTest extends testbase {
	
	@Test(dataProvider="getdata")	
	public void addcustomer(String firstname, String lastname, String Zipcode) throws InterruptedException
	{
		driver.findElement(By.xpath(OR.getProperty("bankmanagerlogin"))).click();
		driver.findElement(By.xpath(OR.getProperty("addcustomer"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstname"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstname);
		driver.findElement(By.xpath(OR.getProperty("lastname"))).click();
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastname);
		driver.findElement(By.xpath(OR.getProperty("zipcode"))).click();
		driver.findElement(By.xpath(OR.getProperty("zipcode"))).sendKeys(Zipcode);
		Thread.sleep(4000);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
	String sheetname = "data";
	int rows = excel.getRowCount(sheetname);
	int cols = excel.getColumnCount(sheetname);
	
	Object[][] data = new Object[rows-1][cols];
	
	for (int rownum = 2;rownum<=rows;rownum++)
	{
		for(int colnum = 0;colnum<cols;colnum++)
		{
			data[rownum - 2][colnum] = excel.getCellData(sheetname,colnum, rownum);
		}
	}
	return data;
		
	}

}
