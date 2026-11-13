#  Construtores

## 1. O que são construtores?

Construtores são estruturas especiais de uma classe utilizadas para inicializar objetos durante sua criação.

Sempre que utilizamos o operador `new` para instanciar uma classe, um construtor é executado.

Sua principal finalidade é permitir que um objeto seja criado com seus atributos devidamente inicializados.

Por exemplo, imagine uma classe `Pessoa` que possui os atributos `nome` e `idade`.

Podemos criar um objeto e atribuir seus valores posteriormente:

```java
Pessoa pessoa = new Pessoa();

pessoa.nome = "Kennedy";
pessoa.idade = 22;
```

Entretanto, podemos utilizar um construtor para fornecer essas informações no momento da criação:

```java
Pessoa pessoa = new Pessoa("Kennedy", 22);
```

Dessa maneira, o objeto já nasce com os valores informados.

---

## 2. Características dos construtores

Os construtores possuem características específicas que os diferenciam dos métodos comuns.

- Possuem o mesmo nome da classe.
- Não possuem tipo de retorno, nem mesmo `void`.
- São executados durante a criação de uma instância.
- Podem receber parâmetros.
- Podem ser sobrecarregados.
- Podem possuir modificadores de acesso.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
```

Nesse exemplo:

- `Pessoa`: nome do construtor, igual ao nome da classe.
- `String nome` e `int idade`: parâmetros recebidos.
- `this.nome` e `this.idade`: atributos do objeto que está sendo inicializado.

---

## 3. Construtor padrão (Default Constructor)

Quando uma classe não possui nenhum construtor declarado, o compilador Java disponibiliza automaticamente um construtor padrão sem parâmetros.

Esse construtor permite instanciar objetos sem fornecer argumentos.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

}
```

Podemos criar um objeto normalmente:

```java
Pessoa pessoa = new Pessoa();
```

Nesse caso, o compilador disponibiliza o construtor padrão.

**Importante:** o construtor padrão gerado pelo compilador deixa de existir quando declaramos qualquer construtor na classe.

Por exemplo:

```java
public class Pessoa {

    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

}
```

Agora, a seguinte instrução não funcionará:

```java
Pessoa pessoa = new Pessoa();
```

Isso acontece porque declaramos um construtor com parâmetros e o compilador não gera automaticamente outro sem parâmetros.

---

## 4. Construtor sem parâmetros

Também podemos declarar manualmente um construtor sem parâmetros.

Diferentemente do construtor padrão gerado pelo compilador, este é declarado explicitamente pelo desenvolvedor.

Exemplo:

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

Agora, quando criamos um objeto:

```java
Pessoa pessoa = new Pessoa();
```

O construtor executa suas instruções e inicializa os atributos.

Podemos perceber que o objeto já possui valores definidos.

---

## 5. Construtor com parâmetros

Um construtor pode receber parâmetros para inicializar os atributos de um objeto com valores específicos.

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

Para criar o objeto, precisamos fornecer os argumentos esperados pelo construtor:

```java
Produto produto = new Produto("Teclado", 120.00);
```

Nesse caso:

- `"Teclado"` é passado para o parâmetro `nome`.
- `120.00` é passado para o parâmetro `preco`.

Os valores são utilizados para inicializar os atributos do objeto.

---

## 6. A palavra-chave this nos construtores

A palavra-chave `this` faz referência à instância atual da classe.

Nos construtores, ela é frequentemente utilizada para diferenciar os atributos da classe dos parâmetros recebidos.

Observe:

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
```

Observe a diferença:

- `this.nome`: representa o atributo da instância.
- `nome`: representa o parâmetro recebido pelo construtor.

Sem utilizar `this`, quando os parâmetros possuem os mesmos nomes dos atributos, seria necessário utilizar outros nomes para evitar ambiguidades.

**Observação:** também é possível utilizar `this()` para chamar outro construtor da mesma classe. Essa chamada precisa ser a primeira instrução do construtor.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

    public Pessoa() {
        this("Não informado", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
```

