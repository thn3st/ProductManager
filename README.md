# ProductManager
CRUD Example with Springboot + Thymleaf + MySQL

DB: 
```
CREATE TABLE category (
	id bigint primary key,
    cate_code varchar(20),
    cate_name varchar(50)
);

create table status(
	id bigint primary key,
    status_name varchar(100)
);

create table sub_category(
	id bigint primary key,
    sub_cate_code varchar(20),
    sub_cate_name varchar(50),
    cate_id bigint not null
);

create table product (
	id bigint primary key,
    sub_cate_id bigint not null,
    product_name varchar(100),
    color varchar(50),
    quantity bigint,
    sell_price double,
    origin_price double,
    description varchar(1000),
    status_id bigint not null
);

create table brand (
	id bigint primary key,
    brand_name varchar(100)
);

create table product_brand(
	product_id bigint,
    brand_id bigint,
    primary key (product_id, brand_id)
);

alter table sub_category
add foreign key (cate_id) references category(id);

alter table product
add foreign key (sub_cate_id) references sub_category(id),
add foreign key (status_id) references status(id);

alter table product_brand
add foreign key (product_id) references product(id),
add foreign key (brand_id) references brand(id);

insert into category
values
	(1, 'AO', 'Áo đẹp'),
    (2, 'QUAN', 'Quần đẹp');
    
insert into sub_category
values
	(1, 'AO_PHONG', 'Áo phông', 1),
    (2, 'QUAN_TAY', 'Quần tây', 2);
    
insert into status
values
	(1, 'Còn hàng'),
    (2, 'Hết hàng');
    
insert into brand
values
	(1, 'Brand 1'),
    (2, 'Brand 2');
```
