/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : his

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2020-07-07 10:07:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for constantitem
-- ----------------------------
DROP TABLE IF EXISTS `constantitem`;
CREATE TABLE `constantitem` (
  `constrantitemid` int(11) NOT NULL AUTO_INCREMENT,
  `constantTypeID` int(11) DEFAULT NULL,
  `ConstantCode` varchar(20) DEFAULT NULL,
  `ConstantName` varchar(20) DEFAULT NULL,
  `delMark` int(11) DEFAULT '1',
  PRIMARY KEY (`constrantitemid`),
  KEY `fk_constantiem_constanttype_id` (`constantTypeID`),
  CONSTRAINT `fk_constantiem_constanttype_id` FOREIGN KEY (`constantTypeID`) REFERENCES `constanttype` (`constanttypeid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of constantitem
-- ----------------------------
INSERT INTO `constantitem` VALUES ('1', '1', 'EK', '儿科', null);
INSERT INTO `constantitem` VALUES ('2', '1', 'GK', '骨科', '1');
INSERT INTO `constantitem` VALUES ('3', '1', 'NK', '内科', '1');
INSERT INTO `constantitem` VALUES ('4', '1', 'WK', '外科', '1');
INSERT INTO `constantitem` VALUES ('5', '3', 'ZRYS', '主任医师', '1');
INSERT INTO `constantitem` VALUES ('6', '3', 'FZRYS', '副主任医师', '1');
INSERT INTO `constantitem` VALUES ('7', '3', 'ZZYS', '主治医师', '1');
INSERT INTO `constantitem` VALUES ('8', '3', 'ZYYS', '住院医师', '1');
INSERT INTO `constantitem` VALUES ('9', '2', 'NAN', '男', '1');
INSERT INTO `constantitem` VALUES ('10', '4', 'ZJ', '专家号', '1');
INSERT INTO `constantitem` VALUES ('11', '4', 'PT', '普通号', '1');
INSERT INTO `constantitem` VALUES ('12', '6', 'GHSFY', '挂号收费员', '1');
INSERT INTO `constantitem` VALUES ('13', '6', 'MZYS', '门诊医生', '1');
INSERT INTO `constantitem` VALUES ('14', '6', 'YYGLY', '医院管理员', '1');
INSERT INTO `constantitem` VALUES ('15', '7', 'LCKS', '临床科室', '1');
INSERT INTO `constantitem` VALUES ('16', '7', 'YJKS', '医技科室', '1');
INSERT INTO `constantitem` VALUES ('17', '7', 'CWKS', '财务科室', '1');
INSERT INTO `constantitem` VALUES ('18', '7', 'XZKS', '行政科室', '1');

-- ----------------------------
-- Table structure for constanttype
-- ----------------------------
DROP TABLE IF EXISTS `constanttype`;
CREATE TABLE `constanttype` (
  `constanttypeid` int(11) NOT NULL AUTO_INCREMENT,
  `constantTypeCode` varchar(20) DEFAULT NULL,
  `constantTypeName` varchar(50) DEFAULT NULL,
  `delMark` int(11) DEFAULT '1',
  PRIMARY KEY (`constanttypeid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of constanttype
-- ----------------------------
INSERT INTO `constanttype` VALUES ('1', 'KSFL', '科室分类', '1');
INSERT INTO `constanttype` VALUES ('2', 'SEX', '性别', '0');
INSERT INTO `constanttype` VALUES ('3', 'YSZC', '医生职称', '1');
INSERT INTO `constanttype` VALUES ('4', 'GHJB', '挂号级别', '1');
INSERT INTO `constanttype` VALUES ('6', 'YHLX', '用户类型', '1');
INSERT INTO `constanttype` VALUES ('7', 'KSZN', '科室职能', '1');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `departmentid` int(11) NOT NULL AUTO_INCREMENT,
  `deptCode` varchar(20) DEFAULT NULL,
  `deptName` varchar(20) DEFAULT NULL,
  `DeptCategoryID` int(11) DEFAULT NULL,
  `deptType` int(11) DEFAULT NULL,
  `delMark` int(11) DEFAULT NULL,
  PRIMARY KEY (`departmentid`),
  KEY `fk_department_constantitem_deptcategoryid` (`DeptCategoryID`),
  CONSTRAINT `fk_department_constantitem_deptcategoryid` FOREIGN KEY (`DeptCategoryID`) REFERENCES `constantitem` (`constrantitemid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'nwk', '脑外科', '4', '15', '1');
INSERT INTO `department` VALUES ('2', 'xxgnk', '心血管内科', '3', '15', '1');
INSERT INTO `department` VALUES ('3', 'sjnk', '神经内科', '3', '15', '1');
INSERT INTO `department` VALUES ('4', 'ptnk', '普通内科', '3', '15', '1');
INSERT INTO `department` VALUES ('5', 'xhnk', '消化内科', '3', '15', '1');
INSERT INTO `department` VALUES ('6', 'hxnk', '呼吸内科', '3', '15', '1');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menuid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) DEFAULT NULL,
  `icon` varchar(50) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `delmark` int(11) DEFAULT NULL,
  PRIMARY KEY (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '门诊病历首页', 'glyphicon glyphicon-book', '/mz/list', '0');
INSERT INTO `menu` VALUES ('2', '用户管理', 'glyphicon glyphicon-user', '/user/list', '0');

-- ----------------------------
-- Table structure for registlevel
-- ----------------------------
DROP TABLE IF EXISTS `registlevel`;
CREATE TABLE `registlevel` (
  `registlevelid` int(11) NOT NULL AUTO_INCREMENT,
  `RegistCode` varchar(20) DEFAULT NULL,
  `RegistName` varchar(20) DEFAULT NULL,
  `SequenceNo` int(11) DEFAULT NULL,
  `RegistFee` double(8,2) DEFAULT NULL,
  `RegistQuota` int(11) DEFAULT NULL,
  `delMark` int(11) DEFAULT '1',
  PRIMARY KEY (`registlevelid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registlevel
-- ----------------------------
INSERT INTO `registlevel` VALUES ('1', 'WKZJH', '外科专家号', '1', '60.00', '20', '1');

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `rmid` int(11) NOT NULL AUTO_INCREMENT,
  `roleid` int(11) DEFAULT NULL,
  `menuid` int(11) DEFAULT NULL,
  `delmark` int(11) DEFAULT NULL,
  PRIMARY KEY (`rmid`),
  KEY `FK_Reference_8` (`roleid`),
  KEY `FK_Reference_9` (`menuid`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`roleid`) REFERENCES `trole` (`roleid`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`menuid`) REFERENCES `menu` (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '1', '2', '0');
INSERT INTO `role_menu` VALUES ('2', '3', '1', '0');

-- ----------------------------
-- Table structure for trole
-- ----------------------------
DROP TABLE IF EXISTS `trole`;
CREATE TABLE `trole` (
  `roleid` int(11) NOT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `delmark` int(11) DEFAULT '0',
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of trole
-- ----------------------------
INSERT INTO `trole` VALUES ('1', '医院管理员', '0');
INSERT INTO `trole` VALUES ('2', '挂号收费员', '0');
INSERT INTO `trole` VALUES ('3', '门诊医生', '0');
INSERT INTO `trole` VALUES ('4', '医技医生', '0');
INSERT INTO `trole` VALUES ('5', '药房操作员', '0');
INSERT INTO `trole` VALUES ('6', '财务管理员', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `userType` int(11) DEFAULT NULL,
  `docTitleId` int(11) DEFAULT NULL COMMENT '医生职称 ,关联constantitem的id',
  `IsScheduling` int(11) DEFAULT NULL COMMENT '是否排版',
  `departmentid` int(11) DEFAULT NULL COMMENT '关联科室id',
  `registLevelid` int(11) DEFAULT NULL COMMENT '关联挂号级别id',
  `delMark` int(11) DEFAULT '1',
  PRIMARY KEY (`userid`),
  KEY `fk_user_departement_departmentid` (`departmentid`),
  KEY `fk_user_constantitem_doctitleid` (`docTitleId`),
  KEY `fk_user_registlevel_registlevelid` (`registLevelid`),
  CONSTRAINT `fk_user_constantitem_doctitleid` FOREIGN KEY (`docTitleId`) REFERENCES `constantitem` (`constrantitemid`),
  CONSTRAINT `fk_user_departement_departmentid` FOREIGN KEY (`departmentid`) REFERENCES `department` (`departmentid`),
  CONSTRAINT `fk_user_registlevel_registlevelid` FOREIGN KEY (`registLevelid`) REFERENCES `registlevel` (`registlevelid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'bianque', '111', '张医生', '13', '5', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userroleid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  `delmark` int(11) DEFAULT NULL,
  PRIMARY KEY (`userroleid`),
  KEY `FK_Reference_6` (`userid`),
  KEY `FK_Reference_7` (`roleid`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`roleid`) REFERENCES `trole` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '3', '0');
