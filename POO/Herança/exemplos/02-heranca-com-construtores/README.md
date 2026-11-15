# Exemplo 02 — Herança com Construtores

## Objetivo

Compreender como funcionam os construtores em uma estrutura de herança em Java, utilizando a palavra-chave `super()` para inicializar os atributos herdados da superclasse.

Neste exemplo, foi desenvolvida uma classe `Pessoa` e uma classe `Funcionario`, que herda suas características e adiciona informações específicas.

## Estrutura

```text
02-heranca-com-construtores/
├── README.md
├── Pessoa.java
├── Funcionario.java
└── Main.java
```

## Conceitos praticados

### 1. Construtor da superclasse

A classe `Pessoa` possui um construtor responsável por inicializar os atributos `nome` e `idade`.

### 2. Herança com extends

A classe `Funcionario` utiliza `extends Pessoa` para herdar os atributos e métodos herdáveis da superclasse.

### 3. Palavra-chave super()

A palavra-chave `super()` permite chamar o construtor da superclasse.

```java
super(nome, idade);
```

Nesse exemplo, os parâmetros `nome` e `idade` são encaminhados ao construtor de `Pessoa`.

### 4. Ordem de execução

Ao criar um objeto da classe `Funcionario`, o construtor da superclasse é executado antes da inicialização específica da subclasse.

A sequência simplificada é:

1. O construtor de `Funcionario` é chamado.
2. `super(nome, idade)` chama o construtor de `Pessoa`.
3. Os atributos herdados são inicializados.
4. Os atributos específicos de `Funcionario` são inicializados.

### 5. Reutilização de métodos

A classe `Funcionario` utiliza o método `exibirDados()` de `Pessoa`, sem precisar implementá-lo novamente.

Depois, complementa a exibição com o cargo e o salário.

## Execução

Compile os arquivos:

```bash
javac Pessoa.java Funcionario.java Main.java
```

Execute:

```bash
java Main
```

## Aprendizado

Os construtores não são herdados pelas subclasses, mas podem ser chamados por elas utilizando `super()`.

Isso permite inicializar corretamente os atributos definidos na superclasse e complementar a inicialização com os atributos específicos da classe filha.

**Conclusão:** a utilização de `super()` facilita a inicialização de objetos em estruturas de herança e evita a repetição de código.