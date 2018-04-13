//package com.myntra.touchstone.Learn;
//
//
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.http.ContentType;
//import com.jayway.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static com.jayway.restassured.RestAssured.given;
//import static com.jayway.restassured.RestAssured.responseSpecification;
//
//public class TestRestAssuredFunctions {
//
//    @Test
//    public void test2() {
//        Response response = RestAssured.when().get("http://api.openweathermap.org/data/2.5/weather?q=bangalore&appid=12ac143b77b4f8a93ec8984f623ef555");
//        System.out.println("body: " + response.getBody());
//        System.out.println("STATUS CODE: " + response.statusCode());
//        System.out.println("ccokies: " + response.cookies());
//        Assert.assertEquals(response.getStatusCode(), 401);
//    }
//
//    @Test
//    public void param() {
//        given().
//                param("q", "london").
//                param("appid", "12ac143b77b4f8a93ec8984f623ef855").
//                when().
//                get("http://api.openweathermap.org/data/2.5/weather").
//                then().
//                assertThat().statusCode(200);
//    }
//
//    @Test
//    public void test_01() {
//        Response response = RestAssured.when().get("http://api.openweathermap.org/data/2.5/weather?q=bangalore&appid=12ac143b77b4f8a93ec8984f623ef855");
//        System.out.println("body: " + response.getBody());
//        System.out.println("STATUS CODE: " + response.statusCode());
////        System.out.println("ccokies: " + response.cookies());
//        System.out.println("get cookies: " + response.getCookies());
//        Assert.assertEquals(response.getStatusCode(), 200);
//    }
//
//    @Test
//    public void response1() {
//        Response response = given().
//                param("q", "london").
//                param("appid", "12ac143b77b4f8a93ec8984f623ef855").
//                when().
//                get("http://api.openweathermap.org/data/2.5/weather");
//        //System.out.println(response.toString());
//        System.out.println(response.asString());
//    }
//
//    @Test
//    public void cityById() {
//        Response response = given().
//                parameter("id", "2172797").
//                param("appid", "12ac143b77b4f8a93ec8984f623ef855").
//                when().
//                get("http://api.openweathermap.org/data/2.5/weather");
//        System.out.println("Status code:" + response.getStatusCode());
//        System.out.println(response.asString());
//    }
//
//
//    @Test
//    public void weatherDesc() {
//        String weatherReport = given().
//                parameter("id", "2172797").
//                param("appid", "12ac143b77b4f8a93ec8984f623ef855").
//                when().
//                get("http://api.openweathermap.org/data/2.5/weather").
//                then().
//                contentType(ContentType.JSON).
//                extract().
//                path("weather[0].description");
//        System.out.println("weatherReport " + weatherReport);
//    }
//
////    @Test
////    public void jsonServerPost() {
////        Response response = given().
////                body("{\n" +
////                        "    \"id\": 10,\n" +
////                        "    \"title\": \"prem chand post req\",\n" +
////                        "    \"author\": \"premchand\"\n" +
////                        "  }").
////                when().contentType(ContentType.JSON).post("http://localhost:3000/posts");
////
////        System.out.println(response.asString());
////    }
////
////    JsonServerPost jsonServerPost = new JsonServerPost();
////
////    @Test
////    public void postByObject() {
////
////        jsonServerPost.setAuthor("prem");
////        jsonServerPost.setId(5);
////        jsonServerPost.setTitle("by object");
////        Response response = given().when().contentType(ContentType.JSON).body(jsonServerPost).post("http://localhost:3000/posts");
////        System.out.println("response " + response.asString());
////    }
////
////    /**
////     * POST request >> Creating a new entry in DB
////     * PUT >> to update record in DB, if we want to update one value we have to send all the filed set to previous value or else it will
////     * update those filed to null
////     * PATCH >> with path we don't need to send all the filed in body to update one or more fields
////     */
////    @Test
////    public void patchmethod() {
////        jsonServerPost.setTitle("updated again by patch method");
////        jsonServerPost.setAuthor("updated by patch method");
////        Response response = given().when().contentType(ContentType.JSON).
////                body(jsonServerPost).
//////                body("{\"title\": \"updated prem chand post req\"}").
////        patch("http://localhost:3000/posts/3");
////        System.out.println("response " + response.asString());
////    }
////
////    @Test
////    public void putMethod() {
////        jsonServerPost.setTitle("update by put method so other filed than title will be null");
////        Response response = given().when().contentType(ContentType.JSON).body(jsonServerPost).put("http://localhost:3000/posts/10");
////        System.out.println(response.asString());
////    }
//
//    @Test
//    public void deleteMethod() {
//        Response response = given().when().contentType(ContentType.JSON).delete("http://localhost:3000/posts/2");
//        System.out.println(response.getStatusCode());
//        // Assert.assertEquals(response.getStatusCode(), 200);
//        Long respTime = response.then().extract().time();
//        System.out.println("respTime: " + respTime + " ms");
//    }
//
//    @Test
//    public void getAnomalyDetails() {
//        Response response = given().
//                header("user-email", "prem.shah@myntra.com").
//                get("http://anomaly-test-service.myntra.com/rest/v1/apollo/anomaly/2/");
//
//        System.out.println("Response: " + response.asString());
//        System.out.println("Status code: " + response.getStatusCode());
//        System.out.println("get content type: " + response.getContentType());
//        System.out.println("Cookies: " + response.cookies());
//        System.out.println("\nEmail header" + response.getHeader("user-email"));
//        System.out.println("responseSpecification" + responseSpecification);
//        System.out.println(response.headers());
//        System.out.println(response.header("user-email"));
//        System.out.println(response.getHeader("user-email"));
//        System.out.println(response.getHeaders());
//
//    }
//
//}
