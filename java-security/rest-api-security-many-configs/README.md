SPRING BOOT REST API AND MANY SECURITY CONFIGURATIONS
=====================================================


LOCALHOST URL
-------------

* URL GET: http://localhost:8080/app/greeting
* URL POST: http://localhost:8080/app/greeting
* URL GET: http://localhost:8080/app/security-one/greeting (credentials: user1 / password1)
* URL POST: http://localhost:8080/app/security-one/greeting (credentials: user1 / password1)
* URL GET: http://localhost:8080/app/security-two/greeting (credentials: user2 / password2)
* URL POST: http://localhost:8080/app/security-two/greeting (credentials: user2 / password2)

Credentials: user / password


DESCRIPTION
-----------

#####Goal
The goal of this project shows how to create simple Spring Boot REST API application secured by many BASIC securities.

#####Details
This project handles two HTTP methods: GET and POST. Some of these methods are secured by BASIC security.

#####Result 
The result of this project is JSON with text "<HTTP method>: Hello World". You can run this project in Browser (only GET) 
or in any REST API Client.

#####Used technologies:
* BE: Spring Boot REST API


IMPLEMENTATION
-----------

Prerequisites:
* Download project "rest-api".

Implementation details:
* In file "pom.xml" add security dependency "spring-boot-starter-security";
* In file "application.properties" add API Credentials;
* Create class "SecurityConfig.java" where all security details are configured.
  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* http://[server]/app/greeting