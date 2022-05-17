SPRING BOOT MVC THYMELEAF AND BASIC SECURITY
============================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting
* **Credentials**: user / password


DESCRIPTION
-----------

This is simple Spring Boot MVC project which displays Greeting page.
This page:
* contains text "Hello World";
* is secured by BASIC security.


Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Prerequisites:
* Download project "mvc-thymeleaf". This project is used as template.

Implementation details:
* In file "pom.xml" add security dependency "spring-boot-starter-security";
* In file "application.properties" add credentials properties;
* Add class "SecurityConfig.java" with security configuration.
  

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