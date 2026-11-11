# 01. Classes e Objetos

## 1. Introdução

Classes e objetos são os principais elementos da Programação Orientada a Objetos (POO).

A classe funciona como um modelo que define as características e os comportamentos que seus objetos poderão possuir. Já o objeto é uma instância concreta criada a partir dessa estrutura.

Por meio desses conceitos, podemos organizar informações e comportamentos relacionados em estruturas reutilizáveis.

## 2. O que é uma Classe?

Uma classe é uma estrutura que representa um determinado tipo de entidade dentro de um sistema.

Ela define:

- **Atributos:** representam as características ou propriedades.
- **Métodos:** representam os comportamentos ou ações.

Por exemplo, em um sistema escolar, podemos representar um aluno por meio de uma classe chamada `Aluno`.

Essa classe pode definir informações como nome, idade e matrícula, além de comportamentos como apresentar seus dados e calcular sua média.

### 2.1. Sintaxe

Em Java, utilizamos a palavra-chave `class` para declarar uma classe.

```java
public class NomeDaClasse {

    // Atributos

    // Métodos

}
```

Exemplo:

```java
public class Aluno {

    String nome;
    int idade;
    double nota;

    void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

}
```

Nesse exemplo:

| Elemento | Descrição |
|---|---|
| `public` | Modificador de acesso da classe. |
| `class` | Palavra-chave utilizada para declarar uma classe. |
| `Aluno` | Nome da classe. |
| `nome`, `idade`, `nota` | Atributos da classe. |
| `apresentarDados()` | Método da classe. |

**Observação:** por convenção, nomes de classes em Java começam com letra maiúscula e utilizam o padrão PascalCase.

Exemplos: `Aluno`, `ContaBancaria`, `GerenciadorDeProdutos`.

---

## 3. O que é um Objeto?

Um objeto é uma instância de uma classe.

Quando criamos um objeto, estamos utilizando a estrutura definida pela classe para representar uma entidade específica.

Cada objeto possui seu próprio estado, representado pelos valores de seus atributos de instância, e pode executar os métodos definidos pela classe.

Por exemplo, utilizando a classe `Aluno`, podemos criar diferentes objetos:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
```

Embora tenham sido criados a partir da mesma classe, os objetos podem representar alunos diferentes.

```java
aluno1.nome = "Kennedy";
aluno1.idade = 22;
aluno1.nota = 8.5;

aluno2.nome = "Maria";
aluno2.idade = 20;
aluno2.nota = 9.0;
```

Cada objeto possui seus próprios valores.

### 3.1. Classe x Objeto

| Classe | Objeto |
|---|---|
| É um modelo ou estrutura. | É uma instância da classe. |
| Define atributos e métodos. | Possui valores próprios para seus atributos de instância. |
| Pode ser utilizada para criar vários objetos. | Representa uma entidade específica. |
| Exemplo: `Aluno`. | Exemplo: `aluno1`, `aluno2`. |

Representação:

```text
                  CLASSE ALUNO
                       |
              Define a estrutura
                       |
          +------------+------------+
          |            |            |
       OBJETO 1     OBJETO 2     OBJETO 3
          |            |            |
        Kennedy       Maria        João
        Idade: 22     Idade: 20    Idade: 21
        Nota: 8.5     Nota: 9.0    Nota: 7.5
```

---

## 4. Instanciação de Objetos

Instanciar significa criar uma instância de uma classe.

Em Java, utilizamos o operador `new` para criar um objeto.

### 4.1. Sintaxe

```java
NomeDaClasse nomeDoObjeto = new NomeDaClasse();
```

Exemplo:

```java
Aluno aluno1 = new Aluno();
```

Podemos dividir essa instrução em três partes:

**1. Declaração da variável de referência**

```java
Aluno aluno1;
```

Declaramos uma variável chamada `aluno1`, cujo tipo é `Aluno`.

Ela poderá armazenar uma referência para um objeto dessa classe.

**2. Criação do objeto**

```java
new Aluno();
```

O operador `new` cria uma nova instância da classe `Aluno`.

Durante esse processo, a JVM aloca memória para o objeto e executa seu construtor.

**3. Atribuição da referência**

```java
aluno1 = new Aluno();
```

A referência retornada pela criação do objeto é atribuída à variável `aluno1`.

As três operações podem ser realizadas em uma única instrução:

```java
Aluno aluno1 = new Aluno();
```

---

## 5. Acessando Atributos e Métodos

Após criar um objeto, podemos acessar seus atributos e métodos utilizando o operador ponto (`.`), desde que estejam acessíveis.

### 5.1. Acessando atributos

```java
aluno1.nome = "Kennedy";
aluno1.idade = 22;
aluno1.nota = 8.5;
```

Nesse exemplo, estamos atribuindo valores aos atributos do objeto `aluno1`.

### 5.2. Acessando métodos

```java
aluno1.apresentarDados();
```

Nesse caso, estamos executando o método `apresentarDados()` do objeto.

### 5.3. Exemplo completo

**Aluno.java**

```java
public class Aluno {

    String nome;
    int idade;
    double nota;

