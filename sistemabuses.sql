-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-06-2023 a las 11:19:19
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemabuses`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `buses`
--

CREATE TABLE `buses` (
  `horainicio` int(255) NOT NULL,
  `horatermino` int(255) NOT NULL,
  `diasemana` varchar(100) NOT NULL,
  `patente` varchar(100) NOT NULL,
  `nombrerecorrido` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `buses`
--

INSERT INTO `buses` (`horainicio`, `horatermino`, `diasemana`, `patente`, `nombrerecorrido`) VALUES
(0, 0, 'SinAsignar', 'SinPatente', 'SinAsignar'),
(800, 900, 'Lunes', 'HFJK20', 'PeñablancaValparaiso'),
(800, 900, 'Lunes', 'KDWR30', 'PeñablancaConcon'),
(800, 900, 'Lunes', 'DFJF30', 'PeñablancaSantaJulia'),
(800, 900, 'Lunes', 'DJFA50', 'QuilpueCalera'),
(800, 900, 'Lunes', 'DSJA20', 'QuilpueSanFelipe'),
(800, 900, 'Martes', 'FJRE20', 'PeñablancaValparaiso'),
(800, 900, 'Martes', 'FJRE20', 'PeñablancaValparaiso'),
(1500, 1600, 'Martes', 'HDDD34', 'PeñablancaValparaiso'),
(800, 900, 'Lunes', 'HDDD50', 'QuilpueSanFelipe'),
(800, 900, 'Miercoles', 'JKSA20', 'QuilpueLosPinos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductores`
--

CREATE TABLE `conductores` (
  `Nombre` varchar(100) NOT NULL,
  `Apellido` varchar(100) NOT NULL,
  `Rut` varchar(100) NOT NULL,
  `PatenteAsociada` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `conductores`
--

INSERT INTO `conductores` (`Nombre`, `Apellido`, `Rut`, `PatenteAsociada`) VALUES
('Diego', 'Martinez', '207737577', 'HFJK20'),
('Jose', 'Pena', '20202202K', 'KDWR30'),
('Joaquin', 'Silva', '20303203K', 'DJFA50'),
('Miguel', 'Insunza', '103234332', 'DFJF30'),
('Marcelo', 'Ahumada', '210002321', 'JKSA20'),
('Pablo', 'Sanchez', '20311232K', 'HDDD50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recorridos`
--

CREATE TABLE `recorridos` (
  `numerorecorrido` int(255) NOT NULL,
  `nombrerecorrido` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `recorridos`
--

INSERT INTO `recorridos` (`numerorecorrido`, `nombrerecorrido`) VALUES
(0, 'SinAsignar'),
(1, 'PeñablancaValparaiso'),
(2, 'PeñablancaConcon'),
(3, 'PeñablancaSantaJulia'),
(4, 'QuilpueCalera'),
(5, 'QuilpueLosPinos'),
(6, 'QuilpueSanFelipe'),
(7, 'PeñablancaPompeya'),
(8, 'ValparaisoPompeya'),
(9, 'QuilpueQuillota');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
