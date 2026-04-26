import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import model.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
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
    String authToken = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL3B1Ymxpc2hlcnMuY2xpY2thZGlsbGEuY29tL2FwaS9hdXRoL2NhbGxiYWNrLWdvb2dsZSIsImlhdCI6MTc3NzE5Mjg2NiwiZXhwIjoxNzc3MjA3MjY2LCJuYmYiOjE3NzcxOTI4NjYsImp0aSI6IjhuTHZYRGxzb2xEM3dBRnIiLCJzdWIiOiIxOTE4ODkiLCJwcnYiOiIyM2JkNWM4OTQ5ZjYwMGFkYjM5ZTcwMWM0MDA4NzJkYjdhNTk3NmY3IiwicmVzdHJpY3Rpb25zIjpbXX0.QbkEhpIlLk6Uz9Eca2yWyBUKJ-HQ8X7dYjjF15TpqGI";



//
        public static ObjectMapper omt = new ObjectMapper(); // создаем объект для сериализации\десериа... json ответа в джава класс и наоброт
        public static model.response.token.Response geetToken() throws JsonProcessingException {
            String responce = given()
                    .log().all()
                    .contentType(ContentType.JSON)
                    .when()
                    .post("https://publishers.clickadilla.com/backend/api/auth/refresh")
                    .then()
                    .extract().response().asString();

            Response r = omt.readValue(responce, Response.class); // приобразую джейсон в класс Респонсе, где он раскладывается по полям
            return r;
        }


//    @BeforeAll
//    static void takeToken(){
//
//       String access_token = given()
//                    .log().all()
//                    .contentType(ContentType.JSON)
//                    .when()
//                    .post("https://publishers.clickadilla.com/backend/api/auth/refresh")
//                    .then()
//                .extract()
//                .path("data.access_token");
//    }


    @Test
    void checkEmail() {
        given()
                .log().all()
                .header("Authorization", authToken)
                .when()
                .get(BaseTest.BASE_URL + endPointProfile)
                .then().statusCode(200)
                .body("data.email", equalTo("evgen2000tos@gmail.com"));
    }

    @Test
    void putFIO() {
        given()
                .log().all()
                .header("Authorization", authToken)
                .when()
                .put(BaseTest.BASE_URL + endPointProfile)
                .then().statusCode(200)
                .body("data.first_name", equalTo("Evgeniy"))
                .body("data.last_name", equalTo("SVIRIDOV"));
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







