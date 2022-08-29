USE db_prova;

SELECT id, nome, celular, email
FROM aluno;

SELECT *
FROM aluno;

SELECT id,
 disciplina
FROM prova;

SELECT id, pergunta
FROM pergunta;

SELECT id, resposta
FROM resposta;

SELECT P.pergunta, R.resposta 
FROM pergunta as P
, resposta as R
WHERE P.id = R.pergunta_id;

SELECT pergunta 
FROM pergunta 
WHERE pergunta LIKE "O que%";

SELECT nome, celular
FROM aluno
WHERE nome LIKE '%son';

SELECT nome, celular
FROM aluno
WHERE nome REGEXP '[ulo-son]';

SELECT id, pergunta FROM pergunta WHERE id = 2;

SELECT id, pergunta
FROM pergunta 
WHERE id LIKE 2 OR id  LIKE 5 OR id LIKE 7;

USE sakila;

SELECT title
FROM film
WHERE title REGEXP '^[id<50]'
ORDER BY title ASC;

SELECT CONCAT(title, "duração de", (length DIV 60)
, ":", ROUND( ( (length / 60) - (length DIV 60)) * 100,0), "min") as "Filme e duração"
, length AS "tempo em minutos"
FROM film;

SELECT COUNT(*) AS filmes_cadastrados
FROM film;

SELECT title AS filme,
length AS duração
FROM film
WHERE length = 90
ORDER BY length ASC;

