package com.dachan;

import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.net.URL;

class TestDemo {
    @Test
    public void testBaidu() throws Exception {
        //修改hub地址
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:24444/wd/hub"), new ChromeOptions());
        driver.get("https://www.baidu.com");
        System.out.println(driver.getTitle());
        assertEquals(driver.getTitle(),"百度一下，你就知道");
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

    @Test
    public void testName() {
        assertEquals("dachan","dachan");
    }
}