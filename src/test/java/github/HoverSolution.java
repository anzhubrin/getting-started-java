package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class HoverSolution {
    @Test
    void hoverToSolution() {
        open("https://github.com/");
        $(withText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("html").shouldHave(text("Build like the best"));
        sleep(6000);
    }
}
