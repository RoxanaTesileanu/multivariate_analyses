/* Reading different types of sources into Scala:

1) .txt files, .csv files and FromURL data (package scala.io.Source)
2) from MSSQL-Server (library com.microsoft.sqlserver.jdbc)
To come:
3) from MongoDB Server (package  "org.mongodb.scala" %% "mongo-scala-driver" % "2.4.0" )
4) within Openstack (NoSQL and SQL DBs ....)
*/

//1) Reading txt files, csv files and FromURL data

import scala.io.Source

val source = Source.fromFile("myData.txt")
val lines = source.getLines.map(_.toArray)
source.close

val source2 = Source.FromURL("https://www.....", "iso....")
read the lines and transform them to an Array


//2) Reading data from the MS SQL-Server 

import java sql._   //it has the Connection, Statement and ResultSet classes
import com.microsoft.sqlserver.jdbc._  // for the msSQL Server
import java.net.InetAddress // to get info about your PC and user (actually not needed). You need to know the settings of the mssql-server (user is SA and your password was set at the installation)

scala> InetAddress.getLocalHost()
res15: java.net.InetAddress = barbu/127.0.1.1

scala> InetAddress.getLocalHost.getHostName()
res22: String = barbu

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance()
scala> Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance()
res64: Any = SQLServerDriver:4

scala> DriverManager.getConnection("jdbc:sqlserver://127.0.1.1;databaseName=employees;user=root;password=mysql;")
com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host 127.0.1.1, port 1433 has failed. Error: "Connection refused. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.".
  at com.microsoft.sqlserver.jdbc.SQLServerException.makeFromDriverError(SQLServerException.java:228)
  at com.microsoft.sqlserver.jdbc.SQLServerException.ConvertConnectExceptionToSQLServerException(SQLServerException.java:285)
  at com.microsoft.sqlserver.jdbc.SocketFinder.findSocket(IOBuffer.java:2437)
  at com.microsoft.sqlserver.jdbc.TDSChannel.open(IOBuffer.java:641)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:2245)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:1921)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:1762)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1077)
  at com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:623)
  at java.sql.DriverManager.getConnection(DriverManager.java:664)
  at java.sql.DriverManager.getConnection(DriverManager.java:270)
  ... 42 elided


DriverManager.getConnection("jdbc:sqlserver://barbu;databaseName=employees;user=barbu;password=mysql;")
com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host barbu, port 1433 has failed. Error: "Connection refused. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.".
  at com.microsoft.sqlserver.jdbc.SQLServerException.makeFromDriverError(SQLServerException.java:228)
  at com.microsoft.sqlserver.jdbc.SQLServerException.ConvertConnectExceptionToSQLServerException(SQLServerException.java:285)
  at com.microsoft.sqlserver.jdbc.SocketFinder.findSocket(IOBuffer.java:2437)
  at com.microsoft.sqlserver.jdbc.TDSChannel.open(IOBuffer.java:641)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:2245)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:1921)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:1762)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1077)
  at com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:623)
  at java.sql.DriverManager.getConnection(DriverManager.java:664)
  at java.sql.DriverManager.getConnection(DriverManager.java:270)
  ... 42 elided


scala> DriverManager.getConnection("jdbc:sqlserver://127.0.1.1:1433;user=SA;databaseName=employees;password=Mysql2018;") 
com.microsoft.sqlserver.jdbc.SQLServerException: Cannot open database "employees" requested by the login. The login failed. ClientConnectionId:ddaba4ee-f4a6-428a-a1d6-5ac944e42a76
  at com.microsoft.sqlserver.jdbc.SQLServerException.makeFromDatabaseError(SQLServerException.java:259)
  at com.microsoft.sqlserver.jdbc.TDSTokenHandler.onEOF(tdsparser.java:256)
  at com.microsoft.sqlserver.jdbc.TDSParser.parse(tdsparser.java:108)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.sendLogon(SQLServerConnection.java:4548)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.logon(SQLServerConnection.java:3409)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.access$100(SQLServerConnection.java:85)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection$LogonCommand.doExecute(SQLServerConnection.java:3373)
  at com.microsoft.sqlserver.jdbc.TDSCommand.execute(IOBuffer.java:7344)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.executeCommand(SQLServerConnection.java:2713)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectHelper(SQLServerConnection.java:2261)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.login(SQLServerConnection.java:1921)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connectInternal(SQLServerConnection.java:1762)
  at com.microsoft.sqlserver.jdbc.SQLServerConnection.connect(SQLServerConnection.java:1077)
  at com.microsoft.sqlserver.jdbc.SQLServerDriver.connect(SQLServerDriver.java:623)
  at java.sql.DriverManager.getConnection(DriverManager.java:664)
  at java.sql.DriverManager.getConnection(DriverManager.java:270)
  ... 42 elided

