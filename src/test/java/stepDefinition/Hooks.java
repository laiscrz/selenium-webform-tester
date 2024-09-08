package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Setup;

/**
 * A classe Hooks contém métodos de inicialização e finalização do WebDriver que serão executados
 * antes e após os cenários de teste do Cucumber.
 */
public class Hooks {

    /**
     * Método anotado com @Before para ser executado antes de cada cenário de teste.
     * Ele inicializa o WebDriver chamando o método createDriverInstance() da classe Setup.
     */
    @Before
    public void openDriver() {
        // Cria uma instância do WebDriver antes do início de cada cenário.
        Setup.createDriverInstance();
    }

    /**
     * Método anotado com @After para ser executado após cada cenário de teste.
     * Ele encerra o WebDriver chamando o método quitDriver() da classe Setup.
     */
    @After
    public  void closeDriver() {
        // Encerra a instância do WebDriver após a execução de cada cenário.
        Setup.quitDriver();
    }
}
