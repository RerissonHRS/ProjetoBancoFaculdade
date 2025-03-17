# ProjetoBancoFaculdade
Projeto Criação App Bancário Anhaguera - ADS
**Documentação do Projeto Gerenciador Bancário**

**1. Visão Geral**

Este projeto é uma aplicação Java simples que simula um sistema de gerenciamento bancário. Ele permite que um usuário informe seus dados pessoais (nome, sobrenome e CPF) e realize operações bancárias básicas, como consultar saldo, depositar e sacar.

**2. Requisitos**

* Java Development Kit (JDK) 8 ou superior
* Apache Maven
* Ambiente de Desenvolvimento Integrado (IDE) (opcional, mas recomendado)

**3. Estrutura do Projeto**

```
gerenciador-banco/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/banco/
│   │           ├── Usuario.java
│   │           ├── ContaBancaria.java
│   │           └── GerenciadorBanco.java
├── pom.xml
```

**4. Descrição das Classes**

* **`Usuario.java`:**
    * Representa um usuário do sistema bancário.
    * Atributos:
        * `nome`: Nome do usuário (String).
        * `sobrenome`: Sobrenome do usuário (String).
        * `cpf`: CPF do usuário (String).
    * Métodos:
        * Construtor: `Usuario(String nome, String sobrenome, String cpf)`
        * Getters: `getNome()`, `getSobrenome()`, `getCpf()`
* **`ContaBancaria.java`:**
    * Representa uma conta bancária.
    * Atributos:
        * `usuario`: Objeto da classe `Usuario`.
        * `saldo`: Saldo da conta (double).
    * Métodos:
        * Construtor: `ContaBancaria(Usuario usuario)`
        * `consultarSaldo()`: Retorna o saldo da conta.
        * `depositar(double valor)`: Adiciona um valor ao saldo.
        * `sacar(double valor)`: Remove um valor do saldo, se houver saldo suficiente.
        * `getUsuario()`: Retorna o objeto Usuario da conta.
* **`GerenciadorBanco.java`:**
    * Classe principal da aplicação.
    * Método:
        * `main(String[] args)`: Ponto de entrada da aplicação, onde o menu de opções é implementado.

**5. Fluxo de Execução**

1.  O programa solicita ao usuário que informe seus dados pessoais (nome, sobrenome e CPF).
2.  Um objeto `Usuario` é criado com os dados fornecidos.
3.  Um objeto `ContaBancaria` é criado, associado ao objeto `Usuario`.
4.  Um menu de opções é exibido:
    * 1. Consultar saldo
    * 2. Depositar
    * 3. Sacar
    * 0. Sair
5.  O usuário escolhe uma opção.
6.  A operação correspondente é executada.
7.  O menu é exibido novamente, até que o usuário escolha a opção 0 (sair).

**6. Como Executar**

1.  Certifique-se de ter o JDK e o Maven instalados.
2.  Abra o terminal e navegue até o diretório do projeto (`gerenciador-banco`).
3.  Execute o comando: `mvn compile exec:java -Dexec.mainClass="com.banco.GerenciadorBanco"`

**7. Melhorias Futuras**

* Implementar tratamento de exceções para entradas inválidas.
* Persistir os dados em um banco de dados.
* Adicionar mais funcionalidades bancárias (transferências, extrato, etc.).
* Criar uma interface gráfica para o usuário.
* Implementar testes unitários.
* Implementar sistema de login e senha.

**8. Considerações**

Este projeto é um exemplo simples de aplicação Java com POO. Ele pode ser expandido e aprimorado para atender a requisitos mais complexos.
