DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to implement **Eureka Naming Server** for network of applications. Eureka Naming Service enables following all available services in network. The result of network of applications is **Hello World** message and **port** numbers of **Text** and **Display** services in a **JSON** format in a **browser** using **Java** applications with **Spring Boot** framework.

##### Details
**Eureka Naming Server** displays names and other information about all services in the network.

Network of applications displays message "Hello World" and "port" numbers of "Text" and "Display" services in JSON format in a browser. Service "Text" provides text which should be displayed. Service "Display" connects with service "Text" and takes from it text and port and then display it in a browser.

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This application uses:
* **Spring Boot** framework: framework details: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Java** (tested on version 1.8.0_291). Tool details: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* Installed **Maven** (tested on version 3.8.5). Tool details: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* Installed **Git** (tested on version 2.33.0.windows.2). Tool details: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`

##### Preconditions - Actions
* **Download** source code and open any **Command Line** tool on **project's folder**. You can do it in following way:
    * Open any Command Line tool (for instance "Windonw PowerShell" on Windows OS) and go to folder where you want to download source code 
    * Clone Github repository with `git clone https://github.com/wisniewskikr/chrisblog-it.git`
    * Go to source code folder with `cd chrisblog-it\java-springboot-cloud-localhost\springboot-cloud-discovery-eureca-localhost`


USAGE
-----

Usage steps:
1. In the first Command Line tool start application with `mvn -f ./springboot-helloworld-browser-json-ports-text spring-boot:run`
1. In the second Command Line tool start application with `mvn -f ./springboot-helloworld-browser-json-ports-display spring-boot:run`
1. In the third Command Line tool start application with `mvn -f ./system-api-gateway-service spring-boot:run`
1. Visit `http://localhost:8090`
1. Clean up environment:
    * In the first Command Line with `ctrl + C`
    * In the second Command Line with `ctrl + C`
    * In the third Command Line with `ctrl + C`