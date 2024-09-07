package pages;

import org.openqa.selenium.By;

public class FormPage extends BasePage {

    // localizadores (class, ids e etc)
    private final By textField = By.name("my-text");
    private final By passwordField = By.name("my-password");
    private final By submitButton = By.cssSelector(".btn.btn-outline-primary.mt-3");
    public final By indexLink = By.linkText("Return to index");
    private final By successMessage = By.id("message");
    private final By dropdown = By.id("my-options");
    private final By checkbox1 = By.id("my-check-1");
    private final By checkbox2 = By.id("my-check-2");

    public void isOnFormPage() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

}
