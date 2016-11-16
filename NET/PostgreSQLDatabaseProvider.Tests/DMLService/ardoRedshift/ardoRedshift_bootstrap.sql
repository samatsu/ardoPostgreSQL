--- cheating with DUMMY because DUMMY and "DUMMY" are not the same in PGSQL
-- CREATE TABLE "DUMMY%Machine%" (ID serial not null primary key, VAL int, "SELECT" int);
CREATE TABLE DUMMY%Machine% (ID int IDENTITY(1,1) not null primary key, VAL int, "SELECT" int);
CREATE TABLE PERSON%Machine% (PERSONID int, NAME varchar(255), AGE int, WEIGHT decimal(37, 8), DEAD boolean, LASTLOGIN timestamp);
-- INSERT INTO "DUMMY%Machine%" (VAL, "SELECT") VALUES (2,123) ;
INSERT INTO DUMMY%Machine% (VAL, "SELECT") VALUES (2,123) ;
INSERT INTO PERSON%Machine% (PERSONID, NAME, AGE, WEIGHT, DEAD, LASTLOGIN) VALUES (1, 'DaveLauper', 21, 80.5, 't', '2014-03-13 14:50:23');
INSERT INTO PERSON%Machine% (PERSONID, NAME, AGE, WEIGHT, DEAD, LASTLOGIN) VALUES (2, 'JohnOps', 30, 100.9, NULL, '2014-03-14 10:00:36');
INSERT INTO PERSON%Machine% (PERSONID, NAME, AGE, WEIGHT, DEAD, LASTLOGIN) VALUES (3, 'NullPerson', NULL, NULL, NULL, NULL);