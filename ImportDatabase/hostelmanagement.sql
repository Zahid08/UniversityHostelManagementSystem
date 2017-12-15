-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 13, 2017 at 12:18 AM
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
-- Table structure for table `caretaker`
--

CREATE TABLE `caretaker` (
  `Name` varchar(100) NOT NULL,
  `ID` int(5) NOT NULL,
  `phoneno` int(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `salary` int(20) NOT NULL,
  `Nationalid` int(50) NOT NULL,
  `permanentaddress` varchar(100) NOT NULL,
  `admitdate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `caretaker`
--

INSERT INTO `caretaker` (`Name`, `ID`, `phoneno`, `address`, `gender`, `salary`, `Nationalid`, `permanentaddress`, `admitdate`) VALUES
('Zahid', 2, 12, 'aaaaa', 'Male', 2, 32132, 'adasd', '2017-10-13 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `cooker`
--

CREATE TABLE `cooker` (
  `Name` varchar(100) NOT NULL,
  `Id` int(5) NOT NULL,
  `Phone_no` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Salary` varchar(100) NOT NULL,
  `National_id` varchar(100) NOT NULL,
  `Permanent_Loacation` varchar(100) NOT NULL,
  `Admitdate` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `password` int(100) NOT NULL,
  `Type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Username`, `password`, `Type`) VALUES
(1, 'Zahid', 123, 'Admin'),
(2, 'akash', 123, 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caretaker`
--
ALTER TABLE `caretaker`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `cooker`
--
ALTER TABLE `cooker`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `studentregistration`
--
ALTER TABLE `studentregistration`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caretaker`
--
ALTER TABLE `caretaker`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cooker`
--
ALTER TABLE `cooker`
  MODIFY `Id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `studentregistration`
--
ALTER TABLE `studentregistration`
  MODIFY `Id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
