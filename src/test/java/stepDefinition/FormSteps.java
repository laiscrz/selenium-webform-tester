package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.FormPage;

/**
 * A classe FormSteps define os passos do Cucumber para os cenários relacionados ao formulário.
 * Cada método mapeia uma etapa do cenário de teste para interações com a página do formulário.
 */
public class FormSteps extends BasePage {

    // Instância da página de formulário para interações com a página
    FormPage formPage = new FormPage();

    // Valores padrão para campos de input e opções
    private static final String VALUE_TEXT = "user";
    private static final String VALUE_PASSWORD = "senha123";
    private static final String VALUE_DROPDOWN_OPTION = "San Francisco";

    /**
     * Navega para a página do formulário antes de iniciar o teste.
     */
    @Dado("que estou na página do formulário")
    public void que_estou_na_pagina_do_formulario() {
        formPage.isOnFormPage(); // Abre a página do formulário
    }

    /**
     * Preenche o campo de texto e senha com o valor padrão fornecido.
     */
    @Quando("preencho o campo de texto e senha com os valores fornecidos")
    public void preencho_o_campo_de_texto_e_senha_com_os_valores_fornecidos() {
        fillInput(formPage.textField, VALUE_TEXT); // Preenche o campo de texto com o valor fornecido
        fillInput(formPage.passwordField, VALUE_PASSWORD); // Preenche o campo de senha com o valor fornecido
    }


    /**
     * Submete o formulário clicando no botão de submissão.
     */
    @Quando("submeto o formulário")
    public void submeto_o_formulario() {
        click(formPage.submitButton); // Submete o formulário clicando no botão de envio
    }

    /**
     * Verifica se a mensagem de sucesso é exibida após a submissão do formulário.
     */
    @Entao("devo ver uma mensagem de sucesso")
    public void devo_ver_uma_mensagem_de_sucesso() {
        formPage.getSuccessMessage(); // Obtém e verifica o texto da mensagem de sucesso
    }

    /**
     * Deixa o campo especificado vazio.
     */
    @Quando("deixo o campo texto e senha vazio")
    public void deixo_o_campo_vazio() {
        fillInput(formPage.textField,"");
        fillInput(formPage.passwordField, "");
    }

    /**
     * Clica no link para retornar à página de índice.
     */
    @Quando("clico no link para retornar à página de index")
    public void clico_no_link_para_retornar_a_pagina_de_index() {
        click(formPage.indexLink); // Clica no link para retornar à página de índice
    }

    /**
     * Verifica se o usuário foi redirecionado para a página de índice.
     */
    @Entao("devo ser redirecionado para a página de index")
    public void devo_ser_redirecionado_para_a_pagina_de_index() {
        formPage.isOnCorrectUrl(); // Verifica se a URL atual é a esperada para a página de índice
    }

    /**
     * Seleciona um item no dropdown.
     */
    @Quando("seleciono um item no dropdown")
    public void seleciono_um_item_no_dropdown() {
        fillInput(formPage.inputFieldDropdown,VALUE_DROPDOWN_OPTION); // Seleciona a opção padrão "San Francisco" no dropdown
    }

    /**
     * Marca as duas checkboxes na página.
     */
    @Quando("marco as duas checkboxes")
    public void marco_as_duas_checkboxes() {
        click(formPage.checkbox1); // Marca o primeiro checkbox
        click(formPage.checkbox2); // Marca o segundo checkbox
    }

}
