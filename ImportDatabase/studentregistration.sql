-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 13, 2017 at 12:19 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostelmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `studentregistration`
--

CREATE TABLE `studentregistration` (
  `Name` varchar(100) NOT NULL,
  `Id` int(5) NOT NULL,
  `Phone_no` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `National_Id` varchar(100) NOT NULL,
  `FatherName` varchar(100) NOT NULL,
  `Mothername` varchar(100) NOT NULL,
  `SeatNo` varchar(100) NOT NULL,
  `BuildinNo` varchar(20) NOT NULL,
  `Floor` varchar(20) NOT NULL,
  `Ammount` varchar(100) NOT NULL,
  `releasing` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentregistration`
--

INSERT INTO `studentregistration` (`Name`, `Id`, `Phone_no`, `Email`, `Gender`, `National_Id`, `FatherName`, `Mothername`, `SeatNo`, `BuildinNo`, `Floor`, `Ammount`, `releasing`) VALUES
('Zahid', 2, '012166632', 'za@gmail.com', 'Male', '3216303652303', 'Tahidul', 'Karima', '1', 'Building1', 'Floor1', '200', 'null'),
('Zahid', 3, '012166632', 'za@gmail.com', 'Male', '3216303652303', 'Tahidul', 'Karima', '1', 'Building1', 'Floor1', '1200', 'null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentregistration`
--
ALTER TABLE `studentregistration`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentregistration`
--
ALTER TABLE `studentregistration`
  MODIFY `Id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
