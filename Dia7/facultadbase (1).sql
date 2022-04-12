-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-04-2022 a las 22:49:15
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `facultadbase`
--
CREATE DATABASE IF NOT EXISTS `facultadbase` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `facultadbase`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
CREATE TABLE IF NOT EXISTS `alumnos` (
  `idAlumnos` int(30) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  PRIMARY KEY (`idAlumnos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

DROP TABLE IF EXISTS `asistencia`;
CREATE TABLE IF NOT EXISTS `asistencia` (
  `idAsistencia` int(20) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `idReserva` int(30) NOT NULL,
  `idProfesor` int(20) NOT NULL,
  `idAlumno` int(30) NOT NULL,
  PRIMARY KEY (`idAsistencia`),
  KEY `fk_idReserva` (`idReserva`),
  KEY `fk_idProfesor` (`idProfesor`) USING BTREE,
  KEY `fk_idAlumno` (`idAlumno`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `elementos`
--

DROP TABLE IF EXISTS `elementos`;
CREATE TABLE IF NOT EXISTS `elementos` (
  `idElementos` int(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idElementos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `elementos_salon`
--

DROP TABLE IF EXISTS `elementos_salon`;
CREATE TABLE IF NOT EXISTS `elementos_salon` (
  `idElementos_salon` int(20) NOT NULL AUTO_INCREMENT,
  `idSalon` int(30) NOT NULL,
  `idElementos` int(30) NOT NULL,
  `cant_elementos` int(20) NOT NULL,
  PRIMARY KEY (`idElementos_salon`),
  KEY `Fk_idElemento` (`idElementos`),
  KEY `Fk_idSalon` (`idSalon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

DROP TABLE IF EXISTS `profesor`;
CREATE TABLE IF NOT EXISTS `profesor` (
  `idProfesor` int(30) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `estado_civil` varchar(20) NOT NULL,
  PRIMARY KEY (`idProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `idReserva` int(20) NOT NULL AUTO_INCREMENT,
  `idProfesor` int(30) NOT NULL,
  `idSalon` int(20) NOT NULL,
  `materia` varchar(20) NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` int(11) NOT NULL,
  `hora_final` int(11) NOT NULL,
  PRIMARY KEY (`idReserva`),
  KEY `Fk_idProfesor` (`idProfesor`),
  KEY `Fk_idSalon` (`idSalon`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salon`
--

DROP TABLE IF EXISTS `salon`;
CREATE TABLE IF NOT EXISTS `salon` (
  `idSalon` int(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idSalon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `fk_idReserva` FOREIGN KEY (`idReserva`) REFERENCES `reserva` (`idReserva`);

--
-- Filtros para la tabla `elementos_salon`
--
ALTER TABLE `elementos_salon`
  ADD CONSTRAINT `Fk_idElemento` FOREIGN KEY (`idElementos`) REFERENCES `elementos` (`idElementos`),
  ADD CONSTRAINT `Fk_idSalon` FOREIGN KEY (`idSalon`) REFERENCES `salon` (`idSalon`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `Fk_idProfesor` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`),
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idSalon`) REFERENCES `salon` (`idSalon`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
