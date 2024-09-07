package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.FormPage;

public class FormSteps {

    private final FormPage formPage = new FormPage();

    @Dado("que eu estou na página do formulário")
    public void que_eu_estou_na_pagina_do_formulario() {
        formPage.isOnFormPage();
    }

    @Quando("eu preencho o campo {string}")
    public void eu_preencho_o_campo(String campoText) {
        formPage.fillTextField(campoText);
    }

    @Quando("o campo de {string}")
    public void o_campo_de(String password) {
        formPage.fillPasswordField(password);
    }

    @Quando("eu submeto o formulário")
    public void eu_submeto_o_formulario() {
        formPage.submitForm();
    }

    @Entao("eu devo ver uma mensagem de sucesso")
    public void eu_devo_ver_uma_mensagem_de_sucesso() {
        formPage.getSuccessMessage();
    }

    @Quando("eu deixo o campo {string} vazio")
    public void eu_deixo_o_campo_vazio(String campo) {
        if (campo.equals("text")) {
            formPage.fillTextField("");
        } else if (campo.equals("password")) {
            formPage.fillPasswordField("");
        }
    }

    @Entao("eu devo ver a mesma mensagem de sucesso")
    public void eu_devo_ver_a_mesma_mensagem_de_sucesso() {
       formPage.getSuccessMessage();
    }

    @Quando("eu clico no link para retornar à página de index")
    public void eu_clico_no_link_para_retornar_a_pagina_de_index() {
        formPage.clickIndexLink();
    }

    @Entao("eu devo ser redirecionado para a página de index")
    public void eu_devo_ser_redirecionado_para_a_pagina_de_index() {
        formPage.getCurrentUrl();
    }

    @Quando("eu seleciono um item no dropdown")
    public void eu_seleciono_um_item_no_dropdown() {
        formPage.selectDropdownOption("San Francisco");
    }

    @Quando("eu marco as duas checkboxes")
    public void eu_marco_as_duas_checkboxes() {
        formPage.selectCheckbox1();
        formPage.selectCheckbox2();
    }
}
