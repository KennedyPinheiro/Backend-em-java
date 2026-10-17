# Arrays 
## O que é um array?
Um array é uma estrutura que permite armazenar vários elementos do mesmo tipo em uma única variável.

```bash 
double[] notas = {8.5, 7.0, 9.2, 6.5};
```
Nesse caso, criamos um array chamado notas, que armazena quatro números decimais.

E aqui está um detalhe importante: em Java, os índices dos arrays começam em zero.

Isso significa que:
- O primeiro elemento está no índice 0.
- O segundo elemento está no índice 1.
- O terceiro elemento está no índice 2.
- O quarto elemento está no índice 3.
  
Se o array possui quatro elementos, seu último índice é 3.

### Como declarar um array

Em Java, podemos declarar um array de diferentes maneiras.

```bash
int[] numeros;
```
Essa linha declara uma variável chamada numeros, capaz de referenciar um array de números inteiros.

Mas atenção: isso ainda não cria o array.

Para criá-lo, precisamos utilizar new:
```bash
int[] numeros = new int[5];
```
<table>
    <thead>
        <tr>
            <th>Trecho</th>
            <th>Significado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>int</code></td>
            <td>Tipo dos elementos armazenados.</td>
        </tr>
        <tr>
            <td><code>[]</code></td>
            <td>Indica que estamos declarando um array.</td>
        </tr>
        <tr>
            <td><code>numeros</code></td>
            <td>Nome da variável.</td>
        </tr>
        <tr>
            <td><code>new</code></td>
            <td>Cria um novo objeto array.</td>
        </tr>
        <tr>
            <td><code>int[5]</code></td>
            <td>Define um array com cinco posições.</td>
        </tr>
    </tbody>
</table>

Podemos Verificar com:
```bash
public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
    }
}

```
**E se o array for de outros tipos?**

Os valores iniciais dependem do tipo dos elementos.

<table>
    <thead>
        <tr>
            <th>Tipo</th>
            <th>Valor padrão</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>int</code></td>
            <td><code>0</code></td>
        </tr>
        <tr>
            <td><code>double</code></td>
            <td><code>0.0</code></td>
        </tr>
        <tr>
            <td><code>boolean</code></td>
            <td><code>false</code></td>
        </tr>
        <tr>
            <td><code>char</code></td>
            <td>Caractere nulo (<code>'\u0000'</code>)</td>
        </tr>
        <tr>
            <td>Tipos de referência, como <code>String</code></td>
            <td><code>null</code></td>
        </tr>
    </tbody>
</table>

```bash
String[] nomes = new String[3];
```

As três posições começam com null, e não com uma string vazia.

Essa diferença será importante quando você começar a trabalhar com validações.

## Inicializando um array com valores
Se você já conhece os valores que deseja armazenar, pode declará-los diretamente.

```bash
int[] numeros = {10, 20, 30, 40, 50};
```
Nesse caso, não precisamos informar a quantidade de posições separadamente. O Java determina o tamanho com base nos valores fornecidos.

Podemos fazer o mesmo com textos:
```bash
String[] nomes = {"Maria", "João", "Carlos"};
```
Ou com números decimais:
```bash
double[] notas = {8.5, 7.0, 9.2};
```

Observe que todos os elementos de um array precisam ser compatíveis com o tipo declarado.

Isto funciona:
```bash
int[] idades = {18, 20, 25};
```
Mas isto não funciona:
```bash
int[] dados = {18, "Maria", 25};
```
O problema é que "Maria" é uma String, enquanto o array foi declarado para armazenar valores int.

Arrays comuns em Java possuem tamanho fixo após sua criação. Se você criar um array com cinco posições, ele continuará tendo cinco posições durante toda a sua existência.

Mais adiante, estudaremos ArrayList, uma estrutura que permite adicionar e remover elementos de maneira mais flexível.