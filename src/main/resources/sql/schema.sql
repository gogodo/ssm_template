-- 创建 部门表
-- drop table t_department
-- ;
CREATE TABLE if not exists `t_department`  (
	`id`         	int  NOT NULL AUTO_INCREMENT,
	`name`       	varchar(200) NOT NULL,
	`note`       	varchar(500) NULL,
	`in_use`      	int(1) NULL DEFAULT '1',
	`create_time`	timestamp DEFAULT CURRENT_TIMESTAMP,
	`update_time`	timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY(`id`)
) commit '部门表'



-- 创建 员工表
-- drop table t_employee;
create table if not exists t_employee
(
    id            int auto_increment comment '标识'
        primary key,
    `name`          varchar(50)   not null comment '姓名',
    in_use        int default 1 not null comment '启用否',
    description   varchar(500)  null comment '描述',
    department_id int           not null comment '所属部门标志',
	`create_time`	timestamp DEFAULT CURRENT_TIMESTAMP,
	`update_time`	timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
)    comment '员工表'
