-- MySQL Script generated by MySQL Workbench
-- Wed May 22 18:05:07 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema upsDataBase
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema upsDataBase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `upsDataBase` DEFAULT CHARACTER SET utf8 ;
USE `upsDataBase` ;

-- -----------------------------------------------------
-- Table `upsDataBase`.`tbl_loja`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `upsDataBase`.`tbl_loja` (
  `idtbl_loja` INT NOT NULL,
  `nome_loja` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtbl_loja`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `upsDataBase`.`tbl_prod`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `upsDataBase`.`tbl_prod` (
  `idtbl_prod` INT NOT NULL,
  `nome_produto` VARCHAR(45) NOT NULL,
  `valor_cash` DECIMAL(9,2) NULL,
  `valor_credCar` DECIMAL(9,2) NULL,
  PRIMARY KEY (`idtbl_prod`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `upsDataBase`.`tbl_loja_has_tbl_prod`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `upsDataBase`.`tbl_loja_has_tbl_prod` (
  `tbl_loja_idtbl_loja` INT NOT NULL,
  `tbl_prod_idtbl_prod` INT NOT NULL,
  `data` DATE NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `cambio` DECIMAL(9,2) NOT NULL,
  PRIMARY KEY (`tbl_loja_idtbl_loja`, `tbl_prod_idtbl_prod`),
  INDEX `fk_tbl_loja_has_tbl_prod_tbl_prod1_idx` (`tbl_prod_idtbl_prod` ASC),
  INDEX `fk_tbl_loja_has_tbl_prod_tbl_loja_idx` (`tbl_loja_idtbl_loja` ASC),
  CONSTRAINT `fk_tbl_loja_has_tbl_prod_tbl_loja`
    FOREIGN KEY (`tbl_loja_idtbl_loja`)
    REFERENCES `upsDataBase`.`tbl_loja` (`idtbl_loja`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_loja_has_tbl_prod_tbl_prod1`
    FOREIGN KEY (`tbl_prod_idtbl_prod`)
    REFERENCES `upsDataBase`.`tbl_prod` (`idtbl_prod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
