-- --------------------------------------------------------
-- Poslužitelj:                  127.0.0.1
-- Server version:               10.1.16-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Verzija:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for addressone
CREATE DATABASE IF NOT EXISTS `addressone` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `addressone`;


-- Dumping structure for table addressone.address
CREATE TABLE IF NOT EXISTS `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `street` varchar(50) DEFAULT '0',
  `street_no` varchar(5) DEFAULT '0',
  `city_id` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_address_city` (`city_id`),
  CONSTRAINT `FK_address_city` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=795708415 DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.address: ~6 rows (approximately)
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`, `street`, `street_no`, `city_id`) VALUES
	(666595790, 'Istarska', '123', 5),
	(666627789, 'Perina', '12', 2),
	(666767766, 'Antina ulica', '2', 10),
	(666892348, 'Paska', '34', 14),
	(666953676, 'Zadarska', '154', 8),
	(667043897, 'Markova', '15', 6);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


-- Dumping structure for table addressone.city
CREATE TABLE IF NOT EXISTS `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `zip_code` varchar(10) NOT NULL,
  `country_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Stupac 2` (`name`),
  KEY `FK_city_country` (`country_id`),
  CONSTRAINT `FK_city_country` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.city: ~15 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`id`, `name`, `zip_code`, `country_id`) VALUES
	(1, 'Canberra', '3000', 1),
	(2, 'Sydney', '3201', 1),
	(3, 'Melbourne', '3542', 1),
	(4, 'Osijek', '31000', 3),
	(5, 'Zagreb', '10000', 3),
	(6, 'Split', '21000', 3),
	(7, 'Quebec', '23553', 2),
	(8, 'Ontario', '325453', 2),
	(9, 'Alberta', '32152', 2),
	(10, 'Essex', '235211', 4),
	(11, 'Hampshire', '365467', 4),
	(12, 'Surrey', '56544', 4),
	(13, 'California', '234553', 5),
	(14, 'Illinois', '97997', 5),
	(15, 'Wisconsin', '343433', 5);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


-- Dumping structure for table addressone.contact
CREATE TABLE IF NOT EXISTS `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) DEFAULT '0',
  `first_name` varchar(20) DEFAULT '0',
  `last_name` varchar(50) DEFAULT '0',
  `phone` varchar(13) DEFAULT '0',
  `email` varchar(50) DEFAULT '0',
  `sex_id` bigint(20) NOT NULL DEFAULT '0',
  `address_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_contact_sex` (`sex_id`),
  KEY `FK_contact_address` (`address_id`),
  CONSTRAINT `FK_contact_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_contact_sex` FOREIGN KEY (`sex_id`) REFERENCES `sex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=247 DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.contact: ~6 rows (approximately)
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`id`, `uname`, `first_name`, `last_name`, `phone`, `email`, `sex_id`, `address_id`) VALUES
	(239, 'tomislav', 'Goran', 'Kosta', '0991234456', 'gorab@kosta.com', 1, 667043897),
	(240, 'tomislav', 'Stevo', 'Anto', '01353536', 'steva@aaa.com', 1, 666953676),
	(241, 'tomislav', 'Drago', 'Oto', '0353332211', 'aaa@sfs.com', 1, 666892348),
	(243, 'ivan', 'Ana', 'Ano', '03523465', 'ana@ano.pb', 2, 666767766),
	(245, 'ivan', 'Pero', 'Perak', '09912412', 'pera@pero.abc', 1, 666627789),
	(246, 'ivan', 'Igor', 'igor', '021424232', 'igor@asfda.com', 1, 666595790);
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


-- Dumping structure for table addressone.country
CREATE TABLE IF NOT EXISTS `country` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `alpha_2` varchar(2) NOT NULL,
  `alpha_3` varchar(3) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `alpha_3` (`alpha_3`),
  UNIQUE KEY `alpha_2` (`alpha_2`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.country: ~5 rows (approximately)
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`id`, `name`, `alpha_2`, `alpha_3`) VALUES
	(1, 'Australia', 'AU', 'AUS'),
	(2, 'Canada', 'CA', 'CAN'),
	(3, 'Croatia', 'CR', 'CRO'),
	(4, 'England', 'EN', 'ENG'),
	(5, 'USA', 'US', 'USA');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


-- Dumping structure for table addressone.sex
CREATE TABLE IF NOT EXISTS `sex` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(7) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.sex: ~2 rows (approximately)
/*!40000 ALTER TABLE `sex` DISABLE KEYS */;
INSERT INTO `sex` (`id`, `name`) VALUES
	(2, 'Femail'),
	(1, 'Male');
/*!40000 ALTER TABLE `sex` ENABLE KEYS */;


-- Dumping structure for table addressone.users
CREATE TABLE IF NOT EXISTS `users` (
  `uname` varchar(50) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=hp8;

-- Dumping data for table addressone.users: ~2 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`uname`, `pwd`, `email`, `address`) VALUES
	('tomislav', '12345', 'tom@tom.com', 'Osijek'),
	('ivan', 'abcde', 'ivan@ivan.com', 'Zagreb');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
