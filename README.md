<h1 align="center">Procedure for building JAVA REST API Projects</h1>
<p align="center">SangamOne Connected Services</p>
Background:  This document is to assist entry-level programmers to build simple REST API projects using Java, Spring Tool Suite, Postman, Talend API Tester.


Tools: Download JDK, Spring Tool Suite,MySQL and Postman from

https://www.oracle.com/in/java/technologies/downloads/

https://spring.io/tools/

https://www.postman.com/downloads/

https://chromewebstore.google.com/detail/talend-api-tester-free-ed/aejoelaoggembcahagimdiliamlcdmfm

Project 1:  Load “holidays1.csv file and display List of Holidays in Mar 2024 without using Database


Create Project Project1 - Spring Starter Project - add dependencies ‘Spring Web’ , with ‘rest1’ as package.  Package Type: “Maven”.  Java: 17
Create Package ‘pkg1’ under project1

      5. Create HolidayController1.java class file
	@RestController
	Within the class

		@GetMapping(“/holidays/2024”)
		Define a method using File, Scanner, read each line, concatenate into a list separated by “\n” and return it in the method.

Test using Browser, Postman or Talend by pointing to URL http://localhost:8080/holidays/2024


