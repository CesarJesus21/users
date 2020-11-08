insert into users(id, creation_date, update_date, enable, author, name, password, email) values ('1', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG', 'USER 1','BIJASFIEOIEJFIEFJIF', 'cesar_jgg@outlook.com');
insert into users(id, creation_date, update_date, enable, author, name, password, email) values ('2', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG', 'USER 2','IFHIHFISIUHEUIHLAñO', 'cesar.jesus.gugu@gmail.com');


insert into roles (id, creation_date, update_date, enable, author, name, description) values ('1', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG', 'ADMIN', 'ROLE ADMINISTRATOR');
insert into roles (id, creation_date, update_date, enable, author, name, description) values ('2', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG', 'USER', 'ROLE BASIC');

INSERT INTO USERS_ROLES (id, creation_date, update_date, enable, author, id_user, id_role) values ('1', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG',  '1', '1');
INSERT INTO USERS_ROLES (id, creation_date, update_date, enable, author, id_user, id_role) values ('2', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG',  '1', '2');
INSERT INTO USERS_ROLES (id, creation_date, update_date, enable, author, id_user, id_role) values ('3', current_timestamp , current_timestamp , 1, 'CESAR JESUS GG',  '2', '1');