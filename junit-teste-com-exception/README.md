# Projeto de Exemplo de Testes Unitários em Java

Este é um projeto de exemplo que demonstra o uso de testes unitários em Java usando JUnit para testar a funcionalidade de cálculo de bônus em um sistema de gerenciamento de funcionários.

## Funcionalidade

O projeto demonstra o cálculo de bônus para funcionários com base no salário usando testes unitários. Ele inclui:

- A classe `Funcionario` para representar os detalhes do funcionário.
- A classe `BonusService` para calcular o bônus com base no salário do funcionário.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java/br/com/alura/tdd/modelo/`: Contém a classe `Funcionario` para representar os funcionários.
- `src/main/java/br/com/alura/tdd/service/`: Contém a classe `BonusService` para calcular o bônus.
- `src/test/java/br/com/alura/tdd/service/`: Contém a classe `BonusServiceTest` para os testes unitários.

## Testes Unitários

Os testes unitários foram implementados usando o framework JUnit. Os cenários de teste incluem:

- Calcula bônus de 10% quando o salário é menor que R$1000.
- Lança uma exceção quando o salário é maior que R$1000.

Os testes são fundamentais para garantir que a lógica de cálculo de bônus esteja funcionando corretamente e para prevenir regressões.

## Como Executar

1. Clone o repositório para sua máquina local.
2. Abra o projeto em uma IDE compatível com Java (como IntelliJ IDEA ou Eclipse).
3. Navegue até a classe `BonusServiceTest` em `src/test/java/br/com/alura/tdd/service/`.
4. Execute os testes usando a opção apropriada da IDE ou o comando de teste fornecido pela ferramenta de build do projeto (por exemplo, `./gradlew test`).

## Contribuição

Contribuições são bem-vindas! Se você encontrar problemas nos testes ou tiver melhorias a sugerir, fique à vontade para criar um pull request.

