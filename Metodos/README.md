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