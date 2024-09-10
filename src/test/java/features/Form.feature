# language: pt

@Form
Funcionalidade: Submissão de Formulário
  @FormInputPassword @SmokeTest
  Cenario: Submeter formulário com Text Input e Password preenchidos
    Dado que estou na página do formulário
    Quando preencho o campo de texto e senha com os valores fornecidos
    E submeto o formulário
    Então devo ver uma mensagem de sucesso

  @FormInputPasswordEmpty
  Cenario: Submeter formulário com Text Input e Password vazios
    Dado que estou na página do formulário
    Quando deixo o campo texto e senha vazio
    E submeto o formulário
    Então devo ver uma mensagem de sucesso

  @FormIndex
  Cenario: Retornar a página de index
    Dado que estou na página do formulário
    Quando clico no link para retornar à página de index
    Então devo ser redirecionado para a página de index

  @FormSelectItem
  Cenario: Selecionar um item do Dropdown (datalist) e submeter o formulário
    Dado que estou na página do formulário
    Quando seleciono um item no dropdown
    E submeto o formulário
    Então devo ver uma mensagem de sucesso

  @FormCheckBoxes
  Cenario: Selecionar as duas checkboxes e submeter o formulário
    Dado que estou na página do formulário
    Quando marco as duas checkboxes
    E submeto o formulário
    Então devo ver uma mensagem de sucesso