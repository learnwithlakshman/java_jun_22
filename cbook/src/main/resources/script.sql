CREATE TABLE app_user(id SERIAL PRIMARY KEY,user_name VARCHAR(250) UNIQUE,password VARCHAR(100)); 
CREATE TABLE contact(id SERIAL PRIMARY KEY,name VARCHAR(250),email VARCHAR(250),mobile VARCHAR(12) UNIQUE);

insert into app_user(user_name,password) values('admin','admin@1234');
insert into contact(name,email,mobile) values('Krish','krish@gmail.com','9876543210');
insert into contact(name,email,mobile) values('Manoj','manoj@gmail.com','9876543211');
