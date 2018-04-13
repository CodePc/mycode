//package com.myntra.touchstone.Learn;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TestGroups {
//
//
//    @BeforeClass(groups = {"sanity", "regression", "db", "functional"})
//    public void beforeClasses() {
//        System.out.println("before classes");
//    }
//
//    @Test(groups = {"sanity", "regression"})
//    public void test1() {
//        System.out.println("{\"sanity\", \"regression\"}");
//    }
//
//    @Test(groups = {"sanity", "db"})
//    public void test2() {
//        System.out.println("{\"sanity\", \"db\"}");
//    }
//
//    @Test(groups = {"sanity", "regression"})
//    public void test3() {
//        System.out.println("sanity\", \"regression\"");
//    }
//
//    @Test(groups = {"sanity", "db"})
//    public void test4() {
//        System.out.println("{\"sanity\", \"db\"}");
//    }
//
//    @Test(groups = {"sanity", "functional"})
//    public void test5() {
//        System.out.println("{\"sanity\", \"functional\"}");
//    }
//
//    @Test(groups = {"sanity", "functional"})
//    public void test6() {
//        System.out.println("{\"sanity\", \"functional\"}");
//    }
//
//    @Test(groups = {"sanity", "db"})
//    public void test7() {
//        System.out.println("{\"sanity\", \"db\"}");
//    }
//}
