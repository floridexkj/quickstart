/*
Navicat MySQL Data Transfer

Source Server         : 192.168.6.164
Source Server Version : 50626
Source Host           : 192.168.6.164:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2016-05-18 14:49:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
