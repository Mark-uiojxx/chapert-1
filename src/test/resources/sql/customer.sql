/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-06-28 14:27:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '朴赞郁', 'Jack', '12345678901', 'piaozanyu@mee.com', '《老男孩》');
INSERT INTO `customer` VALUES ('2', '奉俊昊', 'Mark', '22345678901', 'fengjunhao@mee.com', '《杀人回忆》');
