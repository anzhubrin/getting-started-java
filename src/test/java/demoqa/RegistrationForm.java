package demoqa;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    @Test
    void studentRegistrationForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Andrew");
        $("#lastName").setValue("Smith");
        $("#userEmail").setValue("and1smith@mail.com");

        $(".custom-radio:nth-child(1) > .custom-control-label").click();
        $("#userNumber").setValue("9324567700");

        $("#subjectsInput").val("Olaolala");

        $(byText("Sports")).click();

        File file = new File("src/test/resources/readme.txt");
        $("#uploadPicture").uploadFromClasspath("readme.txt");

        $("#currentAddress").setValue("Guzelce 33");
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Delhi")).click();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave((text("Thanks for submitting the form")));
    }
}
