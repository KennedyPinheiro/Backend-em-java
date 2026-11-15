# 07 - Modificadores de acesso na herança

## Objetivo

Compreender como os modificadores de acesso `public`, `protected`, `private` e o acesso padrão funcionam em uma relação de herança no Java.

## Conceito

Os modificadores de acesso determinam onde atributos, métodos e classes podem ser acessados.

Na herança, eles definem quais membros da superclasse podem ser utilizados diretamente pelas subclasses.

## Modificadores de acesso

### 1. public

Permite acesso de qualquer classe, independentemente do pacote.

### 2. protected

Permite acesso:

- Dentro da própria classe;
- Por outras classes do mesmo pacote;
- Por subclasses, inclusive em outros pacotes, respeitando as regras de acesso da linguagem.

### 3. private

Permite acesso somente dentro da própria classe.

Uma subclasse não pode acessar diretamente um atributo privado da superclasse.

Entretanto, pode utilizar métodos públicos ou protegidos disponibilizados pela superclasse para trabalhar com esses dados.

### 4. Acesso padrão (package-private)

Quando nenhum modificador é declarado, o membro fica acessível apenas dentro do mesmo pacote.

## Estrutura

```text
07-modificadores-de-acesso/
├── README.md
├── Pessoa.java
├── Funcionario.java
└── Main.java
```

## Funcionamento

A classe `Pessoa` possui três atributos:

- `nome`, declarado como `public`;
- `idade`, declarado como `protected`;
- `cpf`, declarado como `private`.

A classe `Funcionario` herda de `Pessoa` e demonstra como acessar os membros herdados.

O atributo `cpf` não pode ser acessado diretamente pela subclasse. Para obter seu valor, utilizamos o método público `getCpf()`.

## Executando

Compile os arquivos:

```bash
javac Pessoa.java Funcionario.java Main.java
```

Execute:

```bash
java Main
```

## Conceitos praticados

- Modificadores de acesso;
- Herança com `extends`;
- Acesso a atributos herdados;
- Diferença entre `public`, `protected` e `private`;
- Encapsulamento;
- Utilização de getters;
- Restrições de acesso entre pacotes.

## Conclusão

Os modificadores de acesso são fundamentais para controlar a visibilidade dos membros de uma classe.

Na herança, o `protected` permite que subclasses utilizem membros herdados sem tornar esses membros públicos para toda a aplicação.

O `private`, por sua vez, preserva o encapsulamento, permitindo que a própria classe controle como seus dados serão acessados.