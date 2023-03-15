# mysql-java-project

This was a MySQL project at Promineo Tech. This project assignment was to develop a menu-driven application that demonstrates how to perform CRUD (Create, Read, Update, Read) operations on a DIY project database.
_________________________________________________________________________________________________________________________________________________________________________

**WEEK 11:** Final Project: Finish adding the UPDATE and DELETE CRUD operations to the assignment, and will create a working full CRUD program.

Objectives: 
1) Modify project details using the UPDATE statement. 
2) Delete a project and all child rows using the DELETE statement. 
3) Observe that using ON DELETE CASCADE automatically deletes child rows with a FOREIGN KEY relationship.    
4) Use the return value from: 
        PreparedStatement.executeUpdate() to determine if a row was updated or deleted. 
_________________________________________________________________________________________________________________________________________________________________________
**WEEK 10:** Expand on the menu app to list all the projects(name and ID). Then, write code to select a project to the edit. 
 
 Objectives: 
 1) Fetch a List of Projects record using SQL query skills.
 2) Learn how to perform multiple queries in a single transaction. 
 3) Write an inner join to fetch category rows related to a project row. 
 4) Use an Optional to either return a project record to throw a custom Exception. 
 5) Practice Lambda expression to list the projects and to throw a custom Exception from an Optional. 
_________________________________________________________________________________________________________________________________________________________________________
**WEEK 9:** Use proper exception handling to gracefully manage any errors. Write code to add project details to the project tables by creating and managing JDBC resources as well as database transactions. 

Objectives: 
1) Write correct exception handling in a menu driven application. 
2) Implement a scanner to father user input from the console. 
3) Work with BigDecimal objects (import java.math.BigDecimal)
4) Use JDBC sources (Connections and Prepared Statements) and ensure they are closed properly. 
5) Implement JDBC methods to insert a project object into the project table. 
_________________________________________________________________________________________________________________________________________________________________________
**WEEK 8:** Draw the diagram using the Draw.io to create an Entity-Relationship Diagram. Then, write SQL statements to create the five project tables. Lastly, use DBeaver to create the tables. 

Objectives: 
1) Learn to create an Entity-Relationship (ERD) in Draw.io with entities and relationship lines. 
2) Learn crows' foot notation and how to apply that knowledge in an Entity Relationship Diagram. 
3) Use DROP TABLE and CREATE TABLE statements to create tables using a MySQL client (DBeaver)
_________________________________________________________________________________________________________________________________________________________________________
**WEEK 7:** Develop a menu driven application in Java. Demonstrate how to perform CRUD operations on a MySQL database. Project schema will contain do it yourself (DIY) projects that contains five tables(project, material, step, category, project_category). We will be working on expanding this application for the next four weeks. 

Objectives: 
1) Use MySQL Workbench to create a schema and user. 
2) Use MySQL Workbench to assign scheme privileges to an user. 
3) Create a Maven project in Eclipse. 
4) Add the MySQL driver as a depdendecy in pom.xml.
5) Seperate project concerns by creating packages. 
6) Write Java code to connect to a MySQL database and schema. 
