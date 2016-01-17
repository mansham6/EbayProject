package com.sqa.ms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sqa.ms.utils.Data;

public class EbayTest {

	@DataProvider
	public static Object[][] dp() {
		return Data.getDatabaseData("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/ebaydb", "root", "root", "item");
	}

	public static void main(String args[]) {
		System.out.println("Running as an Application");
		Data.display2DMatrix(dp());

	}

	public static Object[][] olddp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" }, };
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class lets do this! Review days highlights");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Each method - Project End Time");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After  Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class lets do this! Warn up");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Each method - Project Start time");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before  Test");
	}

	@Test(dataProvider = "dp")
	public void f(String id, String name, String quantity) {
		System.out.println("*********************************************");
		System.out.println("Performing a Test");
		System.out.println("Test id " + id);
		System.out.println("Search for item '" + name + "'");
		System.out.println("We would like " + quantity + "of these.");
		System.out.println("*********************************************");

	}

}
