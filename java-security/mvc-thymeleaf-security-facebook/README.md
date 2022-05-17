SPRING BOOT MVC THYMELEAF AND SECURITY FORM
============================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting
* **Credentials**: user / password


DESCRIPTION
-----------

#####Goal
The goal of this project is to show to create application with simple security form using technologies Spring Boot MVC and Thymeleaf. 

#####Details
This project consists following pages:
* Login Page: this page contains Login and Password fields;
* Greeting Page: with text "Hello World".

#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Prerequisites:
* This project is based on "mvc-thymeleaf".

Implementation details:
* Update file pom.xml: add Spring Boot security;
* Create class SecurityConfig.java;
* Create class LoginController.jave;
* Create file login.html;
* Update file greeting.html;
* Update file custom.css.
  

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