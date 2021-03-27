--  创建城市信息表
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '城市名称',
  `tenant_id` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '租户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 插入城市信息
INSERT INTO `city` ( `name`, `tenant_id`) VALUES ( '潮州', '1');
INSERT INTO `city` ( `name`, `tenant_id`) VALUES ( '汕头', '2');
INSERT INTO `city` ( `name`, `tenant_id`) VALUES ( '揭阳', '3');