    void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

}
```

**Main.java**

```java
public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Kennedy";
        aluno1.idade = 22;
        aluno1.nota = 8.5;

        aluno1.apresentarDados();

    }

}
```

Saída:

```text
Nome: Kennedy
Idade: 22
Nota: 8.5
```

---

## 6. Estado e Comportamento dos Objetos

Todo objeto possui características e comportamentos definidos pela classe.

Esses elementos podem ser compreendidos por meio de dois conceitos:

### Estado

Representa a situação atual de um objeto, determinada pelos valores de seus atributos.

Exemplo:

```java
Aluno aluno1 = new Aluno();

aluno1.nome = "Kennedy";
aluno1.idade = 22;
aluno1.nota = 8.5;
```

O estado desse objeto é representado pelas informações armazenadas em seus atributos.

### Comportamento

Representa as ações que um objeto pode executar por meio de seus métodos.

Exemplo:

```java
aluno1.apresentarDados();
```

Nesse caso, o comportamento do objeto é apresentar suas informações.

**Resumindo:**

- Estado: o que o objeto possui ou como está.
- Comportamento: o que o objeto consegue fazer.

---

## 7. Múltiplos Objetos de uma Mesma Classe

Uma classe pode ser utilizada para criar várias instâncias.

Cada objeto possui seus próprios valores para os atributos de instância, mas compartilha a definição dos atributos e métodos estabelecida pela classe.

Exemplo:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();

aluno1.nome = "Kennedy";
aluno2.nome = "Maria";
```

Modificar o nome de `aluno1` não altera o nome de `aluno2`, pois são objetos diferentes.

Isso acontece porque cada instância possui seu próprio estado.

---

## 8. Referências de Objetos

Em Java, variáveis de tipos não primitivos, como `Aluno`, armazenam referências que permitem acessar os objetos.

Observe:

```java
Aluno aluno1 = new Aluno();

aluno1.nome = "Kennedy";

Aluno aluno2 = aluno1;
```

Nesse exemplo, `aluno2` não cria um novo objeto.

Ele recebe a mesma referência armazenada em `aluno1`.

Representação:

```text
STACK                         HEAP

aluno1 --------+
               |
               +-----------> Objeto Aluno
               |              nome: Kennedy
aluno2 --------+
```

Isso significa que as duas variáveis acessam a mesma instância.

Portanto:

```java
aluno2.nome = "Maria";

System.out.println(aluno1.nome);
```

Saída:

```text
Maria
```

A alteração realizada por `aluno2` também pode ser observada por `aluno1`, pois ambas as variáveis fazem referência ao mesmo objeto.

### 8.1. Criando referências independentes

Para criar objetos diferentes, precisamos utilizar novamente o operador `new`.

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
```

Agora, cada variável referencia uma instância independente.

---

## 9. Comparação de Objetos

Em Java, podemos utilizar o operador `==` para comparar referências de objetos.

Quando utilizado com referências, ele verifica se ambas apontam para a mesma instância.

Exemplo:

```java
Aluno aluno1 = new Aluno();

Aluno aluno2 = aluno1;

Aluno aluno3 = new Aluno();

System.out.println(aluno1 == aluno2);
System.out.println(aluno1 == aluno3);
```

Saída:

```text
true
false
```

Explicação:

- `aluno1 == aluno2`: verdadeiro, pois ambas apontam para o mesmo objeto.
- `aluno1 == aluno3`: falso, pois representam objetos diferentes.

**Importante:** o operador `==` não compara automaticamente o conteúdo dos atributos dos objetos.

Para comparar conteúdos, normalmente utilizamos o método `equals()`, desde que ele esteja implementado adequadamente para essa finalidade.

---

## 10. Memória e Objetos na JVM

Quando um objeto é criado utilizando `new`, a JVM realiza a alocação de memória necessária para sua instância.

Para compreender esse funcionamento, precisamos conhecer duas regiões importantes da memória:

### Heap

É a região de memória utilizada para armazenar os objetos criados durante a execução da aplicação.

### Stack

É utilizada para organizar as execuções dos métodos, incluindo seus frames, variáveis locais e referências locais.

Exemplo:

```java
public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

    }

}
```

Representação conceitual:

```text
STACK                         HEAP

main()                        Objeto Aluno
  |                             |
  |                             +-- nome: null
  +-- aluno1 -----------------> +-- idade: 0
                                +-- nota: 0.0
```

Os atributos de instância recebem valores padrão quando o objeto é criado.

| Tipo | Valor padrão |
|---|---|
| `byte` | `0` |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0f` |
| `double` | `0.0` |
| `char` | `\u0000` |
| `boolean` | `false` |
| Tipos de referência | `null` |

**Atenção:** variáveis locais não recebem valores padrão automaticamente. Elas precisam ser inicializadas antes de serem utilizadas.

---

## 11. Resumo dos Conceitos

| Conceito | Definição |
|---|---|
| Classe | Estrutura que define atributos e métodos. |
| Objeto | Instância criada a partir de uma classe. |
| Atributo | Representa uma característica ou propriedade. |
| Método | Representa um comportamento ou ação. |
| Instanciação | Processo de criação de um objeto. |
| `new` | Operador utilizado para criar objetos. |
| Referência | Permite acessar um objeto. |
| Estado | Valores atuais dos atributos de um objeto. |
| Comportamento | Ações que um objeto pode executar. |
| Heap | Região utilizada para alocação de objetos. |
| Stack | Região utilizada para organizar as execuções dos métodos. |
| `.` | Operador de acesso aos membros de um objeto. |
| `==` | Compara referências para verificar se apontam para a mesma instância. |

---