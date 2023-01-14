-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.30

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
  `ques_id` int NOT NULL AUTO_INCREMENT,
  `ans` int NOT NULL,
  `chose` int NOT NULL,
  `optiona` varchar(255) DEFAULT NULL,
  `optionb` varchar(255) DEFAULT NULL,
  `optionc` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ques_id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,3,-1,'700','100','666','Find the sum of 111 + 222 + 333'),(2,2,-1,'376','375','374','Subtract 457 from 832'),(3,3,-1,'500','2500','None of these','50 times 5 is equal to'),(4,1,-1,'9','10','11','90 ÷ 10'),(5,3,-1,'32','56','46','Simplify: 26 + 32 - 12'),(6,2,-1,'372','216','106','Find the product of 72 × 3'),(7,2,-1,'105','176','325','Solve : 200 – (96 ÷ 4)'),(8,3,-1,'27','26','25','Solve : 24 + 4 ÷ 4'),(9,2,-1,'-1','0','1','Simplify : 3 + 6 x (5 + 4) ÷ 3 - 7'),(10,3,-1,'2','1','0','Simplify :150 ÷ (6 + 3 x 8) - 5'),(11,1,-1,'23','24','25','19 + ……. = 42 '),(12,2,-1,' €',' π',' Ω',' What is the symbol of pi?'),(13,1,-1,'7, 12, 21, 29, 36 ','36, 29, 7, 21, 12','36, 29, 21, 12, 7 ',' Arrange the numbers in ascending order: 36, 12, 29, 21, 7. '),(14,2,-1,'11','55','99 ',' What is the greatest two digit number? '),(15,1,-1,'71','89','109',' How much is 90 – 19?'),(16,3,-1,'3','7','1','20 is divisible by ……… '),(17,1,-1,'17','24','35','Find the value of x; if x = (2 × 3) + 11.'),(18,3,-1,' 101 ',' 999 ','100 ',' What is the smallest three digit number? '),(19,2,-1,' 240',' 261',' 119',' How much is 190 – 87 + 16?'),(20,2,-1,'1','1000','1001',' What is 1000 × 1 equal to?'),(21,3,-1,' Two digits',' Three digits',' Four digits ','How many digits are there in 10000?'),(22,3,-1,' 17',' 18 ',' 19',' Complete the sequence 13, 16, ……, 22.'),(23,1,-1,' 97 ',' 98 ',' 99 ',' What is the largest two digits prime number?'),(24,1,-1,'  0.1 ','  0.01','  0.001  ',' 1 dime = …….. dollar'),(25,3,-1,' 4 ',' 3 ',' 2 ',' How many factors are there in 71?'),(26,1,-1,' 15/17 ',' 15/18 ',' 15/19 ',' Which is the largest number in 15/17, 15/18, 15/19, 15/21?'),(27,3,-1,' 20.5',' 21.5 ',' 22.5 ','What is the average value of 25, 20, 23 and 22?'),(28,2,-1,' Odd ',' Prime ',' None of these ',' 2 is a …………… number.'),(29,3,-1,' 13 ',' 15 ',' 17 ',' What is the sum of one digit prime numbers?'),(30,3,-1,' 1 hours ',' 1.30 hours ',' 1.50 hours ',' How many hours in 90 minutes?');
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

-- Dump completed on 2022-10-16 22:02:13
