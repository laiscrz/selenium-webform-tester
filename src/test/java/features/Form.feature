# language: pt

@Form
Funcionalidade: Submissão de Formulário
    @FormInputPassword @SmokeTest
    Cenario: Submeter formulário com Text Input e Password preenchidos
        Dado que eu estou na página do formulário
        Quando eu preencho o campo "text"
        E o campo de "password"
        E eu submeto o formulário
        Então eu devo ver uma mensagem de sucesso

    @FormInputPasswordEmpty
    Cenario: Submeter formulário com Text Input e Password vazios
        Dado que eu estou na página do formulário
        Quando eu deixo o campo "text" vazio
        E eu deixo o campo "password" vazio
        E eu submeto o formulário
        Então o formulário deve exibir uma mensagem de erro

    @FormIndex
    Cenario: Retornar a página de index
        Dado que eu estou na página de submissão de formulário
        Quando eu clico no link para retornar à página de index
        Então eu devo ser redirecionado para a página de index

    @FormSelectItem
    Cenario: Selecionar um item do Dropdown (datalist) e submeter o formulário
        Dado que eu estou na página de submissão de formulário
        Quando eu seleciono um item no dropdown
        E eu submeto o formulário
        Então eu devo ver uma mensagem de sucesso

    @FormCheckBoxes
    Cenario: Selecionar as duas checkboxes e submeter o formulário
        Dado que eu estou na página do formulário
        Quando eu marco as duas checkboxes
        E eu submeto o formulário
        Então eu devo ver uma mensagem de sucesso
