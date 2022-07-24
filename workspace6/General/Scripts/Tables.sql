DROP TABLE IF EXISTS events;
DROP TABLE IF EXISTS features;
DROP TABLE IF EXISTS park_feature_link;
DROP TABLE IF EXISTS zips;
DROP TABLE IF EXISTS parks;

create table parks (
	park_id  int not null auto_increment,
	park_name varchar(25) not null, 
	acreage  double not null,
	primary key (park_id)
);

create table features (
	feature_id int not null auto_increment,
	features varchar(25) not null, 
	primary key (feature_id)
);

create table park_feature_link (
	pfl_id int not null auto_increment,
	park_id int not null,
	feature_id int not null,
	primary key (pfl_id),
	foreign key (park_id) references parks(park_id),
	foreign key (feature_id) references features(feature_id)
);

create table events (
	event_id int not null auto_increment,
	park_id int not null,
	event_name varchar(25) not null,
	description tinytext,
	primary key (event_id),
	foreign key (park_id) references parks(park_id)
);