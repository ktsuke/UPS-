-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 29-Maio-2019 às 17:12
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `upsdatabase`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_prod`
--

DROP TABLE IF EXISTS `tbl_prod`;
CREATE TABLE IF NOT EXISTS `tbl_prod` (
  `idtbl_prod` int(11) NOT NULL,
  `nome_prod` varchar(45) NOT NULL,
  `nome_loja` varchar(45) NOT NULL,
  `valor_cash` decimal(9,2) DEFAULT NULL,
  `valor_credCar` decimal(9,2) DEFAULT NULL,
  `data` date NOT NULL,
  `cambio` decimal(9,2) NOT NULL,
  PRIMARY KEY (`idtbl_prod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_prod`
--

INSERT INTO `tbl_prod` (`idtbl_prod`, `nome_prod`, `nome_loja`, `valor_cash`, `valor_credCar`, `data`, `cambio`) VALUES
(1, 'RX 580', 'Amazon - BR', '1289.00', '1289.00', '2019-05-22', '1.00'),
(2, 'RX 580', 'Amazon - NA', '184.99', '184.99', '2019-05-22', '4.05'),
(3, 'RX 570', 'Amazon - NA', '488.00', '487.00', '2019-05-23', '4.05'),
(4, 'RX 570', 'Amazon - NA', '200.00', '200.00', '2019-05-24', '4.05'),
(5, 'RX 570', 'Amazon - NA', '600.00', '607.00', '2019-05-22', '4.05'),
(6, 'RX 570', 'Amazon - BR', '100.00', '100.00', '2019-05-24', '4.05'),
(7, 'RX 570', 'Amazon - BR', '200.00', '200.00', '2019-05-23', '1.00'),
(8, 'RX 570', 'Amazon - BR', '400.00', NULL, '2019-02-12', '8.00'),
(9, 'RX 570', 'Amazon - NA', '700.00', NULL, '2019-04-17', '8.00'),
(10, 'RX 570', 'Amazon - NA', '700.00', NULL, '2019-05-14', '8.00'),
(11, 'RX 570', 'Amazon - BR', '500.00', NULL, '2019-05-22', '8.00'),
(12, 'RX 570', 'Amazon - BR', '1000.00', NULL, '2019-09-12', '8.00'),
(13, 'SSD 480gb', 'Americanas', '320.00', NULL, '2019-05-24', '1.00'),
(14, 'SSD 240gb', 'Americanas', '175.00', NULL, '2019-05-24', '1.00'),
(15, 'GTX 1050 Ti', 'Kabum', '950.00', '1000.00', '2019-03-13', '1.00'),
(16, 'GTX 1050 Ti', 'Kabum', '1100.00', '1200.00', '2018-12-11', '1.00'),
(17, 'GTX 1050 Ti', 'Kabum', '900.00', '950.00', '2019-05-24', '1.00'),
(18, 'GTX 1050 Ti', 'Americanas', '1000.00', '1050.00', '2019-05-24', '1.00'),
(19, 'GTX 1050 Ti', 'Americanas', '1200.00', '1250.00', '2019-03-12', '1.00'),
(20, 'SSD 480gb', 'Americanas', '370.00', '400.00', '2019-03-12', '1.00'),
(21, 'SSD 480gb', 'Americanas', '390.00', '420.00', '2019-01-15', '1.00'),
(22, 'SSD 480gb', 'Kabum', '290.00', '320.00', '2019-05-24', '1.00'),
(23, 'SSD 480gb', 'Kabum', '350.00', '370.00', '2019-03-05', '1.00'),
(24, 'SSD 240gb', 'Americanas', '200.00', '230.00', '2019-03-15', '1.00'),
(25, 'SSD 240gb', 'Americanas', '220.00', '250.00', '2019-02-12', '1.00'),
(26, 'SSD 240gb', 'kabum', '170.00', '190.00', '2019-05-24', '1.00'),
(27, 'SSD 240gb', 'kabum', '200.00', '220.00', '2019-03-09', '1.00'),
(28, 'SSD 240gb', 'kabum', '190.00', '210.00', '2019-02-20', '1.00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
