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
##  Métodos com estruturas condicionais

Um método pode conter if, else, switch e outras estruturas de controle.

```bash 
public static boolean senhaValida(String senha) {

    if (senha == null) {
        return false;
    }

    return senha.length() >= 8;
}
```
Quando uma condição já resulta em true ou false, experimente retorná-la diretamente. Isso ajuda a escrever código mais simples.

## Métodos podem chamar outros métodos
Em vez de fazer metodos gigantescos com varias lógicas dentro de si mesmo, podemos fazer uma separação dessas lógicas em outros metodos e chamar os mesmos dentro de um principal.

```bash 
public class Main {

    public static void main(String[] args) {

        String nome = "Kennedy";
        String email = "kennedy@email.com";
        String senha = "12345678";

        boolean cadastroValido = validarCadastro(nome, email, senha);

        if (cadastroValido) {
            System.out.println("Cadastro válido!");
        } else {
            System.out.println("Cadastro inválido!");
        }
    }

    public static boolean validarCadastro(
            String nome,
            String email,
            String senha
    ) {
        return campoPreenchido(nome)
                && campoPreenchido(email)
                && senhaValida(senha);
    }

    public static boolean campoPreenchido(String valor) {
        return valor != null && !valor.isBlank();
    }

    public static boolean senhaValida(String senha) {

        if (senha == null) {
            return false;
        }

        return senha.length() >= 8;
    }
}
```
**Como o programa funciona?**
1. O método main() define os dados do cadastro.
2. main() chama validarCadastro().
3. validarCadastro() chama campoPreenchido() para verificar o nome.
4. O mesmo método verifica o e-mail.
5. Em seguida, chama senhaValida() para verificar a senha.
6. Se todas as condições forem verdadeiras, validarCadastro() retorna true.
7. O método main() utiliza o resultado para exibir a mensagem
<table>
    <thead>
        <tr>
            <th>Método</th>
            <th>Responsabilidade</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>main()</code></td>
            <td>Executar o exemplo e controlar o fluxo principal.</td>
        </tr>
        <tr>
            <td><code>validarCadastro()</code></td>
            <td>Combinar as regras de validação.</td>
        </tr>
        <tr>
            <td><code>campoPreenchido()</code></td>
            <td>Verificar se um campo de texto foi preenchido.</td>
        </tr>
        <tr>
            <td><code>senhaValida()</code></td>
            <td>Verificar o tamanho mínimo da senha.</td>
        </tr>
    </tbody>
</table>

Essa organização permite alterar uma regra sem precisar reescrever todo o processo de cadastro.

Por exemplo, se você precisar mudar a quantidade mínima de caracteres da senha, poderá modificar senhaValida() sem alterar a estrutura de validarCadastro().

Vale lembrar que esse exemplo é didático. Um sistema real também precisaria validar o formato do e-mail, tratar dados de entrada e implementar outras regras de segurança.

## Sobrecarga de métodos: method overloading 
Em Java, é posssivel declarar métodos com o mesmo nome, desde que suas listas de parâmetros sejam diferentes.

Esse recurso é chamado de **sobrecarga de métodos** (method overloading).

```bash 
public static int somar(int a, int b) {
    return a + b;
}

public static int somar(int a, int b, int c) {
    return a + b + c;
}
```

Os dois métodos se chamam somar, mas recebem quantidades diferentes de parâmetros.

O Java identifica qual método utilizar com base nos argumentos fornecidos.

Também podemos sobrecarregar métodos utilizando tipos diferentes:
```bash 
public static int somar(int a, int b) {
    return a + b;
}

public static double somar(double a, double b) {
    return a + b;
}
```
### Uma regra importante
Não podemos criar duas versões de um método que diferem somente pelo tipo de retorno.

isto não é permitido:
```bash 
public static int calcular(int numero) {
    return numero * 2;
}

public static double calcular(int numero) {
    return numero * 2.0;
}
```
As duas assinaturas possuem o mesmo nome e os mesmos parâmetros. O Java não consegue distingui-las pela chamada.


## Métodos static e métodos de instância


```bash
public class Usuario {

    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```
O método apresentar() não possui static.

Isso significa que ele é um método de instância.

Ele pode acessar os atributos nome e idade do objeto ao qual pertence.

### Como utilizar esse método?
 Dentro de utra classe , definimos usuario com o Tipo Usuario(tipo da instancia criada) , recebendo new Usuario(), a espressão cria uma instancia da classe Usuario, a variavel armazena uma referencia a esse objeto. 

com:
```bash
usuario.nome 
usuario.idade
```
Fazemos a definição dos atributos utilizando a variavel.

**Chamamos seu método:**
```bash
usuario.apresentar();
```
O método acessa os atributos do objeto e exibe seus valores.

### Qual é a diferença entre static e métodos de instância?
<table>
    <thead>
        <tr>
            <th>Característica</th>
            <th>Método <code>static</code></th>
            <th>Método de instância</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Pertence a</td>
            <td>Classe</td>
            <td>Instância da classe</td>
        </tr>
        <tr>
            <td>Precisa criar um objeto para ser chamado?</td>
            <td>Não</td>
            <td>Sim, para uma chamada normal</td>
        </tr>
        <tr>
            <td>Acesso direto a atributos de instância</td>
            <td>Não</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>Exemplo</td>
            <td><code>Calculadora.somar(2, 3)</code></td>
            <td><code>usuario.apresentar()</code></td>
        </tr>
    </tbody>
</table>

**Dica:** não coloque static em todos os métodos automaticamente. 

Utilize-o quando o comportamento realmente pertencer à classe e não depender do estado de um objeto específico.

No exemplo de Usuario, cada pessoa possui seu próprio nome e sua própria idade. Portanto, faz sentido que apresentar() seja um método de instância.

## Métodos e o encapsulamento

Apesar de conseguirmos alterar os atributos diretamente , não é a melhor abordagem para uma classe que precisa controlar seus próprios dados.

Uma alternativa é utilizar atributos privados e métodos públicos para interagir com eles.

```bash 
public class Usuario {

    private String nome;
    private int idade;

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public String obterNome() {
        return nome;
    }
}
```
**O que significa private?**
O atributo só pode ser acessado diretamente de dentro da própria classe Usuario, respeitadas as regras de acesso da linguagem.

Outras classes não poderão executar normalmente:
```bash 
usuario.nome = "Exemplo";
```
**O que significa this.nome = nome?**
```bash
public void definirNome(String nome) {
    this.nome = nome;
}
```

Existem dois elementos com o mesmo nome:
- this.nome: o atributo pertencente ao objeto atual.
- nome: o parâmetro recebido pelo método.
A instrução copia o valor do parâmetro para o atributo do objeto.


```bash
usuario.definirNome("Exemplo");
```

Os métodos definirNome() e obterNome() são exemplos de métodos conhecidos como setters e getters.
- Setter: permite definir ou alterar um valor.
- Getter: permite consultar um valor.
  
Mas não precisam existir para todos os atributos. Em um projeto bem estruturado, os métodos devem atender às necessidades da classe, permitindo que ela controle suas regras.

O método recebe "Exemplo" e o armazena no atributo nome.

Nesse caso, o método não apenas atribui um valor: ele protege uma regra da classe.

Esse é um exemplo prático de como métodos ajudam a controlar o comportamento dos objetos.