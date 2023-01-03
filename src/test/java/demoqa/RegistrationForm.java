package demoqa;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationForm {
    @Test
    void studentRegistrationForm() {
        // Открытие сайта
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Andrew"); // Вводим имя
        $("#lastName").setValue("Smith"); // Вводим фамилию
        $("#userEmail").setValue("and1smith@mail.com"); // Вводим email

        $(".custom-radio:nth-child(1) > .custom-control-label").click(); // Выбираем пол
        $("#userNumber").setValue("9324567700"); // Вводим номер телефона

        $("#subjectsInput").val("Olaolala"); // Вводим subjects

        $(byText("Sports")).click(); // Выбираем хобби

        File file = new File("src/test/resources/readme.txt"); // Загружаем файл
        $("#uploadPicture").uploadFromClasspath("readme.txt");

        $("#currentAddress").setValue("Guzelce 33"); // Вводим адресс
        $(byText("Select State")).click(); // Выбираем штат
        $(byText("NCR")).click();
        $(byText("Select City")).click(); // Выбираем город
        $(byText("Delhi")).click();

        $("#submit").click(); // Подтверждаем

        $("#example-modal-sizes-title-lg").shouldHave((text("Thanks for submitting the form")));
    }
}
