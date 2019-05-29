SprintBoot Standalone project 
===============================

# Introduction
 * Structure base in clean architecture, a project that retrieve information from database from the 
   table person, retrieve the celebrity Dua Lipa as assumption and some fans Fan1, Fan2, Fan3, Fan4
   the logic is simple: to get in the database (H2 with SprintBoot) all people and find the celebrity and print in console.


# Modules

 * Contains the entity, repository, scripts for h2 initialization, executable runner (Application.java), implementation and related configuration files to h2 and SprintBoot.

# Prerequisites

 * Installation of Java 8 (JDK) or higher
 * Installation of Gradle 2.14.X or higher
 * Installation of Supported version of the Eclipse Tool as an IDE or any other you preffer



# Command Line for executing project cdm or git bash

# Using Gradle
 * gradle clean build
 * java -jar build/libs/FindCelebrity-1.0.jar

# IDE (Eclipse)

# Import the Sample in Eclipse as a gradle project

 * Select the *Application.java* class from the *sprintboot* package and run as "Run as Java    
   Application",   check in the console log *Celebrity Found: Dua Lipa*

--------------------------------------------------------------------------------
[Eclipse Tool]: https://www.eclipse.org/tools/
[Gradle]: https://gradle.org/
[Clean Architecture]: https://www.freecodecamp.org/news/a-quick-introduction-to-clean-architecture-990c014448d2/
