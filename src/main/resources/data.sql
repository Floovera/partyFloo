insert into SET(ID,NAME,TYPE,PRICE) values (1,'Kerst in Antwerpen','borden',15)
insert into SET(ID,NAME,TYPE,PRICE) values (2,'Ochtendgloed','tasjes',20)
insert into SET(ID,NAME,TYPE,PRICE) values (3,'Ginger','potjes',12)

insert into CREATOR(ID,NAME,EMAIL) values (1,'Ilse Ven','ilsevenandries@gmail.com')
insert into CREATOR(ID,NAME,EMAIL) values (2,'Floo Veraghtert','flooveraghtert@gmail.com')

insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (1,'Groot bord',null,'borden',1,'2021-03-21',1)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (2,'Kleiner bord',null,'borden',1,'2021-03-21',1)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (3,'Thee tasje',null,'tasjes',2,'2021-03-21',2)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (4,'Theepot','Leuke theepot waar je ongeveer zo een litertje thee in kan maken.','tasjes',2,'2021-03-21',2)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (5,'Chips potje',null,'potjes',1,'2021-03-21',3)
insert into CREATION(ID,NAME,EXTRA_INFO,TYPE,CREATOR_ID,ADDED_ON,SET_ID) values (6,'Olijven potje',null,'potjes',1,'2021-03-21',3)