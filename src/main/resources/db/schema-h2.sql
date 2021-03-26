-- noinspection SqlNoDataSourceInspectionForFile

-- DROP TABLE IF EXISTS user;
-- DROP TABLE IF EXISTS role;
--
-- CREATE TABLE user
-- (
--   id      BIGINT (20) NOT NULL COMMENT '主键ID',
--   name    VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
--   age     INT (11) NULL DEFAULT NULL COMMENT '年龄',
--   email   VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
--   role_id BIGINT (20) NOT NULL COMMENT '角色ID',
--   tenant_id  VARCHAR(50) NULL DEFAULT NULL COMMENT '租户id',
--   PRIMARY KEY (id)
-- );
--
-- CREATE TABLE role
-- (
--   id            BIGINT (20) NOT NULL COMMENT '主键ID',
--   role_name     VARCHAR(30) NULL DEFAULT NULL COMMENT '角色名',
--   role_describe VARCHAR(30) NULL DEFAULT NULL COMMENT '角色描述',
--   PRIMARY KEY (id)
-- );
DROP TABLE IF EXISTS city;
CREATE TABLE city
(
  id            BIGINT (20) NOT NULL COMMENT '主键ID',
  name     VARCHAR(30) NULL DEFAULT NULL COMMENT '名称',
  tenant_id VARCHAR(30) NULL DEFAULT NULL COMMENT '租户id',
  PRIMARY KEY (id)
);

-- -- DROP TABLE IF EXISTS user;
-- -- DROP TABLE IF EXISTS role;
-- -- 初始化表
-- create table department
-- (
--   id INT(11) primary key,
--   parent_id INT(11) default 0 not null comment '上级部门ID',
--   org_id INT(11) not null comment '单位ID',
--   name varchar(50) not null comment '名称',
--   extdata varchar(100) null comment '扩展字段',
--   is_deleted tinyint(1) default 0 not null comment '已删除',
--   create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间'
-- )
--   comment '部门';
--
-- create table organization
-- (
--   id int auto_increment comment 'ID'
--     primary key,
--   parent_id int default 0 not null comment '上级单位ID',
--   name varchar(100) not null comment '名称',
--   telphone varchar(20) null comment '电话',
--   is_deleted tinyint(1) default 0 not null comment '是否有效',
--   create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间'
-- )
--   comment '单位';
--
-- create table role
-- (
--   id int auto_increment comment 'ID'
--     primary key,
--   name varchar(20) null,
--   code varchar(20) null,
--   is_deleted tinyint(1) default 0 null,
--   create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间'
-- ) comment '角色';
--
-- create table user
-- (
--   id int auto_increment comment 'ID'
--     primary key,
--   department_id int default 0 not null,
--   username varchar(20) null,
--   gender varchar(20) null,
--   is_deleted tinyint(1) default 0 null,
--   create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间'
-- ) comment '用户';
--
-- create table user_role
-- (
--   user_id int not null comment '用户ID',
--   role_id int not null comment '角色ID',
--   primary key (user_id, role_id)
-- ) comment '用户角色关系';
-- CREATE TABLE `city` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
--   `tenant_id` varchar(50) COLLATE utf8_bin DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
--
-- INSERT INTO `city` (`id`, `name`, `tenant_id`) VALUES ('1', '潮州', '1');
-- INSERT INTO `city` (`id`, `name`, `tenant_id`) VALUES ('2', '汕头', '2');
-- INSERT INTO `city` (`id`, `name`, `tenant_id`) VALUES ('3', '揭阳', '3');
