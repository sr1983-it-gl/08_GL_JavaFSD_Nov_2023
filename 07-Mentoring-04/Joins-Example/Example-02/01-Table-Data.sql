DROP TABLE if exists A;

CREATE TABLE `A` (
  `X` VARCHAR(45) ,
  `Y` VARCHAR(45) ,
  `Z` VARCHAR(45) 
);


INSERT INTO A (X, Y, Z) VALUES ('1', '3', '5');
INSERT INTO A (X, Y, Z) VALUES ('2', '4', '6');
INSERT INTO A (X, Y, Z) VALUES ('4', '9', '9');

DROP TABLE if exists B;


CREATE TABLE `B` (
  `X` VARCHAR(45) ,
  `Y` VARCHAR(45) ,
  `Z` VARCHAR(45) 
);


INSERT INTO B (X, Y, Z) VALUES ('1', '3', '5');
INSERT INTO B (X, Y, Z) VALUES ('1', '4', '6');
INSERT INTO B (X, Y, Z) VALUES ('2', '4', '7');
INSERT INTO B (X, Y, Z) VALUES ('3', '4', '5');
