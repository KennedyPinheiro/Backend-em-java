# 06 - A classe Object e seus métodos

## Objetivo

Compreender a classe `Object`, que representa a raiz da hierarquia de classes do Java, e aprender a utilizar e sobrescrever alguns de seus principais métodos.

## Conceito

Em Java, todas as classes herdam direta ou indiretamente da classe `Object`.

Isso significa que mesmo quando não utilizamos `extends`, nossa classe recebe os métodos disponibilizados por `Object`.

Por exemplo:

```java
public class Produto {
}
```

É equivalente, em relação à herança, a:

```java
public class Produto extends Object {
}
```

Não é necessário declarar essa herança explicitamente.

## Métodos estudados

### 1. toString()

Retorna uma representação textual do objeto.

Podemos sobrescrever esse método para definir quais informações serão apresentadas quando o objeto for convertido em texto.

### 2. equals()

Compara dois objetos.

Por padrão, compara se as referências representam o mesmo objeto. Podemos sobrescrever esse método para comparar o conteúdo dos objetos de acordo com uma regra definida pela aplicação.

Neste exemplo, dois produtos são considerados iguais quando possuem o mesmo código.

### 3. hashCode()

Retorna um código hash do objeto.

É utilizado principalmente em estruturas de dados baseadas em hash, como `HashMap` e `HashSet`.

Quando sobrescrevemos `equals()`, também devemos sobrescrever `hashCode()` para respeitar o contrato entre os dois métodos.

### 4. getClass()

Retorna informações sobre a classe real do objeto.

O método `getSimpleName()` pode ser utilizado para obter apenas o nome simples da classe.

## Estrutura

```text
06-classe-object/
├── README.md
├── Produto.java
└── Main.java
```

## Funcionamento

A classe `Produto` possui três atributos:

- `codigo`;
- `nome`;
- `preco`.

Ela sobrescreve os métodos `toString()`, `equals()` e `hashCode()`.

No método `main`, são criados três produtos para demonstrar:

- A representação textual dos objetos;
- A comparação entre produtos;
- A geração dos códigos hash;
- A identificação da classe dos objetos.

## Executando

Compile os arquivos:

```bash
javac Produto.java Main.java
```

Execute:

```bash
java Main
```

## Conceitos praticados

- Classe `Object`;
- Hierarquia de classes;
- Herança implícita;
- Sobrescrita de métodos;
- Anotação `@Override`;
- Método `toString()`;
- Método `equals()`;
- Método `hashCode()`;
- Método `getClass()`.

## Conclusão

A classe `Object` é a base da hierarquia de classes do Java.

Conhecer seus métodos é importante porque eles aparecem frequentemente no desenvolvimento de aplicações, principalmente ao trabalhar com comparações, coleções e representação de objetos.