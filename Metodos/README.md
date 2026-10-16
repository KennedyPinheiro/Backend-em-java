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