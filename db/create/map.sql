/*
Navicat MySQL Data Transfer

Source Server         : 106.12.27.130
Source Server Version : 50725
Source Host           : 106.12.27.130:3306
Source Database       : map

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-06-09 19:47:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for map
-- ----------------------------
DROP TABLE IF EXISTS `map`;
CREATE TABLE `map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `resource_id` bigint(20) NOT NULL COMMENT '封面id',
  `theme_id` bigint(20) NOT NULL COMMENT '地图主题id',
  `name` varchar(50) NOT NULL COMMENT '地图名称',
  `brief` varchar(300) NOT NULL COMMENT '地图简介',
  `time_used` tinyint(4) NOT NULL DEFAULT '0' COMMENT '积分有效期(0：未启用，1：启用),默认0',
  `start_time` datetime DEFAULT NULL COMMENT '积分有效期开始',
  `end_time` datetime DEFAULT NULL COMMENT '有效期终',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否发布(0：不发布，1：发布)，默认0',
  `follow_order` tinyint(4) NOT NULL DEFAULT '1' COMMENT '阶段是否按顺序(0：否，1：是)，默认1',
  `create_id` bigint(20) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `update_time` datetime NOT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`),
  KEY `institute_id_index` (`institute_id`),
  KEY `resource_id_index` (`resource_id`),
  KEY `theme_id_index` (`theme_id`),
  KEY `name_index` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='地图表';

-- ----------------------------
-- Records of map
-- ----------------------------

-- ----------------------------
-- Table structure for map_course
-- ----------------------------
DROP TABLE IF EXISTS `map_course`;
CREATE TABLE `map_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `map_id` bigint(20) NOT NULL COMMENT '地图id',
  `stage_id` bigint(20) NOT NULL COMMENT '阶段id',
  `type` tinyint(4) NOT NULL COMMENT '线上微课/考试测评',
  `target_id` bigint(20) NOT NULL COMMENT '目标主键id',
  `target_origin_id` bigint(20) NOT NULL COMMENT '目标复制主键id',
  `target_name` varchar(50) NOT NULL COMMENT '目标名称',
  `target_course_id` bigint(20) NOT NULL COMMENT '目标主键对应的course_id',
  `target_front_cover` varchar(255) DEFAULT NULL COMMENT '目标缩略图',
  `target_duration` int(10) DEFAULT NULL COMMENT '目标课程时长',
  `score_used` tinyint(4) DEFAULT NULL COMMENT '学分/积分奖励',
  `score` int(10) DEFAULT NULL COMMENT '学分/积分',
  `order_index` tinyint(4) NOT NULL COMMENT '顺序',
  `time_cost` int(10) DEFAULT NULL COMMENT '考试时长,-1为不限时长',
  `pass_point` int(10) DEFAULT NULL COMMENT '通关分数,默认0分',
  `exame_times` int(10) DEFAULT NULL COMMENT '重考次数,-1为不限次数',
  `user_id` bigint(20) NOT NULL COMMENT '创建者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `institute_id_index` (`institute_id`),
  KEY `map_id_index` (`map_id`),
  KEY `stage_id_index` (`stage_id`),
  KEY `target_id_index` (`target_id`),
  KEY `target_origin_id_index` (`target_origin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程表';

-- ----------------------------
-- Records of map_course
-- ----------------------------

-- ----------------------------
-- Table structure for map_log
-- ----------------------------
DROP TABLE IF EXISTS `map_log`;
CREATE TABLE `map_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `map_id` bigint(20) NOT NULL COMMENT '地图id',
  `stage_id` bigint(20) NOT NULL COMMENT '阶段id',
  `course_id` bigint(20) NOT NULL COMMENT '课程id',
  `start_time` datetime NOT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `learn_time` int(10) DEFAULT '0' COMMENT '学习时长',
  `reward_score` int(10) DEFAULT NULL COMMENT '本次获得学分',
  `is_success` tinyint(4) DEFAULT NULL COMMENT '考试是否完成。0：已完成；1：未完成；2：未通过',
  `process` varchar(50) DEFAULT '0' COMMENT '课程学习进度',
  `exam_point` int(10) DEFAULT '0' COMMENT '考试成绩',
  PRIMARY KEY (`id`),
  KEY `institute_id_index` (`institute_id`),
  KEY `map_id_index` (`map_id`),
  KEY `stage_id_index` (`stage_id`),
  KEY `course_id_index` (`course_id`),
  KEY `user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学习记录表';

-- ----------------------------
-- Records of map_log
-- ----------------------------

-- ----------------------------
-- Table structure for map_stage
-- ----------------------------
DROP TABLE IF EXISTS `map_stage`;
CREATE TABLE `map_stage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `map_id` bigint(20) NOT NULL COMMENT '地图表id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `follow_order` tinyint(4) NOT NULL COMMENT '课程是否按顺序',
  `order_index` tinyint(4) NOT NULL COMMENT '顺序',
  `create_id` bigint(20) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `institute_id_index` (`institute_id`),
  KEY `map_id_index` (`map_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='阶段表';

-- ----------------------------
-- Records of map_stage
-- ----------------------------

-- ----------------------------
-- Table structure for map_student
-- ----------------------------
DROP TABLE IF EXISTS `map_student`;
CREATE TABLE `map_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `map_id` bigint(20) NOT NULL COMMENT '地图id',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `user_id` bigint(20) NOT NULL COMMENT '人员id',
  `pass_sum_lesson` tinyint(4) NOT NULL DEFAULT '0' COMMENT '微课累计闯关数',
  `pass_sum_example` tinyint(4) NOT NULL DEFAULT '0' COMMENT '考试累计闯关数',
  `learn_sum` int(10) NOT NULL DEFAULT '0' COMMENT '学习时长',
  `point_sum` int(10) NOT NULL DEFAULT '0' COMMENT '获得学分/积分',
  `latest_course` varchar(50) DEFAULT NULL COMMENT '最新节点',
  `process` varchar(50) DEFAULT '0' COMMENT '进度',
  `create_id` bigint(20) NOT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `graduation` tinyint(4) DEFAULT '0' COMMENT '是否颁发过毕业证。0：未颁发；1：已颁发',
  PRIMARY KEY (`id`),
  UNIQUE KEY `map_id_institute_id_user_id_index` (`map_id`,`institute_id`,`user_id`),
  KEY `map_id_index` (`map_id`),
  KEY `institute_id_index` (`institute_id`),
  KEY `user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学员表';

-- ----------------------------
-- Records of map_student
-- ----------------------------

-- ----------------------------
-- Table structure for map_theme
-- ----------------------------
DROP TABLE IF EXISTS `map_theme`;
CREATE TABLE `map_theme` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `resource_id` bigint(20) NOT NULL COMMENT '资源表主键',
  PRIMARY KEY (`id`),
  KEY `resource_id_index` (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='地图主题表';

-- ----------------------------
-- Records of map_theme
-- ----------------------------
INSERT INTO `map_theme` VALUES ('1', '夜斩白', '1');
INSERT INTO `map_theme` VALUES ('2', '谁家安泽', '2');
INSERT INTO `map_theme` VALUES ('3', '静静', '3');
INSERT INTO `map_theme` VALUES ('4', '陌陌', '4');

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for pick_student
-- ----------------------------
DROP TABLE IF EXISTS `pick_student`;
CREATE TABLE `pick_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(40) NOT NULL COMMENT '名称',
  `select_id` bigint(20) NOT NULL COMMENT 'staffId或者部门id或者企业id',
  `type` tinyint(4) NOT NULL COMMENT '类型（1为staffId，2部门id,3企业id）',
  `user_id` bigint(20) NOT NULL COMMENT '人员id(当type为1的时候，会存入这个userId)',
  `map_id` bigint(20) NOT NULL COMMENT '地图id',
  `institute_id` bigint(20) NOT NULL COMMENT '企业id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `map_id_index` (`map_id`),
  KEY `institute_id_index` (`institute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='选择学员记录表';

-- ----------------------------
-- Records of pick_student
-- ----------------------------

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `file_name` varchar(255) DEFAULT NULL COMMENT '文件名称',
  `file_size` bigint(20) DEFAULT NULL COMMENT '文件大小，单位(Byte)',
  `url` varchar(255) NOT NULL COMMENT '资源地址',
  `file_type` tinyint(4) NOT NULL COMMENT '资源类型,，1表示图片，2表示文档，3表示压缩文件，4表示音频，5表示视频',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '存储状态, 0正常, 1删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资源存储表';

-- ----------------------------
-- Records of resource
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
