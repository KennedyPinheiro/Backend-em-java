# Atividade 2 — Calculadora de Notas

## Objetivo

Praticar conceitos fundamentais da linguagem Java, incluindo arrays, listas, laços de repetição, métodos, condicionais e Programação Orientada a Objetos (POO).

## Enunciado

Crie um programa que receba cinco notas de um aluno, armazene os valores e calcule sua média final. Ao término, o programa deverá exibir as notas cadastradas, a média calculada e a situação do aluno.

### Requisitos propostos

1. Armazenar cinco notas em um array `double[]`.
2. Utilizar um laço de repetição para receber as notas.
3. Criar um método `calcularMedia(double[] notas)` que retorne a média.
4. Criar um método `foiAprovado(double media)` que retorne `true` quando a média for maior ou igual a `7.0`.
5. Exibir as notas, a média e a situação do aluno.

### Desafio extra

Implementar métodos para identificar a maior e a menor nota cadastrada.

---

## Resolução desenvolvida

Durante a implementação, a proposta foi adaptada para praticar conceitos de Programação Orientada a Objetos.

Em vez de armazenar diretamente os valores em um array de `double`, foi utilizada uma estrutura baseada em objetos da classe `Nota` e em uma lista dinâmica `ArrayList<Nota>`.

Essa abordagem permite trabalhar com encapsulamento, construtores, atributos privados, métodos de acesso e separação de responsabilidades.

### Estrutura do projeto

```text
src/
├── Main.java
├── Nota.java
└── GerenciadorNotas.java