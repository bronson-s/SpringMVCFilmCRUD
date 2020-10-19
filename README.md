## Spring MVC Film C.R.U.D. Project

### Overview
Skill Distillery week 8 project that encompasses all the OOP Java lessons and has added reading info from a SQL database. This project adds HTML, CSS, and Bootstrap to the application. This application implements full web-based C.R.U.D. functionality, using Spring MVC and the DAO pattern. The DAO implementation will use JDBC to persist and retrieve data.

### Topics
 
* Object Relational Mapping
* SQL database
* Maven
* MAMP
* Constructors
* Getters/Setters
* Try/Catch blocks
* Object Oriented Programming
* Spring Framework
* Handling requests
* Gradle
* CSS
* BootStrap



### How to Run
Step 1: A user can enter a Film's ID and see the details of the film in a web page. If the film is not found, they see an appropriate message.

Step 2:
A user can choose to add a new film. They can enter all the properties of the film. Their input will be used to create Film object, which the DAO implementation will save in the database. If the insert fails, the user is informed of this.

Step 3:
When a user retrieves a film, they have the option of deleting it. If they delete the film, it is removed from the database. If the delete fails (such as, due to child records), the user is informed of this.

Step 4:
When a user retrieves a film, they have the option of editing it. If they choose this they are allowed to change any property except the film's ID. When they submit the form, that film's record is updated in the database. If the update fails, the user is informed of this.

Step 5:
A user can search for films by keyword/pattern in title or description. From the resulting list of films, the user can choose to update or delete a record.

Bonus:
When a film's details are displayed, its actors and categories are also listed.