# Java User Model

A student that completes this project shows that they can:

Add additional fields to a Many to Many Join Table
Add standard auditing fields to each table
Use SQL, JPA and Hibernate to perform custom query operations on a RDBMS through a Spring Application
Use SQL, JPA and Hibernate to perform custom data manipulation operations on a RDBMS through a Spring Application
Implement default Swagger documentation

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the applications data. This application will also form the basis of a user authentication application developed elsewhere in the course

### Database layout

The table layouts are as follows

* User is the driving table.
* Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
* Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersdb.png)

Two different applications exist

- usermodel_initial - a starting version of the application that resembles the Crudy Restaurant application developed elsewhere in the course.
- usermodel - the finished version with many "bells and whistles" added
