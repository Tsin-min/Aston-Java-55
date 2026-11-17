package org.example;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

public class LessonEight {
    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.config = RestAssured.config()
                .encoderConfig(EncoderConfig.encoderConfig()
                        .defaultCharsetForContentType("UTF-8", ContentType.ANY));
    }

    @Test
    @DisplayName("Get Request")
    public void getRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().get("/get")
                .then()
                .assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
    @Test
    @DisplayName("Post raw text")
    public void postRawTextText() {
        String requestBody = "It is expected that this will be sent in a reply letter.";
        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when().post("/post")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("url", equalTo("https://postman-echo.com/post"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue());
    }

    @Test
    @DisplayName("Post from data")
    public void postFromData() {
        given()
                .log().all()
                .formParams("foo1", "bar1", "foo2", "bar2")
                .when().post("/post")
                .then()
                .log().body()
                .statusCode(200)
                .body("form.foo1",equalTo("bar1"))
                .body("form.foo2",equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"))
                .body("json.foo1",equalTo("bar1"))
                .body("json.foo2",equalTo("bar2"))
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.host",equalTo("postman-echo.com"));
    }
    @Test
    @DisplayName("Put request")
    public void putRequest() {
        String requestBody = "It is expected that this will be sent in a reply letter.";
        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when().put("/put")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data",equalTo(requestBody))
                .body("url",equalTo("https://postman-echo.com/put"));
    }
    @Test
    @DisplayName("Pathc request")
    public void patchRequest() {
        String requestBody = "It is expected that this will be sent in a reply letter.";
        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when().patch("/patch")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data",equalTo(requestBody))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.content-length",equalTo("56"));
    }
    @Test
    @DisplayName("Delete request")
    public void deleteRequest() {
        String requestBody = "It is expected that this will be sent in a reply letter.";
        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when().delete("/delete")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data",equalTo(requestBody))
                .body("url",equalTo("https://postman-echo.com/delete"))
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.content-length",equalTo("56"));
    }
}
