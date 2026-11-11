# 01. Classes e Objetos

## 1. O que é uma classe?

Uma classe é uma estrutura que define as características (atributos) e os comportamentos (métodos) que seus objetos poderão possuir.

Ela funciona como um modelo para a criação de objetos.

Por exemplo, em um sistema escolar, podemos criar uma classe `Aluno` que define informações como nome, idade e matrícula, além de comportamentos como apresentar dados e verificar aprovação.

Em Java, declaramos uma classe utilizando a palavra-chave `class`.

**Sintaxe:**

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

- `Aluno`: nome da classe.
- `nome`, `idade` e `nota`: atributos.
- `apresentarDados()`: método.

A classe define a estrutura, mas ainda não representa um aluno específico.

---

## 2. O que é um objeto?

Um objeto é uma instância de uma classe.

Isso significa que, a partir de uma classe, podemos criar diferentes objetos, cada um com seus próprios valores para os atributos de instância.

Por exemplo, utilizando a classe `Aluno`, podemos criar dois alunos diferentes:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
```

Embora os dois objetos tenham sido criados a partir da mesma classe, cada um pode armazenar informações diferentes.

Exemplo:

```java
aluno1.nome = "Kennedy";
aluno1.idade = 22;
aluno1.nota = 8.5;

aluno2.nome = "Maria";
aluno2.idade = 20;
aluno2.nota = 9.0;
```

Nesse caso:

- `aluno1` representa um objeto da classe `Aluno`.
- `aluno2` representa outro objeto da mesma classe.
- Ambos possuem os mesmos atributos e métodos disponíveis.
- Cada objeto possui seus próprios valores de atributos de instância.

---

## 3. Instanciação de objetos

Instanciar significa criar uma instância de uma classe.

Em Java, utilizamos o operador `new` para criar objetos.

**Sintaxe:**

```java
NomeDaClasse nomeDoObjeto = new NomeDaClasse();
```

Exemplo:

```java
Aluno aluno1 = new Aluno();
```

Podemos compreender essa instrução dividindo-a em três partes:

**1. Declaração da referência**

```java
Aluno aluno1;
```

Declaramos uma variável chamada `aluno1`, cujo tipo é `Aluno`.

Essa variável pode armazenar uma referência para um objeto dessa classe.

**2. Criação do objeto**

```java
new Aluno();
```

O operador `new` cria uma nova instância da classe `Aluno`, inicializando seus atributos e executando seu construtor.

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

## 4. Acessando atributos e métodos

Depois de criar um objeto, podemos acessar seus atributos e métodos utilizando o operador ponto (`.`).

**Acessando atributos:**

```java
aluno1.nome = "Kennedy";
aluno1.idade = 22;
```

**Acessando métodos:**

```java
aluno1.apresentarDados();
```

O operador ponto permite acessar os membros disponíveis de um objeto, respeitando os modificadores de acesso definidos na classe.

Exemplo completo:

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

## 5. Diferentes objetos da mesma classe

Uma classe pode ser utilizada para criar quantos objetos forem necessários.

Cada objeto possui seu próprio estado, representado pelos valores de seus atributos de instância.

Exemplo:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
Aluno aluno3 = new Aluno();
```

Os três objetos possuem a mesma estrutura, mas podem representar alunos completamente diferentes.

Podemos visualizar essa relação:

```text
                 CLASSE ALUNO
                      |
          Define atributos e métodos
                      |
          +-----------+-----------+
          |           |           |
       ALUNO 1     ALUNO 2     ALUNO 3
          |           |           |
       Kennedy      Maria       João
       Idade: 22    Idade: 20   Idade: 21
       Nota: 8.5    Nota: 9.0   Nota: 7.5
```

Alterar um atributo de um objeto não altera automaticamente o atributo correspondente dos outros objetos.

Isso acontece porque cada instância possui seu próprio estado.

---

## 6. Objetos e memória

Quando criamos um objeto utilizando `new`, a JVM reserva memória para armazenar a instância.

De maneira simplificada, podemos compreender o funcionamento através de duas partes:

- **Heap:** região de memória onde os objetos são alocados.
- **Stack:** região utilizada pelas execuções dos métodos, incluindo variáveis locais e referências locais.

Exemplo:

```java
Aluno aluno1 = new Aluno();
```

Podemos representar conceitualmente:

```text
STACK                         HEAP

aluno1 --------------------> Objeto Aluno
                              nome: null
                              idade: 0
                              nota: 0.0
```

Os valores apresentados são os valores padrão dos atributos de instância.

Em Java:

| Tipo | Valor padrão |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `float` | `0.0f` |
| `boolean` | `false` |
| `char` | `\u0000` |
| Tipos de referência | `null` |

**Observação:** esses valores padrão são aplicados aos atributos de instância e atributos estáticos. Variáveis locais não recebem valores padrão automaticamente e precisam ser inicializadas antes de serem utilizadas.

---

## 7. Referências de objetos

Em Java, uma variável de tipo referência não armazena diretamente o objeto. Ela armazena uma referência que permite acessar aquela instância.

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

Isso significa que as duas variáveis apontam para o mesmo objeto.

Portanto:

```java
aluno2.nome = "Maria";

System.out.println(aluno1.nome);
```

Saída:

```text
Maria
```

Isso acontece porque não existem dois objetos diferentes. Existem duas referências para a mesma instância.

Para criar outro objeto independente, precisamos utilizar novamente `new`:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
```

---

## 8. Comparação entre referências

O operador `==`, quando utilizado com referências de objetos, verifica se as duas referências apontam para a mesma instância.

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

- `aluno1 == aluno2`: verdadeiro, pois ambos apontam para o mesmo objeto.
- `aluno1 == aluno3`: falso, pois representam instâncias diferentes.

**Importante:** para comparar o conteúdo de objetos, normalmente utilizamos o método `equals()`, quando ele está implementado adequadamente para essa comparação.

---

## 9. Resumo

| Conceito | Definição |
|---|---|
| Classe | Estrutura que define atributos e métodos. |
| Objeto | Instância criada a partir de uma classe. |
| Atributo | Variável que representa uma característica do objeto. |
| Método | Bloco de código que representa um comportamento. |
| Instanciação | Processo de criação de um objeto. |
| `new` | Operador utilizado para criar instâncias. |
| Referência | Valor utilizado para acessar um objeto. |
| Heap | Região de memória utilizada para alocação de objetos. |
| Stack | Região utilizada pelas execuções dos métodos. |
| Operador `.` | Utilizado para acessar membros de um objeto. |
