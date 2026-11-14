# Exemplo 03 — Validação de Dados

## Objetivo

Demonstrar como aplicar encapsulamento e validação de dados em Java, protegendo os atributos de uma classe e impedindo operações que violem suas regras.

Neste exemplo, foi desenvolvida uma classe `ContaBancaria` com operações de depósito e saque.

## Estrutura

```text
03-validacao-de-dados/
├── README.md
├── ContaBancaria.java
└── Main.java
```

## Conceitos praticados

### 1. Atributos privados

Os atributos `titular` e `saldo` foram declarados como `private`, impedindo o acesso direto de outras classes.

```java
private String titular;
private double saldo;
```

### 2. Validação no construtor

O construtor verifica se o titular foi informado e se o saldo inicial não é negativo.

Caso os dados sejam inválidos, é lançada uma exceção `IllegalArgumentException`.

### 3. Getters

Os métodos `getTitular()` e `getSaldo()` permitem consultar os dados sem permitir alterações diretas.

### 4. Validação de depósitos

O método `depositar()` verifica se o valor informado é maior que zero antes de modificar o saldo.

### 5. Validação de saques

O método `sacar()` verifica duas condições:

- O valor precisa ser maior que zero.
- O valor não pode ultrapassar o saldo disponível.

### 6. Retorno boolean

Os métodos `depositar()` e `sacar()` retornam:

- `true`: operação realizada com sucesso.
- `false`: operação recusada.

## Execução

Compile os arquivos:

```bash
javac ContaBancaria.java Main.java
```

Execute:

```bash
java Main
```

## Resultado esperado

O programa deve demonstrar:

- Criação de uma conta bancária.
- Consulta do titular e do saldo.
- Realização de um depósito.
- Realização de um saque.
- Recusa de um saque com saldo insuficiente.
- Preservação do saldo quando uma operação é inválida.

## Aprendizado

O encapsulamento não serve apenas para esconder atributos. Ele também permite controlar as operações que modificam o estado de um objeto.

Em vez de permitir que qualquer parte do programa altere o saldo diretamente, a classe `ContaBancaria` disponibiliza operações específicas, respeitando as regras estabelecidas.

**Conclusão:** uma classe bem encapsulada protege seus dados e garante que suas operações respeitem as regras de negócio.