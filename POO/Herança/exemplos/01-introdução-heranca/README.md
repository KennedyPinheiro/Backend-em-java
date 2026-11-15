# Exemplo 01 — Introdução à Herança

## Objetivo

Compreender o funcionamento da herança em Java, utilizando uma classe principal e uma classe derivada para demonstrar o reaproveitamento de atributos e métodos.

Neste exemplo, foi desenvolvida uma classe `Animal` e uma classe `Cachorro`, que herda suas características.

## Estrutura

```text
01-introducao-heranca/
├── README.md
├── Animal.java
├── Cachorro.java
└── Main.java
```

## Conceitos praticados

### 1. Superclasse

A classe `Animal` representa a superclasse, também conhecida como classe pai.

Ela contém atributos e métodos que podem ser aproveitados por outras classes.

### 2. Subclasse

A classe `Cachorro` representa uma subclasse, também conhecida como classe filha.

Ela herda características de `Animal` e pode adicionar seus próprios atributos e comportamentos.

### 3. Palavra-chave extends

A palavra-chave `extends` estabelece uma relação de herança entre duas classes.

```java
public class Cachorro extends Animal {
}
```

Nesse caso, `Cachorro` herda de `Animal`.

### 4. Modificador protected

O modificador `protected` permite que subclasses acessem atributos e métodos protegidos, inclusive quando estão em pacotes diferentes.

### 5. Reutilização de código

A classe `Cachorro` utiliza os atributos `nome` e `idade`, além dos métodos `comer()`, `dormir()` e `emitirSom()`, sem precisar declará-los novamente.

### 6. Métodos específicos

A subclasse também pode possuir comportamentos próprios.

Neste exemplo, o método `latir()` pertence exclusivamente à classe `Cachorro`.

## Execução

Compile os arquivos:

```bash
javac Animal.java Cachorro.java Main.java
```

Execute:

```bash
java Main
```

## Aprendizado

A herança permite reutilizar atributos e métodos de uma classe em outra, reduzindo a duplicação de código e facilitando a organização das aplicações.

**Conclusão:** uma subclasse pode aproveitar características da superclasse e adicionar comportamentos específicos.