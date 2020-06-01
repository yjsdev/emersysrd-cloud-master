/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         :

	emersysrd_db      智慧应急数据库
	emersysrd_config	 系统配置数据库

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 20/05/2019 17:51:35
*/

/******************************************/
/* 数据库 = emersysrd_db  */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_db`;

CREATE DATABASE  `emersysrd_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/******************************************/
/* 系统配置数据库 = emersysrd_config      */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_config`;

CREATE DATABASE  `emersysrd_config` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
