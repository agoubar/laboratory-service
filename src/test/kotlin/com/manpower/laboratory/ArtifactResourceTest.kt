package com.manpower.laboratory

import io.quarkus.test.common.QuarkusTestResource
//import io.quarkus.test.h2.H2DatabaseTestResource
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.*
import org.junit.jupiter.api.Test

@QuarkusTest
//@QuarkusTestResource(H2DatabaseTestResource.class)
open class ArtifactResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/artifacts")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

    @Test
    fun checkList() {
        given()
            .`when`().get("/artifacts")
            .then()
                .statusCode(200)
                .body("size()", `is`(1))
                .body("artifactId", hasItem("laboratory"))
    }

}