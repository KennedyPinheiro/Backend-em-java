# 01 - Introdução ao polimorfismo

## Objetivo

Compreender o conceito de polimorfismo na programação orientada a objetos, utilizando herança e sobrescrita de métodos para permitir que diferentes classes apresentem comportamentos distintos por meio de uma mesma operação.

## Conceito

Polimorfismo significa "muitas formas".

Em Java, permite que objetos de diferentes subclasses sejam tratados por meio de uma referência da superclasse, executando comportamentos específicos de acordo com o tipo real do objeto.

## Funcionamento

Neste exemplo, foi desenvolvido um pequeno sistema de pagamentos com três formas de pagamento:

- `PagamentoPix`;
- `PagamentoCartao`;
- `PagamentoBoleto`.

Todas herdam da classe `Pagamento` e sobrescrevem o método `realizarPagamento()`.

Cada classe apresenta uma implementação diferente desse método.

## Referência da superclasse

Uma característica importante do polimorfismo é permitir que uma referência da superclasse armazene objetos de suas subclasses.

Exemplo:

```java
Pagamento pagamento = new PagamentoPix(150.00);
```

Nesse caso:

- Tipo da referência: `Pagamento`;
- Tipo real do objeto: `PagamentoPix`.

Mesmo utilizando uma referência do tipo `Pagamento`, o Java executa a implementação de `realizarPagamento()` definida em `PagamentoPix`.

## Estrutura

```text
01-introducao-polimorfismo/
├── README.md
├── Pagamento.java
├── PagamentoPix.java
├── PagamentoCartao.java
├── PagamentoBoleto.java
└── Main.java
```

## Executando

Compile os arquivos:

```bash
javac Pagamento.java PagamentoPix.java PagamentoCartao.java PagamentoBoleto.java Main.java
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
- Referência da superclasse;
- Tipo real do objeto;
- Despacho dinâmico de métodos.

## Conclusão

O polimorfismo permite que diferentes classes executem comportamentos específicos utilizando uma mesma operação.

Essa característica facilita a reutilização de código, reduz a necessidade de verificações condicionais e torna as aplicações mais flexíveis e extensíveis.