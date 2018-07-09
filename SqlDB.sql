CREATE DATABASE STAFFMEMBERS	#creates a database with name staffmembers
CREATE TABLE personaldata 	#creates a table within the DB, with the columns id, firstname, lastname, etc.	
	(
	id	SMALLINT NOT NULL,
	firstname	CHAR(25),
	lastname	CHAR(25),
	gender		CHAR(1),
	departmentno	SMALLINT,
	startingdate	DATE,
	salary		DECIMAL(8,2)
	)
INSERT INTO personaldata	#insert some rows into personaldata
	VALUES (1, "Mike", "Mueller", "m", 3, "01-june-10", 4500.00)

INSERT INTO personaldata
	VALUES (2, "Berta", "Hoffmann", "f", 1, "15-june-10", 4000.00)

INSERT INTO personaldata
	VALUES (3, "Adam", "Spencer", "m", 1, "15-june-10", 3500.00)

INSERT INTO personaldata
	VALUES (4, "Maria", "Bye", "f", 2, "15-june-10", 3500.00)

INSERT INTO personaldata
	VALUES (5, "Ben", "Luck", "m", 2, "30-june-10", 3500.00)

INSERT INTO personaldata
	VALUES (6, "Rik", "Meier", "m", 3, "30-june-10", 4000.00)

INSERT INTO personaldata
	VALUES (7, "Luise", "Dale", "f", 3, "30-june-10", 4500.00)

INSERT INTO personaldata
	VALUES (8, "Claude", "Strom", "m",3, "30-june-10", 4000.00)

CREATE TABLE departments	#create a second table within the DB 
	(departmentno	SMALLINT NOT NULL,
	departmentname	CHAR(15)
	)
INSERT INTO departments
	VALUES (1, "administration")
INSERT INTO departments
	VALUES (2, "transport")
INSERT INTO departments
	VALUES (3, "pr")

# from Kuhlmann and Muellmerstadt "Datenbanksprache SQL" 1994
