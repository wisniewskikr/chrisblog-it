SPRING BOOT MVC, THYMELEAF AND SECURITY XSS
===========================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080/app/greeting


DESCRIPTION
-----------

This is simple Spring Boot MVC project which shows how to secure XSS.
On the landing page are 3 links:
* Greeting Page with redirection to Google
* Greeting Page with redirection to Google link which was XSS attacked and not secured. Javascrip alert is displayed;
* Greeting Page with redirection to Google link which was XSS attacked but secured. No javascript alert is displayed.

Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Prerequisites:
* Download project "mvc-thymeleaf".

Implementation details:
* Update file "pom.xml" with "coverity" dependency;
* Update class "GreetingController.java" with XSS default, XSS secured and XSS not secured methods;
* Update class "GreetingCommand.java" with XSS fields;
* Update file "greeting.html" with links to XSS defauld, XSS secured and XSS not secured pages;
* Create file "greeting-xss.html" with text "Hello World", link "Go Back" and link "Go To Google" which is XSS attacked.
  

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