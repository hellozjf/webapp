/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : webapp

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-21 22:56:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('101', 'hellozjf');

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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'root', '123456', '1');
INSERT INTO `t_user` VALUES ('2', 'zjf', '123456', '0');
INSERT INTO `t_user` VALUES ('11', 'zjf', '123456', '0');
INSERT INTO `t_user` VALUES ('21', 'hellozjf', '654321', '1');

-- ----------------------------
-- Table structure for t_user_id
-- ----------------------------
DROP TABLE IF EXISTS `t_user_id`;
CREATE TABLE `t_user_id` (
  `sequence_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_id
-- ----------------------------
INSERT INTO `t_user_id` VALUES ('30');
SET FOREIGN_KEY_CHECKS=1;
