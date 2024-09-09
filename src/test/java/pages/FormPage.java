package pages;

import org.openqa.selenium.By;

/**
 * A classe FormPage representa a página de formulário para testes.
 * Ela contém métodos para interagir com diferentes elementos da página,
 * como campos de texto, campos de senha, dropdown, checkboxes e botões de
 * envio.
 */
public class FormPage extends BasePage {

    // localizadores (class, ids, names e etc)
    public final By textField = By.name("my-text");
    public final By passwordField = By.name("my-password");
    public final By submitButton = By.cssSelector(".btn.btn-outline-primary.mt-3");
    public final By indexLink = By.linkText("Return to index");
    public final By successMessage = By.id("message");
    public final By inputFieldDropdown = By.name("my-datalist");
    public final By checkbox1 = By.id("my-check-1");
    public final By checkbox2 = By.id("my-check-2");

    /**
     * Navega para a página de formulário.
     * Define a URL da página do formulário.
     */
    public void isOnFormPage() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    /**
     * Preenche o campo de texto com o valor fornecido.
     *
     * @param text O texto a ser preenchido no campo de texto.
     */
    public void fillTextField(String text) {
        fillInput(textField, text);
    }

    /**
     * Preenche o campo de senha com o valor fornecido.
     *
     * @param password A senha a ser preenchida no campo de senha.
     */
    public void fillPasswordField(String password) {
        fillInput(passwordField, password);
    }

    /**
     * Preenche o campo de input do dropdown (datalist) com a opção fornecida.
     *
     * @param option A opção a ser preenchida no campo dropdown.
     */
    public void datalistDropdownOption(String option) {
        /*WebElement inputElement = driver.findElement(inputFieldDropdown);
        inputElement.clear();
        inputElement.sendKeys(option);*/
        
        // Localiza o elemento de dropdown (datalist) e insere a opção fornecida
        driver.findElement(inputFieldDropdown).sendKeys(option);
    }

    /**
     * Obtém o texto da mensagem de sucesso após a submissão do formulário.
     */
    public void getSuccessMessage() {
        // Obtém e retorna o texto da mensagem de sucesso
        driver.findElement(successMessage).getText();
    }

    /**
     * Clica em um  submeter o formulário, link ou checkbox baseado no localizador fornecido.
     *
     * @param locator O localizador do elemento a ser clicado.
     */
    public void clickElement(By locator) {
        click(locator);
    }


    /**
     * Verifica se a URL atual do navegador corresponde à URL esperada.
     *
     * @return true se a URL atual corresponder à URL esperada, false caso contrário.
     */
    public boolean isOnCorrectUrl() {
        String urlEsperada = "https://www.selenium.dev/selenium/web/index.html"; // URL esperada
        String urlAtual = driver.getCurrentUrl(); // Obtém a URL atual
        return urlAtual.equals(urlEsperada); // Retorna true se a URL atual for a esperada, false caso contrário
    }

}
