package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize="1920x1080";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Sergo");
        $("#userEmail").setValue("891212321321@mail.ru");
        $("#currentAddress").setValue("Yunosti street");
        $("#permanentAddress").setValue("sportivnaya street");
        $("#submit").click();

        $("#output #name").shouldHave(Condition.text("Sergo"));
        $("#output #email").shouldHave(Condition.text("891212321321@mail.ru"));
        $("#output #currentAddress").shouldHave(Condition.text("Yunosti street"));
        $("#output #permanentAddress").shouldHave(Condition.text("sportivnaya street"));
    }
}
