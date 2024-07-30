-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema misstravveller
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema misstravveller
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `misstravveller` DEFAULT CHARACTER SET utf8 ;
USE `misstravveller` ;

-- -----------------------------------------------------
-- Table `misstravveller`.`Estados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Estados` (
  `id` INT NOT NULL,
  `nombrel` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `misstravveller`.`Viajes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Viajes` (
  `id` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `descripcion` VARCHAR(100) NOT NULL,
  `Estados_id` INT NOT NULL,
  PRIMARY KEY (`id`, `Estados_id`),
  INDEX `fk_Productos_Estados_idx` (`Estados_id` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_Estados`
    FOREIGN KEY (`Estados_id`)
    REFERENCES `misstravveller`.`Estados` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `misstravveller`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Cliente` (
  `idCliente` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido paterno` VARCHAR(45) NOT NULL,
  `apellido materno` VARCHAR(45) NOT NULL,
  `correo electrónico` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `misstravveller`.`Formulariocontacto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Formulariocontacto` (
  `nombre completo` VARCHAR(45) NOT NULL,
  `correo electronico` VARCHAR(255) NOT NULL,
  `telefono` VARCHAR(32) NOT NULL,
  `mensaje` VARCHAR(100) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Cliente_idCliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Cliente_idCliente`),
  INDEX `fk_Formulario de contacto_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Formulario de contacto_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `misstravveller`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `misstravveller`.`Reservaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Reservaciones` (
  `id reservación` VARCHAR(45) NOT NULL,
  `Cliente_idCliente` VARCHAR(45) NOT NULL,
  `Viajes_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id reservación`, `Cliente_idCliente`, `Viajes_id`),
  INDEX `fk_Reservaciones_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  INDEX `fk_Reservaciones_Viajes1_idx` (`Viajes_id` ASC) VISIBLE,
  CONSTRAINT `fk_Reservaciones_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `misstravveller`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservaciones_Viajes1`
    FOREIGN KEY (`Viajes_id`)
    REFERENCES `misstravveller`.`Viajes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `misstravveller`.`Itinerario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `misstravveller`.`Itinerario` (
  `destino` VARCHAR(45) NOT NULL,
  `fecha` DATE NOT NULL,
  `hora salida` TIME NOT NULL,
  `hora llegada` TIME NULL,
  `hora regreso` TIME NULL,
  `Reservaciones_id reservación` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Reservaciones_id reservación`),
  INDEX `fk_Itinerario_Reservaciones1_idx` (`Reservaciones_id reservación` ASC) VISIBLE,
  CONSTRAINT `fk_Itinerario_Reservaciones1`
    FOREIGN KEY (`Reservaciones_id reservación`)
    REFERENCES `misstravveller`.`Reservaciones` (`id reservación`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
