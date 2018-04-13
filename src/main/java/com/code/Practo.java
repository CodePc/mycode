//package com.Code;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.junit.Assert.*;
//import java.net.URL;
//
///**
// * Created by prem on 5/10/2017.
// */
//public class Practo {
//
//
//    public class Source {
//
//        //Do not change this url. Otherwise your evaluation will fail
//        public static final String URL = "http://127.0.0.1:4444/wd/hub";
//
//        WebDriver driver;
//        public static void getDriver(){
//            DesiredCapabilities caps = DesiredCapabilities.phantomjs();
//            driver = new RemoteWebDriver(new URL(URL), caps);
//        }
//
//        public static void gotoURL()
//        {
//            driver.get("http://www.phptravels.net/admin");
//        }
//        public static void login(String email,String password){
//            WebElement email = driver.findElement(By.cssSelector(".form-signin [name='email']"));
//            WebElement password = driver.findElement(By.cssSelector(".form-signin [name='password']"));
//            WebElement submit = driver.findElement(By.cssSelector(".form-signin [type='submit']"));
//            email.sendKeys();
//            password.sendKeys();
//            // element.sendKeys("Hello, World!");
//            submit.click();
//
//        }
//
//        public static boolean onHomePage(){
//            WebElement socialSidebar = driver.findElement(By.class(".social-sidebar"));
//            WebElement content = driver.findElement(By.id("#content");
//            WebElement navBar = driver.findElement(By.class(".navbar-nav");
//            WebDriverWait wait= new WebDriverWait(driver,10);
//            WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(content));
//
//            assertThat(element,is(not(null));
//
//
//        }
//
//        public static void invalidLogin(){
//            WebElement invalidError = driver.findElement(By.cssSelector(".alert-danger");
//            WebDriverWait wait= new WebDriverWait(driver,10);
//            WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(invalidError));
//            assertTrue(element.getText().equals("Invalid Login Credentials"));
//        }
//        public static void main(String[] args) throws Exception {
//
//            //Do not change the below line. Otherwise your evaluation will fail
//
//            String email;
//            String password;
//            email="admin@phptravels.com";
//            password="demoadmin";
//            getDriver();
//            gotoURL();
//            login(email,password);
//            onHomePage();
//
//            System.out.println(driver.getTitle());
//            driver.quit();
//            email="invalid@invalid.com";
//            password="invalid";
//            getDriver();
//            gotoURL();
//            login(email,password);
//            invalidLogin();
//
//            System.out.println(driver.getTitle());
//            driver.quit();
//
//
//        }
//    }
//
//}
