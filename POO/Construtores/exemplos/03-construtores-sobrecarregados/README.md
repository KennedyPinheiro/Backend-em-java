# Construtores em Java

## 1. O que são construtores?

Construtores são estruturas especiais de uma classe responsáveis por inicializar objetos durante sua criação.

Eles são executados automaticamente quando utilizamos a palavra-chave `new` para instanciar um objeto.

Sua principal finalidade é preparar o estado inicial do objeto, atribuindo valores aos seus atributos.

### Exemplo

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
        nome = "Não informado";
        idade = 0;
    }

}
```

Ao criar um objeto:

```java
Pessoa pessoa = new Pessoa();
```

O construtor `Pessoa()` é executado automaticamente.

---

## 2. Características dos construtores

Os construtores possuem algumas características importantes:

- Possuem o mesmo nome da classe.
- Não possuem tipo de retorno, nem mesmo `void`.
- São executados durante a instanciação do objeto.
- Podem receber parâmetros.
- Podem ser sobrecarregados.
- Podem utilizar modificadores de acesso, como `public`, `protected` e `private`.

Exemplo:

```java
public Pessoa() {
    System.out.println("Objeto criado!");
}
```

---

## 3. Construtor padrão (Default Constructor)

Quando uma classe não declara nenhum construtor, o compilador Java disponibiliza automaticamente um construtor padrão sem parâmetros.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

}
```

Podemos instanciar normalmente:

```java
Pessoa pessoa = new Pessoa();
```

Nesse caso, o compilador disponibiliza implicitamente um construtor equivalente a:

```java
public Pessoa() {
    super();
}
```

Os atributos recebem seus valores padrão:

| Tipo | Valor padrão |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Tipos de referência | `null` |

**Importante:** se declararmos qualquer construtor na classe, o compilador deixa de gerar automaticamente o construtor padrão.

---

## 4. Construtor sem parâmetros

É um construtor declarado pelo próprio programador que não recebe argumentos.

Exemplo:

```java
public class Produto {

    String nome;
    double preco;

    public Produto() {
        nome = "Produto não informado";
        preco = 0.0;
    }

}
```

Instanciação:

```java
Produto produto = new Produto();
```

Diferentemente do construtor padrão implícito, esse construtor foi declarado manualmente.

---

## 5. Construtor com parâmetros

Um construtor pode receber parâmetros para inicializar os atributos com valores informados durante a criação do objeto.

Exemplo:

```java
public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

}
```

Instanciação:

```java
Produto produto1 = new Produto("Notebook", 3500.00);
Produto produto2 = new Produto("Mouse", 80.00);
```

Cada objeto é inicializado com seus próprios valores.

### Parâmetros e argumentos

É importante diferenciar:

- **Parâmetros:** variáveis declaradas na definição do construtor.
- **Argumentos:** valores enviados durante a chamada do construtor.

---

## 6. Palavra-chave `this`

A palavra-chave `this` representa a referência ao próprio objeto.

É utilizada para acessar atributos e métodos da instância atual.

Um uso muito comum acontece quando os parâmetros possuem os mesmos nomes dos atributos.

Exemplo:

```java
public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}
```

Nesse caso:

- `this.nome` representa o atributo do objeto.
- `nome` representa o parâmetro recebido.

Portanto:

```java
this.nome = nome;
```

Significa atribuir ao atributo `nome` o valor recebido pelo parâmetro.

### Chamando outro construtor com `this()`

Também podemos utilizar `this()` para chamar outro construtor da mesma classe.

Exemplo:

```java
public class Usuario {

    String nome;
    String email;

    public Usuario() {
        this("Não informado", "Não informado");
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
```

Quando utilizamos:

```java
new Usuario();
```

O construtor sem parâmetros chama o construtor que recebe dois parâmetros.

**Regra:** a chamada `this()` deve ser a primeira instrução do construtor.

---

## 7. Sobrecarga de construtores (Constructor Overloading)

A sobrecarga permite declarar vários construtores dentro da mesma classe, desde que possuam assinaturas diferentes.

Isso possibilita criar objetos de diferentes maneiras.

Exemplo:

```java
public class Usuario {

    String nome;
    String email;
    int idade;

    public Usuario() {
        this("Não informado", "Não informado", 0);
    }

    public Usuario(String nome, String email) {
        this(nome, email, 0);
    }

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
```

