# 09 - Referência da superclasse apontando para subclasses

## Objetivo

Compreender como referências de uma superclasse podem armazenar objetos de diferentes subclasses, explorando o tipo da referência, o tipo real do objeto, o operador `instanceof` e o casting.

## Conceito

Na herança, uma variável declarada com o tipo de uma superclasse pode receber objetos de suas subclasses.

Exemplo:

```java
Funcionario funcionario = new Gerente(
    "Carlos",
    7500,
    "Tecnologia"
);
```

Nesse caso:

- Tipo da referência: `Funcionario`;
- Tipo real do objeto: `Gerente`.

Essa característica permite trabalhar com diferentes tipos de objetos utilizando uma referência comum.

## Tipo da referência e tipo real do objeto

O tipo da referência determina quais membros podem ser acessados diretamente durante a compilação.

O tipo real do objeto determina qual implementação sobrescrita será executada em tempo de execução.

Por exemplo:

```java
Funcionario funcionario = new Gerente(
    "Carlos",
    7500,
    "Tecnologia"
);

funcionario.trabalhar();
```

Embora a referência seja `Funcionario`, o método executado será o sobrescrito em `Gerente`.

## instanceof

O operador `instanceof` verifica se um objeto é compatível com determinado tipo.

Exemplo:

```java
if (funcionario instanceof Gerente) {
    System.out.println("O funcionário é um gerente.");
}
```

É útil para verificar o tipo real de um objeto antes de realizar determinadas operações.

## Casting

O casting permite converter uma referência de um tipo mais geral para um tipo mais específico.

Exemplo:

```java
Gerente gerente = (Gerente) funcionario;
```

Depois da conversão, podemos acessar os métodos específicos da classe `Gerente`.

O casting deve ser utilizado com cuidado, pois uma conversão incompatível pode gerar `ClassCastException`.

## Estrutura

```text
09-referencias-e-subclasses/
├── README.md
├── Funcionario.java
├── Gerente.java
├── Desenvolvedor.java
└── Main.java
```

## Executando

Compile:

```bash
javac Funcionario.java Gerente.java Desenvolvedor.java Main.java
```

Execute:

```bash
java Main
```

## Conceitos praticados

- Herança;
- Polimorfismo;
- Referência da superclasse;
- Tipo real do objeto;
- Sobrescrita de métodos;
- Operador `instanceof`;
- Casting;
- `ClassCastException`;
- Acesso a métodos específicos das subclasses.

## Conclusão

Uma referência de superclasse pode armazenar objetos de diferentes subclasses.

Essa característica permite desenvolver aplicações mais flexíveis, utilizando o polimorfismo e mantendo uma estrutura organizada.

Compreender a diferença entre o tipo da referência e o tipo real do objeto é fundamental para trabalhar corretamente com herança em Java.