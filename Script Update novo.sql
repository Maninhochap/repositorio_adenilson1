CREATE DATABASE  IF NOT EXISTS `db_loja` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_loja`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_loja
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Alexandre','Souza'),(2,'Douglas','Silva'),(3,'Douglas','Silva'),(4,'Marcelo','Camargo'),(5,'Regina','Camargo'),(6,'Regina','Almeida'),(7,'Vanessa','Almeida'),(8,'Gessy','Almeida'),(9,'Antonio','Almeida'),(10,'Maria','Cecilia');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Primeira'),(2,'Bolos'),(3,'Bolacha'),(4,'Computador'),(5,'Eletronica'),(6,'Padaria'),(7,'Bancos'),(8,'Zóias'),(9,'Reformas'),(10,'Ferragem');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contato`
--

DROP TABLE IF EXISTS `contato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `ddd` int DEFAULT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  `data_nasc` varchar(10) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contato`
--

LOCK TABLES `contato` WRITE;
/*!40000 ALTER TABLE `contato` DISABLE KEYS */;
INSERT INTO `contato` VALUES (1,'Renato','Pereira',49,'992314563','12051960','renato@gmail.com'),(2,'Carlos','Souza',55,'99652 2135','21/02/1963','souza@gmail.com'),(3,'Bianca','Correa',48,'98756 3512','12/10/1997','bianca@gmail.com'),(4,'Rogerio','Bucha',49,'98564 3265','03/10/1981','rogerio@gmail.com'),(5,'Salazar','Trevisan',49,'96587 6532','13/02/1945','trevisan@yahoo.com'),(6,'Maria','Fidelis',49,'96548 3565','21/09/2010','maria@hotmail.com'),(7,'Felipe','almeida',45,'95645 2587','19/12/2008','felipe@yahoo.com'),(8,'Antonio','Fidelis',49,'98759 4578','23/12/1956','antonio@gmail.com'),(9,'Felicina','Zancanaro',45,'91232 6578','01/08/2000','felicina@gmail.com'),(10,'Jandir','Fidelis',49,'91245 7865','10/04/1984','fidelis@gmail.com');
/*!40000 ALTER TABLE `contato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `nivel` varchar(45) DEFAULT NULL,
  `data_inicio` varchar(10) DEFAULT NULL,
  `data_fim` varchar(10) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Douglas','iniciante','0','0','Gratuito'),(2,'Douglas','iniciante','10022022','16122022','Gratuito'),(3,'Informatica','Medio','01/02/2019','23/12/2020','2500,00'),(4,'Programação','Avancado','13/02/2022','26/12/2022','Gratuito'),(5,'Administração','Iniciante','10/02/2018','20/12/2021','40.000,00'),(6,'Marketing','3 periodo','10/05/2015','13/06/2020','35.000,00'),(7,'Contabilidade','6 Periodo','01/03/2010','14/11/2019','32.000,00'),(8,'Agronomia','2 Preriodo','04/05/2012','21/11/2018','21.000,00'),(9,'Medicina','5 Periodo','06/06/2016','04/07/2022','150.000,00'),(10,'Enfermagem','7 Periodo','01/04/2018','06/09/2024','34.500,00');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editora`
--

DROP TABLE IF EXISTS `editora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editora` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editora`
--

LOCK TABLES `editora` WRITE;
/*!40000 ALTER TABLE `editora` DISABLE KEYS */;
INSERT INTO `editora` VALUES (1,'Novo Mundo'),(2,'Unochapecó'),(3,'Almeida'),(4,'Inovação'),(5,'Fidelis'),(6,'Categoria'),(7,'Ensinando'),(8,'Eventos'),(9,'Aprendendo'),(10,'Informatica'),(11,'Almeida@gmail.com'),(12,'Inovação@gmail.com'),(13,'Fidelis@gmail.coom'),(14,'Categoria@gmail.com'),(15,'Ensinando@mail.com'),(16,'Eventos@gmail.com'),(17,'Aprendendo@gmail.com'),(18,'Informatica@gmail.com');
/*!40000 ALTER TABLE `editora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `email` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email`
--

LOCK TABLES `email` WRITE;
/*!40000 ALTER TABLE `email` DISABLE KEYS */;
INSERT INTO `email` VALUES (1,'novoemail@gmail.com'),(2,'Unochapecó@gmail.com');
/*!40000 ALTER TABLE `email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filial`
--

DROP TABLE IF EXISTS `filial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filial` (
  `id` int NOT NULL AUTO_INCREMENT,
  `razaoSocial` varchar(100) NOT NULL,
  `nomeFantasiaFilial` varchar(100) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `cep` varchar(15) NOT NULL,
  `estado` varchar(25) NOT NULL,
  `pais` varchar(25) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `inscricaoEstadual` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filial`
--

LOCK TABLES `filial` WRITE;
/*!40000 ALTER TABLE `filial` DISABLE KEYS */;
INSERT INTO `filial` VALUES (1,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(2,'Almeida','Almeida Oficial','Nilo Ficagna','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(3,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(4,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(5,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(6,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(7,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(8,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(9,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843'),(10,'Unberto','Unberto ps','Olavo bilak','Chapecó','89.456.657','SC','Brasil','89.325.326/0001-98','326.356.843');
/*!40000 ALTER TABLE `filial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `razaoSocial` varchar(45) DEFAULT NULL,
  `nomeFantasia` varchar(45) DEFAULT NULL,
  `inscricaoEstadual` varchar(45) DEFAULT NULL,
  `cnpj` varchar(20) NOT NULL,
  `produtoServico` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `cep` varchar(15) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `website` varchar(45) DEFAULT NULL,
  `observacoes` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES ('Adenilson Almeida','PS Almeida','325.365.568','10.365.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','11.365.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','12.365.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','15.332.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','15.365.445/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','15.365.498/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','15.366.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','15.368.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson Almeida','PS Almeida','325.365.568','18.365.486/0001-65','Carga','rua Novo mundo','89.456.654','Chapecó','SC','novomundo@gmail.com','www.novomundo.com.br','não tem'),('Adenilson de Almeida','Prest. Serviços Almeida','321.365.256','41.673.947/0001-40','Serviço','Irinei Bornhausen, 921','89.821.650','Chapecó','SC','psalmeida@outlook.com','não tem','não tem');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `livro`
--

DROP TABLE IF EXISTS `livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `livro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `isbn13` varchar(45) DEFAULT NULL,
  `isbn10` varchar(45) DEFAULT NULL,
  `data_publicacao` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livro`
--

LOCK TABLES `livro` WRITE;
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` VALUES (1,'MYSQL','não tem','não tem','10/02/2001','R$ 125,00'),(2,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(3,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(4,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(5,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(6,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(7,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(8,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(9,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00'),(10,'Adenilson Almeida','PS Almeida','325.365.568','12/02/1965','350,00');
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,'Encanamento'),(2,'Odontologia'),(3,'Pedagogia'),(4,'Medicina'),(5,'Agronomia'),(6,'Enfermagem'),(7,'Ciencia Contabeis'),(8,'Engenharia Computação'),(9,'Odontologia'),(10,'Odontologia');
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensagem`
--

DROP TABLE IF EXISTS `mensagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensagem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mensagem` varchar(45) DEFAULT NULL,
  `remetente` varchar(45) DEFAULT NULL,
  `destinatario` varchar(45) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensagem`
--

LOCK TABLES `mensagem` WRITE;
/*!40000 ALTER TABLE `mensagem` DISABLE KEYS */;
INSERT INTO `mensagem` VALUES (1,'Prioridade','carlos@gmail.com','psservicos@outlook.com','10/05/2022','14:23'),(2,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(3,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(4,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(5,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(6,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(7,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(8,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(9,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35'),(10,'Risco','eu@gmail.com','nos@gmail.com','15/02/2001','21:35');
/*!40000 ALTER TABLE `mensagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prioridade`
--

DROP TABLE IF EXISTS `prioridade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prioridade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prioridade`
--

LOCK TABLES `prioridade` WRITE;
/*!40000 ALTER TABLE `prioridade` DISABLE KEYS */;
INSERT INTO `prioridade` VALUES (1,'Alta'),(2,'Alta'),(3,'Alta'),(4,'Alta'),(5,'Alta'),(6,'Alta'),(7,'Alta'),(8,'Alta'),(9,'Alta'),(10,'Alta');
/*!40000 ALTER TABLE `prioridade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `disciplina` varchar(45) DEFAULT NULL,
  `data_admissao` varchar(10) DEFAULT NULL,
  `data_nascimento` varchar(10) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'Alexandre','Santos','Programação Orientada a Objeto','02/02/2022','10/05/1961','988651032'),(2,'Alexandre','Santos','Programação Orientada a Objeto','02/02/2022','10/05/1961','988651032'),(3,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(4,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(5,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(6,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(7,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(8,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(9,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245'),(10,'Renato','Arruda','Computação','01/03/2022','01/02/1972','96545 3245');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setor`
--

DROP TABLE IF EXISTS `setor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setor` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sigla` varchar(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setor`
--

LOCK TABLES `setor` WRITE;
/*!40000 ALTER TABLE `setor` DISABLE KEYS */;
INSERT INTO `setor` VALUES (1,'Administração','adm'),(2,'Admnistração','Adm'),(3,'Admnistração','Adm'),(4,'Admnistração','Adm'),(5,'Admnistração','Adm'),(6,'Admnistração','Adm'),(7,'Admnistração','Adm'),(8,'Admnistração','Adm'),(9,'Admnistração','Adm'),(10,'Admnistração','Adm');
/*!40000 ALTER TABLE `setor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `celular` varchar(15) NOT NULL,
  `setor` varchar(45) NOT NULL,
  `filial` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Adenilson','adenilson.dealmeida@gmail.com','(49)991031625','Compras','Chapecó','Adenilson123','365421'),(2,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(3,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(4,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(5,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(6,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(7,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(8,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(9,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455'),(10,'Adenilson','adenilson@gmail.com','(49)99324 6545','Adm','Chapecó','adenilsonadm','3216455');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_loja'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 11:15:19
