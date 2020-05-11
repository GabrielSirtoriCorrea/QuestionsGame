CREATE DATABASE  IF NOT EXISTS `questionsgame` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `questionsgame`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: questionsgame
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `SchoolSubject` varchar(20) DEFAULT NULL,
  `ImagePath` text,
  `Response` char(1) DEFAULT NULL,
  `ResolvePath` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'Fisica','Game/QuestionsGame/src/main/resources/GameImages/Questions/FisicaQuestao1.png','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/FisicaResposta1.jpg'),(2,'Quimica','Game/QuestionsGame/src/main/resources/GameImages/Questions/QuimicaQuestao1.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/QuimicaResposta1.jpg'),(3,'Historia','Game/QuestionsGame/src/main/resources/GameImages/Questions/HistoriaQuestao1.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/HistoriaResposta1.jpg'),(4,'Quimica','Game/QuestionsGame/src/main/resources/GameImages/Questions/QuimicaQuestao2.jpg','E','Game/QuestionsGame/src/main/resources/GameImages/Answers/QuimicaResposta2.jpg'),(5,'Biologia','Game/QuestionsGame/src/main/resources/GameImages/Questions/BiologiaQuestao1.jpg','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/BiologiaResposta1.jpg'),(6,'Geografia','Game/QuestionsGame/src/main/resources/GameImages/Questions/GeografiaQuestao1.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/GeografiaResposta1.jpg'),(7,'Matematica','Game/QuestionsGame/src/main/resources/GameImages/Questions/MatematicaQuestao1.jpg','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/MatematicaResposta1.jpg'),(8,'Fiolosofia','Game/QuestionsGame/src/main/resources/GameImages/Questions/FilosofiaQuestao1.jpg','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/FilosofiaResposta1.jpg'),(9,'Sociologia','Game/QuestionsGame/src/main/resources/GameImages/Questions/SociologiaQuestao1.jpg','B','Game/QuestionsGame/src/main/resources/GameImages/Answers/SociologiaResposta1.jpg'),(10,'Lingua Portuguesa','Game/QuestionsGame/src/main/resources/GameImages/Questions/PortuguesQuestao1.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/PortuguesResposta1.jpg'),(11,'Arte','Game/QuestionsGame/src/main/resources/GameImages/Questions/ArteQuestao1.jpg','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/ArteResposta1.jpg'),(12,'Ingles','Game/QuestionsGame/src/main/resources/GameImages/Questions/InglesQuestao1.jpg','B','Game/QuestionsGame/src/main/resources/GameImages/Answers/InglesResposta1.jpg'),(13,'Fisica','Game/QuestionsGame/src/main/resources/GameImages/Questions/FisicaQuestao2.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/FisicaResposta2.jpg'),(14,'Matematica','Game/QuestionsGame/src/main/resources/GameImages/Questions/MatematicaQuestao2.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/MatematicaResposta2.jpg'),(15,'Historia','Game/QuestionsGame/src/main/resources/GameImages/Questions/HistoriaQuestao2.jpg','E','Game/QuestionsGame/src/main/resources/GameImages/Answers/HistoriaResposta2.jpg'),(16,'Biologia','Game/QuestionsGame/src/main/resources/GameImages/Questions/BiologiaQuestao2.jpg','E','Game/QuestionsGame/src/main/resources/GameImages/Answers/BiologiaResposta2.jpg'),(17,'Geografia','Game/QuestionsGame/src/main/resources/GameImages/Questions/GeografiaQuestao2.jpg','B','Game/QuestionsGame/src/main/resources/GameImages/Answers/GeografiaResposta2.jpg'),(18,'Portugues','Game/QuestionsGame/src/main/resources/GameImages/Questions/PortuguesQuestao2.jpg','C','Game/QuestionsGame/src/main/resources/GameImages/Answers/PortuguesResposta2.jpg'),(19,'Filosofia','Game/QuestionsGame/src/main/resources/GameImages/Questions/FilosofiaQuestao2.jpg','E','Game/QuestionsGame/src/main/resources/GameImages/Answers/FilosofiaResposta2.jpg'),(20,'Sociologia','Game/QuestionsGame/src/main/resources/GameImages/Questions/SociologiaQuestao2.jpg','D','Game/QuestionsGame/src/main/resources/GameImages/Answers/SociologiaResposta2.jpg');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-11 20:07:49
