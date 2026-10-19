# Introdução à Programação Orientada a Objetos (POO)
## 1. O que é Programação Orientada a Objetos?
A Programação Orientada a Objetos (POO) é uma forma de organizar um programa utilizando classes e objetos.

Imagine que você está desenvolvendo um sistema escolar. Esse sistema precisa cadastrar alunos, armazenar suas notas, mostrar seus dados e verificar se foram aprovados.

Uma maneira de organizar essas informações é criar uma estrutura que represente um aluno.

Em vez de trabalhar apenas com variáveis e métodos separados, podemos reunir os dados e os comportamentos relacionados a um aluno em uma única estrutura.

Em Java, fazemos isso utilizando classes e objetos.
Exemplo do cotidiano
Imagine uma fábrica de carros.

A fábrica possui um projeto que define as características de um carro, como modelo, cor e velocidade.

Esse projeto é utilizado para fabricar vários carros.

Podemos representar essa ideia assim:
PROJETO DO CARRO
    |
    | Define as características
    | e os comportamentos
    |
    +------> Carro 1
    |           Modelo: Civic
    |           Cor: Preto
    |
    +------> Carro 2
    |           Modelo: Corolla
    |           Cor: Branco
    |
    +------> Carro 3
                Modelo: Onix
                Cor: Prata

Nesse exemplo:
- Classe: é o projeto utilizado para criar os carros.
- Objeto: é cada carro criado a partir desse projeto.
- Atributos: são as características de cada carro.
- Métodos: são as ações que cada carro pode executar.
Em Java, a classe funciona como um modelo que podemos utilizar para criar diferentes objetos.

### Classe e Objeto
Uma classe sendo colocada de forma rudimentar atua como  um molde. Uma classe define todos os atributos e comportamentos(metodos) comuns compartilhados por um tipo de objeto.

Apartir dessa classe pode-se criar um objeto. Quando dois objetos são criados oque diferencia um do outro são os seus atributos. 

Quando à modelagem da classe , a mesma não é estatica , caso a classe no futuro viesse a ter algum atributo ou metodo adicionado e que não foram especificados numa primeira modelagem.  Essa alteração automaticamente estaria disponivel para que todos os objetos tenham acesso a estes novos recursos.

### Atributo e 
