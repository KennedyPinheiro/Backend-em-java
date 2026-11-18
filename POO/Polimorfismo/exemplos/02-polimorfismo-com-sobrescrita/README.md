# 02 - Polimorfismo com sobrescrita de métodos

## Objetivo

Compreender como a sobrescrita de métodos permite que diferentes subclasses forneçam implementações próprias para um método herdado, possibilitando o comportamento polimórfico.

## Conceito

A sobrescrita de métodos ocorre quando uma subclasse redefine um método herdado da superclasse, mantendo sua assinatura compatível.

Em Java, utilizamos a anotação `@Override` para indicar explicitamente que estamos sobrescrevendo um método.

## Funcionamento

Neste exemplo, foi desenvolvido um sistema de cálculo de bônus para funcionários.

A classe `Funcionario` define o método `calcularBonus()`, que representa o comportamento padrão.

As subclasses implementam regras específicas:

- `Funcionario`: bônus de 5%;
- `Gerente`: bônus de 20%;
- `Desenvolvedor`: bônus de 10%.

Todas utilizam o mesmo método, mas apresentam resultados diferentes.

## Estrutura

```text
02-polimorfismo-com-sobrescrita/
├── README.md
├── Funcionario.java
├── Gerente.java
├── Desenvolvedor.java
└── Main.java
```

## Anotação @Override

A anotação `@Override` indica que um método está sobrescrevendo uma implementação herdada.

Além de documentar a intenção do desenvolvedor, permite que o compilador identifique erros na assinatura do método.

## Despacho dinâmico de métodos

Quando um método sobrescrito é chamado, o Java identifica o tipo real do objeto e executa a implementação correspondente.

Exemplo:

```java
Funcionario gerente = new Gerente("Ana", 7000);

gerente.calcularBonus();
```

Embora a referência seja do tipo `Funcionario`, a implementação executada pertence à classe `Gerente`.

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

- Polimorfismo;
- Herança;
- Sobrescrita de métodos;
- Anotação `@Override`;
- Despacho dinâmico de métodos;
- Referência da superclasse;
- Reutilização de código.

## Conclusão

A sobrescrita de métodos permite que subclasses especializem comportamentos herdados.

Com o polimorfismo, diferentes objetos podem utilizar uma mesma operação, executando implementações específicas de acordo com seus tipos reais.