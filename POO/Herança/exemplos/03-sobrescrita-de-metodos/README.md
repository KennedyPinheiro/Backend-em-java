# Exemplo 03 — Sobrescrita de Métodos (Override)

## Objetivo

Compreender como funciona a sobrescrita de métodos em Java, permitindo que subclasses forneçam implementações próprias para métodos herdados de uma superclasse.

Neste exemplo, foi criada uma classe `Animal` e três subclasses: `Cachorro`, `Gato` e `Vaca`.

Cada subclasse possui sua própria implementação do método `emitirSom()`.

## Estrutura

```text
03-sobrescrita-de-metodos/
├── README.md
├── Animal.java
├── Cachorro.java
├── Gato.java
├── Vaca.java
└── Main.java
```

## Conceitos praticados

### 1. Herança

As classes `Cachorro`, `Gato` e `Vaca` herdam características da classe `Animal` utilizando a palavra-chave `extends`.

### 2. Construtores e super()

Cada subclasse possui um construtor que utiliza `super(nome)` para chamar o construtor da superclasse e inicializar o atributo `nome`.

### 3. Sobrescrita de métodos

A sobrescrita permite que uma subclasse forneça uma implementação própria para um método herdado.

Nesse exemplo, todas as subclasses sobrescrevem o método `emitirSom()`.

### 4. Anotação @Override

A anotação `@Override` indica que um método está sobrescrevendo uma implementação herdada.

Além de documentar a intenção, permite que o compilador identifique erros, como tentar sobrescrever um método inexistente ou utilizar uma assinatura incompatível.

### 5. Comportamentos específicos

Cada classe possui uma implementação diferente:

- `Cachorro`: apresenta o latido.
- `Gato`: apresenta o miado.
- `Vaca`: apresenta o mugido.

Apesar de utilizarem o mesmo nome de método, os comportamentos são diferentes.

## Execução

Compile os arquivos:

```bash
javac Animal.java Cachorro.java Gato.java Vaca.java Main.java
```

Execute:

```bash
java Main
```

## Diferença entre Override e Overload

**Override (sobrescrita):** acontece quando uma subclasse redefine um método herdado.

**Overload (sobrecarga):** acontece quando existem métodos com o mesmo nome, mas com diferentes listas de parâmetros.

## Aprendizado

A sobrescrita permite especializar comportamentos herdados, mantendo uma estrutura comum entre as classes.

**Conclusão:** diferentes subclasses podem implementar o mesmo método de maneiras distintas, respeitando a estrutura definida pela superclasse.