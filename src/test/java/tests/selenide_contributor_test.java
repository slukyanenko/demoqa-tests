package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class selenide_contributor_test {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize="1920x1080";
    }

    @Test
    void searchTheBestContributor() {
        // открыть страницу репы селенид
        open("https://github.com/selenide/selenide");

        // навести курсор на первый элемент в блоке Contributors
        $(".BorderGrid").$(Selectors.byText("Contributors")).closest("div").$("ul li").hover();

        // проверить, что имя первого элемента - Андрей Солнцев
        $$(".Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));
    }
}
