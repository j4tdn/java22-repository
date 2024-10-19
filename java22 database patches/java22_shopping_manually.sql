-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java22_shopping_manually
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java22_shopping_manually` ;

-- -----------------------------------------------------
-- Schema java22_shopping_manually
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java22_shopping_manually` DEFAULT CHARACTER SET utf8 ;
USE `java22_shopping_manually` ;

-- -----------------------------------------------------
-- Table `java22_shopping_manually`.`T02_ITEM_GROUP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java22_shopping_manually`.`T02_ITEM_GROUP` ;

CREATE TABLE IF NOT EXISTS `java22_shopping_manually`.`T02_ITEM_GROUP` (
  `C02_ITEM_GROUP_ID` INT NOT NULL AUTO_INCREMENT,
  `C02_ITEM_GROUP_NAME` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`C02_ITEM_GROUP_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java22_shopping_manually`.`T01_ITEM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java22_shopping_manually`.`T01_ITEM` ;

CREATE TABLE IF NOT EXISTS `java22_shopping_manually`.`T01_ITEM` (
  `C01_ITEM_ID` INT NOT NULL AUTO_INCREMENT,
  `C01_ITEM_NAME` VARCHAR(255) NOT NULL,
  `T02_ITEM_GROUP_C02_ITEM_GROUP_ID` INT NOT NULL,
  PRIMARY KEY (`C01_ITEM_ID`, `T02_ITEM_GROUP_C02_ITEM_GROUP_ID`),
  INDEX `fk_T01_ITEM_T02_ITEM_GROUP_idx` (`T02_ITEM_GROUP_C02_ITEM_GROUP_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_T02_ITEM_GROUP`
    FOREIGN KEY (`T02_ITEM_GROUP_C02_ITEM_GROUP_ID`)
    REFERENCES `java22_shopping_manually`.`T02_ITEM_GROUP` (`C02_ITEM_GROUP_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
