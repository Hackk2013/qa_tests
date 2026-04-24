import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import model.response.Response;

import static io.restassured.RestAssured.given;

public class BaseTest {
    public static final String BASE_URL = "https://publishers.clickadilla.com";
    public static ObjectMapper om = new ObjectMapper(); // создаем объект для сериализации\десериа... json ответа в джава класс и наоброт
    public static Response authMe(String endPoint, String authToken) throws JsonProcessingException {
        String response = given()
                .log().all() // Полное логирование запроса и ответа
                .header("Authorization", authToken)
                .contentType(ContentType.JSON)
                .when()
                .post(BaseTest.BASE_URL + endPoint)
                .then()
                .statusCode(200) // Проверка статуса ответа
                .extract().response().asString();
        Response r = BaseTest.om.readValue(response, Response.class); // приобразую джейсон в класс Респонсе, где он раскладывается по полям
        return r;
    }


}