Podemos instanciar de três maneiras:

```java
Usuario usuario1 = new Usuario();

Usuario usuario2 = new Usuario(
    "Ana",
    "ana@email.com"
);

Usuario usuario3 = new Usuario(
    "Carlos",
    "carlos@email.com",
    25
);
```

O Java identifica qual construtor utilizar com base na quantidade, nos tipos e na ordem dos parâmetros.

**Importante:** não é possível declarar dois construtores com a mesma assinatura, mesmo que os nomes dos parâmetros sejam diferentes.

---

## 8. Diferença entre construtores e métodos

Embora possam parecer semelhantes, construtores e métodos possuem finalidades diferentes.

| Característica | Construtor | Método |
|---|---|---|
| Finalidade | Inicializar objetos | Executar comportamentos |
| Nome | Mesmo nome da classe | Pode ter qualquer nome válido |
| Tipo de retorno | Não possui | Possui um tipo ou `void` |
| Execução | Durante a instanciação ou chamada explícita entre construtores | Quando é chamado |
| Sobrecarga | Sim | Sim |

Exemplo de construtor:

```java
public Pessoa(String nome) {
    this.nome = nome;
}
```

Exemplo de método:

```java
public void apresentar() {
    System.out.println("Olá, meu nome é " + nome);
}
```

---

## 9. Inicialização de objetos

Os atributos de um objeto podem receber valores de diferentes maneiras.

### 9.1. Valores padrão

Quando não inicializamos um atributo explicitamente, ele recebe o valor padrão correspondente ao seu tipo.

```java
public class ContaBancaria {

    String titular;
    double saldo;
    boolean ativa;

}
```

### 9.2. Inicialização na declaração

Podemos definir valores diretamente na declaração dos atributos.

```java
public class ContaBancaria {

    String titular = "Não informado";
    double saldo = 0.0;
    boolean ativa = true;

}
```

### 9.3. Inicialização pelo construtor

Também podemos definir os valores durante a criação do objeto.

```java
public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

}
```

### 9.4. Ordem geral de inicialização

De forma simplificada, quando um objeto é criado, o Java segue esta sequência:

1. Os atributos recebem seus valores padrão.
2. Os inicializadores de atributos e blocos de inicialização de instância são executados na ordem em que aparecem na classe.
3. O corpo do construtor é executado.

---

## 10. Boas práticas

Ao trabalhar com construtores, algumas práticas ajudam a manter o código organizado:

- Utilize construtores para inicializar os atributos necessários.
- Escolha parâmetros com nomes claros.
- Utilize `this` para diferenciar atributos e parâmetros.
- Evite repetir código entre construtores; considere utilizar `this()`.
- Utilize sobrecarga quando houver diferentes formas legítimas de criar um objeto.
- Considere validar os valores recebidos quando necessário.

---

## 11. Resumo dos conceitos

| Conceito | Descrição |
|---|---|
| Construtor | Inicializa um objeto durante sua criação. |
| Construtor padrão | Construtor sem parâmetros disponibilizado pelo compilador quando nenhum construtor é declarado. |
| Construtor sem parâmetros | Construtor declarado sem receber argumentos. |
| Construtor com parâmetros | Recebe valores para inicializar os atributos. |
| `this` | Referencia o próprio objeto. |
| `this()` | Chama outro construtor da mesma classe. |
| Sobrecarga | Permite diferentes construtores na mesma classe. |
| Inicialização | Processo de atribuir valores iniciais aos atributos. |

---

## 12. Exemplos práticos

Os exemplos deste módulo estão organizados por assunto:

```text
02-construtores/
├── README.md
└── exemplos/
    ├── 01-construtor-basico/
    ├── 02-construtor-com-parametros/
    ├── 03-construtores-sobrecarregados/
    └── 04-inicializacao-de-objetos/
```

Cada diretório contém exemplos independentes para praticar os conceitos apresentados.

---

## Considerações finais

Construtores são fundamentais na programação orientada a objetos, pois permitem controlar como os objetos são criados e inicializados.

Compreender construtores sem parâmetros, construtores com parâmetros, `this` e sobrecarga é essencial para desenvolver classes mais organizadas e preparar o código para conceitos mais avançados de POO.