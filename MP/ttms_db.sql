-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2023 at 06:07 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ttms_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `security` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `security`, `answer`) VALUES
('kd@8067', 'Kartvya', 'kd@2234', 'Your Lucky Number?', '1'),
('The Unique One !', 'Aditya', 'aadi2234', 'Your NickName?', 'Adi'),
('The Legend', 'Kiran', 'kiran@2008', 'Your Lucky Number?', '07'),
('travelmanager', 'Aditya', 'aadi2234', 'Your NickName?', 'aadi');

-- --------------------------------------------------------

--
-- Table structure for table `bookhotel`
--

CREATE TABLE `bookhotel` (
  `username` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `persons` varchar(20) NOT NULL,
  `days` varchar(10) NOT NULL,
  `ac` varchar(10) NOT NULL,
  `food` varchar(10) NOT NULL,
  `id` varchar(30) NOT NULL,
  `number` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookhotel`
--

INSERT INTO `bookhotel` (`username`, `name`, `persons`, `days`, `ac`, `food`, `id`, `number`, `phone`, `price`) VALUES
('The Unique One !', 'The Taj Hotel', '2', '4', 'AC', 'Yes', 'Aadhar Card', '959147838253', '9309298067', 'Rs. 54810');

-- --------------------------------------------------------

--
-- Table structure for table `bookpackage`
--

CREATE TABLE `bookpackage` (
  `username` varchar(20) NOT NULL,
  `package` varchar(30) NOT NULL,
  `persons` varchar(20) NOT NULL,
  `id` varchar(30) NOT NULL,
  `number` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookpackage`
--

INSERT INTO `bookpackage` (`username`, `package`, `persons`, `id`, `number`, `phone`, `price`) VALUES
('The Unique One !', 'Bronze Package', '2', 'Aadhar Card', '959147838253', '9309298067', 'Rs. 64000');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `username` varchar(20) NOT NULL,
  `id` varchar(30) NOT NULL,
  `number` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `country` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`username`, `id`, `number`, `name`, `gender`, `country`, `address`, `phone`, `email`) VALUES
('The Unique One !', 'Aadhar Card', '959147838253', 'Aditya', 'Male', 'India', 'Kalyan City', '9309298067', 'dhakaneaditya502@gmail.com'),
('kd@8067', 'Aadhar Card', '92308231234', 'Kartvya', 'Male', 'India', 'Mumbai', '7410193207', 'aadityadhakane@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `name` varchar(30) NOT NULL,
  `costperson` varchar(20) NOT NULL,
  `acroom` varchar(10) NOT NULL,
  `foodincluded` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`name`, `costperson`, `acroom`, `foodincluded`) VALUES
('Raddison Blue Hotel', '3400', '1000', '1700'),
('River View Hotel', '2400', '1600', '1000'),
('The Taj Hotel', '4800', '1290', '2900');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
