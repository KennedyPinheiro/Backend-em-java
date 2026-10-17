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

## Acessando os elementos de um array
Para acessar um elemento, utilizamos o nome do array seguido do índice entre colchetes.


```bash 
String[] nomes = {"Maria", "João", "Carlos"};
```

```bash 
System.out.println(nomes[0]);
System.out.println(nomes[1]);
System.out.println(nomes[2]);
```
O número dentro dos colchetes indica qual elemento queremos acessar.

### Modificando um elemento
Também podemos modificar os valores armazenados.
```bash 
String[] nomes = {"Maria", "João", "Carlos"};

nomes[1] = "Pedro";

System.out.println(nomes[1]);
```
O elemento "João", que estava no índice 1, foi substituído por "Pedro".

Essa operação não adicionou uma nova posição. Apenas modificou o valor de uma posição existente.

### Cuidado com os índices inválidos!

```bash 
int[] numeros = {10, 20, 30};

System.out.println(numeros[3]);
```
O que você acha que acontecerá?

O array possui três elementos, nos índices 0, 1 e 2.
O índice 3 não existe.

Portanto, o Java lançará uma exceção chamada:

**ArrayIndexOutOfBoundsException**

Esse erro aparece quando tentamos acessar um índice fora dos limites do array.

Lembre-se:

Se um array possui n elementos, seus índices válidos vão de 0 até n - 1.

### Descobrindo o tamanho com length
Mas e se não soubermos quantos elementos existem no array?

```bash 
int[] numeros = {10, 20, 30, 40, 50};

System.out.println(numeros.length);
```
A propriedade length informa a quantidade de posições do array.

**Correto**
```bash 
numeros.length
```
**Incorreto**
```bash 
numeros.length()
```
Isso acontece porque length, em arrays, é uma propriedade, não um método.

```bash 
int[] numeros = {10, 20, 30, 40, 50};

int ultimoElemento = numeros[numeros.length - 1];

System.out.println(ultimoElemento);
```
Por que subtraímos 1?

Porque o tamanho é 5, mas os índices começam em 0.
Portanto:
- Tamanho: 5.
- Último índice: 4.
- Cálculo: numeros.length - 1.
  

## Percorrendo arrays com for
Imagine que você precisa exibir todos os elementos de um array.

uma forma seria:
```bash 
String[] nomes = {"Maria", "João", "Carlos"};

System.out.println(nomes[0]);
System.out.println(nomes[1]);
System.out.println(nomes[2]);
```
Mas já estudamos uma estrutura que repete instruções: o for.

```bash 
public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Maria", "João", "Carlos"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
```
O laço continua enquanto i for menor que a quantidade de elementos.

Como o array possui três posições, a condição será verdadeira para i = 0, i = 1 e i = 2.

Quando i chegar a 3, o laço será encerrado.

Em cada repetição, acessamos uma posição diferente.

## Percorrendo arrays com for-each
Existe outra forma de percorrer arrays em Java: o for-each.

Ele é especialmente útil quando queremos acessar todos os elementos sem precisar controlar os índices manualmente.

```bash 
String[] nomes = {"Maria", "João", "Carlos"};

for (String nome : nomes) {
    System.out.println(nome);
}
```
Podemos interpretá-la assim:

Para cada elemento do array nomes, coloque seu valor na variável nome e execute o bloco de código.

A estrutura pode ser representada assim:
```bash 
for (Tipo variavel : array) {
    // Código executado para cada elemento
}
```
### Quando usar for e quando usar for-each?
Use o for tradicional quando precisar trabalhar diretamente com os índices.
```bash 
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Índice: " + i);
    System.out.println("Valor: " + numeros[i]);
}
```
Já o for-each é uma boa opção quando você precisa apenas percorrer os elementos.

```bash 
for (int numero : numeros) {
    System.out.println(numero);
}
```
Uma observação importante: alterar a variável do for-each não substitui automaticamente o elemento do array quando se trata de tipos primitivos.
```bash 
int[] numeros = {1, 2, 3};

for (int numero : numeros) {
    numero = 0;
}
```
Ao final, o array continuará contendo {1, 2, 3}.

Isso acontece porque numero recebe uma cópia do valor de cada elemento.

Se quiser modificar as posições de um array de número
```bash 
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = 0;
}
```

