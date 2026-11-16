# 08 - Herança e polimorfismo

## Objetivo

Compreender como o polimorfismo funciona em conjunto com a herança, permitindo que objetos de diferentes subclasses sejam tratados por meio de uma referência da superclasse.

## Conceito

Polimorfismo significa "muitas formas".

Na programação orientada a objetos, permite que objetos de classes diferentes apresentem comportamentos específicos por meio de uma mesma interface de utilização.

No Java, uma das formas de implementar polimorfismo é por meio da herança e da sobrescrita de métodos.

## Funcionamento

Neste exemplo, temos uma classe principal chamada `Animal` e três subclasses:

- `Cachorro`;
- `Gato`;
- `Vaca`.

A classe `Animal` define o método `emitirSom()`.

Cada subclasse sobrescreve esse método utilizando `@Override` e apresenta um comportamento específico.

### Referência da superclasse

Uma característica importante do polimorfismo é permitir que uma variável do tipo da superclasse armazene uma referência para um objeto de uma subclasse.

Exemplo:

```java
Animal animal = new Cachorro("Rex");
```

Nesse caso:

- Tipo da referência: `Animal`;
- Tipo real do objeto: `Cachorro`.

Embora a referência seja do tipo `Animal`, quando chamamos `emitirSom()`, o Java executa a implementação da classe `Cachorro`.

Esse comportamento é conhecido como despacho dinâmico de métodos.

## Estrutura

```text
08-heranca-e-polimorfismo/
├── README.md
├── Animal.java
├── Cachorro.java
├── Gato.java
├── Vaca.java
└── Main.java
```

## Polimorfismo com arrays

Também podemos armazenar diferentes subclasses em um mesmo array cujo tipo seja a superclasse.

Exemplo:

```java
Animal[] animais = {
    new Cachorro("Rex"),
    new Gato("Mimi"),
    new Vaca("Mimosa")
};
```

Dessa maneira, podemos percorrer todos os objetos utilizando uma variável do tipo `Animal`, sem precisar verificar manualmente qual é a classe de cada objeto.

## Executando

Compile os arquivos:

```bash
javac Animal.java Cachorro.java Gato.java Vaca.java Main.java
```

Execute:

```bash
java Main
```

## Conceitos praticados

- Herança;
- Polimorfismo;
- Sobrescrita de métodos;
- Anotação `@Override`;
- Referência da superclasse;
- Tipo real do objeto;
- Despacho dinâmico de métodos;
- Arrays de referências da superclasse;
- Reutilização de código.

## Conclusão

O polimorfismo permite escrever códigos mais flexíveis e reutilizáveis.

Por meio dele, diferentes objetos podem responder à mesma chamada de método de maneiras específicas, respeitando suas próprias implementações.

É um conceito fundamental para desenvolver sistemas orientados a objetos em Java.