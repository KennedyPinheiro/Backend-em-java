# Exemplo 04 — Utilizando super

## Objetivo

Compreender como utilizar a palavra-chave `super` em Java para acessar construtores, atributos e métodos de uma superclasse.

Neste exemplo, foi criada uma classe `Funcionario` e uma classe `Gerente`, que herda suas características e apresenta comportamentos específicos.

## Estrutura

```text
04-utilizando-super/
├── README.md
├── Funcionario.java
├── Gerente.java
└── Main.java
```

## Conceitos praticados

### 1. Chamada ao construtor da superclasse

A palavra-chave `super()` permite chamar o construtor da classe pai.

Na classe `Gerente`, ela é utilizada para inicializar os atributos `nome` e `salario`, definidos em `Funcionario`.

### 2. Acesso aos métodos da superclasse

A expressão `super.metodo()` permite executar a implementação de um método da superclasse.

Nesse exemplo, `super.exibirDados()` executa a implementação original antes de apresentar o departamento do gerente.

### 3. Acesso aos atributos da superclasse

A expressão `super.atributo` permite acessar explicitamente um atributo herdado, desde que seu modificador de acesso permita.

O atributo `salario` foi declarado como `protected`, possibilitando seu acesso pela subclasse.

### 4. Sobrescrita de métodos

A classe `Gerente` sobrescreve os métodos `exibirDados()` e `trabalhar()`.

Com `super`, ela aproveita os comportamentos originais e adiciona funcionalidades específicas.

### 5. Diferença entre this e super

- `this`: referencia a instância atual e seus membros.
- `super`: permite acessar membros da superclasse.

## Execução

Compile os arquivos:

```bash
javac Funcionario.java Gerente.java Main.java
```

Execute:

```bash
java Main
```

## Aprendizado

A palavra-chave `super` permite reutilizar implementações da superclasse, evitando duplicação de código e possibilitando que as subclasses complementem comportamentos existentes.

**Conclusão:** `super` facilita o reaproveitamento e a especialização de atributos, construtores e métodos dentro de uma hierarquia de herança.