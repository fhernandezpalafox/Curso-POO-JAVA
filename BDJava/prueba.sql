/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : prueba

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2013-05-08 12:47:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tblprueba`
-- ----------------------------
DROP TABLE IF EXISTS `tblprueba`;
CREATE TABLE `tblprueba` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tblprueba
-- ----------------------------
INSERT INTO `tblprueba` VALUES ('1', 'sueños día');
INSERT INTO `tblprueba` VALUES ('2', 'sueños de noche');
INSERT INTO `tblprueba` VALUES ('4', 'Felipe Hernandez');
INSERT INTO `tblprueba` VALUES ('6', 'Felipe Hernandez');
