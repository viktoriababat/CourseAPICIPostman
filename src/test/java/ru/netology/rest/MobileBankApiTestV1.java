package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      given()
          .baseUri("http://localhost:9999/api/v1")
      .when()
          .get("/demo/accounts")
      // Проверки
      .then()
          .statusCode(200);
    }
}
