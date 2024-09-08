package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.FormPage;

/**
 * A classe FormSteps define os passos do Cucumber para os cenários relacionados ao formulário.
 * Cada método mapeia uma etapa do cenário de teste para interações com a página do formulário.
 */
public class FormSteps {

    // Instância da página de formulário para interações com a página
    private final FormPage formPage = new FormPage();

    /**
     * Navega para a página do formulário antes de iniciar o teste.
     */
    @Dado("que eu estou na página do formulário")
    public void que_eu_estou_na_pagina_do_formulario() {
        formPage.isOnFormPage(); // Abre a página do formulário
    }

    /**
     * Preenche o campo de texto com o valor fornecido.
     *
     * @param campoText O texto a ser preenchido no campo de texto.
     */
    @Quando("eu preencho o campo {string}")
    public void eu_preencho_o_campo(String campoText) {
        formPage.fillTextField(campoText); // Preenche o campo de texto com o valor fornecido
    }

    /**
     * Preenche o campo de senha com o valor fornecido.
     *
     * @param password A senha a ser preenchida no campo de senha.
     */
    @Quando("o campo de {string}")
    public void o_campo_de(String password) {
        formPage.fillPasswordField(password); // Preenche o campo de senha com o valor fornecido
    }

    /**
     * Submete o formulário clicando no botão de submissão.
     */
    @Quando("eu submeto o formulário")
    public void eu_submeto_o_formulario() {
        formPage.submitForm(); // Submete o formulário
    }

    /**
     * Verifica se a mensagem de sucesso é exibida após a submissão do formulário.
     */
    @Entao("eu devo ver uma mensagem de sucesso")
    public void eu_devo_ver_uma_mensagem_de_sucesso() {
        formPage.getSuccessMessage(); // Obtém e verifica o texto da mensagem de sucesso
    }

    /**
     * Deixa o campo especificado vazio.
     *
     * @param campo O tipo de campo a ser deixado vazio (text ou password).
     */
    @Quando("eu deixo o campo {string} vazio")
    public void eu_deixo_o_campo_vazio(String campo) {
        if (campo.equals("text")) {
            formPage.fillTextField(""); // Deixa o campo de texto vazio
        } else if (campo.equals("password")) {
            formPage.fillPasswordField(""); // Deixa o campo de senha vazio
        }
    }

    /**
     * Verifica se a mesma mensagem de sucesso é exibida após a submissão do formulário.
     */
    @Entao("eu devo ver a mesma mensagem de sucesso")
    public void eu_devo_ver_a_mesma_mensagem_de_sucesso() {
       formPage.getSuccessMessage(); // Obtém e verifica o texto da mensagem de sucesso
    }

    /**
     * Clica no link para retornar à página de índice.
     */
    @Quando("eu clico no link para retornar à página de index")
    public void eu_clico_no_link_para_retornar_a_pagina_de_index() {
        formPage.clickIndexLink(); // Clica no link para retornar à página de index
    }

    /**
     * Verifica se o usuário foi redirecionado para a página de índice.
     */
    @Entao("eu devo ser redirecionado para a página de index")
    public void eu_devo_ser_redirecionado_para_a_pagina_de_index() {
        formPage.isOnCorrectUrl(); // Verifica se a URL atual é a esperada para a página de index
    }

    /**
     * Seleciona um item no dropdown.
     */
    @Quando("eu seleciono um item no dropdown")
    public void eu_seleciono_um_item_no_dropdown() {
        formPage.datalistDropdownOption("San Francisco"); // Seleciona a opção "San Francisco" no dropdown
    }

    /**
     * Marca as duas checkboxes na página.
     */
    @Quando("eu marco as duas checkboxes")
    public void eu_marco_as_duas_checkboxes() {
        formPage.selectCheckbox1(); // Marca o primeiro checkbox
        formPage.selectCheckbox2(); // Marca o segundo checkbox
    }
}
