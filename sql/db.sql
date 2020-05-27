/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         :

	emersysrd_permission 用户管理数据库
	emersysrd_config	 系统配置数据库
	-----emersysrd_quartz	 任务调度数据库

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 20/05/2019 17:51:35
*/

/******************************************/
/* 用户管理数据库 = emersysrd_permission  */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_permission`;

CREATE DATABASE  `emersysrd_permission` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/******************************************/
/* 系统配置数据库 = emersysrd_config      */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_config`;

CREATE DATABASE  `emersysrd_config` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/******************************************/
/* 任务调度数据库 = emersysrd_quartz      */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_quartz`;

CREATE DATABASE  `emersysrd_quartz` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/******************************************/
/* 应急值守数据库 = emersysrd_emerduty      */
/******************************************/

DROP DATABASE IF EXISTS `emersysrd_emerduty`;

CREATE DATABASE  `emersysrd_emerduty` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
