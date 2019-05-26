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

 Date: 05/26/2019 16:43:07 PM
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
INSERT INTO `address` VALUES ('1', '1', '张三', '13512341234', 'XXXXXXXXX', '111111', '0'), ('2', '1', '张三', '13512341234', 'XXXXXXXXX', '111111', '1'), ('3', '1', '张三', '13512341234', 'XXXXXXXXX', '111111', '0');
COMMIT;

-- ----------------------------
--  Table structure for `advert`
-- ----------------------------
DROP TABLE IF EXISTS `advert`;
CREATE TABLE `advert` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `advert`
-- ----------------------------
BEGIN;
INSERT INTO `advert` VALUES ('1', '音箱狂欢', 'https://img.cniao5.com/5608f3b5Nc8d90151.jpg', null, '1'), ('2', '手机国庆礼', 'https://img.cniao5.com/5608eb8cN9b9a0a39.jpg', null, '1'), ('3', 'IT生活', 'https://img.cniao5.com/5608cae6Nbb1a39f9.jpg', null, '1'), ('4', '母婴萌宝', 'https://img.cniao5.com/5608b7cdN218fb48f.jpg', null, '1'), ('5', '国庆大礼包', 'https://img.cniao5.com/560b5a7eN214306c8.jpg', null, '1'), ('6', '手机大放假', 'https://img.cniao5.com/560a409eN35e252de.jpg', null, '1');
COMMIT;

-- ----------------------------
--  Table structure for `campaign`
-- ----------------------------
DROP TABLE IF EXISTS `campaign`;
CREATE TABLE `campaign` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `cp_one` text,
  `cp_two` text,
  `cp_three` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `campaign`
-- ----------------------------
BEGIN;
INSERT INTO `campaign` VALUES ('1', '生活', '{\"id\":1,\"title\":\"生活\",\"imgUrl\":\"https://img.cniao5.com/56090154N3b41c965.jpg\"}', '{\"id\":1,\"title\":\"生活\",\"imgUrl\":\"https://img.cniao5.com/56090154N3b41c965.jpg\"}', '{\"id\":1,\"title\":\"生活\",\"imgUrl\":\"https://img.cniao5.com/56090154N3b41c965.jpg\"}'), ('2', '满减', '{\"id\":2,\"title\":\"满减\",\"imgUrl\":\"https://img.cniao5.com/560908d9N3d66adeb.jpg\"}', '{\"id\":2,\"title\":\"满减\",\"imgUrl\":\"https://img.cniao5.com/560908d9N3d66adeb.jpg\"}', '{\"id\":2,\"title\":\"满减\",\"imgUrl\":\"https://img.cniao5.com/560908d9N3d66adeb.jpg\"}'), ('3', '钟表', '{\"id\":3,\"title\":\"钟表\",\"imgUrl\":\"https://img.cniao5.com/5608e342N9b9d3d51.jpg\"}', '{\"id\":3,\"title\":\"钟表\",\"imgUrl\":\"https://img.cniao5.com/5608e342N9b9d3d51.jpg\"}', '{\"id\":3,\"title\":\"钟表\",\"imgUrl\":\"https://img.cniao5.com/5608e342N9b9d3d51.jpg\"}'), ('4', '手机', '{\"id\":4,\"title\":\"手机\",\"imgUrl\":\"https://img.cniao5.com/5608e4baN5b92922e.jpg\"}', '{\"id\":4,\"title\":\"手机\",\"imgUrl\":\"https://img.cniao5.com/5608e4baN5b92922e.jpg\"}', '{\"id\":4,\"title\":\"手机\",\"imgUrl\":\"https://img.cniao5.com/5608e4baN5b92922e.jpg\"}');
COMMIT;

-- ----------------------------
--  Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `category`
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES ('1', '热门推荐', '1'), ('2', '品牌男装', '2'), ('3', '内衣配饰', '3'), ('4', '家用电器', '4'), ('5', '电脑办公', '5'), ('6', '手机数码', '6'), ('7', '母婴频道', '7'), ('8', '图书', '8'), ('9', '家居家纺', '9'), ('10', '居家生活', '10'), ('11', '个性化妆', '11'), ('12', '鞋靴箱包', '12'), ('13', '奢侈礼品', '13'), ('14', '珠宝饰品', '14');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `item`
-- ----------------------------
BEGIN;
INSERT INTO `item` VALUES ('1', '希捷(seagate)Expansion 新睿翼 1TB 2.5 英寸 USB3.0 移动硬盘 (STEA1000400)', 'https://img.cniao5.com/s_recommend_5519fdd0N02706f5e.jpg', '399', '2', '1', '5', '2'), ('2', '联想(ThinkCentre)E73S(10EN001ACD) 小机箱台式电脑 (I3-4160T 4GB 500GB 核显 Win7)23.8 英寸显示器', 'https://img.cniao5.com/s_recommend_55558580Nbb8545f3.jpg', '299', '10', '1', '5', '2'), ('3', '新观 LED 随身灯充电宝 LED 灯 LED 护眼灯 阅读灯 下单备注颜色 无备注颜色随机发', 'https://img.cniao5.com/s_recommend_5563e1d4Ncc22964e.jpg', '652', '111', '1', '4', '2'), ('4', '新观 LED 随身灯充电宝 LED 灯 LED 护眼灯 阅读灯 下单备注颜色 无备注颜色随机发,xxxx', 'http://pruvywgjy.bkt.clouddn.com/FgqtuW2YknMJzn7c72QwjQf1D_ZP', '1652', '1', '1', '4', '2'), ('5', '新观 LED 随身灯充电宝 LED 灯 LED 护眼灯 阅读灯 下单备注颜色 无备注颜色随机发,xxxx', null, '152', '25', '1', '4', '2'), ('6', '新观 LED 随身灯充电宝 LED 灯 LED 护眼灯 阅读灯 下单备注颜色 无备注颜色随机发,xxxx', 'http://pruvywgjy.bkt.clouddn.com/FgqtuW2YknMJzn7c72QwjQf1D_ZP', '162', '200', '1', '4', '2');
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
