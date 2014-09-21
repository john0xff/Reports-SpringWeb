/* DROP DATABASE `foreign_key`; */

CREATE DATABASE IF NOT EXISTS `foreign_key`;

USE `foreign_key`;

/*Table structure for table `customers` */

CREATE TABLE  IF NOT EXISTS `customers` (
  `customerNumber` int(11) NOT NULL,
  `customerName` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  
  `salesRepEmployeeNumber` int(11) DEFAULT NULL,

  PRIMARY KEY (`customerNumber`) ,
  
 
  KEY `salesRepEmployeeNumber` (`salesRepEmployeeNumber`),
  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`salesRepEmployeeNumber`) REFERENCES `employees` (`employeeNumber`) 
  

) ENGINE=InnoDB DEFAULT CHARSET=latin1;


/*Table structure for table `employees` */

CREATE TABLE IF NOT EXISTS `employees` (
  `employeeNumber` int(11) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,

  PRIMARY KEY (`employeeNumber`)

) ENGINE=InnoDB DEFAULT CHARSET=latin1;


