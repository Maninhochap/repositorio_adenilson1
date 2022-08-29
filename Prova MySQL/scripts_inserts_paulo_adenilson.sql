USE db_prova;
INSERT INTO aluno(id, nome, celular, email, github_usuario)
VALUES(1, 'Paulo', '991053196', 'paulo77moura@gmail.com', 'paulosoaresdemoura'),
(2, 'Adenilson', '991031625', 'adenilson.dealmeida@gmail.com', 'maninhochap');

INSERT INTO prova(id, disciplina)
VALUES(784, 'Bancos de Dados Relacionais e SQL');

INSERT INTO aluno_prova(aluno_id, prova_id)
VALUES(1, 784),
(2, 784);

INSERT INTO pergunta(id, pergunta, prova_id)
VALUES (2, 'O que é um banco de dados? (0,5)', 784)
, (3, 'Explique o que é um SGBD e cite exemplos. (0,5)', 784)
, (4, 'O que são DML, DCL, DDL e DQL? (0,5)', 784)
, (5, 'O que é uma Entidade? (0,5)', 784)
, (6, 'Descreva o que é uma chave primária. (0,5)', 784)
, (7, 'Descreva o que é chave estrangeira. (0,5)', 784)
, (8, 'Cite a diferença entre chave primaria e chave estrangeira. (0,5)', 784)
, (9, 'Um campo do tipo char armazena quais valores? E do tipo int, varchar, date,
datetime? (0,5)', 784)
, (10, 'Explique a(s) diferenças entre os tipos Time, Year, DateTime e Date? (0,5)', 784)
, (11, 'Explique p/ que serve a instrução DELETE. (0,5)', 784);

INSERT INTO resposta(id, resposta, pergunta_id)
VALUES (101, 'É uma coleção organizadda de informações ou dados estruturados, armazenados em sistema de computador.', 2)
, (102, 'Sistema de gerenciamento de Banco de Dados, é um software que possui recursos capazes de manipular as informações do 
banco de dados e interagir com o usuário. Exemplos: Oracle, SQLServer, DB2, PostgreSQL, MySQL.', 3)
, (103, 'DML: Linguagem de manipulação de dados. São os comandos que interagem com os dados dentro das tabelas. INSERT, DELETE, UPDATE.
DCL: Linguagem de controle de dados. São comandos para controlar a parte de segurança  do banco de dados. GRANT, REVOKE, DENY.
DDL: Linguagem de definição de dados. São comandos que interagem com os objetos do banco de dados. CREATE, ALTER, DROP.
DQL: São comando de consulta. SELECT.', 4)
, (104,'É um tipo de modelagem conceitual, o qual procura representar de maneira abstrata os objetos de um domínio de negócio.', 5)
, (105, 'É um identificador único de um registro dentro de uma tabela, se for constituida de um campo se chama chave simples,
 se for constituida de dois ou mais campos será chamada de chave composta.', 6)
 , (106, 'É a chave que permite a referência a resgistros oriundos de outras tabelas. Ou seja, é o campo ou conjunto de campos que
 compõem a chave primária de uma outra tabela.', 7)
 , (107, 'Uma chave primaria é usada para garantir que os dados na coluna expecífica sejam exclusivos. E uma chave extrangeira é uma 
 coluna ou grupo de colunas em uma tabela de banco de dados relacional que fornece um link ou referência entre os dados em duas tabelas.', 8)
 , (108, 'CHAR: Pode ser usado tanto como numero ou como caracteres.
 INT: É o tipo de dados inteiros primário.
 VARCHAR: Referece a um tipo de dados de um campo ou coluna em um sistema de gerenciamento de banco de dados, que pode conter letras e numeros.
 DATE: Campos criados de entrada que permitem ao usuário informar uma data.
 DATETIME: Fornece as classes de data e hora. Faixa de 01/Jan/1970 até 31/Dez/9999. Formato padrão aaaa-mm-dd hh:mm:ss.', 9)
 , (109, 'TIME: Fornece as classes para a manupulação de horas.
 YEAR: Fornece as classes de ano. 
 DATETIME: Fornece as classe de data e hora.
 DATE: Fornece as classes de data.', 10)
 , (110, 'Usada para excluir ou remover todos os dados de uma tabela do banco de dados.', 11)
 
