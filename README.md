# API de Address
 
Bem-vindo à API de Address, uma solução robusta desenvolvida em Spring Boot para complementar a requisição de ceps do usuário, além de salva-las no banco de dados.

## Colaborador
-------------------------------------
| E-mail              | Usuário GitHub |
|---------------------|----------------|
| pablo.haddad.pb@compasso.com.br   |pablitohaddad   |


 
## Requisitos
 
- Java 17 
- MySql Database
- RabbitMQ
- Spring Boot
 
## Configuração
 
1. Clone o repositório:
 
```bash
git clone https://github.com/pablitohaddad/ms-address.git
```
 
2. Configure o banco de dados no arquivo `application.properties`.
 
3. Execute a aplicação:
 
```bash
mvn spring-boot:run
```

## Complementos.
  - postalCode;
  - street;
  - city;
  - state;
 
### Dificuldades.

As únicas dificuldades foram os testes, aos quais não consegui dar início. Entretando, foi uma tarefa fácil consumir a API viacep e manda-las para o banco de dados mongodb
