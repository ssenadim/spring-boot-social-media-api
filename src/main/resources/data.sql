insert into USER_DETAILS (ID,BIRTH_DATE,COUNTRY,MEMBERSHIP_DATE,NAME,SURNAME)
values (100001,current_date(),'USA',current_date(),'Kobe','Bryant');

insert into USER_DETAILS (ID,BIRTH_DATE,COUNTRY,MEMBERSHIP_DATE,NAME,SURNAME)
values (100002,current_date(),'USA',current_date(),'Michael','Jordan');

insert into USER_DETAILS (ID,BIRTH_DATE,COUNTRY,MEMBERSHIP_DATE,NAME,SURNAME)
values (100003,current_date(),'USA',current_date(),'Shaquille','O''neal');

insert into USER_DETAILS (ID,BIRTH_DATE,COUNTRY,MEMBERSHIP_DATE,NAME,SURNAME)
values (100004,current_date(),'Türkiye',current_date(),'Mehmet','Okur');


insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20001,'He is the best player from USA',100001);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20002,'He is majesty',100002);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20003,'He is the best pivot from USA',100003);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20004,'He is the best player from Türkiye',100004);

insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20005,'He is black mamba',100001);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20006,'He is king',100002);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20007,'He is huge',100003);
insert into POST(ID, DESCRIPTION, USER_ID)
VALUES (20008,'He is memo',100004);