CREATE TABLE app_user(id SERIAL PRIMARY KEY,user_name VARCHAR(250) UNIQUE,password VARCHAR(100)); 
CREATE TABLE contact(id SERIAL PRIMARY KEY,name VARCHAR(250),email VARCHAR(250),mobile VARCHAR(12) UNIQUE);
