# Aula 08 — Matrizes em Java

Vamos para a próxima aula! Hoje você vai aprender a trabalhar com **matrizes**, uma estrutura que permite organizar dados em linhas e colunas.

Na aula anterior, você aprendeu a utilizar arrays para armazenar vários valores em uma única variável. Agora vamos avançar um pouco e aprender como armazenar dados em duas dimensões.

Esse conceito será útil para trabalhar com tabelas, notas de alunos, mapas, grades e outras estruturas de dados.

**Conteúdo desta aula:**
1. O que são matrizes.
2. Como declarar e inicializar matrizes.
3. Como acessar e modificar elementos.
4. Como descobrir a quantidade de linhas e colunas.
5. Como percorrer matrizes com `for`.
6. Como receber dados com `Scanner`.
7. Como combinar matrizes com métodos.
8. Exercício prático.

---

## 1. O que é uma matriz?

Na aula anterior, criamos um array de notas:

```java
double[] notas = {8.0, 7.0, 9.0, 6.0};
```

Podemos imaginar esses valores organizados em uma única linha:

| Índice | 0 | 1 | 2 | 3 |
|---|---:|---:|---:|---:|
| Nota | 8.0 | 7.0 | 9.0 | 6.0 |

Agora imagine que precisamos armazenar as notas de três alunos, cada um com quatro notas.

Poderíamos criar um array para cada aluno:

```java
double[] notasAluno1 = {8.0, 7.0, 9.0, 6.0};
double[] notasAluno2 = {7.5, 8.0, 6.5, 9.0};
double[] notasAluno3 = {9.0, 8.5, 10.0, 7.0};
```

Mas existe outra possibilidade: organizar todas as notas em uma matriz.

Uma **matriz bidimensional** é uma estrutura que organiza elementos em linhas e colunas.

Visualmente, ficaria assim:

| Aluno | Nota 1 | Nota 2 | Nota 3 | Nota 4 |
|---|---:|---:|---:|---:|
| Aluno 1 | 8.0 | 7.0 | 9.0 | 6.0 |
| Aluno 2 | 7.5 | 8.0 | 6.5 | 9.0 |
| Aluno 3 | 9.0 | 8.5 | 10.0 | 7.0 |

Em Java, podemos representar essa estrutura usando:

```java
double[][] notas = {
    {8.0, 7.0, 9.0, 6.0},
    {7.5, 8.0, 6.5, 9.0},
    {9.0, 8.5, 10.0, 7.0}
};
```

Observe os dois pares de colchetes:

```java
double[][]
```

Eles indicam que estamos declarando uma referência para uma estrutura de arrays de duas dimensões.

Uma maneira simples de entender é:

- `double[]`: array de números decimais.
- `double[][]`: array que contém arrays de números decimais.

Na prática, uma matriz Java bidimensional é um array cujos elementos são referências para outros arrays.

Não precisa decorar essa definição técnica agora. O importante é compreender como utilizar a estrutura.

---

## 2. Declarando e criando uma matriz

Assim como fizemos com arrays, podemos criar uma matriz utilizando `new`.

Por exemplo:

```java
int[][] numeros = new int[3][4];
```

Vamos entender:

| Trecho | Significado |
|---|---|
| `int` | Tipo dos elementos armazenados. |
| `[][]` | Indica duas dimensões. |
| `numeros` | Nome da variável. |
| `new` | Cria a estrutura. |
| `[3]` | Define três linhas. |
| `[4]` | Define quatro colunas em cada linha. |

Portanto:

```java
int[][] numeros = new int[3][4];
```

Cria uma matriz com três linhas e quatro colunas, totalizando 12 posições.

Podemos representá-la assim:

| Linha / Coluna | Coluna 0 | Coluna 1 | Coluna 2 | Coluna 3 |
|---|---:|---:|---:|---:|
| Linha 0 | 0 | 0 | 0 | 0 |
| Linha 1 | 0 | 0 | 0 | 0 |
| Linha 2 | 0 | 0 | 0 | 0 |

Como os elementos são do tipo `int`, começam com o valor padrão `0`.

Vamos testar:

```java
public class Main {

    public static void main(String[] args) {
        int[][] numeros = new int[3][4];

        System.out.println(numeros[0][0]);
        System.out.println(numeros[1][2]);
        System.out.println(numeros[2][3]);
    }
}
```

Resultado:

```text
0
0
0
```

As três posições acessadas existem e ainda contêm seus valores iniciais.

