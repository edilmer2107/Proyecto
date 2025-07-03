-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-07-2025 a las 09:35:14
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cs_system`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `id` int(11) NOT NULL,
  `tipoE` varchar(120) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`id`, `tipoE`, `estado`) VALUES
(2, 'Enfermeria', 1),
(3, 'Medicina General ', 1),
(4, 'Odontologia', 1),
(5, 'Psicologia', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia`
--

CREATE TABLE `historia` (
  `id` bigint(20) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_medico` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `motivo_consulta` varchar(400) DEFAULT NULL,
  `observaciones` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historia`
--

INSERT INTO `historia` (`id`, `id_paciente`, `id_medico`, `id_especialidad`, `fecha`, `motivo_consulta`, `observaciones`) VALUES
(1, 1, 2, 3, '2025-07-01', 'aaaaaaaaaaaaaaaaaaaaa', 'bbbbbbbbbbbbbbbbbbbbbb');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `id` int(11) NOT NULL,
  `nombres` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `apellidos` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `dni` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(64) NOT NULL,
  `id_especialidad` int(11) DEFAULT NULL,
  `usuario` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `contrasena` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`id`, `nombres`, `apellidos`, `dni`, `telefono`, `correo`, `id_especialidad`, `usuario`, `contrasena`, `estado`) VALUES
(1, 'Luis', 'Sánchez León', '', '', '', 3, 'lsanchez', '12345', 1),
(2, 'María', 'Torres Vega', '87654321', '987654321', 'mariatorres@gmail.com', 3, 'mtorres', 'abcde', 1),
(21, 'Alexis Jose', 'Castillo Linares', '74805762', '987654321', 'alex@gmail.com', 2, NULL, NULL, 1),
(22, 'Edil', 'Narva', '71968036', '987654321', 'edil@gmail.com', 5, NULL, NULL, 0),
(23, 'Pepe', 'Popo', '98765432', '987654321', 'pepe@gmail.com', 5, NULL, NULL, 0),
(24, 'Edil', 'Narva', '71968036', '987654321', 'edil@gmail.com', 5, NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nombres` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `apellidos` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `dni` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sexo` enum('Masculino','Femenino') CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(120) NOT NULL,
  `direccion` varchar(150) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `fecha_nacimento` date DEFAULT NULL,
  `lugar_nacimiento` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado_civil` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `Datos_del_Apoderado` varchar(500) NOT NULL,
  `fecha_registro` date DEFAULT NULL,
  `estado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `nombres`, `apellidos`, `dni`, `sexo`, `telefono`, `correo`, `direccion`, `fecha_nacimento`, `lugar_nacimiento`, `estado_civil`, `Datos_del_Apoderado`, `fecha_registro`, `estado`) VALUES
(1, 'Juan', 'Pérez Ramos', '12345678', 'Masculino', '987654321', 'perezramos@gmail.com', 'Av. Siempre Viva 123', '1980-05-12', 'Lima', 'Casado', '', '2025-06-30', 0),
(2, 'Edil', 'Narva', '71968036', 'Masculino', '987654321', 'edil@gmail.com', 'Jr. Piura', '2005-07-21', 'Cajaruro', 'Soltero', 'Anali Vasquez Narva', '2025-07-01', 0),
(4, 'Billy', 'Nuñez', '87654321', 'Masculino', '934567890', 'billy@gmail.com', 'Av. Peru', '2004-10-27', 'Jaen', 'Soltero', 'Edilmer Eli', '2025-07-01', 1),
(5, 'María', 'Lopez', '87654322', 'Femenino', '934567891', 'maria.lopez@gmail.com', 'Calle Lima 123', '2002-06-15', 'Chachapoyas', 'Soltera', 'Luis Lopez', '2025-07-01', 1),
(8, 'Jose', 'Vasquez', '76543218', 'Masculino', '987654321', 'jose@gmail.com', 'Av. Piloto', '2003-05-27', 'Cajaruro', 'Soltero', 'El pepe', '2025-07-01', 1),
(9, 'Billy Mark', 'Nuñez sanchez', '71529007', 'Masculino', '987654321', 'billy@gmail', '', '2004-10-27', '', '', '', '2025-07-01', 1),
(10, 'Alexis', 'Castillo', '87654321', 'Masculino', '987654321', 'alexis@gmail.com', 'Jr. Sgto Lores', '2002-07-15', 'El Ron', 'Soltero', 'Su mamá', '2025-07-01', 1),
(15, 'Edil', 'Narva', '71968036', 'Masculino', '987654321', 'edil@gmail.com', 'Jr. Piura', '2005-07-21', 'Cajaruro', 'Soltero', 'Anali Vasquez Narva', '2025-07-01', 0),
(16, 'Billy Mark', 'Nuñez sanchez', '71529007', 'Masculino', '987654321', 'billy@gmail', 'Av.Peru', '2004-10-27', 'Jaen', 'Casado', 'Su maá', '2025-07-01', 0),
(17, 'Billy Mark', 'Nuñez sanchez', '71529007', 'Masculino', '987654321', 'billy@gmail', 'aaaaa', '2004-10-27', 'bbbbbbbbbbb', 'cccccccccc', 'yooooooooooooooooo', '2025-07-01', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `historia`
--
ALTER TABLE `historia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_paciente` (`id_paciente`),
  ADD KEY `id_medico` (`id_medico`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `historia`
--
ALTER TABLE `historia`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historia`
--
ALTER TABLE `historia`
  ADD CONSTRAINT `historia_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`id`),
  ADD CONSTRAINT `historia_ibfk_3` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id`),
  ADD CONSTRAINT `historia_ibfk_4` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`);

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `FK` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
