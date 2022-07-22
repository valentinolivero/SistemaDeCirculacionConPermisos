CREATE DATABASE  IF NOT EXISTS `bd_cuidar` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd_cuidar`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_cuidar
-- ------------------------------------------------------
-- Server version	5.5.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Localidad`
--

DROP TABLE IF EXISTS `Localidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localidad` (
  `idLocalidad` int(11) NOT NULL,
  `codPostal` varchar(45) DEFAULT NULL,
  `cumplirCuarentena` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idLocalidad`),
  CONSTRAINT `fk_lugar_2` FOREIGN KEY (`idLocalidad`) REFERENCES `lugar` (`idLugar`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localidad`
--

LOCK TABLES `Localidad` WRITE;
/*!40000 ALTER TABLE `Localidad` DISABLE KEYS */;
INSERT INTO `Localidad` VALUES (1,'1832',0),(3,'7600',1),(5,'1900',0);
/*!40000 ALTER TABLE `Localidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Lugar`
--

DROP TABLE IF EXISTS `Lugar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lugar` (
  `idLugar` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(35) NOT NULL,
  PRIMARY KEY (`idLugar`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lugar`
--

LOCK TABLES `Lugar` WRITE;
/*!40000 ALTER TABLE `Lugar` DISABLE KEYS */;
INSERT INTO `Lugar` VALUES (1,'Lomas de Zamora'),(2,'Ministerio de Educacion'),(3,'Mar del Plata'),(4,'Hospital Gandulfo'),(5,'La Plata');
/*!40000 ALTER TABLE `Lugar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permiso`
--

DROP TABLE IF EXISTS `Permiso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Permiso` (
  `idPermiso` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `idPersona` int(11) NOT NULL,
  `dias` int(11) DEFAULT NULL,
  `idRodado` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPermiso`),
  KEY `fk_Permiso_1_idx` (`idPersona`),
  KEY `fk_Permiso_2_idx` (`idRodado`),
  CONSTRAINT `fk_Permiso_1` FOREIGN KEY (`idPersona`) REFERENCES `Persona` (`idPersona`),
  CONSTRAINT `fk_Permiso_2` FOREIGN KEY (`idRodado`) REFERENCES `Rodado` (`idRodado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permiso`
--

LOCK TABLES `Permiso` WRITE;
/*!40000 ALTER TABLE `Permiso` DISABLE KEYS */;
INSERT INTO `Permiso` VALUES (1,'2021-03-30',1,1,1),(2,'2021-04-20',2,5,2),(3,'2021-04-30',1,1,2),(4,'2021-05-20',2,5,1);
/*!40000 ALTER TABLE `Permiso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permisoxlugar`
--

DROP TABLE IF EXISTS `permisoxlugar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permisoxlugar` (
  `idPermiso` int(11) NOT NULL,
  `idLugar` int(11) NOT NULL,
  PRIMARY KEY (`idPermiso`,`idLugar`),
  KEY `fk_PermisoXLugar_2_idx` (`idLugar`),
  CONSTRAINT `fk_PermisoXLugar_1` FOREIGN KEY (`idPermiso`) REFERENCES `Permiso` (`idPermiso`),
  CONSTRAINT `fk_PermisoXLugar_2` FOREIGN KEY (`idLugar`) REFERENCES `Lugar` (`idLugar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permisoxlugar`
--

LOCK TABLES `permisoxlugar` WRITE;
/*!40000 ALTER TABLE `permisoxlugar` DISABLE KEYS */;
INSERT INTO `permisoxlugar` VALUES (1,1),(4,1),(1,2),(2,3),(4,3),(3,4),(2,5),(3,5);
/*!40000 ALTER TABLE `permisoxlugar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
INSERT INTO `Persona` VALUES (1,11111111,'Lopez','Claudia'),(2,22222222,'Rodriguez','Juan');
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rodado`
--

DROP TABLE IF EXISTS `Rodado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Rodado` (
  `idRodado` int(11) NOT NULL AUTO_INCREMENT,
  `dominio` varchar(10) NOT NULL,
  `vehiculo` varchar(30) NOT NULL,
  PRIMARY KEY (`idRodado`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rodado`
--

LOCK TABLES `Rodado` WRITE;
/*!40000 ALTER TABLE `Rodado` DISABLE KEYS */;
INSERT INTO `Rodado` VALUES (1,'AAA111','Citroen C4'),(2,'CCC333','Ford Ka');
/*!40000 ALTER TABLE `Rodado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ubicacion`
--

DROP TABLE IF EXISTS `Ubicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ubicacion` (
  `idUbicacion` int(11) NOT NULL,
  `longitud` int(11) DEFAULT NULL,
  `latitud` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUbicacion`),
  CONSTRAINT `fk_lugar_1` FOREIGN KEY (`idUbicacion`) REFERENCES `lugar` (`idLugar`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ubicacion`
--

LOCK TABLES `Ubicacion` WRITE;
/*!40000 ALTER TABLE `Ubicacion` DISABLE KEYS */;
INSERT INTO `Ubicacion` VALUES (2,-3459780,-5839116),(4,-3476167,-5839233);
/*!40000 ALTER TABLE `Ubicacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-25 12:42:15
