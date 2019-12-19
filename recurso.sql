-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2019 a las 22:54:52
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `recursos_aprendizaje`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recurso`
--

CREATE TABLE `recurso` (
  `id_recurso` int(10) NOT NULL,
  `titulo_recurso` varchar(1000) NOT NULL,
  `detalle_recurso` varchar(5000) NOT NULL,
  `enlace_recurso` varchar(500) NOT NULL,
  `categoria` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `recurso`
--

INSERT INTO `recurso` (`id_recurso`, `titulo_recurso`, `detalle_recurso`, `enlace_recurso`, `categoria`) VALUES
(1, 'Inteligencia', 'La inteligencia se ha definido de muchas maneras, incluyendo: la capacidad de lógica, comprensión, autoconciencia, aprendizaje, conocimiento emocional, ...', 'https://es.wikipedia.org/wiki/Inteligencia', 'Lectura'),
(2, '¿Qué es la inteligencia?', 'La inteligencia es una capacidad mental muy general que implica habilidad para razonar, planificar, resolver problemas, pensar de forma abstracta...', 'https://www.elmundodelsuperdotado.com/que-es-la-inteligencia/', 'Lectura'),
(3, 'Definición de inteligencia', 'El término inteligencia proviene del latín intelligentia, que a su vez deriva de inteligere. Esta es una palabra compuesta por otros dos términos: intus (“entre”) y ...', 'https://definicion.de/inteligencia/', 'Lectura'),
(4, '¿Qué es la Inteligencia Artificial?', 'La Inteligencia Artificial (IA) es la combinación de algoritmos planteados con el propósito de crear máquinas que presenten las mismas capacidades que el ser ...', 'https://www.iberdrola.com/innovacion/que-es-inteligencia-artificial', 'Lectura'),
(5, 'Inteligencia artificial', 'La inteligencia artificial (IA), es la inteligencia llevada a cabo por máquinas. En ciencias de la computación, una máquina «inteligente» ideal es un agente ...', 'https://es.wikipedia.org/wiki/Inteligencia_artificial', 'Lectura'),
(6, 'Inteligencia artificial', 'La inteligencia artificial (IA) hace posible que las máquina aprendan de la experiencia, se ajusten a nuevas aportaciones y realicen tareas como hacen los ...', 'https://www.sas.com/es_cl/insights/analytics/what-is-artificial-intelligence.html', 'Lectura'),
(7, '¿Qué es Inteligencia Artificial?', 'Seguro que a muchos os suena el término IA debido a la cantidad de películas de ciencia ficción que se han ...', 'https://www.youtube.com/watch?v=XgDfv5cI2VI', 'Video'),
(8, '¿De qué es capaz la inteligencia artificial?', 'El desarrollo de la inteligencia artificial (IA) nos conduce a un cambio fundamental. Los algoritmos ya ...', 'https://www.youtube.com/watch?v=34Kz-PP_X7c', 'Video'),
(9, 'El futuro de la IA: hacia inteligencias artificiales realmente inteligentes', 'Este capítulo contiene algunas reflexiones sobre inteligencia artificial (IA). En primer lugar, se explica la distinción entre la IA fuerte y la débil, así como los ...', 'https://www.bbvaopenmind.com/articulos/el-futuro-de-la-ia-hacia-inteligencias-artificiales-realmente-inteligentes/', 'Lectura'),
(10, 'La última década y el futuro del impacto de la IA en la sociedad', 'La inteligencia artificial (IA) es una expresión técnica referida a artefactos empleados para detectar contextos o llevar a cabo acciones en respuesta a contextos ...', 'https://www.bbvaopenmind.com/articulos/la-ultima-decada-y-el-futuro-del-impacto-de-la-ia-en-la-sociedad/', 'Lectura'),
(11, 'Los países quieren ser líderes en IA, ¿pero hasta qué punto? | Captcha 2x06', 'Es difícil imaginar, en pleno 2019, a un solo político que no apostille en mayor o menor medida que su país tiene ...', 'https://www.youtube.com/watch?v=Q1gQ9gUDavo', 'Video'),
(12, 'Robots, IA y automatización: Una amenaza al empleo', 'Estudio de Banxico advierte que 68% de la población en el país se dedica a labores con alta probabilidad de ...', 'https://www.youtube.com/watch?v=b3IyR_rYg6s', 'Video');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `recurso`
--
ALTER TABLE `recurso`
  ADD PRIMARY KEY (`id_recurso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `recurso`
--
ALTER TABLE `recurso`
  MODIFY `id_recurso` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
