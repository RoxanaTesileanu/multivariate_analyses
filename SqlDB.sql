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

CREATE TABLE departments	#create a second table within the DB, with two columns: departmentno and departmentname 
	(departmentno	SMALLINT NOT NULL,
	departmentname	CHAR(15)
	)
INSERT INTO departments		# create some rows for the table departments
	VALUES (1, "administration")
INSERT INTO departments
	VALUES (2, "transport")
INSERT INTO departments
	VALUES (3, "pr")

# Some queries:

SELECT * FROM personaldata	#selects all rows of a table, * means all

SELECT firstname, startingdate FROM personaldata	#selects the two columns (firstname and startingdate) from a table

SELECT * FROM personaldata WHERE departmentno=1		#selects all entries from personaldata where the deptno is 1

# instead of = one can use >, <, <> (not equal), <=, >=

SELECT lastname, salary FROM personaldata WHERE salary>4000.00 #selects the lastname for the salary >4000.00

SELECT lastname, departmentno, salary FROM personaldata WHERE departmentno=3 AND salary>3000.00
#selects the lastname from the table with the deptno. 1 and a salary > 4000.00 (two conditions: dept 1 and salar>4000.00)



# from Kuhlmann and Muellmerstadt "Datenbanksprache SQL" 1994
