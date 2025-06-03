-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 03, 2025 at 02:55 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_laptop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int NOT NULL,
  `nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama`, `username`, `password`) VALUES
(1, 'admin', 'admin', 'admin123'),
(123230219, 'Ikhsan Fillah Hidayat', 'ikhsan', 'ikzy123');

-- --------------------------------------------------------

--
-- Table structure for table `laptop`
--

CREATE TABLE `laptop` (
  `id` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `merek` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `model` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `spesifikasi` text COLLATE utf8mb4_general_ci NOT NULL,
  `harga` double NOT NULL,
  `stok` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laptop`
--

INSERT INTO `laptop` (`id`, `merek`, `model`, `spesifikasi`, `harga`, `stok`) VALUES
('AC1001', 'ACER', 'NITRO 5', 'RTX 4050, i5 12500H', 18500000, 4),
('AC1007', 'ACER', 'ASPIRE 5', 'Vega 8, Ryzen 5 5500U', 7900000, 5),
('AC1013', 'ACER', 'SWIFT X', 'RTX 3050, Ryzen 7 5800U', 13500000, 3),
('AC1019', 'ACER', 'EXTENSA 15', 'Vega 6, Ryzen 3 5300U', 6150000, 10),
('AC1025', 'ACER', 'TRAVELMATE P2', 'UHD Graphics, i3 1215U', 7500000, 9),
('AC1031', 'ACER', 'NITRO V15', 'RTX 4060, i5 13450HX', 19500000, 2),
('AC1037', 'ACER', 'ASPIRE 3', 'Intel UHD, i3 1215U', 6850000, 8),
('AC1043', 'ACER', 'SWIFT GO 14', 'Iris Xe, i7 1355U', 15900000, 5),
('AC1049', 'ACER', 'PREDATOR HELIOS NEO', 'RTX 4060, i7 13700HX', 27500000, 1),
('AC1055', 'ACER', 'CHROMEBOOK SPIN 714', 'Iris Xe, i5 1235U', 10500000, 6),
('AC1231', 'ACER', 'NITRO 15', 'RTX 4060, I5 14400H', 20000000, 3),
('AC2342', 'ACER', 'Aspire 7', 'GTX 1650, Ryzen 5 5500U', 9800000, 7),
('AC3456', 'ACER', 'Predator Helios', 'RTX 4070, i9 13900HX', 33000000, 2),
('AC5647', 'ACER', 'Aspire Vero', 'Intel Iris Xe, i5 1155G7', 8800000, 4),
('AC8912', 'ACER', 'Swift X', 'RTX 3050Ti, Ryzen 5 5600U', 13000000, 2),
('AS1002', 'ASUS', 'VIVOBOOK X15', 'GTX 1650, i5 1135G7', 10250000, 7),
('AS1008', 'ASUS', 'TUF DASH F15', 'RTX 4060, i7 12700H', 20500000, 3),
('AS1014', 'ASUS', 'ROG FLOW X13', 'RTX 3050 Ti, Ryzen 9 6900HS', 22000000, 2),
('AS1020', 'ASUS', 'EXPERTBOOK B1', 'Intel UHD, i3 1115G4', 6700000, 8),
('AS1026', 'ASUS', 'ZENBOOK 14', 'Iris Xe, i7 1255U', 16500000, 4),
('AS1032', 'ASUS', 'ROG STRIX G15', 'RTX 3060, Ryzen 7 6800H', 19900000, 3),
('AS1038', 'ASUS', 'EXPERTBOOK P2', 'Intel UHD, i5 1135G7', 9450000, 7),
('AS1044', 'ASUS', 'TUF GAMING A16', 'RTX 4050, Ryzen 7 7735HS', 18900000, 3),
('AS1050', 'ASUS', 'ZENBOOK S13 OLED', 'Iris Xe, i7 1355U', 22500000, 2),
('AS1056', 'ASUS', 'ROG ZEPHYRUS G14', 'RTX 4060, Ryzen 9 7940HS', 27500000, 2),
('AS1111', 'ASUS', 'TUF A15', 'RTX 3050, I5 12400H', 15000000, 5),
('AS2121', 'ASUS', 'ROG Zephyrus', 'RTX 4080, Ryzen 9 7945HX', 35000000, 2),
('AS4321', 'ASUS', 'Vivobook Pro', 'RTX 3050, Ryzen 7 5800H', 15500000, 6),
('AS6423', 'ASUS', 'TUF Dash F15', 'RTX 3060, i7 12650H', 16500000, 5),
('AS9991', 'ASUS', 'ZenBook 14X', 'RTX 3050, i7 1260P', 16000000, 1),
('DL1005', 'DELL', 'INSPIRON 15', 'Intel Iris Xe, i5 1135G7', 8750000, 8),
('DL1011', 'DELL', 'G16 7620', 'RTX 3060, i7 12700H', 19800000, 2),
('DL1017', 'DELL', 'XPS 13 PLUS', 'Iris Xe, i7 1360P', 24000000, 3),
('DL1023', 'DELL', 'LATITUDE 3420', 'Intel UHD, i5 1135G7', 9100000, 7),
('DL1029', 'DELL', 'VOSTRO 14 3000', 'Intel UHD, i3 1115G4', 6650000, 7),
('DL1035', 'DELL', 'ALIENWARE M15 R7', 'RTX 3070 Ti, Ryzen 9 6900HX', 33000000, 1),
('DL1041', 'DELL', 'PRECISION 3570', 'Iris Xe, i7 1265U', 21500000, 3),
('DL1047', 'DELL', 'G15 5530', 'RTX 4050, i5 13450HX', 19500000, 3),
('DL1053', 'DELL', 'XPS 15 9530', 'RTX 4050, i7 13700H', 31000000, 1),
('DL1059', 'DELL', 'INSPIRON 16 PLUS', 'RTX 3050, i7 13620H', 18800000, 2),
('DL1112', 'DELL', 'Inspiron 16', 'Intel Iris Xe, i5 1135G7', 9000000, 5),
('DL3344', 'DELL', 'XPS 15', 'RTX 4050, i7 13700H', 24000000, 5),
('DL4312', 'DELL', 'Alienware m16', 'RTX 4090, i9 13950HX', 45000000, 1),
('DL5523', 'DELL', 'G15', 'RTX 4060, i7 12700H', 19000000, 4),
('DL9981', 'DELL', 'Latitude 5540', 'Intel UHD, i5 1335U', 10000000, 7),
('HP1004', 'HP', 'PAVILION GAMING', 'GTX 1650, Ryzen 5 4600H', 9800000, 6),
('HP1010', 'HP', 'ENVY 13', 'Intel Iris Xe, i7 1165G7', 11200000, 6),
('HP1016', 'HP', 'VICTUS 15', 'RTX 3050, i5 12450H', 13400000, 5),
('HP1022', 'HP', 'SPECTRE x360', 'Iris Xe, i7 1255U', 22500000, 2),
('HP1028', 'HP', 'OMEN TRANSCEND 16', 'RTX 4070, i9 13900HX', 34500000, 1),
('HP1034', 'HP', 'PROBOOK 440 G9', 'Iris Xe, i5 1235U', 13750000, 5),
('HP1040', 'HP', 'PAVILION PLUS 14', 'RTX 2050, i5 1240P', 12500000, 6),
('HP1046', 'HP', 'VICTUS 16', 'RTX 4060, Ryzen 7 7840HS', 21000000, 4),
('HP1052', 'HP', 'DRAGONFLY G4', 'Iris Xe, i7 1355U', 26000000, 2),
('HP1058', 'HP', 'ELITEBOOK 840 G10', 'Iris Xe, i7 1355U', 24000000, 3),
('HP1234', 'HP', 'Spectre x360', 'Intel Iris Xe, i7 1355U', 17500000, 3),
('HP2233', 'HP', 'Envy x360', 'Intel Iris Xe, i7 1195G7', 12500000, 3),
('HP4412', 'HP', 'Pavilion 16', 'GTX 1650, i5 11300H', 10500000, 2),
('HP5678', 'HP', 'Omen 16', 'RTX 4060, i7 13620H', 21000000, 2),
('HP8888', 'HP', 'Victus 16', 'RTX 3050Ti, Ryzen 5 5600H', 14000000, 4),
('LN1003', 'LENOVO', 'IDEAPAD GAMING 3', 'RTX 3050, Ryzen 5 5600H', 12200000, 5),
('LN1009', 'LENOVO', 'LOQ 15', 'RTX 4050, i5 13420H', 17800000, 4),
('LN1015', 'LENOVO', 'YOGA SLIM 7', 'Iris Xe, i7 1260P', 14800000, 4),
('LN1021', 'LENOVO', 'LEGION 5I', 'RTX 3070 Ti, i7 12700H', 26000000, 1),
('LN1027', 'LENOVO', 'FLEX 5', 'Vega 6, Ryzen 3 5300U', 7200000, 6),
('LN1033', 'LENOVO', 'IDEAPAD SLIM 3', 'Vega 6, Ryzen 5 5500U', 8250000, 6),
('LN1039', 'LENOVO', 'THINKPAD E14', 'Iris Xe, i7 1255U', 15800000, 4),
('LN1045', 'LENOVO', 'LOQ 16IRH8', 'RTX 4060, i7 13620H', 22000000, 2),
('LN1051', 'LENOVO', 'LEGION PRO 5', 'RTX 4070, Ryzen 7 7745HX', 29500000, 1),
('LN1057', 'LENOVO', 'YOGA BOOK 9i', 'Iris Xe, i7 1355U', 28500000, 1),
('LNV1239', 'LENOVO', 'Legion 7', 'RTX 4080, i9 13980HX', 38000000, 1),
('LNV1423', 'LENOVO', 'LOQ', 'RTX 4050, I7 13400H', 17500000, 1),
('LNV7654', 'LENOVO', 'Legion 5', 'RTX 3070, Ryzen 7 5800H', 22000000, 3),
('LNV7865', 'LENOVO', 'Yoga Slim 7i', 'Intel Iris Xe, i7 1165G7', 11900000, 6),
('LNV9988', 'LENOVO', 'IdeaPad Gaming', 'GTX 1650, i5 11400H', 10900000, 3),
('MS1006', 'MSI', 'GF63 THIN', 'RTX 3050 Ti, i7 11800H', 14200000, 2),
('MS1012', 'MSI', 'CROSSHAIR 15', 'RTX 3070, i9 12900H', 27000000, 1),
('MS1018', 'MSI', 'MODERN 14', 'Vega 7, Ryzen 5 5500U', 7900000, 6),
('MS1024', 'MSI', 'BRAVO 15', 'RX 6500M, Ryzen 5 5600H', 11800000, 5),
('MS1030', 'MSI', 'SUMMIT E13', 'Iris Xe, i7 1185G7', 18800000, 2),
('MS1036', 'MSI', 'KATANA GF66', 'RTX 3060, i7 11800H', 16500000, 4),
('MS1042', 'MSI', 'STEALTH 15M', 'RTX 3060, i7 11375H', 17500000, 2),
('MS1048', 'MSI', 'CYBORG 15', 'RTX 4060, i7 12650H', 20500000, 2),
('MS1054', 'MSI', 'VECTOR GP68HX', 'RTX 4080, i9 13980HX', 38500000, 1),
('MS1060', 'MSI', 'MODERN 15', 'Vega 7, Ryzen 5 7520U', 8150000, 5),
('MSI1234', 'MSI', 'GF63 Thin', 'RTX 3050, i5 11400H', 14500000, 6),
('MSI4567', 'MSI', 'Stealth 17', 'RTX 4070, i9 13900H', 37000000, 1),
('MSI6677', 'MSI', 'Katana GF66', 'RTX 3060, i5 12500H', 17000000, 4),
('MSI7771', 'MSI', 'Bravo 15', 'RX 5500M, Ryzen 7 4800H', 12000000, 3),
('MSI9922', 'MSI', 'Modern 14', 'Intel Iris Xe, i5 1240P', 9500000, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `laptop`
--
ALTER TABLE `laptop`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
