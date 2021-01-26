package com.fca.calidad.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UadyVirtualLoginTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  //C:/Universidad/chromedriver.exe
	  System.setProperty("webdriver.chrome.driver", "C:\\Universidad\\chromedriver.exe");
      //driver = new FirefoxDriver();
	  driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCasetrue() throws Exception {
    driver.get("https://es.uadyvirtual.uady.mx/login/index.php");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("a16211381");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("falsa123cambiada");
    driver.findElement(By.xpath("//section[@id='region-main']/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("loginbtn")).click();
    driver.findElement(By.xpath("//div[@id='course-info-container-2093-8']/div/div/a/span[3]")).click();
  }
  @Test
  public void testUntitledTestCasefalse() throws Exception {
    driver.get("https://es.uadyvirtual.uady.mx/login/index.php");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("a16211381");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("password");
    driver.findElement(By.xpath("//section[@id='region-main']/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("loginbtn")).click();
    driver.findElement(By.xpath("//div[@id='course-info-container-2093-8']/div/div/a/span[3]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
