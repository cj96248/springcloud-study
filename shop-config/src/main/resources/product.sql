-- 商品类目
create table product_category
(
  category_id int not null auto_increment COMMENT '主键',
  category_name varchar(64) not null COMMENT '类目名称',
  category_type int not null COMMENT '类目编号',
  create_time timestamp not null default current_timestamp COMMENT '创建时间',
  update_time timestamp default current_timestamp on update current_timestamp COMMENT '修改时间',
  primary key (category_id),
  unique key uqe_category_type (category_type)
);

-- desc product_category;
-- show create table product_category\G;

-- 数据模拟
insert into product_category
(category_name,category_type,create_time)
values
  ('热卖商品',1,'2019-01-28 16:40:22'),
  ('猜你喜欢',2,'2017-02-23 11:42:52');

-- 商品
create table product_info
(
  product_id varchar(32) not null,
  product_name varchar(64) not null COMMENT '商品名称',
  product_price decimal(8,2) not null COMMENT '商品单价',
  product_stock int not null COMMENT '商品库存',
  product_desc varchar(128) COMMENT '商品描述',
  product_icon varchar(128) COMMENT '商品小图',
  product_status tinyint(3) DEFAULT 0 COMMENT '商品状态',
  category_type int not null COMMENT '商品类目编号',
  create_time timestamp not null default current_timestamp COMMENT '创建时间',
  update_time timestamp not null default current_timestamp on update current_timestamp COMMENT '更新时间',
  primary key (product_id)
);

INSERT INTO `product_info` (`product_id`, `product_name`, `product_price`, `product_stock`, `product_desc`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`)
VALUES
	('157875196366160022','香芋派',0.01,39,'派对就吃香芋派','image/157875196366160022.jpeg',0,1,'2018-03-28 19:39:15','2018-07-02 11:45:44'),
	('157875227953464068','巨无霸套餐',100.90,200,'美味中的经典之作','image/157875227953464068.jpeg',1,1,'2018-03-28 19:35:54','2018-04-21 10:05:57'),
	('157875227953234242','全家桶套餐',50.90,200,'尽享美味佳肴','image/157875227953234242.jpeg',0,2,'2019-01-28 19:35:54','2019-02-21 10:05:57'),
	('164103465734242707','鸡腿',0.02,982,'椒盐劲脆鸡腿','image/164103465734242707.jpeg',0,1,'2018-03-30 17:11:56','2019-02-24 19:20:54');