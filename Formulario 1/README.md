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


<hr>

# Condicionais em Java

## A estrutura If

<p>A palavra-chave if significa "se".</p>

<p>Ela permite executar um bloco de código somente quando determinada condição for verdadeira.</p>

<p><strong>Regra importante: </strong> em Java, a condição do if precisa resultar em um valor booleano (true ou false).</p>

```bash
if (idade >= 18) {
    // Código
}
```
Isso funciona porque idade >= 18 é uma expressão booleana.

Já isto não funciona:
```bash
if (idade) {
    System.out.println("Olá");
}
```
## A estrutura if/else

E se quisermos executar uma ação quando a condição for verdadeira e outra quando for falsa?

É aí que entra o else, que significa "senão"

```bash
public class Main {

    public static void main(String[] args) {

        int idade = 16;

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

    }
}
```

## A estrutura if/else if/else

Possuimos uma sequencia de condições que uma apos a outra , assim que uma condição é identificada como falsa , passa para seguinte,
algo que poderia ser feito com uma sequencia de if , escolhendo qual dentre eles é executado possuimos a estrutura  **else if**.

## Condicionais dentro de condicionais

Java também permite colocar um if dentro de outro if. Isso é conhecido como condicional aninhada.
Imagine um sistema que verifica se uma pessoa pode acessar uma área administrativa.

se uma das condições for a necessidade de autentição e a seguinte dentro dela for um nivel de acesso do usuario a resposta final depende de ambas as condições serem verdadeiras.
se uma das condições for falsa a resposta do else correpondende que será informada.

A escolha entre condicionais aninhadas e operadores lógicos depende do comportamento que você deseja implementar.
Em um sistema real, também seria necessário validar as permissões no backend. Esconder uma tela no frontend, por exemplo, não é suficiente para proteger uma funcionalidade.

## A estrutura switch

Além do if/else, Java possui a estrutura switch.
Ela é útil quando queremos executar diferentes ações de acordo com o valor de uma variável ou expressão.
Imagine um sistema de atendimento com um menu de opções:

```bash
public class Main {

    public static void main(String[] args) {

        int opcao = 2;

        switch (opcao) {

            case 1:
                System.out.println("Cadastrar usuário.");
                break;

            case 2:
                System.out.println("Consultar usuários.");
                break;

            case 3:
                System.out.println("Excluir usuário.");
                break;

            default:
                System.out.println("Opção inválida.");

        }

    }
}
```
### Como funciona?

switch (opcao)

Indica qual valor será analisado.

case 1, case 2, case 3

Cada case representa uma alternativa.

break

Encerra a execução do switch naquele ponto, evitando que o programa continue executando os próximos casos.
default

É a alternativa executada quando nenhum dos casos corresponde ao valor analisado.

#### Quando utilizar if e quando utilizar switch?

Use if/else quando precisar avaliar condições, intervalos ou expressões lógicas:

```bash
if (idade >= 18) {
    System.out.println("Maior de idade.");
}
```
Use switch quando quiser selecionar uma alternativa com base em valores específicos:
```bash
switch (opcao) {
    case 1:
        System.out.println("Cadastrar");
        break;
    case 2:
        System.out.println("Consultar");
        break;
    default:
        System.out.println("Inválido");
}
```