---

## 3. Acessando os elementos de uma matriz

Nos arrays comuns, utilizamos um índice:

```java
numeros[0]
```

Nas matrizes bidimensionais, precisamos de dois índices:

```java
numeros[linha][coluna]
```

O primeiro índice indica a linha.

O segundo indica a coluna.

Considere esta matriz:

```java
int[][] numeros = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

Podemos representá-la assim:

| Índice da linha | Coluna 0 | Coluna 1 | Coluna 2 |
|---|---:|---:|---:|
| Linha 0 | 10 | 20 | 30 |
| Linha 1 | 40 | 50 | 60 |
| Linha 2 | 70 | 80 | 90 |

Agora vamos acessar alguns valores.

**Acessando o número 10:**

```java
System.out.println(numeros[0][0]);
```

O resultado será:

```text
10
```

**Acessando o número 50:**

```java
System.out.println(numeros[1][1]);
```

Resultado:

```text
50
```

**Acessando o número 90:**

```java
System.out.println(numeros[2][2]);
```

Resultado:

```text
90
```

Observe que os índices começam em zero nas duas dimensões.

Por isso, a última posição dessa matriz é:

```java
numeros[2][2]
```

### Modificando um elemento

Assim como nos arrays, podemos alterar os valores de uma matriz.

```java
int[][] numeros = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

numeros[1][1] = 100;

System.out.println(numeros[1][1]);
```

Resultado:

```text
100
```

A posição da linha 1 e coluna 1, que armazenava `50`, agora armazena `100`.

A matriz passa a ser:

| Linha | Coluna 0 | Coluna 1 | Coluna 2 |
|---|---:|---:|---:|
| Linha 0 | 10 | 20 | 30 |
| Linha 1 | 40 | 100 | 60 |
| Linha 2 | 70 | 80 | 90 |

---

## 4. Como descobrir a quantidade de linhas e colunas?

Na aula anterior, você aprendeu a utilizar `length` para descobrir o tamanho de um array.

Nas matrizes, também utilizamos essa propriedade.

Veja:

```java
int[][] numeros = new int[3][4];

System.out.println(numeros.length);
```

Resultado:

```text
3
```

Nesse caso, `numeros.length` retorna a quantidade de linhas.

Mas como descobrimos a quantidade de colunas?

Podemos acessar o primeiro array interno:

```java
System.out.println(numeros[0].length);
```

Resultado:

```text
4
```

Portanto:

```java
numeros.length
```

Retorna a quantidade de linhas.

Já:

```java
numeros[0].length
```

Retorna a quantidade de elementos da primeira linha.

**Importante:** isso pressupõe que a primeira linha exista e não seja `null`.

### Exemplo completo

```java
public class Main {

    public static void main(String[] args) {
        int[][] numeros = new int[3][4];

        System.out.println("Quantidade de linhas: " + numeros.length);
        System.out.println("Quantidade de colunas: " + numeros[0].length);
    }
}
```

Resultado:

```text
Quantidade de linhas: 3
Quantidade de colunas: 4
```

Essa informação será muito importante quando utilizarmos laços de repetição para percorrer matrizes.

---

## 5. Percorrendo uma matriz com `for`

Você já aprendeu a utilizar o `for` para percorrer arrays.

Para percorrer uma matriz bidimensional, normalmente utilizamos **dois laços de repetição**.

Um laço percorre as linhas.

O outro percorre as colunas.

Observe:

```java
public class Main {

    public static void main(String[] args) {
        int[][] numeros = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }
}
```

Resultado:

```text
10
20
30
40
50
60
70
80
90
```

Vamos entender como isso funciona.

### O primeiro `for`

```java
for (int i = 0; i < numeros.length; i++)
```

Esse laço percorre as linhas.

Como a matriz possui três linhas, `i` assumirá os valores:

```text
0
1
2
```

### O segundo `for`

```java
for (int j = 0; j < numeros[i].length; j++)
```

Esse laço percorre as colunas da linha atual.

Se `i` for `0`, acessaremos os elementos da primeira linha.

Se `i` for `1`, acessaremos os elementos da segunda linha.

E assim por diante.

### Acessando o elemento

```java
System.out.println(numeros[i][j]);
```

Aqui utilizamos os dois índices.

O valor de `i` determina a linha, enquanto o valor de `j` determina a coluna.

Observe a sequência:

| Linha (`i`) | Coluna (`j`) | Valor |
|---:|---:|---:|
| 0 | 0 | 10 |
| 0 | 1 | 20 |
| 0 | 2 | 30 |
| 1 | 0 | 40 |
| 1 | 1 | 50 |
| 1 | 2 | 60 |
| 2 | 0 | 70 |
| 2 | 1 | 80 |
| 2 | 2 | 90 |

O laço interno é executado completamente para cada linha.

Essa estrutura é chamada de **laços aninhados**, porque um laço está dentro do outro.

### Exibindo a matriz em formato de tabela

Podemos utilizar `print()` para manter os números da mesma linha na mesma linha da saída:

```java
public class Main {

