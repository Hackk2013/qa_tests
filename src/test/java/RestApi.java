import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import model.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.module.jsv.JsonSchemaValidator;

import java.util.List;

public class RestApi {
    String endPointProfile = "/backend/api/profile";
    String authToken = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL3B1Ymxpc2hlcnMuY2xpY2thZGlsbGEuY29tL2FwaS9hdXRoL3JlZnJlc2giLCJpYXQiOjE3NzcwMzczNzksImV4cCI6MTc3NzA1MTc3OSwibmJmIjoxNzc3MDM3Mzc5LCJqdGkiOiJxdndnYURITGdxRlhsaWQ4Iiwic3ViIjoiMTkxODg5IiwicHJ2IjoiMjNiZDVjODk0OWY2MDBhZGIzOWU3MDFjNDAwODcyZGI3YTU5NzZmNyIsInJlc3RyaWN0aW9ucyI6W119.krsLUj4ky1-qtzYomaSgURktCumX1KJEJSe2CR_es_Y";
    String

    @Test
    void checkEmail() {
        given()
                .log().all()
                .header("Authorization", authToken)
                .when().get(BaseTest.BASE_URL + endPointProfile)
                .then().statusCode(200)
                .body("data.email", equalTo("evgen2000tos@gmail.com"));
    }

    @Test
    void putFIO() {
        given()
                .log().all()
                .header("Authorization", authToken)
                .when().put(BaseTest.BASE_URL + endPointProfile)
                .then().statusCode(200)
                .body("data.first_name", equalTo("Evgeniy"))
                .body("data.last_name", equalTo("SVIRIDOV"));
    }

    @Test
    void postME() {
        String url = "https://publishers.clickadilla.com/backend/api/auth/me";
        String authToken = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL3B1Ymxpc2hlcnMuY2xpY2thZGlsbGEuY29tL2FwaS9hdXRoL3JlZnJlc2giLCJpYXQiOjE3NzcwMzE0MzMsImV4cCI6MTc3NzA0NTgzMywibmJmIjoxNzc3MDMxNDMzLCJqdGkiOiJ2R0ppNlBHcFg5TjFSYXBGIiwic3ViIjoiMTkxODg5IiwicHJ2IjoiMjNiZDVjODk0OWY2MDBhZGIzOWU3MDFjNDAwODcyZGI3YTU5NzZmNyIsInJlc3RyaWN0aW9ucyI6W119.Ea62j3tMH0-E3U9V0a_p4PiS_pc2T2BDX8s9VqnPF7I";
        String body = "";
        given().
                log().all().
                header("Authorization", authToken)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .body("data", equalTo(""));

    }

    @Test
    void validateFullJsonStructure() throws JsonProcessingException {
        String endPoint = "/backend/api/auth/me";
        Response r = BaseTest.authMe(endPoint, authToken);
        List<String> landings = r.getData().getPermissions().getLandings();
        Assertions.assertAll(
                () -> assertEquals("$0.00", r.getData().getBalance()),
                () -> assertEquals("mitchell@clickadilla.com", r.getData().getManager().getEmail()),
                () -> assertEquals("telegram", r.getData().getManager().getContacts().get(0).getName()),
                () -> assertEquals("archive", landings.get(0))
        );
    }
}







