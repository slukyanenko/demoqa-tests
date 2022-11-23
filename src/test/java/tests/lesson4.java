package tests;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class lesson4 {
    @Test
    void shouldFindSelenideRepositoryPage() {
        // 1. открыть страницу https://github.com/
        open("https://github.com/");

        // 2. ввести поисковое значение selenide + 3. Нажать Enter
        $("[data-test-selector=\"nav-search-input\"]").setValue("Selenide").pressEnter();

        // 4. выбрать первый результат поиска
        $$(".repo-list li").first().$("a").click();
        // 5. проврека результата поиска
        $("[rel=\"author\"]").shouldHave(Condition.text("selenide"));
    }
}

// $$(".имя искомого элемента")-ввести в консоль для проверки, что такой элемент один!
