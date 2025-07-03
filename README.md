# 🎉 Gestão de Convidados

Projeto desenvolvido em **Spring Boot** como parte dos estudos baseados no livro [Produtividade no Desenvolvimento de Aplicações
Web com Spring Boot](https://www.algaworks.com/) da AlgaWorks.

O projeto original do livro inclui apenas as funcionalidades de cadastro e listagem de convidados. A partir dele, foram adicionadas novas funcionalidades e melhorias.

## ✨ Funcionalidades Implementadas

- ✅ Listar convidados cadastrados
- ✅ Adicionar novo convidado
- ✅ Editar dados de um convidado
- ✅ Remover convidado com confirmação
- ✅ Interface web com css puro e thymeleaf
- ✅ Banco de dados em MySql

## 📘 Sobre o Projeto Original

O livro ensina a criar um projeto simples para entender:

- Como configurar o Spring Boot
- Como criar entidades JPA
- Como usar Spring Data
- Como renderizar dados com Thymeleaf
- Como criar formulários de cadastro

A partir desses fundamentos, foram implementados:

- Funcionalidade de edição dos dados
- Exclusão de registros com confirmação
- Melhorias no layout e organização do projeto
- Relacionamento de entidades, vinculando o convidado a um evento

## 💻 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Thymeleaf
- Bootstrap
- MySQL
- Maven

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
 [  [git clone https://github.com/seu-usuario/seu-repo.git]](https://github.com/joelsantos611/springboot_gestao_convidados)

 2. **Acesse a pasta do projeto:**
    
cd seu-repo

3. **Execute o projeto:**

./mvnw spring-boot:run

ou

mvn spring-boot:run

4. **Acesse no navegador:**

http://localhost:8080/convidados/

## 🛠 Configuração do Banco de Dados

Por padrão, o projeto utiliza o MySql, mas com configurações de usuario da minha maquina,
Para usar configurações pessoais do MySql na maquina local edite o ficheiro em:

src/main/resources/application.properties

## Exemplo de configuração MySQL:

spring.datasource.url=jdbc:mysql://localhost:3306/gestao_convidados?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update

## Estrutura do Projeto

src
 └── main
     ├── java
     │    └── com.joelsantos.gestao_convidados
     │         ├── controller
     │         │     └── ConvidadoController.java
     │         ├── model
     │         │     └── Convidado.java
     │         └── repository
     │               └── ConvidadoRepository.java
     └── resources
          ├── templates
          │     └── convidados
          │          ├── index.html
          │          └── form.html
          └── application.properties

  ## 🎯 Melhorias Futuras

    Validação de formulários

    Mensagens de sucesso e erro

    Paginação da listagem

    Autenticação de usuários

  ## 📝 Licença

Projeto com fins educativos, baseado em exemplos do livro da AlgaWorks.

Desenvolvido por Joel Dos Santos


