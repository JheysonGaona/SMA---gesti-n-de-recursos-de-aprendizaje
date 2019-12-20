-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2019 a las 18:23:44
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
(2, 'Inteligencia', 'La inteligencia es una capacidad mental muy general que implica habilidad para razonar, planificar, resolver problemas, pensar de forma abstracta...', 'https://www.elmundodelsuperdotado.com/que-es-la-inteligencia/', 'Lectura'),
(3, 'Inteligencia', 'El término inteligencia proviene del latín intelligentia, que a su vez deriva de inteligere. Esta es una palabra compuesta por otros dos términos: intus (“entre”) y ...', 'https://definicion.de/inteligencia/', 'Lectura'),
(4, 'Inteligencia Artificial', 'La Inteligencia Artificial (IA) es la combinación de algoritmos planteados con el propósito de crear máquinas que presenten las mismas capacidades que el ser ...', 'https://www.iberdrola.com/innovacion/que-es-inteligencia-artificial', 'Lectura'),
(5, 'Inteligencia artificial', 'La inteligencia artificial (IA), es la inteligencia llevada a cabo por máquinas. En ciencias de la computación, una máquina «inteligente» ideal es un agente ...', 'https://es.wikipedia.org/wiki/Inteligencia_artificial', 'Lectura'),
(6, 'Inteligencia artificial', 'La inteligencia artificial (IA) hace posible que las máquina aprendan de la experiencia, se ajusten a nuevas aportaciones y realicen tareas como hacen los ...', 'https://www.sas.com/es_cl/insights/analytics/what-is-artificial-intelligence.html', 'Lectura'),
(7, 'Inteligencia Artificial', 'Seguro que a muchos os suena el término IA debido a la cantidad de películas de ciencia ficción que se han ...', 'https://www.youtube.com/watch?v=XgDfv5cI2VI', 'Video'),
(8, 'Inteligencia artificial', 'El desarrollo de la inteligencia artificial (IA) nos conduce a un cambio fundamental. Los algoritmos ya ...', 'https://www.youtube.com/watch?v=34Kz-PP_X7c', 'Video'),
(9, 'IA', 'Este capítulo contiene algunas reflexiones sobre inteligencia artificial (IA). En primer lugar, se explica la distinción entre la IA fuerte y la débil, así como los ...', 'https://www.bbvaopenmind.com/articulos/el-futuro-de-la-ia-hacia-inteligencias-artificiales-realmente-inteligentes/', 'Lectura'),
(10, 'IA ', 'La inteligencia artificial (IA) es una expresión técnica referida a artefactos empleados para detectar contextos o llevar a cabo acciones en respuesta a contextos ...', 'https://www.bbvaopenmind.com/articulos/la-ultima-decada-y-el-futuro-del-impacto-de-la-ia-en-la-sociedad/', 'Lectura'),
(11, 'IA', 'Es difícil imaginar, en pleno 2019, a un solo político que no apostille en mayor o menor medida que su país tiene ...', 'https://www.youtube.com/watch?v=Q1gQ9gUDavo', 'Video'),
(12, 'Inteligencia Artificial', 'Estudio de Banxico advierte que 68% de la población en el país se dedica a labores con alta probabilidad de ...', 'https://www.youtube.com/watch?v=b3IyR_rYg6s', 'Video'),
(14, 'Inteligencia Artificial', 'La inteligencia artificial (IA) es una de las ramas de la Informática, con fuertes raíces en otras áreas como la lógica y las ciencias cognitivas. Vicenç Torra nos ...', 'http://www.fgcsic.es/lychnos/es_es/articulos/inteligencia_artificial', 'Lectura'),
(15, 'Inteligencia Artificial', 'Expertos vaticinan que el desarrollo de la IA dará a luz una nueva generación de robots capaces de atender nuestras necesidades. Pero ¿constituirán una ...', 'muyinteresante.es/tecnologia/articulo/ventajas-y-riesgos-de-la-inteligencia-artificial-651449483429', 'Lectura'),
(16, 'Inteligencia Artificial', 'El sector financiero es un gran exponente de la penetración de esta tecnología en favor del cliente y de la eficiencia en los procedimientos internos. Gracias a ...', 'https://elpais.com/tag/inteligencia_artificial/a', 'Lectura'),
(17, 'Inteligencia', 'La inteligencia es la capacidad de relacionar conocimientos que poseemos para resolver una determinada situación. Si indagamos un poco ...', 'https://www.xatakaciencia.com/otros/que-es-la-inteligencia', 'Lectura'),
(18, 'Inteligencia', 'El estudio de la inteligencia ha interesado a psicólogos, filósofos, educadores y el público en general durante varios siglos. La sociedad humana valora ...', 'http://www.scielo.org.co/pdf/racefn/v35n134/v35n134a09.pdf', 'Lectura'),
(20, 'Inteligencia', 'os 12 tipos de inteligencia fueron establecidos por el psicólogo estadounidense Howard Gardner, creador de la teoría de las inteligencias ...', 'https://rockcontent.com/es/blog/tipos-de-inteligencia/', 'Lectura'),
(21, 'Inteligencia', 'Qué es Inteligencia. Concepto y Significado de Inteligencia: Inteligencia es la capacidad o facultad de entender, razonar, saber, aprender y de ..', 'https://www.significados.com/inteligencia/', 'Lectura'),
(22, 'Inteligencia', 'Descubre cómo aumentar tu inteligencia con 15 tips o consejos para conseguir ser más inteligente o más listo ...', 'https://www.youtube.com/watch?v=-V4k8v4AbOM', 'Video'),
(23, 'Inteligencia', 'Si estás leyendo esto, significa que eres inteligente. Muy inteligente, de hecho. O al menos más inteligente que el ...', 'https://www.youtube.com/watch?v=n-M1KaysHvw', 'Video'),
(24, 'Seguridad de la informacion', 'La seguridad de la información es el conjunto de medidas preventivas y reactivas de​ las organizaciones y sistemas tecnológicos que permiten resguardar y ...', 'https://es.wikipedia.org/wiki/Seguridad_de_la_informaci%C3%B3n', 'Lectura'),
(25, 'Seguridad de la informacion', 'La seguridad de la información permite asegurar la identificación, valoración y gestión de los activos de información y sus riesgos, en función del impacto que ...', 'https://www.uv.mx/celulaode/seguridad-info/tema1.html', 'Lectura'),
(26, 'Seguridad de la informacion', 'La seguridad de la información tiene como objetivo proteger los datos de las empresas teniendo en cuenta: confidencialidad, disponibilidad e integridad.\r\n', 'https://obsbusiness.school/int/blog-investigacion/sistemas/seguridad-de-la-informacion-un-conocimiento-imprescindible', 'Lectura'),
(27, 'Seguridad de la informacion', 'La seguridad de la información tiene como objetivo proteger los datos de las empresas teniendo en cuenta: confidencialidad, disponibilidad e integridad.\r\n', 'https://obsbusiness.school/int/blog-investigacion/sistemas/seguridad-de-la-informacion-un-conocimiento-imprescindible', 'Lectura'),
(28, 'Seguridad de la informacion', 'Qué es la Seguridad de la Información? ¿Cuáles son los principales cambios que introduce la GDPR frente a la LOPD? ¡Descubre más sobre ...', 'https://www.tecon.es/la-seguridad-de-la-informacion/', 'Lectura'),
(29, 'Seguridad de la informacion', 'Qué es la Seguridad de la Información? ¿Cuáles son los principales cambios que introduce la GDPR frente a la LOPD? ¡Descubre más sobre ...', 'https://www.universidadviu.com/las-4-claves-la-seguridad-la-informacion/', 'Lectura'),
(30, 'Seguridad de la informacion', 'Este blog explica la definición y el alcance de la Seguridad de la Información en los tiempos actuales.', 'https://bsginstitute.com/bs-campus/blog/Seguridad-de-la-Informacion-20', 'Lectura'),
(31, 'Seguridad de la informacion', 'La seguridad de la información se ha convertido en el tema central de la ciberseguridad. Primero, porque los datos que se encuentran en el ...', 'https://www.gb-advisors.com/es/seguridad-de-la-informacion/', 'Lectura'),
(32, 'Seguridad de la Informacion', 'Breve introducción sobre los conceptos básicos sobre la seguridad de la información.', 'https://www.youtube.com/watch?v=zV2sfyvfqik', 'Video'),
(33, 'Seguridad de la Informacion', 'Hoy en día, con los hackers a la orden del día es indispensable contar con un apoyo para garantizar la ...', 'https://www.youtube.com/watch?v=BNdPQU32p2Y', 'Video'),
(34, 'Seguridad de la Informacion', 'La implantación de un SGSI tiene como objetivo proteger la información, el activo más importante en una empresa ...', 'https://www.youtube.com/watch?v=THnQ2FH7NtU', 'Video'),
(35, 'Seguridad de la Informacion', '... de la Seguridad de la Información. Para implantar un SGSI es posible contar con una serie de normas que ...', 'https://www.youtube.com/watch?v=vWAV0bdWvtI', 'Video'),
(36, 'Seguridad', 'Seguridad (del latín securitas)​ cotidianamente se puede referir a la ausencia de riesgo o a la confianza en algo o en alguien. Sin embargo, el término puede ...', 'https://es.wikipedia.org/wiki/Seguridad', 'Lectura'),
(37, 'Seguridad', 'Seguridad es un conjunto de sistemas, medios organizativos, medios humanos y acciones dispuestas para eliminar, reducir o controlar los riesgos y amenazas ...', 'http://epn.gov.co/elearning/distinguidos/SEGURIDAD/1_conceptos_de_seguridad.html', 'Lectura'),
(38, 'Seguridad', 'El término seguridad posee múltiples usos. A grandes rasgos, puede afirmarse que este concepto que proviene del latín securitas hace foco en la característica ...', 'https://definicion.de/seguridad/', 'Lectura'),
(39, 'Seguridad', 'Se define a la seguridad como la ausencia de peligro, daño o riesgo. También es la sensación de confianza que se tiene en algo o alguien: \"es bueno tener ...', 'http://www.forodeseguridad.com/artic/discipl/4163.htm', 'Lectura'),
(40, 'Seguridad', 'La palabra Seguridad proviene del latín securitas, que a su vez deriva de securus (sin cuidado, sin precaución, sin temor a preocuparse), que significa lib.', 'https://conceptodefinicion.de/seguridad/', 'Lectura'),
(41, 'Seguridad', 'Encuentra las últimas noticias, fotos y videos de Seguridad en El Universo.', 'https://www.eluniverso.com/seguridad', 'Lectura'),
(42, 'Seguridad', 'Noticias, análisis, entrevistas, fotos y videos sobre Seguridad en temáticas de El Universo.', 'https://www.eluniverso.com/tema/seguridad', 'Lectura'),
(43, 'Seguridad', 'OBJETIVOS DEL SISTEMA DE SEGURIDAD E HIGIENE EN EL TRABAJO DE LA UNIVERSIDAD DE OTAVALO. OBJETIVO GENERAL: • Precautelar y ...', 'uotavalo.edu.ec/index.php/objetivosseguridad.html', 'Lectura'),
(44, 'Seguridad', 'La carrera de Seguridad y Salud Ocupacional forma a profesionales capaces de desempeñarse en las áreas de seguridad y salud ocupacional, con un ...', 'https://inscripciones.utpl.edu.ec/distancia/seguridad', 'Lectura');

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
  MODIFY `id_recurso` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
