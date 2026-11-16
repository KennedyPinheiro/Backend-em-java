# 10 - Modificador final na herança

## Objetivo

Compreender a utilização do modificador `final` no Java e como ele pode restringir a herança, a sobrescrita de métodos e a alteração de valores de variáveis.

## Conceito

O modificador `final` é utilizado para indicar que determinado elemento não poderá sofrer algumas alterações.

Na programação orientada a objetos, ele é especialmente importante para controlar o comportamento das classes e métodos.

## Utilizações do final

### 1. final em métodos

Quando um método é declarado como `final`, ele não pode ser sobrescrito pelas subclasses.

Exemplo:

```java
public final void exibirIdentificacao() {
    System.out.println("Identificação do funcionário.");
}
```

As subclasses continuam podendo utilizar o método herdado, mas não podem fornecer outra implementação por meio de sobrescrita.

### 2. final em classes

Quando uma classe é declarada como `final`, ela não pode ser herdada por outra classe.

Exemplo:

```java
public final class Sistema {
}
```

Não é permitido criar uma subclasse utilizando `extends Sistema`.

### 3. final em atributos

Quando um atributo é declarado como `final`, ele precisa receber um valor uma única vez.

Exemplo:

```java
private final String matricula;
```

O valor pode ser atribuído diretamente na declaração ou durante a inicialização do objeto, como no construtor.

Depois da atribuição, não será possível substituir seu valor.

Quando `final` é utilizado em referências de objetos, a referência não pode apontar para outro objeto, mas o estado interno do objeto ainda pode ser alterado, dependendo de sua implementação.

## Estrutura

```text
10-modificador-final/
├── README.md
├── Funcionario.java
├── Desenvolvedor.java
├── Sistema.java
└── Main.java
```

## Funcionamento

O exemplo utiliza:

- `Funcionario`: demonstra um método declarado como `final`;
- `Desenvolvedor`: herda de `Funcionario` e sobrescreve um método que não é final;
- `Sistema`: demonstra uma classe que não pode ser herdada;
- `Main`: executa os exemplos.

## Executando

Compile:

```bash
javac Funcionario.java Desenvolvedor.java Sistema.java Main.java
```

Execute:

```bash
java Main
```

## Conceitos praticados

- Modificador `final`;
- Herança;
- Sobrescrita de métodos;
- Restrições de herança;
- Métodos finais;
- Classes finais;
- Atributos finais;
- Inicialização de atributos.

## Conclusão

O modificador `final` permite estabelecer restrições importantes no Java.

Ele pode impedir que classes sejam herdadas, que métodos sejam sobrescritos e que variáveis recebam novas atribuições.

Seu uso contribui para a previsibilidade e a segurança do código.