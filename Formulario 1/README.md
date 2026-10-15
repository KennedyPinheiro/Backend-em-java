# Sintaxe Básica e Estrutura

## O método main

```bash
 static void main(String[] args) {

}
```
<table>
    <thead>
        <tr>
            <th>Elemento</th>
            <th>Significado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>public</code></td>
            <td>Permite que o método seja acessado publicamente.</td>
        </tr>
        <tr>
            <td><code>static</code></td>
            <td>Permite que o método seja executado sem a necessidade de criar uma instância da classe.</td>
        </tr>
        <tr>
            <td><code>void</code></td>
            <td>Indica que o método não retorna um valor.</td>
        </tr>
        <tr>
            <td><code>main</code></td>
            <td>Nome do método reconhecido como ponto de entrada do programa Java.</td>
        </tr>
        <tr>
            <td><code>String[] args</code></td>
            <td>Recebe argumentos de texto passados ao programa durante sua inicialização.</td>
        </tr>
    </tbody>
</table>

## Definição de Variaveis 

Em java , diferente do javaScript as variaveis devem ser tipadas em sua definição , onde  inserimos o tipo de informção que aquela variável vai receber no momento que à definimos.

<strong> JavaScript
</strong>

```bash 
 let nome = "Kennedy"
```

<strong> Java
</strong>

```bash 
 String nome = "Kennedy"
```
<p>
Conhecendo os principais tipos de dados
</p>

<table>
    <thead>
        <tr>
            <th>
            Tipo
            </th>
            <th>
            Utilização
            </th>
            <th>
            Exemplo
            </th>
        </tr>
    </thead>
    <tbody>
            <tr>
                <td><code>String</code></td>
                <td>Permite que o método seja acessado publicamente.</td>
                <td>"Kennedy"</td>
            </tr>
            <tr>
                <td><code>int</code></td>
                <td>Números inteiros</td>
                <td>13</td>
            </tr>
            <tr>
                <td><code>double</code></td>
                <td>Números decimais</td>
                <td>1.75</td>
            </tr>
            <tr>
                <td><code>boolean</code></td>
                <td>Valores verdadeiro ou falso</td>
                <td>true</td>
            </tr>
            <tr>
                <td><code>char</code></td>
                <td>Um único caractere</td>
                <td>'k'</td>   
            </tr>
        </tbody>
</table>

# Operadores em Java

## 1. Operadores aritméticos

<table>
    <thead>
        <tr>
            <th>Operador</th>
            <th>Operação</th>
            <th>Exemplo</th>
            <th>Resultado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>+</code></td>
            <td>Adição</td>
            <td><code>10 + 5</code></td>
            <td><code>15</code></td>
        </tr>
        <tr>
            <td><code>-</code></td>
            <td>Subtração</td>
            <td><code>10 - 5</code></td>
            <td><code>5</code></td>
        </tr>
        <tr>
            <td><code>*</code></td>
            <td>Multiplicação</td>
            <td><code>10 * 5</code></td>
            <td><code>50</code></td>
        </tr>
        <tr>
            <td><code>/</code></td>
            <td>Divisão</td>
            <td><code>10.0 / 5</code></td>
            <td><code>2.0</code></td>
        </tr>
        <tr>
            <td><code>%</code></td>
            <td>Resto da divisão</td>
            <td><code>10 % 3</code></td>
            <td><code>1</code></td>
        </tr>
    </tbody>
</table>

## Operadores de atribuição

<table>
    <thead>
        <tr>
            <th>Operador</th>
            <th>Exemplo</th>
            <th>Equivalente</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>=</code></td>
            <td><code>numero = 10</code></td>
            <td>Atribui <code>10</code> à variável.</td>
        </tr>
        <tr>
            <td><code>+=</code></td>
            <td><code>numero += 5</code></td>
            <td><code>numero = numero + 5</code></td>
        </tr>
        <tr>
            <td><code>-=</code></td>
            <td><code>numero -= 3</code></td>
            <td><code>numero = numero - 3</code></td>
        </tr>
        <tr>
            <td><code>*=</code></td>
            <td><code>numero *= 2</code></td>
            <td><code>numero = numero * 2</code></td>
        </tr>
        <tr>
            <td><code>/=</code></td>
            <td><code>numero /= 2</code></td>
            <td><code>numero = numero / 2</code></td>
        </tr>
        <tr>
            <td><code>%=</code></td>
            <td><code>numero %= 3</code></td>
            <td><code>numero = numero % 3</code></td>
        </tr>
    </tbody>
</table>


```bash
public class Main {

    public static void main(String[] args) {

        int saldo = 100;

        saldo += 50;

        System.out.println(saldo);

        saldo -= 30;

        System.out.println(saldo);

    }
}
```
## Operadores relacionais

<table>
    <thead>
        <tr>
            <th>Operador</th>
            <th>Significado</th>
            <th>Exemplo</th>
            <th>Resultado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>==</code></td>
            <td>Igual a</td>
            <td><code>10 == 10</code></td>
            <td><code>true</code></td>
        </tr>
        <tr>
            <td><code>!=</code></td>
            <td>Diferente de</td>
            <td><code>10 != 5</code></td>
            <td><code>true</code></td>
        </tr>
        <tr>
            <td><code>&gt;</code></td>
            <td>Maior que</td>
            <td><code>10 &gt; 5</code></td>
            <td><code>true</code></td>
        </tr>
        <tr>
            <td><code>&lt;</code></td>
            <td>Menor que</td>
            <td><code>10 &lt; 5</code></td>
            <td><code>false</code></td>
        </tr>
        <tr>
            <td><code>&gt;=</code></td>
            <td>Maior ou igual a</td>
            <td><code>10 &gt;= 10</code></td>
            <td><code>true</code></td>
        </tr>
        <tr>
            <td><code>&lt;=</code></td>
            <td>Menor ou igual a</td>
            <td><code>5 &lt;= 10</code></td>
            <td><code>true</code></td>
        </tr>
    </tbody>
</table>


<p>Vamos interpretar:   </p>
<ol>
    <li>
        <code>idade >= 18</code>: verdadeiro, porque 20 é maior ou igual a 18.
    </li>
    <li>
        <code>idade < 18</code>: falso, porque 20 não é menor que 18.
    </li>
    <li>
        <code>idade == 20</code>: verdadeiro, porque os valores são iguais.
    </li>
    <li>
        <code>idade != 20</code>: falso, porque os valores são iguais.
    </li>
</ol>

## Operadores lógicos

<p>Imagine que você está desenvolvendo um sistema de cadastro.</p>
<p>Para permitir que uma pessoa se cadastre, o sistema precisa verificar se ela tem pelo menos 18 anos e se aceitou os termos de uso.</p>
<p>Podemos combinar essas condições com operadores lógicos.</p>
<p>Java possui três operadores principais:</p>
<table>
    <thead>
        <tr>
            <th>Operador</th>
            <th>Nome</th>
            <th>Significado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>&amp;&amp;</code></td>
            <td>E lógico</td>
            <td>Todas as condições precisam ser verdadeiras.</td>
        </tr>
        <tr>
            <td><code>||</code></td>
            <td>OU lógico</td>
            <td>Pelo menos uma condição precisa ser verdadeira.</td>
        </tr>
        <tr>
            <td><code>!</code></td>
            <td>NÃO lógico</td>
            <td>Inverte o valor lógico: verdadeiro se torna falso, e falso se torna verdadeiro.</td>
        </tr>
    </tbody>
</table>
