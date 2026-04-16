//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import java.util.Scanner;
//import static com.codeborne.selenide.Condition.exactText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class test {
    String url = "https://demo.guru99.com/insurance/v1/register.php";
    String email = "hackk";
    String pass = "12345";
    String name = "Evgeniy";
    String surname = "SV";
    String phone = "89997775522";
    String addres = "SV";
    String city = "SV";
    String country = "SV";
    String pscd = "SV";



    @Test
    void successfulSearchTest() {
        open(url);
        $("[name=\"title\"]").click();
        $("[value=\"Father\"]").click();
        $("[name=\"firstname\"]").setValue(name);
        $("[name=\"firstname\"]").setValue(surname);
        $("[name=\"phone\"]").setValue(phone);
        $("[name=\"street\"]").setValue(addres);
        $("[name=\"county\"]").setValue(country);
        $("[name=\"city\"]").setValue(city);
        $("[name=\"post_code\"]").setValue(pscd);



    }
}