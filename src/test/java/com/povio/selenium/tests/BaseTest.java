package com.povio.selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup(){
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/selenium_standalone_binaries/linux/googlechrome/64bit/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("--no-default-browser-check", "--remote-allow-origins=*", "ignore-certificate-errors");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize(); 
    }

    @After 
    public void teardown(){
        driver.quit();
    }

    }

    
