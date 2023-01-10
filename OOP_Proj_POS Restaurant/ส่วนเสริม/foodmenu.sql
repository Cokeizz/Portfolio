-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2021 at 04:11 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `foodmenu`
--

--
-- Dumping data for table `food_menu`
--

INSERT INTO `food_menu` (`barcode`, `foodName`, `price`) VALUES
('8850718801473', 'Lay Original', 20),
('8850718801497', 'Lay Sour Cream & Onion', 20),
('8850718815401', 'Lay Max Barbecue', 20),
('8850718815982', 'Lay Chilly lime', 20);

--
-- Dumping data for table `summary_table`
--

INSERT INTO `summary_table` (`DATE/TIME`, `TOTAL PRICE`) VALUES
('19-04-2021 06:38:18', '380.0'),
('19-04-2021 06:38:49', '705.0'),
('19-04-2021 07:37:28', '140.0'),
('19-04-2021 07:37:38', '235.0'),
('19-04-2021 07:51:55', '140.0'),
('19-04-2021 18:29:55', '500.0'),
('26-04-2021 17:13:26', '100.0'),
('26-04-2021 17:53:34', '80.0'),
('26-04-2021 19:01:25', '120.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
