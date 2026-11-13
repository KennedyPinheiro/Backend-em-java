# Construtores com Parâmetros em Java

## 1. O que são construtores com parâmetros?

Construtores com parâmetros são construtores que recebem valores durante a criação de um objeto.

Eles permitem inicializar os atributos de uma classe com informações fornecidas no momento da instanciação, evitando que seja necessário atribuir cada valor individualmente depois de criar o objeto.

Dessa forma, diferentes objetos da mesma classe podem ser criados com informações diferentes.

### Exemplo

```java
public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
```

Nesse exemplo, o construtor recebe três parâmetros:

- `nome`: recebe o nome do produto.
- `preco`: recebe o preço do produto.
- `quantidade`: recebe a quantidade disponível.

Esses valores são utilizados para inicializar os atributos do objeto.

---

## 2. Passando argumentos na instanciação

Para utilizar um construtor com parâmetros, precisamos informar os valores esperados durante a criação do objeto.

```java
public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 80.00, 10);

    }

}
```

Observe:

```java
Produto produto1 = new Produto("Notebook", 3500.00, 5);
```

Durante a instanciação, os valores são enviados ao construtor na mesma ordem em que os parâmetros foram declarados.

| Argumento | Parâmetro | Valor |
|---|---|---|
| `"Notebook"` | `nome` | Notebook |
| `3500.00` | `preco` | 3500.00 |
| `5` | `quantidade` | 5 |

O mesmo processo acontece ao criar `produto2`, mas com valores diferentes.

Assim, cada objeto possui seu próprio estado.

---

## 3. Utilizando a palavra-chave `this`

A palavra-chave `this` representa a referência ao próprio objeto.

Ela é utilizada para acessar atributos e métodos da instância atual.

Nos construtores, é bastante comum utilizá-la para diferenciar os atributos da classe dos parâmetros recebidos.

Exemplo:

```java
public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
```

Observe a diferença:

- `this.nome`: atributo pertencente ao objeto.
- `nome`: parâmetro recebido pelo construtor.

Portanto:

```java
this.nome = nome;
```

Significa atribuir ao atributo `nome` do objeto o valor recebido pelo parâmetro `nome`.

Sem o `this`, quando os nomes são iguais, o Java entende que estamos fazendo referência ao parâmetro local.

---

## 4. Parâmetros e argumentos

Embora sejam conceitos relacionados, parâmetros e argumentos possuem significados diferentes.

### Parâmetros

São as variáveis declaradas na definição do construtor.

```java
public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}
```

Nesse exemplo, `nome` e `preco` são parâmetros.

### Argumentos

São os valores efetivamente enviados durante a chamada do construtor.

```java
Produto produto = new Produto("Teclado", 150.00);
```

Nesse exemplo, `"Teclado"` e `150.00` são argumentos.

**Resumindo:**
- Parâmetros são definidos na declaração.
- Argumentos são informados na chamada.

---

## 5. Ordem e tipos dos parâmetros

Os argumentos precisam respeitar a quantidade, a ordem e os tipos esperados pelo construtor.

Considere:

```java
public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
```

Uma instanciação válida seria:

```java
Produto produto = new Produto("Monitor", 1200.00, 3);
```

Uma chamada com tipos incompatíveis pode gerar erro de compilação:

```java
Produto produto = new Produto(1200.00, "Monitor", 3);
```

Isso acontece porque o primeiro parâmetro espera uma `String`, mas recebeu um `double`.

---

## 6. Construtor sem parâmetros x construtor com parâmetros

A principal diferença está na forma como os objetos são inicializados.

### Construtor sem parâmetros

```java
public Produto() {
    nome = "Não informado";
    preco = 0.0;
    quantidade = 0;
}
```

Instanciação:

```java
Produto produto = new Produto();
```

Os valores são definidos pelo próprio construtor.

### Construtor com parâmetros

```java
public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
```

Instanciação:

```java
Produto produto = new Produto("Notebook", 3500.00, 5);
```

Os valores são fornecidos durante a criação do objeto.

---

## 7. Vantagens dos construtores com parâmetros

A utilização de construtores com parâmetros oferece algumas vantagens:

- **Inicialização imediata:** os atributos recebem valores durante a criação do objeto.
- **Flexibilidade:** diferentes objetos podem ser criados com informações diferentes.
- **Organização:** concentra a inicialização dos atributos em um único lugar.
- **Redução de código:** evita várias atribuições depois da instanciação.
- **Previsibilidade:** facilita entender quais informações são necessárias para criar um objeto.

---

## 8. Resumo

| Conceito | Descrição |
|---|---|
| Construtor com parâmetros | Recebe valores durante a criação do objeto. |
| Parâmetros | Variáveis declaradas na definição do construtor. |
| Argumentos | Valores enviados durante a instanciação. |
| `this` | Referencia o próprio objeto. |
| Instanciação | Processo de criação de um objeto utilizando `new`. |

### Considerações finais

Construtores com parâmetros permitem criar objetos já inicializados com informações específicas.

Esse conceito é importante para desenvolver aplicações orientadas a objetos, pois facilita a criação e a organização de instâncias com diferentes estados.

Também prepara o caminho para o estudo de **sobrecarga de construtores**, que permite definir diferentes maneiras