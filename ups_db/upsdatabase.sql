-- MySQL Script generated by MySQL Workbench
-- Thu May 23 16:27:14 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema upsdatabase
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema upsdatabase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `upsdatabase` DEFAULT CHARACTER SET utf8 ;
USE `upsdatabase` ;

-- -----------------------------------------------------
-- Table `upsdatabase`.`tbl_prod`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `upsdatabase`.`tbl_prod` (
  `idtbl_prod` INT NOT NULL,
  `nome_prod` VARCHAR(45) NOT NULL,
  `nome_loja` VARCHAR(45) NOT NULL,
  `valor_cash` DECIMAL(9,2) NULL,
  `valor_credCar` DECIMAL(9,2) NULL,
  `data` DATE NOT NULL,
  `cambio` DECIMAL(9,2) NOT NULL,
  PRIMARY KEY (`idtbl_prod`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
