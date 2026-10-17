# Métodos em Java
## O que são métodos em Java
Um método é um bloco de código criado para executar uma tarefa específica.

Imagine que você esteja desenvolvendo um sistema de cadastro de usuários. Você precisa realizar várias operações:
- Validar se o nome foi preenchido.
- Verificar se o e-mail é válido.
- Conferir se a senha possui o tamanho mínimo.
- Exibir os dados cadastrados.
- Calcular a idade de uma pessoa.
  
Você poderia escrever todo o código dentro do método main(). Entretanto, conforme o programa cresce, isso se torna difícil de organizar e manter.
Os métodos permitem separar essas responsabilidades em blocos menores e reutilizáveis.

Criamos o método principal
```bash
Criamos o método principal
```
O método main() é o ponto de entrada tradicional de uma aplicação Java executada diretamente pela JVM.


Declaramos o método
```bash
public static void exibirMensagem() {
    System.out.println("Olá, mundo!");
}
```

Aqui, definimos o que acontece quando o método é executado.

Observe uma diferença importante:
- Declarar um método: escrever sua definição.
- Chamar um método: solicitar que ele seja executado.

Declarar um método não significa que ele será executado automaticamente. É necessário chamá-lo, direta ou indiretamente, a menos que outro mecanismo da linguagem ou do framework seja responsável por sua execução.

### Qual é a vantagem?

Imagine precisar exibir uma mensagem em 20 lugares diferentes.

Sem um método, você poderia repetir a mesma instrução 20 vezes.

Com um método, você escreve a lógica uma vez e a reutiliza sempre que necessário.

Isso favorece três princípios importantes:
- Reutilização: aproveitamos o mesmo código em diferentes lugares.
- Organização: cada método pode representar uma responsabilidade específica.
- Manutenção: uma alteração na lógica pode ser feita em um único lugar.

## Anatomia de um método Java

``` bash
public static int somar(int numero1, int numero2) {
    int resultado = numero1 + numero2;

    return resultado;
}
``` 
Esse método recebe dois números inteiros, soma os valores e devolve o resultado.
<table>
    <thead>
        <tr>
            <th>Parte</th>
            <th>Significado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>public</code></td>
            <td>Define que o método pode ser acessado de outras classes, respeitadas as regras de acesso.</td>
        </tr>
        <tr>
            <td><code>static</code></td>
            <td>Permite chamar o método pela classe, sem precisar criar uma instância dela.</td>
        </tr>
        <tr>
            <td><code>int</code></td>
            <td>Define o tipo de valor que o método retorna.</td>
        </tr>
        <tr>
            <td><code>somar</code></td>
            <td>É o nome do método.</td>
        </tr>
        <tr>
            <td><code>int numero1</code></td>
            <td>Primeiro parâmetro, que recebe um número inteiro.</td>
        </tr>
        <tr>
            <td><code>int numero2</code></td>
            <td>Segundo parâmetro, que recebe um número inteiro.</td>
        </tr>
    </tbody>
</table>

## Como os parâmetros e argumentos funcionam?

O parâmetro **exemplo** funciona como uma variável que recebe um valor quando o método é chamado.

O valor **"x"** é o argumento passado na chamada.

Portanto:
- Parâmetro: a variável declarada na definição do método.
- Argumento: o valor fornecido quando chamamos o método.
### Métodos com vários parâmetros
```bash 
public static void apresentarUsuario(String nome, int idade) {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
}
```
Nesse exemplo, o método recebe dois parâmetros:
1. String nome
2. int idade
Os argumentos devem corresponder aos tipos e à ordem dos parâmetros.

**Uma boa prática:** escolha nomes de parâmetros que deixem claro o que o método espera receber.

## Métodos void: quando não precisamos retornar um valor
Até agora, vimos métodos que recebem parâmetros e métodos que podem devolver resultados. Entretanto, alguns métodos existem apenas para executar uma ação.

Para isso, utilizamos void.

```bash
public static void exibirBoasVindas() {
    System.out.println("Bem-vindo ao sistema!");
}
```
O void indica que o método não retorna um valor para quem o chamou.

o metodo void pode receber parametros ,  e pode usar o return , mas  existe uma diferença.

```bash 
public static void verificarIdade(int idade) {

    if (idade < 18) {
        System.out.println("Menor de idade.");
        return;
    }

    System.out.println("Maior de idade.");
}
```

Nesse exemplo, o return encerra a execução do método naquele ponto.

Se a idade for menor que 18, o método exibirá a primeira mensagem e terminará sem executar a segunda.
Se a idade for 18 ou maior, continuará até a última instrução.

**Atenção:**em um método void, utilizamos return; sem valor. Já em um método que retorna int, String ou outro tipo, precisamos devolver um valor compatível quando a execução exige um retorno.

## Métodos que retornam valores com return

Metodos que utilizam alguma tipagem fora void , como int , string , utilizam a informação recebida como parametro e após efetuar a ação dentro do metodo faz um retorno.

Exemplo ao somar , recebendo como parametro dois números , utiliza esses valores no calculo e retorna o resultado desse calculo.

### Diferença entre void e return 

- Exemplo A — Apenas exibe o resultado

```bash 
public static void somarEExibir(int a, int b) {
    System.out.println(a + b);
}
```
- Exemplo B — Retorna o resultado
```bash
public static int somar(int a, int b) {
    return a + b;
}
```
No primeiro exemplo, o método exibe o resultado diretamente.

No segundo, o método devolve o resultado para que o código que o chamou decida o que fazer com ele.

considerando o uso do segundo , com base no retorno dele podemos utilizar a resposta dele em outro metodo , ou outro campo.

### Outros tipos de retorno

- Texto
```bash 
public static String obterNome() {
    return "Kennedy";
}
```
- Decimal
```bash 
public static double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}
```
- Valor lógico
```bash 
public static boolean ehMaiorDeIdade(int idade) {
    return idade >= 18;
}
```