I'VE CREATED MY OWN DB FOR TESTING HOW THE CONNECTION WORKS (https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-ubuntu?view=sql-server-linux-2017#connect-locally; https://docs.microsoft.com/en-us/sql/connect/jdbc/step-3-proof-of-concept-connecting-to-sql-using-java?view=sql-server-2017, https://docs.microsoft.com/en-us/sql/connect/jdbc/retrieving-result-set-data-sample?view=sql-server-2017):

scala> DriverManager.getConnection("jdbc:sqlserver://127.0.1.1:1433;user=SA;databaseName=TestDB;password=Mysql2018;")
res80: java.sql.Connection = ConnectionID:67 ClientConnectionId: bf7da3fd-cae9-47b3-9754-8ecd84382d13

scala> val sqlCommand = "SELECT * FROM Inventory WHERE quantity > 152"
sqlCommand: String = SELECT * FROM Inventory WHERE quantity > 152

scala> val statement = res80.create
createArrayOf   createBlob   createClob   createNClob   createSQLXML   createStatement   createStruct

scala> val statement = res80.createStatement()
statement: java.sql.Statement = SQLServerStatement:1

scala> val queryRes = statement.executeQuery(sqlCommand)
queryRes: java.sql.ResultSet = SQLServerResultSet:1

cala> queryRes.getString("quantity")
res93: String = 154

scala> queryRes.getString("id")
res94: String = 2

scala> queryRes.getString("name")
res95: String = orange



val source3 = getClass.getResource("/employees.sql")

scala> val source3 = getClass.getResource("/employees.sql")


source3: java.net.URL = file:/home/barbu/multivariate_analyses/DeepLearning/target/scala-2.11/classes/employees.sql

scala> val source4 = getClass.getResourceAsStream("/employees.sql")
source4: java.io.InputStream = java.io.BufferedInputStream@74baac09

scala> val lines = Source.fromInputStream(source4).getLines
lines: Iterator[String] = non-empty iterator

scala> lines.foreach(line=> println(line))
--  Sample employee database 
--  See changelog table for details
--  Copyright (C) 2007,2008, MySQL AB
--  
--  Original data created by Fusheng Wang and Carlo Zaniolo
--  http://www.cs.aau.dk/TimeCenter/software.htm
--  http://www.cs.aau.dk/TimeCenter/Data/employeeTemporalDataSet.zip
-- 
--  Current schema by Giuseppe Maxia 
--  Data conversion from XML to relational by Patrick Crews
-- 
-- This work is licensed under the 
-- Creative Commons Attribution-Share Alike 3.0 Unported License. 
-- To view a copy of this license, visit 
-- http://creativecommons.org/licenses/by-sa/3.0/ or send a letter to 
-- Creative Commons, 171 Second Street, Suite 300, San Francisco, 
-- California, 94105, USA.
-- 
--  DISCLAIMER
--  To the best of our knowledge, this data is fabricated, and
--  it does not correspond to real people. 
--  Any similarity to existing people is purely coincidental.
-- 

DROP DATABASE IF EXISTS employees;
CREATE DATABASE IF NOT EXISTS employees;
USE employees;

SELECT 'CREATING DATABASE STRUCTURE' as 'INFO';

DROP TABLE IF EXISTS dept_emp,
                     dept_manager,
                     titles,
                     salaries, 
                     employees, 
                     departments;

/*!50503 set default_storage_engine = InnoDB */;
/*!50503 select CONCAT('storage engine: ', @@default_storage_engine) as INFO */;

CREATE TABLE employees (
    emp_no      INT             NOT NULL,
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(14)     NOT NULL,
    last_name   VARCHAR(16)     NOT NULL,
    gender      ENUM ('M','F')  NOT NULL,    
    hire_date   DATE            NOT NULL,
    PRIMARY KEY (emp_no)
);

