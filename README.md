# Trabalho da disciplina Testes Automatizados
## Automação de Anotepad com Playwright

Este projeto tem como objetivo automatizar o preenchimento de uma nota no site Anotepad usando Playwright para Java. O script preenche o título da nota e o corpo com o nome e a matrícula de um aluno.

## Funcionalidades

- **Navegação automatizada** para acessar o site Anotepad.

- **Criação de uma nova nota** com título e corpo personalizados.

- **Preenchimento automatizado** do título com "Entrega trabalho TEST DAS 2024" e corpo com nome e matrícula do aluno.

- **Testes automatizados** utilizando JUnit para validar o preenchimento correto dos campos.


## Ferramentas utilizadas

**Testes:** JUnit 5.11

**Linguagem de programação:** Java 17

**Bibliotecas e ferramentas:** Playwright e Maven

**IDE:** IntelliJ


## Rodando localmente

1º Passo: Clone o projeto

```bash
  git clone git@github.com:jeancarloscc/test-software-trab.git
```

2º Passo: Entre no diretório do projeto

```bash
  cd test-software-trab
```

3º Passo: Instalar dependências

```bash
  mvn install
```

4º Passo: Rode a automação com o seguinte código

```bash
  mvn exec:java -Dexec.mainClass="com.test.trabalho.jc.Main"
```
## Autores

- [@jeancc.costa](https://www.instagram.com/jeancc.costa?igsh=MW10aXV4OW1rZG0zcg==)

