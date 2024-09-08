package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * A classe Setup é responsável por gerenciar a criação e o encerramento da instância do WebDriver para testes automatizados.
 */
public class Setup {
    // private (no code do professor)

    /** 
     * O WebDriver protegido (protected) permite que subclasses acessem, mas outras classes fora do pacote não.
     * Ele será usado para interagir com o navegador.
     */
    protected static WebDriver driver;

    /**
     * Método estático para criar uma instância do WebDriver com as opções configuradas.
     * Ele utiliza o navegador Chrome com a estratégia de carregamento NORMAL e maximiza a janela do navegador.
     */
    public static void createDriverInstance() {
        // Cria uma instância de ChromeOptions para configurar o comportamento do navegador Chrome.
        ChromeOptions options = new ChromeOptions();
        // Define a estratégia de carregamento da página como NORMAL, ou seja, o WebDriver 
        // espera que todos os recursos sejam carregados.
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        // Inicializa o WebDriver utilizando o ChromeDriver com as opções configuradas.
        driver = new ChromeDriver(options);
        // Maximiza a janela do navegador para garantir que a página esteja completamente visível.
        driver.manage().window().maximize();

    }


    /**
     * Método estático para encerrar a instância do WebDriver.
     * Ele encerra a sessão do navegador e libera os recursos alocados pelo WebDriver.
     */
    public static void quitDriver() {
        // Fecha o navegador e libera os recursos do WebDriver.
        driver.quit();
    }
}
