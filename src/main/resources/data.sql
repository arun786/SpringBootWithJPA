create table person(
  id INTEGER not NULL AUTO_INCREMENT,
  name VARCHAR(60) NOT NULL ,
  location VARCHAR(60) NOT NULL ,
  birth_date DATE,
  PRIMARY KEY (id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10003,  'Pieter', 'Amsterdam',sysdate());