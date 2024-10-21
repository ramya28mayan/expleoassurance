package com.expinsbase;


	
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;

		public static void LaunchBrowswer() {

			ChromeOptions co = new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();

		}

		public static String getPropertyFileValue(String key) throws IOException {
			FileInputStream file = new FileInputStream("src\\test\\resources\\Properties\\data.properties");
			Properties p = new Properties();
			p.load(file);
			return p.getProperty(key);
		}

		public static void LaunchURL(String APIURL) {

			driver.get(APIURL);
		}

		public static String GetCurrentURL() {

			String currentUrl = driver.getCurrentUrl();
			System.err.println(currentUrl);
			return currentUrl;

		}

		public static void EnterValue(WebElement w, String s) {
			w.sendKeys(s);
		}

	}
