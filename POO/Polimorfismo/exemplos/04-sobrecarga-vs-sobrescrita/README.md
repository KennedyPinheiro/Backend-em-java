# Exemplo 04 — Diferença entre Sobrecarga e Sobrescrita

## Objetivo

Compreender as diferenças entre sobrecarga (*Method Overloading*) e sobrescrita (*Method Overriding*), identificando como cada mecanismo funciona no Java.

## Conceitos

### 1. Sobrecarga (Overload)

A sobrecarga permite criar métodos com o mesmo nome dentro de uma classe, mas com diferentes listas de parâmetros.

As diferenças podem ocorrer na quantidade, nos tipos ou na ordem dos parâmetros.

A escolha do método acontece durante a compilação, sendo considerada uma forma de polimorfismo estático.

### 2. Sobrescrita (Override)

A sobrescrita permite que uma subclasse redefina um método herdado da superclasse.

O método sobrescrito mantém o mesmo nome e a mesma assinatura de parâmetros, apresentando um comportamento específico na subclasse.

A implementação executada é determinada pelo tipo real do objeto durante a execução do programa.

A anotação `@Override` indica que o método está sobrescrevendo um método herdado e permite ao compilador verificar essa intenção.

## Estrutura

```text
04-sobrecarga-vs-sobrescrita/
├── README.md
├── Funcionario.java
├── Gerente.java
└── Main.java
```

## Implementação

A classe `Funcionario` apresenta duas versões do método `calcularBonus()`:

- `calcularBonus()`: calcula um bônus padrão de 5%.
- `calcularBonus(double percentual)`: calcula um bônus utilizando um percentual informado.

A classe `Gerente` herda de `Funcionario` e sobrescreve `calcularBonus()`, definindo um bônus de 20%.

A classe `Main` demonstra os dois mecanismos e utiliza uma referência da superclasse para acessar um objeto da subclasse.

## Comparação

| Característica | Sobrecarga | Sobrescrita |
|---|---|---|
| Nome | Igual | Igual |
| Parâmetros | Diferentes | Mesmos parâmetros |
| Herança | Não obrigatória | Necessária |
| Resolução | Tempo de compilação | Tempo de execução |
| Objetivo | Oferecer diferentes formas de executar uma operação | Especializar um comportamento herdado |

## Compilação e execução

```bash
javac Funcionario.java Gerente.java Main.java
java Main
```

## Aprendizados

Ao concluir este exemplo, você terá praticado:

- Diferenças entre Overload e Override;
- Sobrecarga de métodos;
- Sobrescrita com `@Override`;
- Herança;
- Referências da superclasse;
- Polimorfismo estático e dinâmico.