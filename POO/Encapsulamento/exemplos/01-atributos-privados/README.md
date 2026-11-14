# Atributos Privados em Java

## 1. Objetivo

Este exemplo apresenta o uso do modificador de acesso `private` em Java e demonstra como ele impede que outras classes acessem diretamente os atributos de um objeto.

Esse é o primeiro passo para compreender o encapsulamento na Programação Orientada a Objetos.

## 2. O que são atributos privados?

Atributos privados são variáveis declaradas dentro de uma classe utilizando o modificador `private`.

Eles somente podem ser acessados diretamente pela própria classe em que foram declarados.

Exemplo:

```java
public class Pessoa {

    private String nome;
    private int idade;

}
```

Nesse caso, os atributos `nome` e `idade` são privados.

Isso significa que outras classes não podem consultá-los ou modificá-los diretamente.

## 3. Tentando acessar os atributos

Considere a seguinte classe principal:

```java
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Kennedy";
        pessoa.idade = 22;

    }

}
```

Ao tentar executar esse código, o compilador apresentará erros.

Isso acontece porque os atributos foram declarados como `private` na classe `Pessoa`.

O mesmo acontece quando tentamos consultar seus valores:

```java
System.out.println(pessoa.nome);
System.out.println(pessoa.idade);
```

Essas operações também não são permitidas fora da classe.

## 4. O que o modificador private protege?

O modificador `private` controla o acesso aos membros de uma classe.

Neste exemplo:

- A classe `Pessoa` pode acessar seus próprios atributos.
- A classe `Main` pode criar objetos `Pessoa`.
- A classe `Main` não pode acessar diretamente os atributos privados de `Pessoa`.

Essa restrição ajuda a proteger o estado interno dos objetos.

## 5. Executando o exemplo

Entre na pasta:

```bash
cd 03-encapsulamento/exemplos/01-atributos-privados
```

Compile os arquivos:

```bash
javac Pessoa.java Main.java
```

Execute:

```bash
java Main
```

Resultado:

```text
Objeto Pessoa criado!
```

Para observar o erro de acesso, retire os comentários das linhas que tentam acessar `pessoa.nome` e `pessoa.idade` no arquivo `Main.java` e tente compilar novamente.

Depois, comente essas linhas novamente para que o exemplo volte a compilar.

## 6. Conceitos aprendidos

| Conceito | Descrição |
|---|---|
| `private` | Restringe o acesso direto ao membro à própria classe. |
| Atributo privado | Variável de uma classe protegida pelo modificador `private`. |
| Controle de acesso | Mecanismo que determina quais classes podem acessar determinados membros. |
| Encapsulamento | Princípio que controla o acesso e a modificação dos dados de um objeto. |

## Considerações finais

O uso de atributos privados permite proteger os dados internos de uma classe, impedindo que outras classes os modifiquem diretamente.

Entretanto, muitas vezes precisamos consultar ou modificar esses valores de maneira controlada.

Para isso, estudaremos os **Getters e Setters**, que permitem acessar e alterar atributos privados por meio de métodos.