-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-07-2022 a las 22:55:08
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_rickandmorty`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personajesrm`
--

CREATE TABLE `personajesrm` (
  `id` int(11) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personajesrm`
--

INSERT INTO `personajesrm` (`id`, `gender`, `image`, `name`, `status`) VALUES
(6, 'Female', 'https://rickandmortyapi.com/api/character/avatar/6.jpeg', 'Abadango Cluster Princess', 'Aliveeeee'),
(2, 'male', 'https://rickandmortyapi.com/api/location/3', 'Morty Smith', 'Alive'),
(3, 'Female', 'https://rickandmortyapi.com/api/location/20', 'Summer Smith', 'Alive'),
(4, 'Male', 'https://rickandmortyapi.com/api/location/20', 'Jerry Smith', 'Alive'),
(5, 'Male', 'https://rickandmortyapi.com/api/location/20', 'Jerry Smith', 'Alive');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personajesrm`
--
ALTER TABLE `personajesrm`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personajesrm`
--
ALTER TABLE `personajesrm`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