CREATE TABLE departments (
    dept_no     CHAR(4)         NOT NULL,
    dept_name   VARCHAR(40)     NOT NULL,
    PRIMARY KEY (dept_no),
    UNIQUE  KEY (dept_name)
);

CREATE TABLE dept_manager (
   emp_no       INT             NOT NULL,
   dept_no      CHAR(4)         NOT NULL,
   from_date    DATE            NOT NULL,
   to_date      DATE            NOT NULL,
   FOREIGN KEY (emp_no)  REFERENCES employees (emp_no)    ON DELETE CASCADE,
   FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
   PRIMARY KEY (emp_no,dept_no)
); 

CREATE TABLE dept_emp (
    emp_no      INT             NOT NULL,
    dept_no     CHAR(4)         NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE            NOT NULL,
    FOREIGN KEY (emp_no)  REFERENCES employees   (emp_no)  ON DELETE CASCADE,
    FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no,dept_no)
);

CREATE TABLE titles (
    emp_no      INT             NOT NULL,
    title       VARCHAR(50)     NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE,
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no,title, from_date)
) 
; 

CREATE TABLE salaries (
    emp_no      INT             NOT NULL,
    salary      INT             NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE            NOT NULL,
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no, from_date)
) 

.........
........

scala> val source4 = getClass.getResource("/employees.sql")
source4: java.net.URL = file:/home/barbu/multivariate_analyses/DeepLearning/target/scala-2.11/classes/employees.sql

scala> source4.
equals         getDefaultPort   getPath       getQuery      hashCode         sameFile         toURI   
getAuthority   getFile          getPort       getRef        openConnection   toExternalForm           
getContent     getHost          getProtocol   getUserInfo   openStream       toString                 

scala> source4.getContent
res13: Object = java.io.BufferedInputStream@7343baad

//3) Reading data from Mongo DB Server

scala> import org.mongodb.scala._
import org.mongodb.scala._

scala> val mongoClient: MongoClient = MongoClient()Iul 13, 2018 10:56:57 AM com.mongodb.diagnostics.logging.JULLogger log
INFO: Opened connection [connectionId{localValue:9, serverValue:1}] to localhost:27017
Iul 13, 2018 10:56:57 AM com.mongodb.diagnostics.logging.JULLogger log
INFO: Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[4, 0, 0]}, minWireVersion=0, maxWireVersion=7, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=5730694}

Iul 13, 2018 10:57:11 AM com.mongodb.diagnostics.logging.JULLogger log
INFO: Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}
mongoClient: org.mongodb.scala.MongoClient = MongoClient(com.mongodb.async.client.MongoClientImpl@6e01d9e0)


scala> val database:MongoDatabase = mongoClient.getDatabase("myTest")
database: org.mongodb.scala.MongoDatabase = MongoDatabase(com.mongodb.async.client.MongoDatabaseImpl@491518f1)

scala> database.
canEqual           drop                  listCollections   productPrefix    watch                writeConcern   
codecRegistry      equals                name              readConcern      withCodecRegistry                   
copy               getCollection         productArity      readPreference   withReadConcern                     
createCollection   hashCode              productElement    runCommand       withReadPreference                  
createView         listCollectionNames   productIterator   toString         withWriteConcern                    

scala> database.getCollection("persons")
res0: org.mongodb.scala.MongoCollection[org.mongodb.scala.Document] = MongoCollection(com.mongodb.async.client.MongoCollectionImpl@3936f66f)

scala> val doc: Document = Document("name"-> "Maria")
doc: org.mongodb.scala.Document = Document((name,BsonString{value='Maria'}))



//4) Reading data within an OpenStack cloud


/* References:

Mark Lewis, Introduction into Problem Solving Using Scala, 2017.  

Alex Fruzenshtein, http://fruzenshtein.com/scala-working-with-resources-folders-files/

Microsoft Documentation for the Microsoft MS Sql-Server and JDBC Driver: https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-2017
https://docs.microsoft.com/en-us/sql/connect/jdbc/step-3-proof-of-concept-connecting-to-sql-using-java?view=sql-server-2017

The employees.sql db from: https://github.com/datacharmer/test_db

Kyle Banker, Peter Bakkum, Shaun Verch, Douglas Garrett, Tim Hawkins, MongoDB in Action, 2nd edition, Manning, 2016.

V.K. Cody Baumgardner, OpenStack in Action, Manning, 2016. 

*/