    public static void main(String[] args) {
        int[][] numeros = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
```

Resultado:

```text
10    20    30
40    50    60
70    80    90
```

O `\t` insere uma tabulação, enquanto o `println()` ao final de cada linha pula para a próxima.

---

## 6. Recebendo valores com `Scanner`

Agora vamos criar uma matriz que recebe números digitados pelo usuário.

O programa deverá preencher uma matriz com duas linhas e três colunas.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(
                    "Digite o valor da linha " + i +
                    ", coluna " + j + ": "
                );

                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz cadastrada:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }

            System.out.println();
        }

        scanner.close();
    }
}
```

### Como o programa funciona?

Primeiro, criamos uma matriz:

```java
int[][] numeros = new int[2][3];
```

Ela terá duas linhas e três colunas, totalizando seis posições.

Depois, utilizamos os laços aninhados para preencher cada posição.

```java
numeros[i][j] = scanner.nextInt();
```

Essa linha armazena o número digitado na posição correspondente.

Por exemplo, quando `i = 0` e `j = 0`, o valor será armazenado em:

```java
numeros[0][0]
```

Quando `i = 0` e `j = 1`, será armazenado em:

```java
numeros[0][1]
```

E assim por diante.

Se o usuário digitar os valores `1`, `2`, `3`, `4`, `5` e `6`, a matriz ficará assim:

| Linha | Coluna 0 | Coluna 1 | Coluna 2 |
|---|---:|---:|---:|
| Linha 0 | 1 | 2 | 3 |
| Linha 1 | 4 | 5 | 6 |

---

## 7. Somando os valores de uma matriz

Agora vamos utilizar a matriz para resolver um problema.

Imagine que você tem uma tabela de vendas de uma loja, com duas lojas e três produtos.

```java
double[][] vendas = {
    {100.0, 150.0, 200.0},
    {120.0, 180.0, 250.0}
};
```

Podemos somar todos os valores utilizando dois laços:

```java
public class Main {

    public static void main(String[] args) {
        double[][] vendas = {
            {100.0, 150.0, 200.0},
            {120.0, 180.0, 250.0}
        };

        double total = 0;

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                total += vendas[i][j];
            }
        }

        System.out.println("Total de vendas: R$ " + total);
    }
}
```

Resultado:

```text
Total de vendas: R$ 1000.0
```

A lógica é semelhante àquela que utilizamos para calcular a média de um array.

A diferença é que agora precisamos percorrer duas dimensões.

Primeiro, inicializamos o acumulador:

```java
double total = 0;
```

Depois, somamos cada elemento:

```java
total += vendas[i][j];
```

Ao final, `total` contém a soma de todos os valores da matriz.

Esse tipo de processamento pode ser utilizado em tabelas de vendas, relatórios e outros sistemas que organizam informações em linhas e colunas.

---

## 8. Matrizes e métodos

Na aula anterior, você aprendeu que os métodos ajudam a separar as responsabilidades do programa.

Podemos aplicar o mesmo princípio às matrizes.

Vamos criar um método que recebe uma matriz de números inteiros e calcula a soma de todos os seus elementos.

```java
public class Main {

    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int resultado = somarMatriz(numeros);

        System.out.println("Soma: " + resultado);
    }

    public static int somarMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}
```

Resultado:

```text
Soma: 21
```

Observe a declaração:

```java
public static int somarMatriz(int[][] matriz)
```

O método recebe uma matriz de números inteiros e retorna um `int`.

Na chamada:

```java
int resultado = somarMatriz(numeros);
```

Passamos a matriz como argumento e armazenamos o resultado devolvido pelo método.

Essa organização permite reutilizar a lógica de soma em diferentes partes do programa.

Por exemplo, poderíamos criar outras matrizes e passá-las ao mesmo método, sem precisar repetir o código dos laços.

---