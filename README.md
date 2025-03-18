# REST API - Nome do Projeto

## 📌 Descrição
Esta é uma **REST API** desenvolvida em Java utilizando Spring Boot. A API permite realizar operações CRUD (Create, Read, Update, Delete) para gerenciar recursos de forma eficiente.

## 🚀 Tecnologias Utilizadas
```md
- **Java**  
- **Spring Boot**
- **Spring Data JPA**
- **MySQL / H2 Database**
- **Swagger** (Documentação da API)
- **JWT** (Autenticação e Autorização)
- **Maven**
```

## 📂 Estrutura do Projeto
```sh
/src
  ├── main/java/com/exemplo/api
  │   ├── controller
  │   ├── service
  │   ├── repository
  │   ├── model
  │   ├── dto
  │   ├── config
  ├── main/resources
      ├── application.yml
      ├── data.sql
```

## 🔧 Como Executar o Projeto
```sh
# Clone o repositório:
git clone https://github.com/Dvd-coder-art/Rest-api.git

# Acesse o diretório do projeto:
cd nome-do-projeto

# Configure o banco de dados no application.yml

# Execute o projeto:
mvn spring-boot:run

# Acesse a API:
http://localhost:8080
```

## 📌 Endpoints Principais
### Autenticação
```sh
POST /auth/login    # Realiza login e retorna um token JWT
POST /auth/register # Registra um novo usuário
```

### Recursos
```sh
GET /api/entidade        # Lista todos os registros
GET /api/entidade/{id}   # Obtém um único registro por ID
POST /api/entidade       # Cria um novo registro
PUT /api/entidade/{id}   # Atualiza um registro
DELETE /api/entidade/{id} # Remove um registro
```

## 📄 Documentação
A API conta com a documentação Swagger, que pode ser acessada via:
```sh
http://localhost:8080/swagger-ui.html
```

## 🛠️ Contribuição
```sh
# Faça um fork do projeto
# Crie uma branch para sua funcionalidade
git checkout -b minha-feature

# Commit suas alterações
git commit -m 'Adicionando nova funcionalidade'

# Push para a branch
git push origin minha-feature

# Abra um Pull Request
```

---

## 📝 Licença
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


