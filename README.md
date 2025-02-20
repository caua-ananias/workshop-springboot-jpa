# Sistema de Pedidos - Web Service com Spring Boot

## Sobre o Projeto
Este é um web service desenvolvido com Spring Boot que implementa um sistema de pedidos. O projeto inclui funcionalidades para gerenciamento de usuários, produtos, categorias, pedidos e itens de pedido.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.2
- JPA / Hibernate
- Banco de dados H2 (em memória)
- Maven

## Modelo de Domínio
O sistema é composto pelas seguintes entidades:
- User (Usuário)
- Order (Pedido)
- Product (Produto)
- Category (Categoria)
- OrderItem (Item do Pedido)
- Payment (Pagamento)

## Funcionalidades
- CRUD completo de usuários
- Consulta de produtos e categorias
- Gerenciamento de pedidos
- Associação de produtos com categorias
- Cálculo de subtotal e total dos pedidos
- Tratamento de exceções personalizado

## Endpoints da API
### Usuários
- GET /users - Lista todos os usuários
- GET /users/{id} - Busca usuário por ID
- POST /users - Insere novo usuário
- PUT /users/{id} - Atualiza usuário
- DELETE /users/{id} - Remove usuário

### Produtos
- GET /products - Lista todos os produtos
- GET /products/{id} - Busca produto por ID

### Categorias
- GET /categories - Lista todas as categorias
- GET /categories/{id} - Busca categoria por ID

### Pedidos
- GET /orders - Lista todos os pedidos
- GET /orders/{id} - Busca pedido por ID

## Como Executar
1. Clone o repositório
2. Certifique-se de ter o Java 17 e Maven instalados
3. Execute o comando: `mvn spring-boot:run`
4. A aplicação estará disponível em `http://localhost:8080`

## Banco de Dados
O projeto utiliza o banco de dados H2 em memória. Para acessar o console do H2:
1. Inicie a aplicação
2. Acesse `http://localhost:8080/h2-console`
3. Configure o JDBC URL como: `jdbc:h2:mem:testdb`
4. Usuário: `sa`
5. Senha: (deixe em branco)

## Tratamento de Exceções
O sistema inclui tratamento personalizado para:
- Recurso não encontrado
- Erro de integridade do banco de dados
- Exceções gerais
