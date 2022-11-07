/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.26 : Database - zjut-training
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zjut-training` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `zjut-training`;

/*Table structure for table `testuser` */

DROP TABLE IF EXISTS `testuser`;

CREATE TABLE `testuser` (
        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
        `username` varchar(48) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
        `password` varchar(16) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
        `birthday` datetime DEFAULT NULL COMMENT '生日',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `testuser` */

insert  into `testuser`(`id`,`username`,`password`,`birthday`) values
    (1,'zhangsan','123','2000-11-06 21:07:25');




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
