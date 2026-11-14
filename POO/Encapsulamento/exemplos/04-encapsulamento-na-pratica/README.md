# Exemplo 04 — Encapsulamento na Prática

## Objetivo

Aplicar os principais conceitos de encapsulamento em Java por meio de uma classe `Aluno`.

O programa permite cadastrar um aluno, adicionar notas, calcular sua média e verificar sua situação acadêmica.

## Estrutura

```text
04-encapsulamento-na-pratica/
├── README.md
├── Aluno.java
└── Main.java
```

## Conceitos praticados

### 1. Atributos privados

Os atributos `nome` e `notas` são privados, impedindo alterações diretas de outras classes.

### 2. Construtor

O construtor recebe o nome do aluno, valida a informação e inicializa a lista de notas.

### 3. Getters

O método `getNome()` permite consultar o nome do aluno sem disponibilizar acesso direto ao atributo.

### 4. Validação de notas

O método `adicionarNota()` permite adicionar somente notas entre 0 e 10.

Caso uma nota esteja fora desse intervalo, ela não será adicionada.

### 5. Cálculo da média

O método `calcularMedia()` percorre a lista de notas, soma os valores e divide pela quantidade de notas cadastradas.

Caso não existam notas, retorna zero.

### 6. Verificação de aprovação

O método `estaAprovado()` verifica se a média do aluno é maior ou igual a 7.

### 7. Exibição de informações

O método `exibirInformacoes()` apresenta o nome, as notas, a média e a situação acadêmica do aluno.

## Execução

Compile os arquivos:

```bash
javac Aluno.java Main.java
```

Execute:

```bash
java Main
```

## Aprendizado

Este exemplo demonstra como utilizar o encapsulamento para proteger os dados de um objeto e controlar as operações realizadas sobre eles.

Em vez de permitir alterações diretas nas notas, a classe `Aluno` disponibiliza métodos específicos que verificam as regras antes de modificar seu estado.

**Conclusão:** o encapsulamento permite construir classes mais seguras, organizadas e responsáveis por controlar seus próprios dados.