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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmployeeID` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Gender` enum('Male','Female','Other') NOT NULL,
  `Email` varchar(255) NOT NULL,
  `PhoneNumber` varchar(20) NOT NULL,
  `Address1` varchar(255) NOT NULL,
  `Address2` varchar(255) NOT NULL,
  `State` varchar(255) NOT NULL,
  `AlternativeEmail` varchar(255) NOT NULL,
  `AlternativePhoneNumber` varchar(20) NOT NULL,
  `District` varchar(255) NOT NULL,
  `Department` varchar(255) NOT NULL,
  `Designation` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `DateHired` date NOT NULL,
  `JobTitle` varchar(255) NOT NULL,
  `Salary` decimal(10,2) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=1022 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1001,'Vivek','M G','2004-01-31','Male','vm4512@srmist.edu.in','7904388983','56 Giri Road','T Nagar','Tamil Nadu','vivekmg3101@gmail.com','7010966284','Chennai','CS','Manager','Active','2022-06-01','Human Resources Manager',5000000.00,NULL),(1002,'Sayeeram','R','2004-10-04','Male','sayeeramr@gmail.com','1234567890','abc Nagar','abc area','Tamil Nadu','abc@gmail.com','1234567890','Villapuram','CS','Developer','Active','2021-12-26','Software Development Manager',500000.00,NULL),(1003,'Rajesh','Kumar','2003-12-28','Male','abc@gmail.com','0123456789','abc','abc','Tamil Nadu','abc@gmail.com','0123456789','Madurai','Support','Member','Active','2041-12-29','Sales Representative',10000.00,NULL),(1004,'Hari','Aravindh','2004-05-26','Male','ha7014@gmail.com','0123456789','85 ASKT Nagar','Bypass Road','Tamil Nadu','KingHari26@gmail.com','0123456789','Sivakasi','CS','Member','Active','2023-01-01','Data Scientist',400000.00,NULL),(1005,'Omprakash','Babu','2005-04-16','Male','ob5065@srmist.edu.in','0123456789','abc','abc','Tamil Nadu','abc@gmail.com','0123456789','Chengalpattu','CS','Developer','Active','2023-10-28','Full-Stack Developer',600000.00,NULL),(1006,'John','Doe','1980-05-10','Male','john.doe@email.com','123-456-7890','123 Main St','Apt 4B','California','john.alternate@email.com','987-654-3210','Los Angeles','HR','Human Resources Manager','Active','2005-02-15','Human Resources Manager',75000.00,NULL),(1007,'Jane','Smith','1990-02-22','Female','jane.smith@email.com','987-654-3210','456 Elm St','Unit 2C','New York','jane.alternate@email.com','123-456-7890','New York','IT','Software Development Manager','Active','2015-07-10','Software Development Manager',85000.00,NULL),(1008,'Michael','Johnson','1985-08-15','Male','michael.johnson@email.com','555-555-5555','789 Oak Dr','Apt 7D','Texas','michael.alternate@email.com','444-444-4444','Houston','IT','Frontend Developer','Active','2010-04-20','Frontend Developer',65000.00,NULL),(1009,'Emily','Wilson','1993-04-30','Female','emily.wilson@email.com','111-111-1111','321 Pine Rd','Suite 3A','Florida','emily.alternate@email.com','222-222-2222','Miami','IT','Backend Developer','Active','2012-11-30','Backend Developer',72000.00,NULL),(1010,'David','Brown','1977-06-05','Male','david.brown@email.com','333-333-3333','567 Cedar Ave','Apt 1B','California','david.alternate@email.com','777-777-7777','San Francisco','IT','Full-Stack Developer','Active','2008-09-25','Full-Stack Developer',60000.00,NULL),(1011,'Olivia','Martinez','1990-01-18','Female','olivia.martinez@email.com','777-777-7777','654 Redwood Ln','Unit 5E','California','olivia.alternate@email.com','333-333-3333','Los Angeles','IT','UX/UI Design','Active','2013-03-12','UX/UI Design',58000.00,NULL),(1012,'James','Taylor','1988-09-12','Male','james.taylor@email.com','222-222-2222','987 Birch St','Apt 6C','Texas','james.alternate@email.com','888-888-8888','Dallas','IT','Data Scientist','Active','2011-06-08','Data Scientist',67000.00,NULL),(1013,'Sophia','Lopez','1995-11-25','Female','sophia.lopez@email.com','999-999-9999','234 Oakwood Dr','Suite 4D','Florida','sophia.alternate@email.com','666-666-6666','Miami','IT','Product Manager','Active','2014-02-19','Product Manager',72000.00,NULL),(1016,'Harshak B','B','2023-11-30','Male','harshakb@gmail.com','7904388983','abc street','abc street','Tamil Nadu','harshakb@gmail.com','0123456789','Chennai','CS','Staff','Active','2023-10-31','Backend Developer',500000.00,NULL),(1018,'Johnson','Prince','2004-12-14','Male','jp4950@srmist.edu.in','7904388983','abc','abc','Tamil Nadu','jp4950@srmist.edu.in','0123456789','Chennai','CS','Active','Active','2023-11-04','Backend Developer',1000000.00,'JP6924'),(1019,'SRINITHISH','S M','2023-11-14','Male',' sm2920@srmist.edu.in','7904388983','Abc','Abc','Tamil Nadu',' sm2920@srmist.edu.in','0123456789','Mettur','Marketing','Manager','Active','2023-11-04','Product Manager',500000.00,NULL),(1020,'VIGNESH','VENKATESAN','2004-11-04','Male','vv6644@srmist.edu.in','0123456789','abc','abc','Tamil Nadu','vv6644@srmist.edu.in','0123456789','Vellore','Support','Manager','Active','2023-11-04','Product Manager',50000.00,NULL),(1021,'Geetharani','M','1974-04-08','Female','m.geetharani@yahoo.co.in','9444927932','Abc Nagar','Abc Area','Tamil Nadu','m.geetharani@yahoo.co.in','9444802345','Chennai','Desginer','Designer','Active','2023-11-10','UX/UI Design',400000.00,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
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
