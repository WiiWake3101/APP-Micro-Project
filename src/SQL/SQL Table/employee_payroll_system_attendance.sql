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
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `attendance_id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `attendance_date` date DEFAULT NULL,
  `status` enum('Present','Absent','Late','Excused') NOT NULL,
  `in_time` time DEFAULT NULL,
  `out_time` time DEFAULT NULL,
  `overtime` time DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`attendance_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=180 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (1,1001,'Vivek','M G','2023-10-29','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(2,1002,'Sayeeram','R','2023-10-29','Present','09:00:00','17:00:00','08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(3,1003,'Rajesh','Kumar','2023-10-29','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-09 06:12:48'),(4,1004,'Hari','Aravindh','2023-10-29','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(5,1005,'Omprakash','Babu','2023-10-29','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(6,1006,'John','Doe','2023-10-29','Absent',NULL,NULL,'08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(7,1007,'Jane','Smith','2023-10-29','Present','09:00:00','17:00:00','08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(8,1008,'Michael','Johnson','2023-10-29','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(9,1009,'Emily','Wilson','2023-10-29','Present','09:30:00','17:30:00','08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(10,1010,'David','Brown','2023-10-29','Present','09:45:00','17:45:00','08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(11,1011,'Olivia','Martinez','2023-10-29','Present','09:00:00','17:00:00','08:00:00','2023-11-08 13:46:15','2023-11-08 13:46:15'),(12,1012,'James','Taylor','2023-10-29','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(13,1013,'Sophia','Lopez','2023-10-29','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(14,1001,'Vivek','M G','2023-10-30','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(15,1002,'Sayeeram','R','2023-10-30','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(16,1003,'Rajesh','Kumar','2023-10-30','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-09 06:12:48'),(17,1004,'Hari','Aravindh','2023-10-30','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(18,1005,'Omprakash','Babu','2023-10-30','Late','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-09 06:12:48'),(19,1006,'John','Doe','2023-10-30','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(20,1007,'Jane','Smith','2023-10-30','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(21,1008,'Michael','Johnson','2023-10-30','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(22,1009,'Emily','Wilson','2023-10-30','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(23,1010,'David','Brown','2023-10-30','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(24,1011,'Olivia','Martinez','2023-10-30','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(25,1012,'James','Taylor','2023-10-30','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(26,1013,'Sophia','Lopez','2023-10-30','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(27,1001,'Vivek','M G','2023-10-31','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(28,1002,'Sayeeram','R','2023-10-31','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(29,1003,'Rajesh','Kumar','2023-10-31','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(30,1004,'Hari','Aravindh','2023-10-31','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(31,1005,'Omprakash','Babu','2023-10-31','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(32,1006,'John','Doe','2023-10-31','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(33,1007,'Jane','Smith','2023-10-31','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(34,1008,'Michael','Johnson','2023-10-31','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(35,1009,'Emily','Wilson','2023-10-31','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(36,1010,'David','Brown','2023-10-31','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(37,1011,'Olivia','Martinez','2023-10-31','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(38,1012,'James','Taylor','2023-10-31','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(39,1013,'Sophia','Lopez','2023-10-31','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(40,1001,'Vivek','M G','2023-11-01','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(41,1002,'Sayeeram','R','2023-11-01','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(42,1003,'Rajesh','Kumar','2023-11-01','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(43,1004,'Hari','Aravindh','2023-11-01','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(44,1005,'Omprakash','Babu','2023-11-01','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(45,1006,'John','Doe','2023-11-01','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(46,1007,'Jane','Smith','2023-11-01','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(47,1008,'Michael','Johnson','2023-11-01','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(48,1009,'Emily','Wilson','2023-11-01','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(49,1010,'David','Brown','2023-11-01','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(50,1011,'Olivia','Martinez','2023-10-30','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(51,1012,'James','Taylor','2023-10-30','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(52,1013,'Sophia','Lopez','2023-10-30','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(53,1001,'Vivek','M G','2023-11-02','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(54,1002,'Sayeeram','R','2023-11-02','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(55,1003,'Rajesh','Kumar','2023-11-02','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(56,1004,'Hari','Aravindh','2023-11-02','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(57,1005,'Omprakash','Babu','2023-11-02','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(58,1006,'John','Doe','2023-11-02','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(59,1007,'Jane','Smith','2023-11-02','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(60,1008,'Michael','Johnson','2023-11-02','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(61,1009,'Emily','Wilson','2023-11-02','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(62,1010,'David','Brown','2023-11-02','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(63,1001,'Vivek','M G','2023-11-03','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(64,1002,'Sayeeram','R','2023-11-03','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(65,1003,'Rajesh','Kumar','2023-11-03','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(66,1004,'Hari','Aravindh','2023-11-03','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(67,1005,'Omprakash','Babu','2023-11-03','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(68,1006,'John','Doe','2023-11-03','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(69,1007,'Jane','Smith','2023-11-03','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(70,1008,'Michael','Johnson','2023-11-03','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(71,1009,'Emily','Wilson','2023-11-03','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(72,1010,'David','Brown','2023-11-03','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(73,1011,'Olivia','Martinez','2023-11-03','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(74,1012,'James','Taylor','2023-11-03','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(75,1013,'Sophia','Lopez','2023-11-03','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(76,1001,'Vivek','M G','2023-11-04','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(77,1002,'Sayeeram','R','2023-11-04','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(78,1003,'Rajesh','Kumar','2023-11-04','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(79,1004,'Hari','Aravindh','2023-11-04','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(80,1005,'Omprakash','Babu','2023-11-04','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(81,1006,'John','Doe','2023-11-04','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(82,1007,'Jane','Smith','2023-11-04','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(83,1008,'Michael','Johnson','2023-11-04','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(84,1009,'Emily','Wilson','2023-11-04','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(85,1010,'David','Brown','2023-11-04','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(86,1011,'Olivia','Martinez','2023-11-04','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(87,1012,'James','Taylor','2023-11-04','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(88,1013,'Sophia','Lopez','2023-11-04','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(89,1001,'Vivek','M G','2023-11-05','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(90,1002,'Sayeeram','R','2023-11-05','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(91,1003,'Rajesh','Kumar','2023-11-05','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(92,1004,'Hari','Aravindh','2023-11-05','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(93,1005,'Omprakash','Babu','2023-11-05','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(94,1006,'John','Doe','2023-11-05','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(95,1007,'Jane','Smith','2023-11-05','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(96,1008,'Michael','Johnson','2023-11-05','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(97,1009,'Emily','Wilson','2023-11-05','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(98,1010,'David','Brown','2023-11-05','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(99,1011,'Olivia','Martinez','2023-11-05','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(100,1012,'James','Taylor','2023-11-05','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(101,1013,'Sophia','Lopez','2023-11-05','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(102,1001,'Vivek','M G','2023-11-06','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(103,1002,'Sayeeram','R','2023-11-06','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(104,1003,'Rajesh','Kumar','2023-11-06','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(105,1004,'Hari','Aravindh','2023-11-06','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(106,1005,'Omprakash','Babu','2023-11-06','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(107,1006,'John','Doe','2023-11-06','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(108,1007,'Jane','Smith','2023-11-06','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(109,1008,'Michael','Johnson','2023-11-06','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(110,1009,'Emily','Wilson','2023-11-06','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(111,1010,'David','Brown','2023-11-06','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(112,1011,'Olivia','Martinez','2023-11-06','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(113,1012,'James','Taylor','2023-11-06','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(114,1013,'Sophia','Lopez','2023-11-06','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(115,1001,'Vivek','M G','2023-11-07','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(116,1002,'Sayeeram','R','2023-11-07','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(117,1003,'Rajesh','Kumar','2023-11-07','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(118,1004,'Hari','Aravindh','2023-11-07','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(119,1005,'Omprakash','Babu','2023-11-07','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(120,1006,'John','Doe','2023-11-07','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(121,1007,'Jane','Smith','2023-11-07','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(122,1008,'Michael','Johnson','2023-11-07','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(123,1009,'Emily','Wilson','2023-11-07','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(124,1010,'David','Brown','2023-11-07','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(125,1011,'Olivia','Martinez','2023-11-07','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(126,1012,'James','Taylor','2023-11-07','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(127,1013,'Sophia','Lopez','2023-11-07','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(128,1001,'Vivek','M G','2023-11-08','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(129,1002,'Sayeeram','R','2023-11-08','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(130,1003,'Rajesh','Kumar','2023-11-08','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(131,1004,'Hari','Aravindh','2023-11-08','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(132,1005,'Omprakash','Babu','2023-11-08','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(133,1006,'John','Doe','2023-11-08','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(134,1007,'Jane','Smith','2023-11-08','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(135,1008,'Michael','Johnson','2023-11-08','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(136,1009,'Emily','Wilson','2023-11-08','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(137,1010,'David','Brown','2023-11-08','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(138,1011,'Olivia','Martinez','2023-11-08','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(139,1012,'James','Taylor','2023-11-08','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(140,1013,'Sophia','Lopez','2023-11-08','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(141,1001,'Vivek','M G','2023-11-09','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(142,1002,'Sayeeram','R','2023-11-09','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(143,1003,'Rajesh','Kumar','2023-11-09','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(144,1004,'Hari','Aravindh','2023-11-09','Late','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(145,1005,'Omprakash','Babu','2023-11-09','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(146,1006,'John','Doe','2023-11-09','Absent',NULL,NULL,NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(147,1007,'Jane','Smith','2023-11-09','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(148,1008,'Michael','Johnson','2023-11-09','Present','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(149,1009,'Emily','Wilson','2023-11-09','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(150,1010,'David','Brown','2023-11-09','Present','09:45:00','17:45:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(151,1011,'Olivia','Martinez','2023-11-09','Present','09:00:00','17:00:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(152,1012,'James','Taylor','2023-11-09','Late','09:15:00','17:15:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(153,1013,'Sophia','Lopez','2023-11-09','Present','09:30:00','17:30:00',NULL,'2023-11-08 13:46:15','2023-11-08 13:46:15'),(154,1001,'Vivek','M G','2023-11-10','Late','09:10:00','17:10:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(155,1002,'Sayeeram','R','2023-11-10','Late','09:20:00','17:20:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(156,1003,'Rajesh','Kumar','2023-11-10','Late','09:30:00','17:30:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(157,1004,'Hari','Aravindh','2023-11-10','Late','09:40:00','17:40:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(158,1005,'Omprakash','Babu','2023-11-10','Present','09:50:00','17:50:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(159,1006,'John','Doe','2023-11-10','Absent',NULL,NULL,NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(160,1007,'Jane','Smith','2023-11-10','Present','09:00:00','17:00:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(161,1008,'Michael','Johnson','2023-11-10','Present','09:15:00','17:15:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(162,1009,'Emily','Wilson','2023-11-10','Present','09:30:00','17:30:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(163,1010,'David','Brown','2023-11-10','Present','09:45:00','17:45:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(164,1011,'Olivia','Martinez','2023-11-10','Present','09:00:00','17:00:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(165,1012,'James','Taylor','2023-11-10','Late','09:15:00','17:15:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(166,1013,'Sophia','Lopez','2023-11-10','Present','09:30:00','17:30:00',NULL,'2023-11-09 14:31:17','2023-11-09 14:31:17'),(167,1001,'Vivek','M G','2023-11-11','Late','09:15:00','17:15:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(168,1002,'Sayeeram','R','2023-11-11','Late','09:25:00','17:25:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(169,1003,'Rajesh','Kumar','2023-11-11','Late','09:35:00','17:35:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(170,1004,'Hari','Aravindh','2023-11-11','Late','09:45:00','17:45:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(171,1005,'Omprakash','Babu','2023-11-11','Present','09:55:00','17:55:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(172,1006,'John','Doe','2023-11-11','Absent',NULL,NULL,NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(173,1007,'Jane','Smith','2023-11-11','Present','09:10:00','17:10:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(174,1008,'Michael','Johnson','2023-11-11','Present','09:20:00','17:20:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(175,1009,'Emily','Wilson','2023-11-11','Present','09:30:00','17:30:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(176,1010,'David','Brown','2023-11-11','Present','09:40:00','17:40:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(177,1011,'Olivia','Martinez','2023-11-11','Present','09:00:00','17:00:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(178,1012,'James','Taylor','2023-11-11','Late','09:10:00','17:10:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22'),(179,1013,'Sophia','Lopez','2023-11-11','Present','09:20:00','17:20:00',NULL,'2023-11-09 14:31:22','2023-11-09 14:31:22');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
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
