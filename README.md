# 🌐 Projeto de Automação com Selenium

Este projeto utiliza **Selenium WebDriver** para automatizar testes de submissão de formulários. A estrutura é organizada em classes que representam as páginas e passos de teste, integradas com **Cucumber** para a definição dos cenários de teste de forma legível e comportamental (BDD). 📝

## 📂 Funcionalidades

O projeto cobre diferentes funcionalidades do formulário, tais como:

- 🖋️ Preenchimento de campos de texto e senha
- 🗂️ Seleção de itens de um dropdown (datalist)
- ☑️ Manipulação de checkboxes
- 🚀 Submissão do formulário
- 🔄 Navegação entre páginas

## 🏗️ Estrutura do Projeto

### 1. `BasePage.java`

A **BasePage** serve como classe base para outras páginas. Contém métodos reutilizáveis para interações com a página, como:
- ⏳ Esperar que um elemento esteja visível
- ✍️ Preencher campos de entrada (inputs)
- 🖱️ Clicar em elementos

### 2. `FormPage.java`

A **FormPage** representa a página de formulário e contém localizadores e métodos específicos para interagir com os elementos dessa página, como campos de texto, senha, dropdowns, checkboxes e botões. 📄

### 3. `FormSteps.java`

A classe **FormSteps** contém os passos de automação descritos em **Gherkin**, utilizados pelo **Cucumber**. Cada método corresponde a uma etapa de um cenário de teste:
- 🌐 Navegação para a página do formulário
- 📝 Preenchimento de campos de texto e senha
- 📤 Submissão do formulário
- ✅ Validação de mensagens de sucesso

### 4. `Hooks.java`

A classe **Hooks** contém métodos que são executados antes e depois de cada cenário de teste:
- 🚗 Inicializa o **WebDriver** antes dos testes
- 🛑 Encerra o **WebDriver** ao final dos testes

### 5. `Setup.java`

A classe **Setup** é responsável por configurar e gerenciar a instância do **WebDriver**, utilizando o navegador **Google Chrome**. Ela contém métodos para:
- ⚙️ Inicializar o WebDriver com as opções configuradas
- ❌ Encerrar o WebDriver após os testes

## 🎯 Cenários de Teste

Os cenários de teste são definidos em linguagem Gherkin, facilitando a compreensão e a automação. Alguns dos cenários cobertos incluem:

### 1. Submissão de Formulário com Text Input e Password Preenchidos
- **Dado** que estou na página do formulário
- **Quando** preencho o campo de texto e senha com os valores fornecidos
- **E** submeto o formulário
- **Então** devo ver uma mensagem de sucesso 🎉

### 2. Submissão de Formulário com Campos Vazios
- **Dado** que estou na página do formulário
- **Quando** deixo o campo de texto e senha vazios
- **E** submeto o formulário
- **Então** devo ver uma mensagem de sucesso 🆗

### 3. Retorno à Página de Index
- **Dado** que estou na página do formulário
- **Quando** clico no link para retornar à página de index
- **Então** devo ser redirecionado para a página de index 🔙

### 4. Seleção de Item no Dropdown e Submissão
- **Dado** que estou na página do formulário
- **Quando** seleciono um item no dropdown
- **E** submeto o formulário
- **Então** devo ver uma mensagem de sucesso 📥

### 5. Seleção de Checkboxes e Submissão
- **Dado** que estou na página do formulário
- **Quando** marco as duas checkboxes
- **E** submeto o formulário
- **Então** devo ver uma mensagem de sucesso ☑️

## 💻 Tecnologias Utilizadas

- **Java** ☕ para a implementação da lógica de automação
- **Selenium WebDriver** 🌐 para controle do navegador
- **Cucumber** 🥒 para a definição dos cenários de teste em Gherkin
- **ChromeDriver** para a interação com o navegador Google Chrome

## 🚀 Como Executar

1. Clone o repositório do projeto:
   ```bash
   git clone https://github.com/laiscrz/selenium-webform-tester.git
   ```
2. Certifique-se de ter o **Java** e o **Maven** instalados.
3. Execute o comando:
   ```bash
   mvn test
   ```
   para rodar todos os testes automatizados.

## 🎯 Conclusão

Este projeto exemplifica uma abordagem simples e eficaz para a automação de testes de formulários web com Selenium, utilizando uma arquitetura organizada e baseada em boas práticas de automação de testes. 
