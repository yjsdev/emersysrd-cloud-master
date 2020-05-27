-- ----------------------------
-- 1、通讯录分组表
-- ----------------------------
drop table if exists contacts_groups;
create table contacts_groups (
  group_id          bigint(20)      not null auto_increment    comment '分组id',
  group_name        varchar(30)     default ''                 comment '分组名称',
  group_type        varchar(30)     default 'custom_type'      comment '分组类别',
  order_num         int(4)          default 0                  comment '显示顺序',
  version           varchar(11)     default null               comment '版本',
  status            char(1)         default '0'                comment '分组状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	     datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (group_id)
) engine=innodb auto_increment=200 comment = '通讯录分组表';
-- ----------------------------
-- 初始化-通讯录分组表数据
-- ----------------------------
insert into contacts_groups values(1,'政务通讯录','zw_type', 0, '0', '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups values(2,'应急通讯录','yj_type', 1, '0', '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups values(3,'基层通讯录','jc_type', 2, '0', '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups values(4,'常用联络人','cyr_type', 3, '0', '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');
insert into contacts_groups values(5,'最近联络人','zjr_type', 4, '0', '0', '0', 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00');

-- ----------------------------
-- 2、通讯录成员表
-- ----------------------------
drop table if exists contacts_group_members;
create table contacts_group_members (
  member_id         bigint(20)      not null auto_increment    comment '成员ID',
  dept_id           bigint(20)      default null               comment '部门ID',
  member_name       varchar(30)     not null                   comment '成员名称',
  post_name         varchar(30)     default ''                 comment '岗位名称',
  status            char(1)         default '0'                comment '帐号状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  group_id          bigint(20)      not null                   comment '通讯录组id',
  lastcall_by       varchar(64)     default ''                 comment '最后联系人',
  lastcall_date     datetime        default null               comment '最后联系时间',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	     datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (member_id)
) engine=innodb auto_increment=100 comment = '通讯录成员表';

insert into contacts_groups values(1,null,'张三', '值班员', '0', '0', 1, '', null, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_groups values(2,null,'李四', '值班长', '0', '0', 2, '', null, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_groups values(3,null,'王五', '值班员', '0', '0', 3, '', null, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_groups values(4,null,'赵六', '值班员', '0', '0', 4, '', null, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
insert into contacts_groups values(5,null,'陈飞', '值班员', '0', '0', 5, '', null, 'admin', '2018-03-16 11-33-00', 'admin', '2018-03-16 11-33-00', '');
