SPRING BOOT MVC, THYMELEAF AND SECURED SSL
==========================================


LOCALHOST URL
-------------

* **URL**: https://localhost:8080/app/greeting


DESCRIPTION
-----------

#####Goal
The goal of this project is to show how to create Java application with Spring Boot MVC and Thymeleaf
secured by SSL (HTTPS).

#####Details
This project consists of one page:
* **Greeting Page**: this page just displays text "Hello World". URL is secured by SSL.

#####Result 
After copy URL in browser`s address field a user is redirected to Greeting Page. Text "Hello World" is displayed.

#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

#####Prerequisites:
* This project is based on existing project "mvc-thymeleaf".

#####Implementation details:
* Create keystore file "demo.p12";
* Create folder "keystores" and place there keystore file;
* Update file application.properties with keystore properties;

  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* https://[server]/app/greeting


KEYSTORE
--------

To create your own keystore please use following command:
* keytool -genkeypair -alias demo -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore demo.p12 -validity 3650

or

* keytool -genkeypair -alias demo -keyalg RSA -keysize 2048 -keystore demo.jks -validity 3650


TOMCAT
------

To configure ssl in Tomcat you have to:
* copy file "demo.p12" from location ``<app>/src/main/resources/keystores`` to location: ``<tomcat_home>/conf``
* make following changes in file ``<tomcat_home>/conf/server.xml``:

```              
<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
               clientAuth="false" sslProtocol="TLS" 
			   keystoreFile="${catalina.home}/conf/demo.p12"			   
			   keystorePass="password"/>