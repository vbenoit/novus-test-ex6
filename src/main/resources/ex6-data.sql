-- --------------------------------------------------------
-- Hôte :                        candidate.cqr4dfsuiei5.ap-south-1.rds.amazonaws.com
-- Version du serveur:           5.6.37-log - MySQL Community Server (GPL)
-- SE du serveur:                Linux
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Export de la structure de la base pour candidate
CREATE DATABASE IF NOT EXISTS `candidate` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `candidate`;

-- Export de la structure de la table candidate. user
CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `qualification` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Export de données de la table candidate.user : ~8 rows (environ)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`iduser`, `firstname`, `lastname`, `qualification`) VALUES
	(1, 'Peter', 'smith', 'designer'),
	(2, 'Nicole', 'fan', 'admin'),
	(3, 'Jamie', 'han', 'assistant'),
	(4, 'Sami', 'Ahmad', 'Engineer'),
	(5, 'Ramy', 'Amine', 'Developper'),
	(6, 'Adam', 'Roberts', 'Software Manager'),
	(7, 'Andy', 'James', 'Technician'),
	(8, 'Juliette', 'Dumont', 'Front desk');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
