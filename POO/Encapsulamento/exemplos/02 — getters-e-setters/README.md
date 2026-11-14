# Getters e Setters em Java

## 1. Objetivo

Este exemplo apresenta os métodos Getters e Setters, utilizados para consultar e modificar atributos privados de uma classe.

Esses métodos são importantes no encapsulamento, pois permitem controlar o acesso aos dados de um objeto sem disponibilizar seus atributos diretamente.

## 2. O que são Getters?

Getters são métodos responsáveis por retornar o valor de um atributo privado.

Normalmente, seus nomes começam com `get`, seguido do nome do atributo.

Exemplo:

```java
public String getNome() {
    return nome;
}
```

Nesse caso:

- `public`: permite que outras classes acessem o método.
- `String`: tipo de retorno.
- `getNome()`: nome do método.
- `return nome`: retorna o valor do atributo.

Utilização:

```java
System.out.println(produto.getNome());
```

## 3. O que são Setters?

Setters são métodos responsáveis por modificar os valores dos atributos privados.

Normalmente, seus nomes começam com `set`, seguido do nome do atributo.

Exemplo:

```java
public void setNome(String nome) {
    this.nome = nome;
}
```

Nesse caso:

- `public`: permite que outras classes acessem o método.
- `void`: indica que o método não retorna valor.
- `setNome()`: nome do método.
- `String nome`: parâmetro recebido.
- `this.nome = nome`: atribui o valor recebido ao atributo do objeto.

Utilização:

```java
produto.setNome("Notebook");
```

## 4. Utilizando Getters e Setters juntos

Os dois métodos podem ser utilizados para consultar e modificar o mesmo atributo.

Exemplo:

```java
public class Produto {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

Classe principal:

```java
public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Notebook");

        System.out.println(produto.getNome());

    }

}
```

Resultado:

```text
Notebook
```

O método `setNome()` modifica o atributo, enquanto `getNome()` retorna seu valor.

## 5. Diferenças entre Getters e Setters

| Característica | Getter | Setter |
|---|---|---|
| Finalidade | Consultar um atributo | Modificar um atributo |
| Prefixo convencional | `get` | `set` |
| Retorno | Tipo do atributo | Geralmente `void` |
| Parâmetros | Geralmente nenhum | Geralmente um |
| Exemplo | `getNome()` | `setNome("Notebook")` |

## 6. Convenções de nomenclatura

Em Java, existem convenções para nomear esses métodos.

Para um atributo chamado `nome`:

```java
getNome()
setNome()
```

Para um atributo chamado `preco`:

```java
getPreco()
setPreco()
```

Para atributos booleanos, também é comum utilizar o prefixo `is` nos métodos de consulta.

Exemplo:

```java
private boolean ativo;

public boolean isAtivo() {
    return ativo;
}
```

## 7. Getters e Setters não são obrigatórios

Nem todo atributo privado precisa possuir getter e setter.

Podemos disponibilizar somente a consulta, somente a alteração ou nenhum dos dois, dependendo das necessidades da classe.

Exemplo:

```java
public class Produto {

    private String codigo;

    public String getCodigo() {
        return codigo;
    }

}
```

Nesse caso, outras classes podem consultar o código, mas não podem modificá-lo diretamente por meio de um setter.

Essa decisão ajuda a manter o controle sobre os dados do objeto.

## 8. Executando o exemplo

Entre na pasta:

```bash
cd 03-encapsulamento/exemplos/02-getters-e-setters
```

Compile os arquivos:

```bash
javac Produto.java Main.java
```

Execute:

```bash
java Main
```

## 9. Conceitos aprendidos

| Conceito | Descrição |
|---|---|
| Getter | Método utilizado para consultar um atributo privado. |
| Setter | Método utilizado para modificar um atributo privado. |
| `return` | Devolve um valor ao código que chamou o método. |
| `this` | Referencia o próprio objeto. |
| `void` | Indica que um método não retorna valor. |

## Considerações finais

Getters e Setters permitem que outras classes interajam com os atributos privados de maneira controlada.

Eles são ferramentas comuns na implementação do encapsulamento, mas devem ser utilizados conforme a necessidade da classe.

No próximo exemplo, serão adicionadas validações aos setters para impedir que valores inválidos sejam atribuídos aos atributos.