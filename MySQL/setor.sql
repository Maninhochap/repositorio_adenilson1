USE db_loja;
CREATE TABLE IF NOT EXISTS setor(id int unsigned not null auto_increment primary key
, nome varchar(45) not null
, sigla varchar(8) not null
);