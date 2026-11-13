# Encapsulamento em Java

## 1. O que é encapsulamento?

Encapsulamento é um dos quatro pilares da Programação Orientada a Objetos (POO).

Seu objetivo é proteger os dados de um objeto, controlando como seus atributos podem ser acessados e modificados.

Em Java, isso é feito principalmente por meio dos modificadores de acesso, como `private`, `public` e `protected`, além de métodos que permitem interagir com os atributos de maneira controlada.

O encapsulamento ajuda a evitar alterações indevidas e mantém a integridade dos dados de um objeto.

### Exemplo sem encapsulamento

```java
public class Pessoa {

    String nome;
    int idade;

}
```

Nesse exemplo, os atributos não possuem um modificador de acesso explícito. Como estão no mesmo pacote, outras classes podem acessá-los diretamente.

```java
Pessoa pessoa = new Pessoa();

pessoa.nome = "Kennedy";
pessoa.idade = -500;
```

O problema é que não existe nenhuma validação impedindo uma idade negativa.

---

## 2. Modificadores de acesso

Os modificadores de acesso definem onde atributos, métodos e outros membros de uma classe podem ser acessados.

Java possui quatro níveis de acesso:

| Modificador | Mesma classe | Mesmo pacote | Subclasse em outro pacote | Qualquer classe |
|---|---|---|---|---|
| `private` | Sim | Não | Não | Não |
| Sem modificador (*package-private*) | Sim | Sim | Não | Não |
| `protected` | Sim | Sim | Sim, pelas regras de herança | Não |
| `public` | Sim | Sim | Sim | Sim |

### 2.1. `private`

Restringe o acesso ao membro à própria classe.

```java
public class Pessoa {

    private String nome;
    private int idade;

}
```

Outras classes não conseguem acessar diretamente esses atributos.

### 2.2. `public`

Permite que o membro seja acessado por outras classes, respeitando as demais regras de acesso.

```java
public class Pessoa {

    public String nome;

}
```

### 2.3. `protected`

Permite acesso dentro do mesmo pacote e também por subclasses, mesmo quando estão em pacotes diferentes, respeitando as regras específicas de herança.

```java
public class Pessoa {

    protected String nome;

}
```

### 2.4. Sem modificador de acesso

Quando nenhum modificador é declarado, o acesso fica restrito ao mesmo pacote.

Esse comportamento é conhecido como *package-private*.

```java
public class Pessoa {

    String nome;

}
```

---

## 3. Atributos privados

Uma das práticas mais comuns do encapsulamento é declarar os atributos de uma classe como `private`.

Exemplo:

```java
public class Pessoa {

    private String nome;
    private int idade;

}
```

Dessa maneira, outras classes não podem modificar diretamente esses atributos.

Isso permite que a própria classe controle como seus dados serão consultados e alterados.

---

## 4. Getters

Getters são métodos utilizados para consultar ou retornar os valores dos atributos privados.

Normalmente, utilizam o prefixo `get`, seguido do nome do atributo.

Exemplo:

```java
public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

}
```

Utilização:

```java
Pessoa pessoa = new Pessoa();

System.out.println(pessoa.getNome());
```

O método `getNome()` permite consultar o atributo privado `nome` sem acessá-lo diretamente.

### Características

- Geralmente possuem o prefixo `get`.
- Retornam o valor de um atributo.
- Normalmente não recebem parâmetros.
- Podem conter lógica adicional antes de retornar um valor.

---

## 5. Setters

Setters são métodos utilizados para modificar os valores dos atributos privados.

Normalmente, utilizam o prefixo `set`, seguido do nome do atributo.

Exemplo:

```java
public class Pessoa {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

Utilização:

```java
Pessoa pessoa = new Pessoa();

pessoa.setNome("Kennedy");
```

O método `setNome()` permite modificar o atributo privado `nome` de maneira controlada.

### Características

- Geralmente possuem o prefixo `set`.
- Normalmente recebem um parâmetro.
- Geralmente possuem retorno `void`.
- Podem validar os valores antes de modificar os atributos.

---

## 6. Validação de dados

Uma das grandes vantagens do encapsulamento é permitir a validação dos dados antes de modificar o estado de um objeto.

Exemplo:

```java
public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
```

Agora, uma idade negativa não será atribuída ao objeto.

Utilização:

```java
Pessoa pessoa = new Pessoa();

pessoa.setNome("Kennedy");
pessoa.setIdade(22);

pessoa.setIdade(-500);

System.out.println(pessoa.getNome());
System.out.println(pessoa.getIdade());
```

O valor inválido será ignorado e a idade permanecerá com o último valor válido.

**Importante:** o comportamento de uma validação depende da implementação. Podemos ignorar valores inválidos, lançar exceções ou retornar resultados indicando sucesso ou falha.

---

## 7. Encapsulamento com construtores

