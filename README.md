# Blood Bank Management System
A robust desktop application built with Java Swing and MySQL for efficient management of blood bank operations.

This project provides a simple and user-friendly graphical interface to manage donor details, track blood stock, and handle other essential tasks. The primary goal is to streamline the process of adding new donors, updating records, managing inventory, and searching for information.

# Features
User Authentication: Secure login and logout system for authorized access.

Donor Management: Easily add, update, and view comprehensive donor records.

Blood Stock Control: Increase and manage blood stock levels for different blood groups.

Advanced Search: Quickly find donors by their blood group or location.

Intuitive GUI: A clean and straightforward interface designed with Java Swing for ease of use.

# Tech Stack
Core Language: Java

GUI: Java Swing

Database: MySQL

Connectivity: JDBC (Java Database Connectivity)

IDE: Apache NetBeans

# Project Structure
A brief overview of the key directories in this project:

.
├── src/Project/    # Contains all .java source code files
├── nbproject/      # NetBeans project configuration files
├── build/          # Stores the compiled .class files
└── dist/           # Contains the final runnable .jar application

# Getting Started
Follow these steps to get the project up and running on your local machine.

Prerequisites
Java Development Kit (JDK) 8 or newer

Apache NetBeans IDE

MySQL Server

Installation & Setup
Clone the repository:

git clone [https://github.com/garima533/BloodBankManagementSystem.git](https://github.com/garima533/BloodBankManagementSystem.git)

Open the project in NetBeans:

Launch NetBeans IDE.

Go to File > Open Project and select the cloned folder.

Set up the Database:

Ensure your MySQL server is running.

Create a new database for this project.

Import the necessary tables using the provided .sql file (or create them manually if not provided).

Open the src/Project/Connectionprovider.java file and update the database URL, username, and password with your credentials.

Run the Application:

In the NetBeans project explorer, navigate to the src/Project/ directory.

Right-click on the login.java file.

Select Run File to start the application.


