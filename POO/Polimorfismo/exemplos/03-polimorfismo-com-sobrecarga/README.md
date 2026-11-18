# Exemplo 03 — Polimorfismo com Sobrecarga de Métodos

## Objetivo

Compreender o funcionamento da sobrecarga de métodos (*Method Overloading*) em Java, aprendendo a criar métodos com o mesmo nome, mas com diferentes parâmetros.

## Conceito

A sobrecarga permite definir vários métodos com o mesmo nome dentro de uma classe, desde que suas listas de parâmetros sejam diferentes.

As diferenças podem estar em:

- Quantidade de parâmetros;
- Tipos dos parâmetros;
- Ordem dos tipos dos parâmetros.

O Java identifica qual método deve executar com base nos argumentos informados durante a chamada.

Esse processo acontece em tempo de compilação, sendo conhecido como **polimorfismo estático**.

## Estrutura

```text
03-polimorfismo-com-sobrecarga/
├── README.md
├── Calculadora.java
└── Main.java
```

## Implementação

A classe `Calculadora` possui quatro versões do método `somar`:

| Método | Descrição |
|---|---|
| `somar(int, int)` | Soma dois números inteiros. |
| `somar(double, double)` | Soma dois números decimais. |
| `somar(int, int, int)` | Soma três números inteiros. |
| `somar(double, int)` | Soma um número decimal com um inteiro. |

A classe `Main` realiza chamadas diferentes para demonstrar como o Java seleciona automaticamente a versão adequada do método.

## Regra importante

Não é possível sobrecarregar métodos alterando somente o tipo de retorno.

A assinatura dos métodos precisa apresentar diferenças nos parâmetros.

## Sobrecarga x Sobrescrita

| Sobrecarga (Overload) | Sobrescrita (Override) |
|---|---|
| Mesmo nome, parâmetros diferentes. | Método herdado redefinido na subclasse. |
| Pode acontecer na mesma classe. | Depende de herança. |
| Resolução em tempo de compilação. | Despacho dinâmico em tempo de execução. |
| Não exige `@Override`. | Utiliza `@Override` como boa prática. |

## Compilação e execução

```bash
javac Calculadora.java Main.java
java Main
```

## Resultado esperado

```text
Soma de dois inteiros: 30
Soma de dois decimais: 31.0
Soma de três inteiros: 60
Soma de decimal com inteiro: 15.5
```

## Aprendizados

Ao concluir este exemplo, você terá praticado:

- Sobrecarga de métodos;
- Diferenças entre parâmetros;
- Retorno de métodos;
- Resolução de métodos pelo compilador;
- Polimorfismo estático.