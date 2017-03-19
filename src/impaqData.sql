-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: impaq
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `barCode` int(11) NOT NULL,
  `productName` varchar(20) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`barCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'asparagus',1.23),(2,'apple',2.54),(3,'almond',4.35),(4,'applesauce',4.87),(5,'bacon',7.44),(6,'bagels',2.55),(7,'beans',3.59),(8,'barley',4.57),(9,'beer',5.33),(10,'bread',1.47),(11,'broccoli',2.35),(12,'buritto',3.55),(13,'cabbage',4.57),(14,'cake',1.77),(15,'carrots',9.88),(16,'celery',2.54),(17,'cheese',3.24),(18,'chicken',1.33),(19,'chips',8.88),(20,'chocolate',2.45),(21,'coffee',1.33),(22,'cookies',1.22),(23,'corn',9.87),(24,'cupcakes',8.78),(25,'crab',3.55),(26,'curry',3.44),(27,'cereal',4.87),(28,'duck',9.88),(29,'dumplings',3.11),(30,'donuts',0.99),(31,'eggs',1.54),(32,'falafel',3.54),(33,'fish',3.24),(34,'garlic',1.78),(35,'ginger',3.54),(36,'gnocchi',3.55),(37,'goose',4.44),(38,'granola',3.55),(39,'grapes',3.55),(40,'guancamole',4.15),(41,'gumbo',1.23),(42,'ham',3.05),(43,'halibut',3.15),(44,'hamburger',3.54),(45,'honey',3.55),(46,'hummus',1.22),(47,'jam',3.54),(48,'ketchup',8.78),(49,'kiwi',1.54),(50,'lobster',3.55),(51,'lamb',3.54),(52,'lasagna',3.44),(53,'meatballs',4.88),(54,'milk',1.55),(55,'milkshake',1.77),(56,'noodles',9.84),(57,'ostrich',3.57),(58,'pizza',3.58),(59,'pepperoni',1.57),(60,'porter',2.47),(61,'pancakes',2.44),(62,'spinach',3.44),(63,'spaghetti',3.48),(64,'toast',4.77),(65,'waffles',7.85),(66,'wasabi',4.84),(67,'wine',9.11),(68,'walnuts',1.02),(69,'yogurt',2.08),(70,'zucchini',3.57);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-15  1:26:55
