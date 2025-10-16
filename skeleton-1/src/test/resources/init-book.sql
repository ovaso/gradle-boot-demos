create table book
(
	id      bigint unsigned not null auto_increment primary key,
	name    varchar(50)    not null,
	edition integer        not null,
	price   numeric(10, 2) not null
) engine=innodb;
