# Sistema_Tarefa_Esig #

## Proposta ## 
O projeto tem o objetivo de genrenciar tarefas a partir da criação de um CRUD utilizando Java web.

## Objetivos especificos ##
- [ ] Criar uma a plicação Java Web utilizando JavaServer Faces (JSF)
- [x] Utilizar persistência em um banco de dados PostgreSQL.
- [x] Utilizar JPA
- [ ] Utilizar testes de unidades
- [ ] Publicar projeto no heroku ou outro ambiente cloud.
- [ ] outros diferenciais que julgar conveniente.

### Tecnologias ### 
Na criação do projeto foram utilizadas as seguintes tecnologias:
- Eclipse IDE for Java Developers - 2021-12
- PostgreSQL 13 
- JDK 11
- Postman (Para fins de testes)

## Arquivos ##
- pom.xml: Arquivos das dependecias
- src/main/resources/application.properties: Configurações do banco de dados
- src/main/java/com/sistemaEsig/Tarefa2: Tarefa2, Tarefa2Controller, TarefaRepository, TarefaMB, Tarefa2Aplication

### Execução ### 
- Para a execução recomenda-se a utilização das tecnologias citadas acima.
- Criar banco de dados pgAdmin 4. Nome do banco: bd_tarefas
- Criar um projeto Maven através do site https://start.spring.io/ ou através do proprio IDE Eclipse 
- Abrir local do projeto e substituir a pasta 'src' e arquivo 'pom.xml'
- Executar aplicação e visualizar o mesmo no navegador atráves do endereço localhost:8080/tarefas

### Funcionalidades implementadas ###
- Criação da entity Tarefa e adicionados as anotações JPA.
- GET, POST, DELETE, PUT no banco de dados, testados através do Postman.
