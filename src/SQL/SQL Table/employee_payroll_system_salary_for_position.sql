CREATE DATABASE  IF NOT EXISTS `employee_payroll_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employee_payroll_system`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: employee_payroll_system
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `salary_for_position`
--

DROP TABLE IF EXISTS `salary_for_position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary_for_position` (
  `PositionID` int NOT NULL AUTO_INCREMENT,
  `PositionName` varchar(255) NOT NULL,
  `HourlySalary` decimal(10,2) NOT NULL,
  `MonthlySalary` decimal(10,2) NOT NULL,
  `YearlySalary` decimal(10,2) NOT NULL,
  `OvertimePerHour` decimal(10,2) NOT NULL,
  PRIMARY KEY (`PositionID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_for_position`
--

LOCK TABLES `salary_for_position` WRITE;
/*!40000 ALTER TABLE `salary_for_position` DISABLE KEYS */;
INSERT INTO `salary_for_position` VALUES (1,'Human Resources Manager',240.38,500000.00,6000000.00,250.00),(2,'Software Development Manager',192.31,400000.00,4800000.00,200.00),(3,'Frontend Developer',31.25,65000.00,780000.00,40.00),(4,'Backend Developer',34.62,72000.00,864000.00,45.00),(5,'Full-Stack Developer',288.46,600000.00,7200000.00,350.00),(6,'UX/UI Design',27.88,58000.00,696000.00,40.00),(7,'Data Scientist',192.31,400000.00,4800000.00,200.00),(8,'Product Manager',34.62,72000.00,864000.00,45.00),(9,'Sales Representative',2.31,4810.00,57720.00,25.00),(10,'Customer Support Specialist',0.84,1750.00,21000.00,15.00),(11,'Human Resources Manager',240.38,500000.00,6000000.00,250.00),(12,'Software Development Manager',192.31,400000.00,4800000.00,200.00),(13,'Frontend Developer',31.25,65000.00,780000.00,40.00),(14,'Backend Developer',34.62,72000.00,864000.00,45.00),(15,'Full-Stack Developer',288.46,600000.00,7200000.00,350.00),(16,'UX/UI Design',27.88,58000.00,696000.00,40.00),(17,'Data Scientist',192.31,400000.00,4800000.00,200.00),(18,'Product Manager',34.62,72000.00,864000.00,45.00),(19,'Sales Representative',2.31,4810.00,57720.00,25.00),(20,'Customer Support Specialist',0.84,1750.00,21000.00,15.00);
/*!40000 ALTER TABLE `salary_for_position` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-11 18:03:08
