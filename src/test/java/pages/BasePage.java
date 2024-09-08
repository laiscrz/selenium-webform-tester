package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Setup;

import java.time.Duration;

/**
 * A classe BasePage serve como a classe base para outras páginas.
 * Ela contém métodos utilitários comuns para interagir com elementos da página,
 * como
 * esperar que um elemento esteja visível, preencher inputs e realizar cliques.
 */
public class BasePage extends Setup {

    /**
     * Método para esperar que um elemento esteja presente na página.
     * Ele aguarda até 30 segundos para que o elemento esteja localizado no DOM.
     *
     * @param locator O localizador do elemento (By).
     * @return O elemento WebElement encontrado.
     */
    protected WebElement waitElement(By locator) {
        // Espera até que o elemento esteja presente no DOM por até 30 segundos.
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Verifica se o elemento identificado pelo localizador está visível na página.
     *
     * @param locator O localizador do elemento (By).
     * @return true se o elemento estiver visível, false caso contrário.
     */
    protected boolean isVisible(By locator) {
        // Espera o elemento estar presente e visível na página.
        WebElement element = waitElement(locator);
        // Retorna true se o elemento estiver visível, false caso contrário.
        return element.isDisplayed();
    }

    /**
     * Preenche um campo de input com o texto fornecido.
     * Verifica se o elemento está visível antes de enviar o texto.
     *
     * @param locator O localizador do elemento de input (By).
     * @param text    O texto a ser preenchido no campo de input.
     */
    protected void fillInput(By locator, String text) {
        // Verifica se o elemento está visível e então preenche o campo de input.
        isVisible(locator);
        // Localiza o elemento e insere o texto fornecido.
        driver.findElement(locator).sendKeys(text);
    }

    /**
     * Realiza um clique em um elemento da página.
     * Verifica se o elemento está visível antes de realizar o clique.
     *
     * @param locator O localizador do elemento (By).
     */
    protected void click(By locator) {
        // Verifica se o elemento está visível e então realiza o clique.
        isVisible(locator);
        // Localiza o elemento e realiza a ação de clique.
        driver.findElement(locator).click();
    }

}
