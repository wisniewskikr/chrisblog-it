SPRING BOOT MVC THYMELEAF AND CSRF SECURITY
===========================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting
* **Credentials**: user / password


DESCRIPTION
-----------

This is simple Spring Boot MVC project which contains:
* Landing Page: here you can go to CSRF Secured Page or CSRF Not Secured Page;
* CSRF Secured Page: Spring Boot automatically adds here hidden field "_csrf" with unique id. Only request with this unique id are valid. This is configured in class "ConfigSecurity.java";
* CSRF Not Secured Page: there is not hidden field "_csrf". This is configured in class "ConfigSecurity.java";
* CSRF Not Secured Hacker Page: this is hacker page who send request similar to CSRF Not Secured Page;
* CSRF Secured Hacker Page: this is hacker page who send request similar to CSRF Secured Page.

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf

CSRF Description:
* CSRF is possible only for secured pages;
* Hacker tries to force some action on this secured pages. For instance add some comment on forum in behalf of victim.


IMPLEMENTATION
-----------

Prerequisites:
* Download project "mvc-thymeleaf". This project is used as template.

Implementation details:
* In file "pom.xml" add security dependency "spring-boot-starter-security";
* In file "application.properties" add credentials properties;
* Add class "SecurityConfig.java" with security configuration;
* Update class "GreetingController.java" with CSRF secured and CSRF not secured methods;
* Update class "GreetingCommand.java" with CSRF fields;
* Update file "greeting.html" with links to CSRF secured and CSRF not secured pages;
* Create file "greeting-csrf.html" with "Hello World" form, link "Go Back" and link to hacker page;
* Create file "hacker-page-not-secured-csrf.html" with hacker form which try to connect to user "Hello World" form; 
* Create file "hacker-page-secured-csrf.html" with hacker form which try to connect to user "Hello World" form.
  

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