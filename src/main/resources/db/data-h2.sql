-- DELETE FROM user;
-- DELETE FROM role;
--
-- INSERT INTO role (id, role_name, role_describe)
-- VALUES (1, '管理员', 'boos 级别'),
--        (2, '用户', '就是个普通人'),
--        (3, '程序猿', '偶尔需要用来祭天');
--
-- INSERT INTO user (id, name, age, email, role_id,tenant_id)
-- VALUES (1, 'Jone', 18, 'test1@baomidou.com', 1,'1'),
--        (2, 'Jack', 20, 'test2@baomidou.com', 2,'1'),
--        (3, 'Tom', 28, 'test3@baomidou.com', 2,'1'),
--        (4, 'Sandy', 21, 'test4@baomidou.com', 3,'1'),
--        (5, 'Billie', 24, 'test5@baomidou.com', 3,'1');
DELETE FROM city;
 INSERT INTO city (id, name, tenant_id)
VALUES (1, '潮州', '1'),
       (2, '汕头', '1'),
       (3, '揭阳', '1');
-- --
-- -- 初始化样例数据
-- INSERT INTO department (id, parent_id, org_id, name)
-- VALUES (10001, 0, 100001, '产品部'), (10002, 10001, 100001, '研发组'), (10003, 10001, 100001, '测试组');
--
-- -- dictionary数据字典表将由devtools自动生成
-- -- 插入数据字典样例数据
-- INSERT INTO dictionary (id, parent_id, type, item_name, item_value, description, extdata, sort_id, `is_deletable`, is_editable)
-- VALUES (1, 0, 'GENDER', '性别', null, '', null, 99, 0, 1), (2, 1, 'GENDER', '男', 'M', null, null, 99, 0, 1), (3, 1, 'GENDER', '女', 'F', null, null, 99, 0, 1);
--
-- INSERT INTO organization (id, parent_id, name, telphone) VALUES (100001, 0, '帝博信息', '0512-62988949');
--
-- INSERT INTO role (id, name, code) VALUES (101, '管理员', 'ADMIN'), (102, '操作员', 'OPERATOR');
--
-- INSERT INTO user (id, department_id, username, gender)
-- VALUES (1001, 10002, '张三', 'M'), (1002, 10002, '李四', 'F');
--
-- INSERT INTO user_role (user_id, role_id) VALUES (1001, 101),(1001, 102),(1002, 102);