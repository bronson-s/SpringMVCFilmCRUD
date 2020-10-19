## Spring MVC Film C.R.U.D. Project

### Overview
Students were asked to build a full stack web application that encompassed Spring Model View Controller design with full C.R.U.D capability, as well as a DAO pattern using JDBC to manipulate data. The project was to use a database provided to us and builds upon the project from last week. This application uses Tomcat Web Container to run on a server. Furthermore this project was supposed to give us experience working in a collaborated format within a group through git and was assigned to us in groups of 3.

### Key Concepts

* Object Relational Mapping
* Data Manipulation and Transactions
* SQL Data Manipulation Language using JDBC
* JSP Views
* JSP Expression language
* Tag libraries
* JavaBeans
* Database Accessor Objects
* Spring Web Model View Controller patterns
* Spring MVC with C.R.U.D
* HTML and CSS

### Challenges/Lessons Learned.
The biggest challenge of this project was navigating the group dynamics for a larger app for the first time. It was challenging to coordinate time and more over we quickly discovered what sorts of problems can arrive when working in a collaborated format through git. Definitely lots of valuable take aways for the three of us when it comes to working as a team on a web application. Most of these take aways have to do with communication and timing.


#### How to Run
To Run this application direct your search engine to: http://localhost:8080/MVCFilmSite/
or run the application on a server within your JRE.

Refer to the list below for possible functionalities of the site.

 1:
A user can enter a Film's ID and see the details of the film in a web page. If the film is not found, they see an appropriate message.

 2:
A user can choose to add a new film. They can enter all the properties of the film. Their input will be used to create Film object, which the DAO implementation will save in the database. If the insert fails, the user is informed of this.

 3:
When a user retrieves a film, they have the option of deleting it. If they delete the film, it is removed from the database. If the delete fails (such as, due to child records), the user is informed of this.

 4:
When a user retrieves a film, they have the option of editing it. If they choose this they are allowed to change any property except the film's ID. When they submit the form, that film's record is updated in the database. If the update fails, the user is informed of this.

 5:
A user can search for films by keyword/pattern in title or description. From the resulting list of films, the user can choose to update or delete a record.
