DROP SCHEMA security;
DROP SCHEMA nsi;
DROP SCHEMA data;
CREATE SCHEMA security;
CREATE SCHEMA nsi;
CREATE SCHEMA data;

--SECURITY управление пользователями
DROP TABLE security."user";
DROP TABLE security."role";
DROP TABLE security."group";
DROP TABLE security."userinrole";
DROP TABLE security."useringroup";
DROP TABLE security."groupinrole";

CREATE TABLE security."user"
(
    "LOGON"         char(32)    NOT NULL,
    "PASSWORD"      char(32)    NOT NULL,
    "HOST"          varchar(256),
    "NAME"          varchar(128)NOT NULL,
    "SURNAME"       varchar(128)NOT NULL,
    "FATHER"        varchar(128),
    "PHONE"         varchar(128),
    "EMAIL"         varchar(128),
    "ACTIVE"        char(1)     NOT NULL,
    PRIMARY KEY ("LOGON")
);
CREATE TABLE security."role"
(
    "ROLE"          char(32)    NOT NULL,
    "COMMENT"       varchar(128),
    PRIMARY KEY ("ROLE")
);
CREATE TABLE security."group"
(
    "GROUP"         char(32)    NOT NULL,
    "COMMENT"       varchar(128),
    PRIMARY KEY ("GROUP")
);
CREATE TABLE security."userinrole"
(
    "LOGON"         char(32)    NOT NULL REFERENCES security."user"("LOGON"),
    "ROLE"          char(32)    NOT NULL REFERENCES security."role"("ROLE")
);
CREATE TABLE security."useringroup"
(
    "LOGON"         char(32)    NOT NULL REFERENCES security."user"("LOGON"),
    "GROUP"         char(32)    NOT NULL REFERENCES security."group"("GROUP")
);
CREATE TABLE security."groupinrole"
(
    "GROUP"         char(32)    NOT NULL REFERENCES security."group"("GROUP"),
    "ROLE"          char(32)    NOT NULL REFERENCES security."role"("ROLE")
);

--NSI нормативка
--DATA основные данные