# Inicialização de Objetos em Java

## 1. O que é inicialização de objetos?

A inicialização de objetos é o processo de atribuir valores iniciais aos atributos de uma classe quando uma instância é criada.

Em Java, esse processo acontece automaticamente durante a instanciação de um objeto, utilizando a palavra-chave `new`.

Existem diferentes maneiras de inicializar os atributos de um objeto, como:

- Valores padrão da linguagem.
- Inicialização diretamente na declaração dos atributos.
- Blocos de inicialização de instância.
- Construtores.

Esses mecanismos permitem definir o estado inicial de cada objeto.

---

## 2. Valores padrão dos atributos

Quando um objeto é criado, seus atributos recebem valores padrão de acordo com seus tipos, caso nenhum outro valor tenha sido atribuído.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;
    double altura;
    boolean ativa;

}
```

Ao criar um objeto:

```java
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.altura);
        System.out.println(pessoa.ativa);

    }

}
```

Resultado:

```text
null
0
0.0
false
```

### Tabela de valores padrão

| Tipo | Valor padrão |
|---|---|
| `byte` | `0` |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0f` |
| `double` | `0.0` |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| Tipos de referência | `null` |

**Importante:** esses valores padrão são aplicados aos atributos de instância e às variáveis de classe (`static`). Variáveis locais de métodos não recebem valores automaticamente e precisam ser inicializadas antes do uso.

---

## 3. Inicialização na declaração dos atributos

Uma maneira simples de inicializar atributos é atribuir valores diretamente durante sua declaração.

Exemplo:

```java
public class Produto {

    String nome = "Produto não informado";
    double preco = 0.0;
    int quantidade = 1;

}
```

Ao criar um objeto:

```java
Produto produto = new Produto();
```

Os atributos já possuem os valores definidos na classe.

Essa abordagem é útil quando queremos estabelecer valores iniciais comuns para todas as instâncias.

### Características

- Os valores são definidos diretamente na declaração.
- Cada objeto recebe seus próprios atributos inicializados.
- Os valores podem ser substituídos posteriormente por um construtor ou outro código.

---

## 4. Blocos de inicialização de instância

Java permite criar blocos de código diretamente dentro de uma classe, fora de métodos e construtores.

Esses blocos são chamados de **blocos de inicialização de instância**.

Eles são executados durante a criação de cada objeto, antes do corpo do construtor.

Exemplo:

```java
public class Pessoa {

    String nome;
    int idade;

    {
        nome = "Não informado";
        idade = 18;

        System.out.println("Bloco de inicialização executado!");
    }

}
```

Instanciação:

```java
Pessoa pessoa = new Pessoa();
```

Resultado:

```text
Bloco de inicialização executado!
```

Nesse exemplo, o bloco atribui valores aos atributos antes da execução do construtor.

### Características

- Não possuem nome.
- Não possuem parâmetros.
- Não possuem tipo de retorno.
- São executados a cada criação de objeto.
- Podem acessar os atributos e métodos de instância.

---

## 5. Inicialização por construtores

Os construtores também são responsáveis por inicializar os atributos de um objeto.

Eles permitem receber informações durante a instanciação e utilizá-las para definir o estado inicial da instância.

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

Instanciação:

```java
Pessoa pessoa1 = new Pessoa("Ana", 20);
Pessoa pessoa2 = new Pessoa("Carlos", 25);
```

Cada objeto recebe valores diferentes.

Essa abordagem é especialmente útil quando precisamos que os objetos sejam criados com informações específicas.

---

## 6. Ordem de inicialização dos objetos

O Java segue uma sequência definida durante a criação de objetos.

De maneira simplificada, considerando uma classe sem herança explícita:

1. A memória do objeto é alocada.
2. Os atributos recebem seus valores padrão.
3. Os inicializadores de atributos e blocos de inicialização de instância são executados na ordem em que aparecem no código.
4. O corpo do construtor é executado.

### Exemplo completo

```java
public class Produto {

    String nome = "Produto padrão";

    {
        System.out.println("Bloco de inicialização executado!");
    }

    public Produto(String nome) {

        System.out.println("Construtor executado!");

        this.nome = nome;

    }

}
```

Classe principal:

```java
public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook");

        System.out.println("Produto: " + produto.nome);

    }

}
```

Resultado:

```text
Bloco de inicialização executado!
Construtor executado!
Produto: Notebook
```

Observe que:

- Primeiro, o atributo recebe o valor definido na declaração.
- Depois, o bloco de inicialização é executado.
- Por último, o construtor altera o valor do atributo.

---

## 7. Diferenças entre as formas de inicialização

| Forma | Característica | Quando é utilizada |
|---|---|---|
| Valores padrão | Valores definidos automaticamente pela linguagem | Quando não existe inicialização explícita |
| Declaração de atributos | Define valores diretamente nos atributos | Quando todas as instâncias compartilham o mesmo valor inicial |
| Bloco de inicialização | Executa instruções antes do construtor | Quando existe uma lógica comum de inicialização |
| Construtor | Recebe parâmetros e inicializa o objeto | Quando cada instância precisa de valores específicos |

---

## 8. Boas práticas

Ao trabalhar com inicialização de objetos, algumas práticas ajudam a manter o código organizado:

- Inicialize os atributos com valores adequados ao contexto da aplicação.
- Utilize construtores quando precisar receber informações para criar objetos.
- Evite repetir inicializações desnecessárias.
- Utilize blocos de inicialização somente quando houver uma necessidade real.
- Não dependa de valores padrão quando o atributo precisa obrigatoriamente de um valor específico.
- Mantenha a inicialização dos objetos simples e fácil de compreender.

---

## 9. Resumo dos conceitos

| Conceito | Descrição |
|---|---|
| Inicialização | Processo de atribuir valores iniciais aos atributos. |
| Valores padrão | Valores atribuídos automaticamente pelo Java. |
| Inicialização na declaração | Atribuição de valores diretamente nos atributos. |
| Bloco de inicialização | Bloco executado durante a criação de cada instância. |
| Construtor | Estrutura responsável por inicializar objetos. |
| Instanciação | Processo de criação de um objeto utilizando `new`. |

---

## 10. Exemplo prático

Os exemplos deste assunto estão organizados em:

```text
04-inicializacao-de-objetos/
├── ContaBancaria.java
└── Main.java
```

O exemplo utiliza uma classe `ContaBancaria` para demonstrar:

- Inicialização de atributos na declaração.
- Bloco de inicialização de instância.
- Inicialização por construtor.
- Criação de múltiplos objetos com estados diferentes.

---

## Considerações finais

A inicialização de objetos é um conceito fundamental da Programação Orientada a Objetos em Java.

Compreender como os atributos recebem seus valores e a ordem em que os mecanismos de inicialização são executados ajuda a desenvolver classes mais organizadas e previsíveis.

Esse conhecimento complementa o estudo de construtores e prepara o caminho para conceitos mais avançados, como encapsulamento e controle do estado dos objetos.