Nesse exemplo, o construtor sem parâmetros delega a inicialização ao construtor com parâmetros.

---

## 7. Sobrecarga de construtores

A sobrecarga acontece quando uma classe possui dois ou mais construtores com diferentes listas de parâmetros.

Isso permite criar objetos de diferentes maneiras, dependendo das informações disponíveis.

Exemplo:

```java
public class Usuario {

    String nome;
    String email;
    int idade;

    public Usuario() {
        nome = "Não informado";
        email = "Não informado";
        idade = 0;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.idade = 0;
    }

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
```

Podemos instanciar objetos utilizando diferentes construtores:

```java
Usuario usuario1 = new Usuario();

Usuario usuario2 = new Usuario(
    "Kennedy",
    "kennedy@email.com"
);

Usuario usuario3 = new Usuario(
    "Maria",
    "maria@email.com",
    20
);
```

Cada chamada utiliza um construtor diferente, de acordo com os argumentos fornecidos.

**Importante:** para que exista sobrecarga, os construtores precisam possuir listas de parâmetros diferentes. Não é possível diferenciá-los apenas pelo nome dos parâmetros ou pelo tipo de retorno.

---

## 8. Construtores x Métodos

Embora os construtores e métodos sejam estruturas declaradas dentro de uma classe, possuem finalidades diferentes.

| Construtores | Métodos |
|---|---|
| Inicializam objetos. | Executam comportamentos. |
| Possuem o mesmo nome da classe. | Podem possuir qualquer nome válido. |
| Não possuem tipo de retorno. | Possuem um tipo de retorno ou `void`. |
| São executados durante a instanciação. | São chamados quando necessário. |
| Podem receber parâmetros. | Podem receber parâmetros. |
| Podem ser sobrecarregados. | Podem ser sobrecarregados. |

Exemplo:

```java
public class Pessoa {

    String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

}
```

Utilização:

```java
Pessoa pessoa = new Pessoa("Kennedy");

pessoa.apresentar();
```

O construtor inicializa o objeto, enquanto o método executa um comportamento.

---

## 9. Inicialização de objetos

A inicialização de objetos é o processo de definir os valores iniciais de seus atributos.

Em Java, podemos inicializar atributos utilizando:

- Valores padrão da linguagem.
- Inicialização diretamente na declaração dos atributos.
- Blocos de inicialização.
- Construtores.

Exemplo:

```java
public class ContaBancaria {

    String titular = "Não informado";
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

}
```

Nesse exemplo, `titular` possui um valor inicial na declaração, mas esse valor pode ser substituído pelo construtor.

O atributo `saldo`, por ser do tipo `double`, recebe inicialmente o valor padrão `0.0`, caso não seja inicializado de outra maneira.

---

## 10. Resumo dos conceitos

| Conceito | Definição |
|---|---|
| Construtor | Estrutura utilizada para inicializar objetos. |
| Default Constructor | Construtor sem parâmetros gerado automaticamente pelo compilador quando nenhum construtor é declarado. |
| Construtor sem parâmetros | Construtor declarado sem receber argumentos. |
| Construtor com parâmetros | Recebe valores para inicializar os atributos. |
| `this` | Referencia a instância atual da classe. |
| `this()` | Chama outro construtor da mesma classe. |
| Sobrecarga | Permite declarar diferentes construtores com listas de parâmetros distintas. |
| Inicialização | Processo de definir os valores iniciais dos atributos. |

---

## 11. Considerações finais

Os construtores são fundamentais para garantir que os objetos sejam criados com seus atributos devidamente inicializados.

Eles permitem controlar como uma instância será criada, quais informações serão necessárias e quais valores serão atribuídos inicialmente.

Compreender construtores também prepara o caminho para o encapsulamento, pois futuramente utilizaremos essas estruturas para controlar a inicialização e a integridade dos dados de nossos objetos.