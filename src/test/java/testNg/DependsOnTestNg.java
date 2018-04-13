//package com.myntra.touchstone.Learn;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class DependsOnTestNg {
//
//    @Test
//    public void login() {
//        Assert.assertTrue(false);
//    }
//
//    @Test(dependsOnMethods = {"login"})
//    public void homePage() {
//        System.out.println("Depends on login method");
//    }
//
//    @Test(dependsOnMethods = {"login"})
//    public void logout() {
//        System.out.println("logout");
//    }
//}
//
//
