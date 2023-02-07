-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 09, 2021 at 03:44 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wherehouse_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(25) NOT NULL,
  `role` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `name`, `username`, `password`, `role`) VALUES
('01', 'Lahiru Buddhika Jayasundara', 'manager', 'manager123', 'Manager'),
('02', 'Yashod Bawantha', 'operator', 'operator123', 'Operator');

-- --------------------------------------------------------

--
-- Table structure for table `registeruser`
--

DROP TABLE IF EXISTS `registeruser`;
CREATE TABLE IF NOT EXISTS `registeruser` (
  `user_id` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `id_number` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_no` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registeruser`
--

INSERT INTO `registeruser` (`user_id`, `name`, `id_number`, `address`, `phone_no`, `email`) VALUES
('01', 'lahiru buddhika', '200102102745', 'dunakadeniya welipannagahamulla', '2001lahiru123@gmail.com', '0761794048');

-- --------------------------------------------------------

--
-- Table structure for table `storage_job`
--

DROP TABLE IF EXISTS `storage_job`;
CREATE TABLE IF NOT EXISTS `storage_job` (
  `user_id` varchar(100) NOT NULL,
  `customer_name` varchar(60) NOT NULL,
  `product_name` varchar(60) NOT NULL,
  `product_code` varchar(50) NOT NULL,
  `unit` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `duration` varchar(50) NOT NULL,
  `avalibility` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `storage_job`
--

INSERT INTO `storage_job` (`user_id`, `customer_name`, `product_name`, `product_code`, `unit`, `date`, `duration`, `avalibility`) VALUES
('01', 'lahiru buddhika', 'MD CODIAL', '0220', '5', '2021/10/02', '10', 'Close'),
('01', 'lahiru buddhika', 'shampo', '0241', '10', '2021/10/2', '10', 'Close');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
