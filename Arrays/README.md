## Arrays 
### O que é um array?
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