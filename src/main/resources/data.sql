insert into CREATOR(ID,NAME,IMG_SOURCE,EMAIL) values (1,'Ilse Ven','img/ilse.jpg','ilsevenandries@gmail.com')
insert into CREATOR(ID,NAME,IMG_SOURCE,EMAIL) values (2,'Bea Breugelmans','img/bea.jpg','beabreugelmans@gmail.com')

insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Allerlei bordjes','img/creatie1.jpg',null,5,'borden',1,'2021-03-21')
insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Theepot en tasjes','img/creatie2.jpg',null,10,'tasjes',1,'2021-03-21')
insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Thee tasje en bord voor koekjes','img/creatie3.jpg',null,5,'tasjes',2,'2021-03-21')
insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Pasta borden','img/creatie4.jpg','Mama mia die pasta is lekker',5,'borden',2,'2021-03-21')
insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Chips potjes','img/creatie5.jpg',null,10,'potjes',1,'2021-03-21')
insert into CREATION(ID,NAME,IMG_SOURCE,EXTRA_INFO,PRICE,TYPE,CREATOR_ID,ADDED_ON) values (nextval('creation_seq'),'Aperitief potjes','img/creatie6.jpg',null,12,'potjes',1,'2021-03-21')