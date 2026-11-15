# Exemplo 05 — Hierarquia de Herança

## Objetivo

Compreender como funciona a herança em vários níveis em Java, utilizando diferentes classes relacionadas por uma hierarquia.

Neste exemplo, foi desenvolvida uma estrutura composta por três classes:

- `Pessoa`: classe mais genérica.
- `Funcionario`: herda de `Pessoa`.
- `Desenvolvedor`: herda de `Funcionario`.

## Estrutura

```text
05-hierarquia-de-heranca/
├── README.md
├── Pessoa.java
├── Funcionario.java
├── Desenvolvedor.java
└── Main.java
```

## Hierarquia de classes

```text
             Pessoa
                |
           Funcionario
                |
          Desenvolvedor
```

A classe `Desenvolvedor` herda diretamente de `Funcionario` e indiretamente de `Pessoa`.

## Conceitos praticados

### 1. Herança em vários níveis

A herança pode ser organizada em diferentes níveis.

Uma classe pode herdar de outra que também possui uma superclasse.

### 2. Herança direta

Acontece quando uma classe herda diretamente de outra.

Nesse exemplo, `Funcionario` herda diretamente de `Pessoa`.

### 3. Herança indireta

Acontece quando uma classe recebe características de uma superclasse por meio de outra classe intermediária.

Nesse exemplo, `Desenvolvedor` herda indiretamente de `Pessoa`, por meio de `Funcionario`.

### 4. Palavra-chave extends

A palavra-chave `extends` estabelece a relação de herança entre as classes.

### 5. Palavra-chave super()

A palavra-chave `super()` permite chamar o construtor da superclasse imediata.

Na classe `Desenvolvedor`, a chamada `super()` executa o construtor de `Funcionario`, que por sua vez chama o construtor de `Pessoa`.

### 6. Reutilização de atributos e métodos

A classe `Desenvolvedor` aproveita características de diferentes níveis da hierarquia, evitando a repetição de código.

Ela utiliza informações pessoais, profissionais e comportamentos específicos da área de desenvolvimento.

## Execução

Compile os arquivos:

```bash
javac Pessoa.java Funcionario.java Desenvolvedor.java Main.java
```

Execute:

```bash
java Main
```

## Aprendizado

A herança em vários níveis permite organizar classes de maneira hierárquica, compartilhando características entre diferentes níveis de especialização.

**Conclusão:** uma classe pode herdar características de sua superclasse direta e também receber, indiretamente, características das classes anteriores da hierarquia.