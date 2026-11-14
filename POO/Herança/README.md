# 04 — Herança

## Introdução

A **herança** é um dos quatro pilares da Programação Orientada a Objetos (POO).

Ela permite que uma classe herde atributos e métodos de outra classe, possibilitando o reaproveitamento de código e facilitando a organização de sistemas.

Por meio da herança, podemos criar classes mais específicas a partir de classes genéricas.

Por exemplo, podemos ter uma classe `Animal` com características comuns, como nome e idade. Outras classes, como `Cachorro` e `Gato`, podem herdar essas características e implementar comportamentos específicos.

## 1. Conceito de Herança

Na herança, temos dois tipos principais de classes:

- **Superclasse:** classe que fornece atributos e métodos para outras classes. Também conhecida como classe pai.
- **Subclasse:** classe que herda atributos e métodos de outra classe. Também conhecida como classe filha.

Exemplo:

```java
public class Animal {
    String nome;
    int idade;

    public void comer() {
        System.out.println("O animal está comendo.");
    }
}
```

A classe `Animal` representa uma superclasse.

Podemos criar uma classe `Cachorro` que herda suas características:

```java
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}
```

Agora, a classe `Cachorro` possui acesso aos membros herdáveis de `Animal` e também possui seu próprio método `latir()`.

## 2. Palavra-chave extends

Em Java, utilizamos a palavra-chave `extends` para estabelecer uma relação de herança entre classes.

Sintaxe:

```java
public class ClasseFilha extends ClassePai {
    // Atributos e métodos específicos
}
```

Exemplo:

```java
public class Cachorro extends Animal {
}
```

Nesse caso, `Cachorro` herda de `Animal`.

Uma classe Java pode estender diretamente apenas uma classe. Isso significa que Java não permite herança múltipla de classes.

Entretanto, uma classe pode implementar várias interfaces, assunto que será estudado posteriormente.

## 3. Reutilização de Atributos e Métodos

Uma das principais vantagens da herança é evitar a duplicação de código.

Sem herança, poderíamos precisar declarar os mesmos atributos e métodos em várias classes.

Com herança, características comuns ficam concentradas na superclasse.

Exemplo:

```java
public class Animal {
    protected String nome;

    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
```

```java
public class Cachorro extends Animal {
    public void latir() {
        System.out.println(nome + " está latindo.");
    }
}
```

A classe `Cachorro` aproveita o atributo `nome` e o método `comer()` de `Animal`.

## 4. Modificadores de Acesso na Herança

Os modificadores de acesso determinam quais membros podem ser utilizados pelas subclasses.

Os principais são:

| Modificador | Acesso na subclasse |
|---|---|
| `private` | Não permite acesso direto pela subclasse. |
| `protected` | Permite acesso pela subclasse, inclusive em outro pacote. |
| `public` | Permite acesso de qualquer classe. |
| Padrão (package-private) | Permite acesso somente dentro do mesmo pacote. |

Exemplo:

```java
public class Animal {
    private String nome;
    protected int idade;
    public String especie;
}
```

Uma subclasse não consegue acessar diretamente o atributo `nome`, pois ele é privado.

Entretanto, pode acessar `idade` e `especie`, respeitando as regras dos respectivos modificadores.

**Importante:** atributos privados continuam fazendo parte do estado herdado do objeto, mas não podem ser acessados diretamente pela subclasse. Quando necessário, podem ser disponibilizados por métodos públicos ou protegidos da superclasse.

## 5. Sobrescrita de Métodos (Override)

A sobrescrita acontece quando uma subclasse fornece uma implementação própria para um método herdado da superclasse.

Para isso, utilizamos a anotação `@Override`.

Exemplo:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}
```

```java
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au