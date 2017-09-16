/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : webapp

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-16 17:35:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_loginfo
-- ----------------------------
DROP TABLE IF EXISTS `t_loginfo`;
CREATE TABLE `t_loginfo` (
  `logTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `id` int(11) NOT NULL,
  `isSuccess` int(11) NOT NULL,
  KEY `id` (`id`),
  CONSTRAINT `t_loginfo_ibfk_1` FOREIGN KEY (`id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginfo
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `isAdmin` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'root', '123456', '1');
SET FOREIGN_KEY_CHECKS=1;
