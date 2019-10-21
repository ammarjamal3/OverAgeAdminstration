-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 21, 2019 at 11:05 PM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ammar`
--
CREATE DATABASE IF NOT EXISTS `ammar` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ammar`;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `salary` double NOT NULL,
  `age` int(200) NOT NULL,
  `department` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `date_of_birth` varchar(200) NOT NULL,
  `gender` varchar(200) NOT NULL,
  `education` varchar(200) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `contract_start` varchar(200) NOT NULL,
  `contract_end` varchar(200) NOT NULL,
  `nationality` varchar(200) NOT NULL,
  `mother_language` varchar(200) NOT NULL,
  `other_language` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `phone` double NOT NULL,
  `admin` varchar(255) NOT NULL,
  `Modify By` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `fname`, `name`, `salary`, `age`, `department`, `address`, `date_of_birth`, `gender`, `education`, `experience`, `contract_start`, `contract_end`, `nationality`, `mother_language`, `other_language`, `email`, `phone`, `admin`, `Modify By`) VALUES
(34, 'dsf', 'dfs', 34, 34, 'sdf', 'fsd', 'Tue Jul 23 10:05:05 GMT+03:00 2019', 'fsd', 'dfs', 'dsf', 'Wed Jul 03 10:05:05 GMT+03:00 2019', 'Wed Jul 24 10:05:05 GMT+03:00 2019', 'sdf', 'fsdas', 'dsf43', 'dsf@gmail.com', 21, '', 'ammar'),
(35, 'sdf', 'dsf', 32, 32, 'dsf', 'ds', 'Wed Jul 03 11:56:57 GMT+03:00 2019', 'ds', 'dssd', 'ds', 'Mon Jul 08 11:56:57 GMT+03:00 2019', 'Thu Jul 18 11:56:57 GMT+03:00 2019', 'ds', 'sd', 'dssd', 'sd', 324324, '', ''),
(36, 'kj', 'kj', 67, 23, 'gxf', 'gs', 'Wed Jul 03 23:26:05 GMT+03:00 2019', 'dfs', 'ds', 'ds', 'Thu Jul 04 23:26:05 GMT+03:00 2019', 'Mon Jul 15 23:26:05 GMT+03:00 2019', 'dsds', 'dsds', 'ds', 'dfsdf', 33232, '', ''),
(37, 'qw', 'qw', 12, 23, 'defg', 'kjho', 'Thu Jul 04 23:41:04 GMT+03:00 2019', 'loiu', 'hjk', 'yuiuil', 'Wed Jul 10 23:41:04 GMT+03:00 2019', 'Mon Jul 29 23:41:04 GMT+03:00 2019', 'dfff', 'dfsfd', 'afdg', 'adfg', 234567, '', ''),
(38, 'fgh', 'fghj', 45, 56, 'gh', 'gh', 'Wed Jul 03 23:52:27 GMT+03:00 2019', 'frghj', 'fgh', 'rgth', 'Wed Jul 03 23:52:27 GMT+03:00 2019', 'Mon Jul 15 23:52:27 GMT+03:00 2019', 'ghj', 'fvgh', 'gh', 'gh', 345678, '', ''),
(39, 'fg', 'fg', 56, 56, 'gh', 'gh', 'Thu Jul 18 00:10:57 GMT+03:00 2019', 'dfg', 'dfg', 'dfg', 'Wed Jul 10 00:10:57 GMT+03:00 2019', 'Thu Jul 11 00:10:57 GMT+03:00 2019', 'fg', 'fg', 'ggb', 'gh', 6543, '', ''),
(40, 'dfgD', 'rt', 45, 545, 'gh', 'fgh', 'Sat Jul 20 00:16:51 GMT+03:00 2019', 'fg', 'fg', 'fg', 'Fri Jul 12 00:16:51 GMT+03:00 2019', 'Fri Jul 12 00:16:51 GMT+03:00 2019', 'rt', 'fgf', 'gfh', 'fgh', 3456, '', ''),
(41, 'gh', 'gfg', 76, 67, 'hj', 'hj', 'Wed Jul 17 03:56:07 GMT+03:00 2019', 'hj', 'hj', 'hjjh', 'Tue Jul 02 03:56:07 GMT+03:00 2019', 'Tue Jul 30 03:56:07 GMT+03:00 2019', 'gh', 'jh', 'jh', 'hj', 566767, 'ammar', ''),
(42, 'asd', 'sad', 34, 34, 'sad', 'sda', 'Fri Jul 19 06:19:07 GMT+03:00 2019', 'fdg', 'df', 'fd', 'Wed Jul 03 06:19:07 GMT+03:00 2019', 'Tue Jul 30 06:19:07 GMT+03:00 2019', 'sad', 'sad', 'sad', 'sad', 324, 'ammar', ''),
(43, 'aaaaa', 'aaaa', 23, 23, 'aa', 'aa', 'Wed Jul 17 06:21:31 GMT+03:00 2019', 'sd', 'sd', 'ds', 'Tue Jul 02 06:21:31 GMT+03:00 2019', 'Wed Jul 31 06:21:31 GMT+03:00 2019', 'aa', 'aaa', 'aa', 'aa', 23, 'ammar', ''),
(46, 'www', 'www', 11, 11, 'ww', 'ww', 'Fri Jul 05 06:36:25 GMT+03:00 2019', 'www', 'ww', 'ww', 'Thu Jul 11 06:36:25 GMT+03:00 2019', 'Thu Jul 25 06:36:25 GMT+03:00 2019', 'ww', 'ww', 'ww', 'www', 11, 'ammar', ''),
(48, 'ggg', 'ggg', 33, 33, 'gg', 'gg', 'Thu Jul 04 06:40:10 GMT+03:00 2019', 'gg', 'gggg', 'gg', 'Thu Jul 04 06:40:11 GMT+03:00 2019', 'Thu Jul 11 06:40:11 GMT+03:00 2019', 'gg', 'ggg', 'gggg', 'gg', 33, 'ammar', ''),
(49, 'as', 'as', 21, 21, 'as', 'sa', 'Thu Jul 04 06:47:31 GMT+03:00 2019', 'sasa', 'sa', 'sa', 'Sat Jul 13 06:47:31 GMT+03:00 2019', 'Wed Jul 31 06:47:31 GMT+03:00 2019', 'sa', 'sa', 'sasa', 'sa', 12, 'ammar', ''),
(51, 'qw', 'qw', 21, 12, 'qw', 'qw', 'Thu Jul 18 06:50:42 GMT+03:00 2019', 'wq', 'qw', 'wq', 'Wed Jul 03 06:50:42 GMT+03:00 2019', 'Wed Jul 17 06:50:42 GMT+03:00 2019', 'wq', 'wq', 'qw', 'qw', 12, 'ammar', ''),
(52, 'hhh', 'hh', 66, 66, 'hhh', 'hh', 'Tue Jul 09 06:52:19 GMT+03:00 2019', 'hh', 'hhh', 'hhh', 'Wed Jul 03 06:52:20 GMT+03:00 2019', 'Thu Jul 18 06:52:20 GMT+03:00 2019', 'hh', 'h', 'hh', 'hh', 66, 'ammar', ''),
(53, 'qq', 'qq', 11, 11, 'qq', 'qq', 'Thu Jul 11 06:53:48 GMT+03:00 2019', 'qq', 'qqq', 'qq', 'Thu Jul 04 06:53:48 GMT+03:00 2019', 'Sat Jul 27 06:53:48 GMT+03:00 2019', 'qq', 'qqq', 'qq', 'qqq', 11, 'ammar', ''),
(54, 'ww', 'ww', 22, 22, 'ww', 'ww', 'Fri Jul 05 06:56:30 GMT+03:00 2019', 'ww', 'wwww', 'w', 'Thu Jul 04 06:56:30 GMT+03:00 2019', 'Thu Jul 18 06:56:30 GMT+03:00 2019', 'ww', 'www', 'ww', 'ww', 22, 'ammar', ''),
(55, 'q', 'q', 1, 1, 'q', 'q', 'Tue Jul 09 07:02:57 GMT+03:00 2019', 'q', 'q', 'q', 'Wed Jul 03 07:02:57 GMT+03:00 2019', 'Thu Jul 11 07:02:57 GMT+03:00 2019', 'q', 'q', 'q', 'qq', 1, 'ammar', ''),
(56, 'e', 'e', 3, 3, 'ee', 'e', 'Wed Jul 03 07:03:57 GMT+03:00 2019', 'e', 'e', 'e', 'Tue Jul 02 07:03:57 GMT+03:00 2019', 'Thu Jul 18 07:03:57 GMT+03:00 2019', 'e', 'e', 'ee', 'fg@gmail.com', 3, 'ammar', 'abbas'),
(57, 't', 't', 5, 5, 'tt', 't', 'Thu Jul 04 07:05:13 GMT+03:00 2019', 't', 't', 't', 'Wed Jul 10 07:05:13 GMT+03:00 2019', 'Wed Jul 31 07:05:13 GMT+03:00 2019', 't', 't', 'tttt', 't', 5, 'ammar', ''),
(58, 'h', 'h', 5, 5, 'h', 'h', 'Wed Jul 03 07:08:30 GMT+03:00 2019', 'h', 'h', 'h', 'Wed Jul 03 07:08:30 GMT+03:00 2019', 'Fri Aug 09 07:08:30 GMT+03:00 2019', 'h', 'h', 'h', 'h', 5, 'ammar', ''),
(59, 'j', 'j', 7, 7, 'j', 'j', 'Wed Jul 17 07:10:23 GMT+03:00 2019', 'j', 'j', 'j', 'Wed Jul 03 07:10:23 GMT+03:00 2019', 'Wed Jul 24 07:10:23 GMT+03:00 2019', 'j', 'j', 'j', 'j', 7, 'ammar', ''),
(60, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 07:11:49 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 07:11:49 GMT+03:00 2019', 'Fri Aug 02 07:11:49 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar', ''),
(61, 'q', 'q', 1, 1, 'q', 'q', 'Wed Jul 03 07:14:02 GMT+03:00 2019', 'qq', 'q', 'q', 'Thu Jul 04 07:14:02 GMT+03:00 2019', 'Thu Jul 18 07:14:02 GMT+03:00 2019', 'q', 'q', 'q', 'q', 1, 'ammar', ''),
(62, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 07:21:09 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 07:21:09 GMT+03:00 2019', 'Wed Jul 24 07:21:09 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar', ''),
(63, 'q', 'q', 1, 1, 'q', 'q', 'Wed Jul 10 07:34:34 GMT+03:00 2019', 'qq', 'q', 'q', 'Wed Jul 03 07:34:34 GMT+03:00 2019', 'Thu Jul 11 07:34:34 GMT+03:00 2019', 'q', 'q', 'q', 'q', 1, 'ammar', ''),
(64, 'w', 'w', 2, 2, 'ww', 'w', 'Tue Jul 16 07:36:38 GMT+03:00 2019', 'w', 'w', 'w', 'Tue Jul 02 07:36:39 GMT+03:00 2019', 'Fri Jul 26 07:36:39 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar', ''),
(65, 'y', 'y', 6, 6, 'y', 'y', 'Wed Jul 10 07:41:50 GMT+03:00 2019', 'y', 'y', 'y', 'Wed Jul 03 07:41:50 GMT+03:00 2019', 'Wed Jul 17 07:41:50 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar', ''),
(66, 't', 't', 5, 5, 't', 't', 'Thu Jul 04 07:42:46 GMT+03:00 2019', 't', 't', 't', 'Tue Jul 02 07:42:46 GMT+03:00 2019', 'Thu Jul 18 07:42:46 GMT+03:00 2019', 't', 't', 't', 't', 5, 'ammar', ''),
(67, 'y', 'y', 6, 6, 'y', 'y', 'Wed Jul 03 07:44:56 GMT+03:00 2019', 'y', 'y', 'y', 'Wed Jul 03 07:44:56 GMT+03:00 2019', 'Tue Jul 16 07:44:56 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar', ''),
(68, 'y', 'y', 6, 6, 'y', 'y', 'Tue Jul 02 07:48:07 GMT+03:00 2019', 'y', 'y', 'y', 'Tue Jul 02 07:48:07 GMT+03:00 2019', 'Fri Jul 12 07:48:07 GMT+03:00 2019', 'y', 'y', 'yyy', 'y', 6, 'ammar', ''),
(69, 'y', 'y', 6, 6, 'y', 'y', 'Tue Jul 09 07:49:10 GMT+03:00 2019', 'y', 'y', 'y', 'Tue Jul 09 07:49:10 GMT+03:00 2019', 'Thu Jul 11 07:49:10 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar', ''),
(70, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'Thu Jul 18 13:59:57 GMT+03:00 2019', 'w', 'ww', 'ww', 'w', 2, 'ammar', ''),
(71, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'Thu Jul 18 13:59:57 GMT+03:00 2019', 'w', 'ww', 'ww', 'w', 2, 'ammar', ''),
(72, 'e', 'e', 3, 3, 'e', 'e', 'Wed Jul 17 14:09:48 GMT+03:00 2019', 'e', 'e', 'e', 'Wed Jul 03 14:09:48 GMT+03:00 2019', 'Tue Jul 30 14:09:48 GMT+03:00 2019', 'e', 'ee', 'e', 'e', 3, 'ammar', ''),
(73, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 24 09:00:24 GMT+03:00 2019', 'w', 'w', 'w', 'Thu Jul 04 09:00:24 GMT+03:00 2019', 'Thu Jul 11 09:00:24 GMT+03:00 2019', 'w', 'w', 'ww', 'w', 2, 'ammar', ''),
(74, 'wsdw', 'weew', 23, 23, 'we', 'ew', 'Thu Aug 08 14:12:16 GMT+03:00 2019', 'we', 'we', 'we', 'Wed Jul 31 14:12:16 GMT+03:00 2019', 'Wed Aug 21 14:12:16 GMT+03:00 2019', 'wewe', 'weew', 'wewe', 'we', 233232, 'ammar', ''),
(75, 'mohammed', 'sd', 32, 23, 'we', 'we', 'Tue Aug 06 14:55:59 GMT+03:00 2019', 'we', 'ew', 'ew', 'Wed Aug 07 14:55:59 GMT+03:00 2019', 'Tue Aug 06 14:55:59 GMT+03:00 2019', 'er', 'er', 'rere', 'er', 34, 'ammar', 'abbas'),
(76, 'ali', 'we', 23, 34, 'er', 're', 'Thu Aug 08 15:08:03 GMT+03:00 2019', 'er', 'er', 'er', 'Wed Jul 31 15:08:03 GMT+03:00 2019', 'Tue Aug 27 15:08:03 GMT+03:00 2019', 'er', 're', 'er', 'er', 34, 'ammar', 'abbas'),
(77, 'gg', 'gg', 4, 4, 't', 't', 'Thu Aug 08 18:58:05 GMT+03:00 2019', 't', 't', 't', 'Thu Aug 08 18:58:05 GMT+03:00 2019', 'Fri Aug 16 18:58:05 GMT+03:00 2019', 'g', 'gg', 'g', 'g', 4, 'ammar', 'ammar'),
(78, 'q', 'q', 2, 2, 'e', 'e', 'Wed Aug 07 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'Wed Jul 31 20:09:12 GMT+03:00 2019', 'Mon Aug 12 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'e', 22, 'ammar', NULL),
(79, 'q', 'q', 2, 2, 'e', 'e', 'Wed Aug 07 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'Wed Jul 31 20:09:12 GMT+03:00 2019', 'Mon Aug 12 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'ammarjamnal@gmail.com', 22, 'ammar', NULL),
(80, 'q', 'q', 2, 2, 'e', 'e', 'Wed Aug 07 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'Wed Jul 31 20:09:12 GMT+03:00 2019', 'Mon Aug 12 20:09:12 GMT+03:00 2019', 'e', 'e', 'e', 'a', 22, 'ammar', NULL),
(81, 'w', 'w', 22, 2, 'sd', 's', 'Thu Aug 08 20:11:46 GMT+03:00 2019', 's', 's', 's', 'Wed Aug 07 20:11:46 GMT+03:00 2019', 'Wed Aug 14 20:11:46 GMT+03:00 2019', 's', 's', 's', 's', 2, 'ammar', NULL),
(82, 'w', 'w', 22, 2, 'sd', 's', 'Thu Aug 08 20:11:46 GMT+03:00 2019', 's', 's', 's', 'Wed Aug 07 20:11:46 GMT+03:00 2019', 'Wed Aug 14 20:11:46 GMT+03:00 2019', 's', 's', 's', 'ammarjamal@gmail.com', 2, 'ammar', NULL),
(83, 'a', 'a', 2, 2, 'd', 'd', 'Thu Aug 01 20:14:58 GMT+03:00 2019', 'd', 'd', 'd', 'Wed Jul 31 20:14:58 GMT+03:00 2019', 'Wed Aug 28 20:14:58 GMT+03:00 2019', 'd', 'd', 'd', 'd', 2, 'ammar', NULL),
(84, 'a', 'a', 2, 2, 'd', 'd', 'Thu Aug 01 20:14:58 GMT+03:00 2019', 'd', 'd', 'd', 'Wed Jul 31 20:14:58 GMT+03:00 2019', 'Wed Aug 28 20:14:58 GMT+03:00 2019', 'd', 'd', 'd', 'ammarjamal@gmail.com', 2, 'ammar', NULL),
(85, '1', '1', 7, 6, 'gt', 'g', 'Wed Aug 07 22:04:55 GMT+03:00 2019', 'gg', 'g', 'g', 'Thu Aug 01 22:04:55 GMT+03:00 2019', 'Wed Aug 14 22:04:55 GMT+03:00 2019', 'gg', 'g', 'gg', 'aa@gmail.com', 333, 'ammar', NULL),
(86, '1', '1', 7, 6, 'gt', 'g', 'Wed Aug 07 22:04:55 GMT+03:00 2019', 'gg', 'g', 'g', 'Thu Aug 01 22:04:55 GMT+03:00 2019', 'Wed Aug 14 22:04:55 GMT+03:00 2019', 'gg', 'g', 'gg', 'aa@gmail.com', 333, 'ammar', NULL),
(87, '1', '1', 7.6, 6, 'gt', 'g', 'Wed Aug 07 22:04:55 GMT+03:00 2019', 'gg', 'g', 'g', 'Thu Aug 01 22:04:55 GMT+03:00 2019', 'Wed Aug 14 22:04:55 GMT+03:00 2019', 'gg', 'g', 'gg', 'aa@gmail.com', 333, 'ammar', NULL),
(88, '1', '1', 17.6, 6, 'gt', 'g', 'Wed Aug 07 22:04:55 GMT+03:00 2019', 'gg', 'g', 'g', 'Thu Aug 01 22:04:55 GMT+03:00 2019', 'Wed Aug 14 22:04:55 GMT+03:00 2019', 'gg', 'g', 'gg', 'aa@gmail.com', 333, 'ammar', NULL),
(89, 'q', 'q', 2, 2, 'q', 'q', 'Thu Aug 15 22:09:07 GMT+03:00 2019', 'q', 'qq', 'q', 'Thu Aug 08 22:09:07 GMT+03:00 2019', 'Wed Aug 21 22:09:07 GMT+03:00 2019', 'q', 'qqq', 'qq', 'aa@gmail.com', 33, 'ammar', NULL),
(90, 'q', 'q', 2.3, 2, 'q', 'q', 'Thu Aug 15 22:09:07 GMT+03:00 2019', 'q', 'qq', 'q', 'Thu Aug 08 22:09:07 GMT+03:00 2019', 'Wed Aug 21 22:09:07 GMT+03:00 2019', 'q', 'qqq', 'qq', 'aa@gmail.com', 33, 'ammar', NULL),
(91, 'q', 'q', 32.3, 2, 'q', 'q', 'Thu Aug 15 22:09:07 GMT+03:00 2019', 'q', 'qq', 'q', 'Thu Aug 08 22:09:07 GMT+03:00 2019', 'Wed Aug 21 22:09:07 GMT+03:00 2019', 'q', 'qqq', 'qq', 'aa@gmail.com', 33, 'ammar', NULL),
(92, 'q', 'q', 32.33, 2, 'q', 'q', 'Thu Aug 15 22:09:07 GMT+03:00 2019', 'q', 'qq', 'q', 'Thu Aug 08 22:09:07 GMT+03:00 2019', 'Wed Aug 21 22:09:07 GMT+03:00 2019', 'q', 'qqq', 'qq', 'aa@gmail.com', 33, 'ammar', NULL),
(93, 'tg', 'g', 5, 5, 'gt', 'gg', 'Fri Aug 09 22:14:15 GMT+03:00 2019', 'g', 'g', 'g', 'Sun Aug 18 22:14:15 GMT+03:00 2019', 'Fri Aug 09 22:14:15 GMT+03:00 2019', 'dd', 'dddd', 'dd', 'aaa@gmail.com', 33, 'ammar', NULL),
(94, 'tg', 'g', 5.6, 5, 'gt', 'gg', 'Fri Aug 09 22:14:15 GMT+03:00 2019', 'g', 'g', 'g', 'Sun Aug 18 22:14:15 GMT+03:00 2019', 'Fri Aug 09 22:14:15 GMT+03:00 2019', 'dd', 'dddd', 'dd', 'aaa@gmail.com', 33, 'ammar', NULL),
(95, 'a', 'a', 2, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@gmail.com', 1, 'ammar', NULL),
(96, 'a', 'a', 2.9, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@gmail.com', 1, 'ammar', NULL),
(97, 'a', 'a', 22, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@gmail.om', 1, 'ammar', NULL),
(98, 'a', 'a', 22, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@mail.om', 1, 'ammar', NULL),
(99, 'a', 'a', 22, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@ail.om', 1, 'ammar', NULL),
(100, '', 'a', 22, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@ail.om', 1, 'ammar', NULL),
(101, '', '', 22, 2, 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'a', 'a', 'a', 'Thu Aug 01 23:36:19 GMT+03:00 2019', 'Thu Aug 15 23:36:19 GMT+03:00 2019', 'fgfg', 'g', 'frgt', 'aa@ail.om', 1, 'ammar', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` int(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `date_of_birth` longtext NOT NULL,
  `gender` varchar(255) NOT NULL,
  `education` varchar(255) NOT NULL,
  `experience` varchar(255) NOT NULL,
  `nationality` varchar(255) NOT NULL,
  `mother_language` varchar(255) NOT NULL,
  `other_language` varchar(255) NOT NULL,
  `family_phone` int(255) NOT NULL,
  `family_E-mail` varchar(255) NOT NULL,
  `date_of_join` longtext NOT NULL,
  `special_needs` varchar(255) NOT NULL,
  `chronic_diseases` varchar(255) NOT NULL,
  `other_diseases` varchar(255) NOT NULL,
  `admin` varchar(255) NOT NULL,
  `Modify By` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `fname`, `name`, `age`, `department`, `date_of_birth`, `gender`, `education`, `experience`, `nationality`, `mother_language`, `other_language`, `family_phone`, `family_E-mail`, `date_of_join`, `special_needs`, `chronic_diseases`, `other_diseases`, `admin`, `Modify By`) VALUES
(1, 'aaa', 'sdfdsfds', 345, 'errewtf', 'javax.swing.JTextField[,129,288,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@37ad965b,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', 'ertret', 'ertert', 'ertrt', 'ertret', 'erteqq', 'errtte', 45343453, 'reeter', 'javax.swing.JTextField[,129,496,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@37ad965b,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', 'ertert', 'erttreetet', 'ertrttre', 'ammar', 'ammar'),
(3, 'az', 'a', 1, 'a', 'javax.swing.JTextField[,129,288,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@5bc61e05,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', 'aa', 'aa', 'aa', 'aa', 'ddd', 'dd', 23232323, 'M_fame@gmail.com', 'javax.swing.JTextField[,129,496,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@5bc61e05,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', 'aa', 'aa', 'aa', 'ammar', 'ammar'),
(5, 'az', 'a', 1231, 'a', 'Thu Aug 01 00:07:35 GMT+03:00 2019', 'aa', 'aa', 'aa', 'aa', 'ddd', 'dd', 23, 'M_fame@gmail.com', 'Wed Aug 07 00:07:35 GMT+03:00 2019', 'aa', 'aa', 'aa', 'ammar', NULL),
(6, 'f', 'f', 44, 'f', 'Thu Aug 08 00:15:00 GMT+03:00 2019', 'f', 'fff', 'f', 'ff', 'ff', 'f', 32312, 'N/A', 'Wed Aug 21 00:15:00 GMT+03:00 2019', 'f', 'f', 'f', 'ammar', NULL),
(7, '', '', 34, '', 'javax.swing.JTextField[,129,288,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@66431086,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', '', '', '', '', '', '', 0, 'aa@gmail.com', 'javax.swing.JTextField[,129,496,178x19,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@66431086,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]', '', '', '', 'ammar', NULL),
(8, 'fg', 'fg', 45, 'fd', 'Thu Aug 08 23:58:52 GMT+03:00 2019', 'fdfd', 'fdfd', 'fdfd', 'fdfddf', 'gfgf', 'gfgf', 454545, 'aa@gmail.com', 'Thu Aug 01 23:58:52 GMT+03:00 2019', 'fdfd', 'fdfd', 'fdfd', 'ammar', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'ammar', 'jamal'),
(2, 'abbas', 'saeed');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
