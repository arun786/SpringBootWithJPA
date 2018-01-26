create table person(
  id INTEGER not NULL,
  name VARCHAR(60) NOT NULL ,
  location VARCHAR(60) NOT NULL ,
  birth_date DATE,
  PRIMARY KEY (id)
);

INSERT INTO PERSON (NAME, LOCATION, BIRTH_DATE ) VALUES('Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON ( NAME, LOCATION, BIRTH_DATE ) VALUES( 'James', 'New York',sysdate());
INSERT INTO PERSON ( NAME, LOCATION, BIRTH_DATE ) VALUES( 'Pieter', 'Amsterdam',sysdate());