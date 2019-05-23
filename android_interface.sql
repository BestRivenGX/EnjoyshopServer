/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost
 Source Database       : android_interface

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : utf-8

 Date: 05/23/2019 21:24:50 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `consignee` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `zip_code` varchar(255) DEFAULT NULL,
  `is_default` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `address`
-- ----------------------------
BEGIN;
INSERT INTO `address` VALUES ('1', '1', '张三', '13512341234', '广东省深圳市福田区福华路1234号', '123456', '0'), ('2', '1', '张三', '13512341234', 'XXXXXXXXX', '111111', '0'), ('3', '1', '张三', '13512341234', 'XXXXXXXXX', '111111', '0');
COMMIT;

-- ----------------------------
--  Table structure for `campaign`
-- ----------------------------
DROP TABLE IF EXISTS `campaign`;
CREATE TABLE `campaign` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `campaign`
-- ----------------------------
BEGIN;
INSERT INTO `campaign` VALUES ('1', '六一活动');
COMMIT;

-- ----------------------------
--  Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `category`
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES ('1', '电子产品');
COMMIT;

-- ----------------------------
--  Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `sale` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `campaign_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `item`
-- ----------------------------
BEGIN;
INSERT INTO `item` VALUES ('1', '希捷(seagate)Expansion 新睿翼 1TB 2.5 英寸 USB3.0 移动硬盘 (STEA1000400)', 'https://img.cniao5.com/s_recommend_5519fdd0N02706f5e.jpg', '399', '0', '1', '1', '1'), ('2', '联想(ThinkCentre)E73S(10EN001ACD) 小机箱台式电脑 (I3-4160T 4GB 500GB 核显 Win7)23.8 英寸显示器', 'https://img.cniao5.com/s_recommend_55558580Nbb8545f3.jpg', '399', '0', '1', '1', '1'), ('3', '新观 LED 随身灯充电宝 LED 灯 LED 护眼灯 阅读灯 下单备注颜色 无备注颜色随机发', 'https://img.cniao5.com/s_recommend_5563e1d4Ncc22964e.jpg', '1652', '0', '1', '1', '1');
COMMIT;

-- ----------------------------
--  Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `item_json` varchar(255) DEFAULT NULL,
  `addr_id` int(11) DEFAULT NULL,
  `pay_channel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mobi` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `logo_url` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobi` (`mobi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '13512341234', null, '新用户13512341234', '123456', 'http://pruvywgjy.bkt.clouddn.com/1.jpeg', '0adca3220b1b907805ccd70d110bf38a'), ('2', null, null, '新用户13512341231', '123456', 'http://pruvywgjy.bkt.clouddn.com/1.jpeg', '645d7086926719765ee2e5dc29faefeb'), ('3', '13512341231', null, '新用户13512341231', '123456', 'http://pruvywgjy.bkt.clouddn.com/1.jpeg', '645d7086926719765ee2e5dc29faefeb');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
