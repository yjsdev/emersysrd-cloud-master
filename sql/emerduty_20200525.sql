-- ----------------------------
-- 1、通讯录分组表
-- ----------------------------
drop table if exists contacts_groups;
create table contacts_groups
(
  group_id    bigint(19) not null auto_increment comment '分组id',
  group_name  varchar(30) default '' comment '分组名称',
  group_type  varchar(30) default 'custom_type' comment '分组类别',
  order_num   int(10)     default 0 comment '显示顺序',
  revision    int         default 0 comment '乐观锁',
  status      char(1)     default 0 comment '分组状态 （0正常 1停用）',
  del_flag    char(1)     default 0 comment '删除标志 （0代表存在 2代表删除）',
  create_by   varchar(64) default '' comment '创建者',
  create_time datetime    default current_timestamp comment '创建时间',
  update_by   varchar(64) default '' comment '更新者',
  update_time datetime comment '更新时间',
  primary key (group_id)
) engine = innodb
  auto_increment = 100 comment = '通讯录分组表';
-- ----------------------------
-- 初始化-通讯录分组表数据
-- ----------------------------

insert into contacts_groups (group_id, group_name, group_type, order_num, revision, status, del_flag, create_by, create_time, update_by, update_time)
values (1, '政务通讯录', 'zw_type', 0, 0, '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups (group_id, group_name, group_type, order_num, revision, status, del_flag, create_by, create_time, update_by, update_time)
values (2, '应急通讯录', 'yj_type', 1, 0, '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups (group_id, group_name, group_type, order_num, revision, status, del_flag, create_by, create_time, update_by, update_time)
values (3, '基层通讯录', 'jc_type', 2, 0, '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups (group_id, group_name, group_type, order_num, revision, status, del_flag, create_by, create_time, update_by, update_time)
values (4, '常用联络人', 'cyr_type', 3, 0, '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups (group_id, group_name, group_type, order_num, revision, status, del_flag, create_by, create_time, update_by, update_time)
values (5, '最近联络人', 'zjr_type', 4, 0, '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
-- ----------------------------
-- 2、通讯录成员表
-- ----------------------------
drop table if exists contacts_group_members;
create table contacts_group_members
(
  member_id     bigint(19)  not null auto_increment comment '成员id',
  member_name   varchar(30) not null comment '成员名称',
  dept_id       varchar(32) not null comment '部门id',
  dept_name     varchar(30)  default '' comment '部门名称',
  post_id       bigint(19) comment '岗位id',
  post_name     varchar(30)  default '' comment '岗位名称',
  group_id      bigint(19)  not null comment '通讯录组id',
  status        char(1)      default 0 comment '成员状态 （0正常 1停用）',
  del_flag      char(1)      default 0 comment '删除标志 （0代表存在 2代表删除）',
  lastcall_by   varchar(64)  default '' comment '最后联系人',
  lastcall_date datetime comment '最后联系时间',
  revision      int          default 0 comment '乐观锁',
  create_by     varchar(64)  default '' comment '创建者',
  create_time   datetime     default current_timestamp comment '创建时间',
  update_by     varchar(64)  default '' comment '更新者',
  update_time   datetime comment '更新时间',
  remark        varchar(500) default '' comment '备注',
  primary key (member_id)
) engine = innodb
  auto_increment = 1 comment = '通讯录成员表';
-- ----------------------------
-- 初始化-通讯录成员表数据
-- ----------------------------
insert into contacts_group_members (`member_id`, `member_name`, `dept_id`, `dept_name`, `post_id`, `post_name`,
       `group_id`, `status`, `del_flag`, `lastcall_by`, `lastcall_date`, `revision`, `create_by`, `create_time`, `update_by`, `update_time`,`remark`)
values (1, '张三', '1', '政府', '1', '值班员', 1, '0', '0', '', null, 0, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_group_members (`member_id`, `member_name`, `dept_id`, `dept_name`, `post_id`, `post_name`,
        `group_id`, `status`, `del_flag`, `lastcall_by`, `lastcall_date`, `revision`, `create_by`, `create_time`, `update_by`, `update_time`,`remark`)
values (2, '李四', '1', '政府', '1', '值班长', 2, '0', '0', '', null, 0, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_group_members (`member_id`, `member_name`, `dept_id`, `dept_name`, `post_id`, `post_name`,
        `group_id`, `status`, `del_flag`, `lastcall_by`, `lastcall_date`, `revision`, `create_by`, `create_time`, `update_by`, `update_time`,`remark`)
values (3, '王五', '1', '政府', '1', '值班员', 3, '0', '0', '', null, 0, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_group_members (`member_id`, `member_name`, `dept_id`, `dept_name`, `post_id`, `post_name`,
        `group_id`, `status`, `del_flag`, `lastcall_by`, `lastcall_date`, `revision`, `create_by`, `create_time`, `update_by`, `update_time`,`remark`)
values (4, '赵六', '1', '政府', '1', '值班员', 4, '0', '0', '', null, 0, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_group_members (`member_id`, `member_name`, `dept_id`, `dept_name`, `post_id`, `post_name`,
        `group_id`, `status`, `del_flag`, `lastcall_by`, `lastcall_date`, `revision`, `create_by`, `create_time`, `update_by`, `update_time`,`remark`)
values (5, '陈飞', '1', '政府', '1', '值班员', 5, '0', '0', '', null, 0, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
-- ----------------------------
-- 3、通讯录成员属性表
-- ----------------------------
drop table if exists contacts_member_property;
create table contacts_member_property
(
  pro_id        bigint(19)  not null auto_increment comment '属性id',
  member_id     bigint(19)  not null comment '成员id',
  name          varchar(32) not null comment '属性名',
  value         varchar(32) comment '属性值 ''',
  pro_type      varchar(32) comment '属性类型 ''',
  pro_type_name varchar(32) comment '属性类型名称 ''',
  revision      int comment '乐观锁',
  created_by    varchar(32) comment '创建人 ''',
  created_time  datetime comment '创建时间 current_timestamp',
  updated_by    varchar(32) comment '更新人 ''',
  updated_time  datetime comment '更新时间',
  primary key (pro_id)
) comment = '通讯录成员属性';
-- ----------------------------
-- 4、通讯录成员行为记录表
-- ----------------------------
drop table if exists contacts_member_behavior;
create table contacts_member_behavior
(
  id           varchar(32) not null comment '记录流水号',
  member_id    bigint(19)  not null comment '成员号',
  object_type  varchar(32)  default '' comment '关联对象类型',
  object_id    bigint(19) comment '关联对象号',
  type         varchar(32)  default '' comment '行为类型',
  value        varchar(32)  default '' comment '行为数值',
  intro        varchar(512) default '' comment '行为说明',
  revision     int comment '乐观锁',
  created_by   varchar(32)  default '' comment '创建人',
  created_time datetime     default current_timestamp comment '创建时间',
  updated_by   varchar(32)  default '' comment '更新人',
  updated_time datetime comment '更新时间',
  primary key (id)
) comment = '通讯录成员行为记录';
