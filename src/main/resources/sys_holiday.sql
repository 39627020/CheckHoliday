/*
 Navicat Premium Data Transfer

 Source Server         : 人力积分系统-prod
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : 175.153.165.77:31937
 Source Schema         : db_score

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 13/01/2023 14:11:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_holiday
-- ----------------------------
DROP TABLE IF EXISTS `sys_holiday`;
CREATE TABLE `sys_holiday` (
  `fd_id` int(11) NOT NULL AUTO_INCREMENT,
  `fd_day` date DEFAULT NULL COMMENT '日期',
  `fd_name` varchar(64) DEFAULT NULL COMMENT '节假日类型中文名，可能值为 周一 至 周日、假期的名字、某某调休',
  `fd_type` tinyint(4) NOT NULL COMMENT '工作日、周末、节日、调休',
  `fd_week` tinyint(4) DEFAULT NULL COMMENT '一周中的第几天。值为 1 - 7，分别表示 周一 至 周日',
  `fd_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除 0否 1是',
  `fd_create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fd_update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `fd_reserved1` varchar(255) DEFAULT NULL COMMENT '保留字段1',
  `fd_reserved2` varchar(255) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`fd_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2194 DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
