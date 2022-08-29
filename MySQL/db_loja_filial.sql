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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 10:55:26
