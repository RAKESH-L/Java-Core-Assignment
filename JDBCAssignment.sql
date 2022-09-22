create database myproductassigment_80631;

use myproductassigment_80631;

create table product(id int primary key auto_increment, name varchar(255) NOT NULL, price double default 0,
						description varchar(255));
                        
describe product;

select * from product;   

drop table product;                     