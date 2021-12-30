insert into SET(ID,NAME,TYPE) values (1,'Kerst in Antwerpen','borden')
insert into SET(ID,NAME,TYPE) values (2,'Ochtendgloed','tasjes')
insert into SET(ID,NAME,TYPE) values (3,'Ginger','potjes')

insert into CREATOR(ID,NAME,EMAIL) values (1,'Ilse Ven','ilsevenandries@gmail.com')
insert into CREATOR(ID,NAME,EMAIL) values (2,'Floo Veraghtert','flooveraghtert@gmail.com')

insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (1,'Groot bord',null,'borden',15,1,'2021-03-21',1)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (2,'Kleiner bord',null,'borden',10,1,'2021-03-21',1)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (3,'Thee tasje',null,'tasjes',5,2,'2021-03-21',2)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (4,'Theepot','Leuke theepot waar je ongeveer zo een litertje thee in kan maken.','tasjes',15,2,'2021-03-21',2)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (5,'Chips potje',null,'potjes',5,1,'2021-03-21',3)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,PRICE,CREATOR_ID,ADDED_ON,SET_ID) values (6,'Olijven potje',null,'potjes',3,1,'2021-03-21',3)