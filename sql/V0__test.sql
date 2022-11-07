create table testuser
(
    id       bigint auto_increment comment '主键' primary key,
    username varchar(48) null comment '用户名',
    password varchar(16) null comment '密码',
    birthday datetime    null comment '生日'
);
