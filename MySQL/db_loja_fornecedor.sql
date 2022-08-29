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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 10:55:26
