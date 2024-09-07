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

    public void fillTextField(String text) {
        fillInput(textField, text);
    }

    public void fillPasswordField(String password) {
        fillInput(passwordField, password);
    }

    public void submitForm() {
        click(submitButton);
    }

    public void selectDropdownOption(String option) {
        isVisible(dropdown);
        driver.findElement(dropdown).sendKeys(option);
    }

    public void getSuccessMessage() {
        driver.findElement(successMessage).getText();
    }

    public void clickIndexLink() {
        click(indexLink);
    }

    public void selectCheckbox1() {
        click(checkbox1);
    }

    public void selectCheckbox2() {
        click(checkbox2);
    }

    public void getCurrentUrl() {
        String urlEsperada = "https://www.selenium.dev/selenium/web/index.html";
        driver.get(urlEsperada);
    }
}
